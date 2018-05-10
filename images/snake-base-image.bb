SUMMARY = "Snake base image"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

require console-image.bb

TOOLS_INSTALL = " \
    bzip2 \
    devmem2 \
    dosfstools \
    ethtool \
    fbset \
    findutils \
    iproute2 \
    less \
    memtester \
    netcat \
    procps \
    rsync \
    sysfsutils \
    unzip \
    util-linux \
    zip \
    e2fsprogs-resize2fs \
    nano \
    mc \
    htop \
    tcpdump \
"

IMAGE_INSTALL += " \
    ${TOOLS_INSTALL} \
"

export IMAGE_BASENAME = "snake-base-image"

