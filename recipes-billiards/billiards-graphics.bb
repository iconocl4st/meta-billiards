DESCRIPTION = "builds the billiards graphics api"
HOMEPAGE = "https://github.com/iconocl4st/billiards-graphics-api"
LICENSE = "GPL-3.0"
SRC_URI = "git://github.com/iconocl4st/billiards-graphics-api.git;protocol=https;branch=main"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464 \
"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"

inherit cmake systemd

SYSTEMD_AUTO_ENABLE = "enable"

do_install() {
	cmake_do_install
	install -D -p -m0644 ${WORKDIR}/git/graphics_api.service ${D}${systemd_unitdir}/system/graphics_api.service
}

DEPENDS = "billiards-common"
FILES_${PN} += "/app /app/graphics_api ${systemd_unitdir}/system/graphics_api.service"
SYSTEMD_SERVICE_${PN} = "graphics_api.service"
