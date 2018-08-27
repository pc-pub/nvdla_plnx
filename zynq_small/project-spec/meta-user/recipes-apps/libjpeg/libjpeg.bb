#
# This file is the libjpeg recipe.
#

SUMMARY = "Simple libjpeg application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "http://www.ijg.org/files/jpegsrc.v9c.tar.gz"
SRC_URI[md5sum] = "93c62597eeef81a84d988bccbda1e990"

S = "${WORKDIR}/jpeg-9c"
CFLAGS_prepend ="-I ${S}/include"

inherit autotools

