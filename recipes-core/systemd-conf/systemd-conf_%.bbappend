FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://wlan0.network \
"

FILES_${PN} += " \
    ${sysconfdir}/systemd/network/wlan0.network \
"

do_install_append() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/wlan0.network ${D}${sysconfdir}/systemd/network
}
