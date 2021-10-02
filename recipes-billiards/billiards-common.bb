DESCRIPTION = "downloads the billiards common headers"
HOMEPAGE = "https://github.com/iconocl4st/billiards-common"
LICENSE = "GPL-3.0"
SRC_URI = "git://github.com/iconocl4st/billiards-common.git;branch=main"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464 \
"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"

inherit cmake

ALLOW_EMPTY_${PN} = "1"
