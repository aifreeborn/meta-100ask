# Copyright (C) 2022 NXP

DESCRIPTION = "RTL bt and wifi firmware"
HOMEPAGE = "https://github.com/aifreeborn/imx6ull_rootfs"
SECTION = "kernel"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/aifreeborn/imx6ull_rootfs.git;protocol=https;branch=main;destsuffix=rtl-bt-wifi-1.1.0;name=rtl-bt-wifi-1.1.0"
SRCREV_rtl-bt-wifi-1.1.0 = "340ef5fbae6a8c76d20d74da6c04ca9ce7845d4a"

inherit allarch

do_install() {
    # Install rtl bt and wifi image
    install -d ${D}${nonarch_base_libdir}/firmware/rtl_bt
    install -m 0644 ${WORKDIR}/rtl-bt-wifi-1.1.0/kernel_firmware/rtl_bt/rtl*.bin ${D}${nonarch_base_libdir}/firmware/rtl_bt
    install -d ${D}${nonarch_base_libdir}/firmware/rtlwifi
    install -m 0644 ${WORKDIR}/rtl-bt-wifi-1.1.0/kernel_firmware/rtlwifi/rtl*.bin ${D}${nonarch_base_libdir}/firmware/rtlwifi
}

INSANE_SKIP:${PN} = "arch already-stripped"

FILES:${PN} += "${nonarch_base_libdir}/firmware/rtl_bt/*.bin"
FILES:${PN} += "${nonarch_base_libdir}/firmware/rtlwifi/*.bin"

