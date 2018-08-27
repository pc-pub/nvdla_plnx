#
# This file is the nvdla-runtime recipe.
#

SUMMARY = "Simple nvdla-runtime application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://umd \
       file://umd/* \
       file://Makefile \
       "

S = "${WORKDIR}"
TARGET_CC_ARCH += "${LDFLAGS}"
RDEPENDS_${PN} += "opendla"
TARGET_PATH = "${S}/umd/out/runtime"

do_compile() {
	     oe_runmake
}

do_install() {
    install -d ${D}${libdir}
    install -d ${D}${includedir}/libnvdla_runtime
    install -d ${D}${includedir}/libnvdla_runtime/nvdla
    install -m 0755 ${TARGET_PATH}/libnvdla_runtime/libnvdla_runtime.so     ${D}${libdir}
    install -m 0644 ${S}/umd/include/*.h ${D}${includedir}/libnvdla_runtime
    install -m 0644 ${S}/umd/include/nvdla/*.h ${D}${includedir}/libnvdla_runtime/nvdla
}

FILES_${PN} = " ${libdir}/libnvdla_runtime.so ${includedir}/*"
FILES_${PN}-dev = ""

