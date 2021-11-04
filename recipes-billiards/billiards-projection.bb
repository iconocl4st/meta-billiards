DESCRIPTION = "downloads the billiards projection api"
HOMEPAGE = "https://github.com/iconocl4st/billiards-projection-api"
LICENSE = "GPL-3.0"
SRC_URI = "git://github.com/iconocl4st/billiards-projection-api.git;protocol=https;branch=main"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464 \
"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"

inherit qmake5 systemd

SYSTEMD_AUTO_ENABLE = "enable"


do_install() {
	install -D -p -m755 qt-projection-api ${D}/app/qt-projection-api
	install -D -p -m0644 ${WORKDIR}/git/projection_api.service ${D}${systemd_unitdir}/system/projection_api.service
}

DEPENDS = "qtbase billiards-common"
# ALLOW_EMPTY_${PN} = "1"
FILES_${PN} += "/app /app/qt-projection-api ${systemd_unitdir}/system/projection_api.service"
SYSTEMD_SERVICE_${PN} = "projection_api.service"
