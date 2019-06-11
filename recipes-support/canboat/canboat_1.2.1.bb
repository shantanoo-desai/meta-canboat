# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; if that is correct you should separate
# these in the LICENSE value using & if the multiple licenses all apply, or | if there
# is a choice between the multiple licenses. If in doubt, check the accompanying
# documentation to determine which situation is applicable.
LICENSE = "GPLv3"
DEPENDS += "libxslt-native canboat-native"

LIC_FILES_CHKSUM = "file://GPL;md5=05507c6da2404b0e88fe5a152fd12540 \
                    file://LICENSE;md5=c5b238a6c6d2a959113901cc3b423190 \
                    file://common/license.h;md5=1bbc4761bb5de7d385635b12959c6e91"

SRC_URI_append = " \
                file://0001-Add-non-root-user-to-new-Makefile.patch \
		file://0001-Define-ANALYZEREXEC.patch \
		file://0001-use-php-instead-of-php5.patch \
		"

SRC_URI = "https://github.com/canboat/canboat/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "59e2a4e7934ecf236aafaacd8222c552"
SRC_URI[sha256sum] = "2eaebbefed3765368e424f5f3fb769d9138a1fc9b075a2f23139d3134ba46f87"


# PREFIX ?= "${root_prefix}"
# PREFIX_class-native = "${prefix}"

EXTRA_OEMAKE_append_class-target = " ANALYZEREXEC=analyzer "


do_install () {
	oe_runmake DESTDIR=${D} PREFIX=${root_prefix} EXEC_PREFIX=${exec_prefix} install
}

RDEPENDS_${PN}_append_class-target = " php-cli perl"
BBCLASSEXTEND = "native nativesdk"

