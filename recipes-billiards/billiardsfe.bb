DESCRIPTION = "Builds the Pistach.io REST server"
HOMEPAGE = "https://github.com/pistacheio/pistache"
LICENSE = "Apache License 2.0"

SRC_URI = "git:///mnt/1f0ab4b3-c472-49e1-92d8-c0b5664f7fdb/ProjectsForFun/Pool/qt/projection;branch=arm;protocol=file"


LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464 \
"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"

inherit qmake5

DEPENDS = "qtbase"
ALLOW_EMPTY_${PN} = "1"
