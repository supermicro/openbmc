HOMEPAGE = "http://github.com/openbmc/dbus-top"
PR = "r1"
PV = "1.0+git${SRCPV}"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://github.com/openbmc/dbus-top;protocol=https;branch=main"
SRCREV = "abc3218cc2a9fe2de9fc9db214749b89f30c1774"

S = "${WORKDIR}/git"
inherit meson pkgconfig

SUMMARY = "DBus-Top"
DESCRIPTION = "A top-like tool for DBus."

DEPENDS += "systemd"
DEPENDS += "sdbusplus"
DEPENDS += "ncurses"
DEPENDS += "fmt"
