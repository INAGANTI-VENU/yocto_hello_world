SUMMARY = "My application"
DESCRIPTION = "Simple example application built with Yocto"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://myapp.c \
           file://Makefile"

S = "${WORKDIR}"

# No configure step for simple apps
do_configure[noexec] = "1"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 myapp ${D}${bindir}
}

FILES:${PN} = "${bindir}/myapp"
