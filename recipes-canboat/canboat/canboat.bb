SUMMARY = "CANBOAT"
SECTION = "base"
LICENSE = "GPLv3"
DEPENDS += "libxslt-native"
LIC_FILES_CHKSUM = "file://GPL;md5=05507c6da2404b0e88fe5a152fd12540"

SRC_URI = "git://github.com/canboat/canboat.git;branch=${SRCBRANCH} \
           file://0001-Cross-compile-analyzer.patch \
          "
SRCBRANCH = "master"
SRCREV = "93b2ebfb334d7a9750b6947d3a4af9b091be2432"

S = "${WORKDIR}/git"

do_compile() {
    oe_runmake
}

do_install() {
   oe_runmake DESTDIR=${D} PREFIX=${root_prefix} EXEC_PREFIX=${exec_prefix} install

}

RDEPENDS_${PN} += "php-cli perl"
