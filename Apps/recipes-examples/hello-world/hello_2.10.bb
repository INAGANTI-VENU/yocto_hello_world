SUMMARY = "Hello example"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PN = "hello"

SRC_URI = "file://hello-simple.c file://Makefile"
S = "${WORKDIR}"

do_configure[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello-simple ${D}${bindir}
}

PACKAGES = "${PN} ${PN}-dbg ${PN}-src"
FILES:${PN} = "${bindir}/hello-simple"
