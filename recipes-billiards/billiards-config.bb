DESCRIPTION = "builds the billiards configuration api"
HOMEPAGE = "https://github.com/iconocl4st/billiards-config-api"
LICENSE = "GPL-3.0"
SRC_URI = "git://github.com/iconocl4st/billiards-config-api.git;branch=main"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464 \
"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"

inherit cmake

DEPENDS = "billiards-common boost"
FILES_${PN} += "/app /app/config_api"
