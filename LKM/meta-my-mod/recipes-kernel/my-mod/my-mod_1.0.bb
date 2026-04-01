SUMMARY = "Simple out-of-tree kernel module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=855cb65b5f2c39e6d931fdfc25379c91"

inherit module

SRC_URI = "file://mymod.c \
           file://Makefile \
           file://COPYING"

S = "${WORKDIR}"
