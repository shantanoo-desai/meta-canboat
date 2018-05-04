SUMMARY = "CANBOAT"
SECTION = "base"
LICENSE = "GPLv3"
#DEPENDS = "xsltproc"

LIC_FILES_CHKSUM = "file://GPL;md5=05507c6da2404b0e88fe5a152fd12540"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/canboat/canboat.git;branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "93b2ebfb334d7a9750b6947d3a4af9b091be2432"
EXTRA_OEMAKE = "'CC=${CC}' 'AR=${AR}'"
do_compile() {
	oe_runmake
}


