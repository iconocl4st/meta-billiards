DESCRIPTION = "downloads the billiards attempts api"
HOMEPAGE = "https://github.com/iconocl4st/billiards-attempts-api"
LICENSE = "GPL-3.0"
SRC_URI = "git://github.com/iconocl4st/billiards-projection-api.git;branch=main"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464 \
"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"

inherit qmake5

DEPENDS = "qtbase billiards_common boost"
# ALLOW_EMPTY_${PN} = "1"
FILES_${PN} += "/app /app/qt-projection-api"
