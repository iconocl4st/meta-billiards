DESCRIPTION = "Builds the Pistach.io REST server"
HOMEPAGE = "https://github.com/pistacheio/pistache"
LICENSE = "GPL-3.0"

SRC_URI = "git:///mnt/1f0ab4b3-c472-49e1-92d8-c0b5664f7fdb/ProjectsForFun/Pool/glView;branch=master;protocol=file"
# SRC_URI = "git:///home/path.git; file:defconfig"
# SRC_URI = "git://github.com/pistacheio/pistache.git"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464 \
"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"

inherit cmake

# DEPENDS = "freeglut"

# REQUIRED_DISTRO_FEATURES = "x11"

# do_compile() {
#     oe_runmake LFLAGS='${LDFLAGS}'
# }
# 
# do_install() {
#     oe_runmake install INSTALL_ROOT=${D}
#     #install configure file
#     install -d ${D}${sysconfdir}/xdg/qtchooser/
#     install -m 0644 ${S}/tests/auto/qtchooser/testdata/config2/qtchooser/*.conf \
#                ${D}${sysconfdir}/xdg/qtchooser/
#     install -m 0644 ${S}/tests/auto/qtchooser/testdata/default/qtchooser/default.conf \
#                ${D}${sysconfdir}/xdg/qtchooser/
# }
