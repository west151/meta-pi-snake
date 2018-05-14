SUMMARY = "Add file modules to /etc"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "file://modules"

PR = "r1"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/
    install -m 0666 modules ${D}${sysconfdir}/
}

FILES_${PN} = "${sysconfdir}"

