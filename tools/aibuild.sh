#!/bin/bash

DISTRO=fsl-imx-100ask-fb MACHINE=imx6ull100ask source imx-setup-release.sh -b build-fsl-imx-100ask-fb
bitbake imx-image-multimedia

