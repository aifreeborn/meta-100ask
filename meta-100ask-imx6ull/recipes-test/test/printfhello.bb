# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Copyright 2017-2023 NXP

DESCRPITION = "Prints Hello World"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

PN = "printfhello"
PV = "1"

addtask TestFun

python do_TestFun(){
  bb.plain("********************");
  bb.plain("* *");
  bb.plain("* Hello, World! *");
  bb.plain("* *");
  bb.plain("********************");
}
