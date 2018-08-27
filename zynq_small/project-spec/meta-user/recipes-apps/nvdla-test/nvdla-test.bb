#
# This file is the nvdla-test recipe.
#

SUMMARY = "Simple nvdla-test application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://umd \
        file://umd/* \
        file://Makefile \
        "

S = "${WORKDIR}"
TARGET_CC_ARCH += "${LDFLAGS}"
RDEPENDS_${PN} += " nvdla-runtime"
DEPENDS += " libjpeg"

do_compile() {
	     oe_runmake
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 ${S}/umd/out/runtime/nvdla_runtime/nvdla_runtime ${D}${bindir}
}

FILES_${PN} += " ${bindir}/nvdla_runtime"

