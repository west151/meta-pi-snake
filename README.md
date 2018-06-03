# meta-snake

mkdir ~/yocto-data
cd ~/yocto-data

git clone -b rocko git://git.yoctoproject.org/poky.git poky
cd poky

git clone -b master https://github.com/west151/meta-snake
git clone -b rocko git://git.openembedded.org/meta-openembedded
git clone -b rocko git://git.yoctoproject.org/meta-raspberrypi
git clone -b 5.10 git://code.qt.io/yocto/meta-qt5.git

cd ~/yocto-data
~/yocto-data$ mkdir -p snake/build

#

└── yocto-data
    ├── poky
    │   ├── meta-openembedded
    │   ├── meta-qt5
    │   ├── meta-raspberrypi
    │   ├── meta-snake
    └── snake
        └── build

~/yocto-data$ cp poky/meta-snake/conf/bblayers.conf.example snake/build/bblayers.conf
~/yocto-data$ cp poky/meta-snake/conf/local.conf.example snake/build/local.conf

# 
~$ source ~/yocto-data/poky/oe-init-build-env ~/yocto-data/snake/build

bitbake console-image
bitbake snake-base-image
# WaveShare Compute Module IO Board Plus
bitbake snake-wboard-image

# SDK
bitbake meta-toolchain-qt5
