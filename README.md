
meta-canboat
=============

- [CANBOAT](https://github.com/canboat/canboat) provides binaries for __CAN__ Networks
  on boats.
- This layer provides a Yocto Layer for using the CANBOAT binaries on different embedded
  boards.

Patches & Issues
================

Please submit any patches against the canboat layer to the
GitHub Repository's Issue Tracker

Maintainer: Shan Desai <shantanoo.desai@gmail.com>


Contribution Credits
=======================

- [Khem Raj](https://github.com/kraj) provided a successful recipe for the repository.
  His recipe can be found in [meta-himvis](https://github.com/kraj/meta-himvis/tree/master/recipe-core/canboat).


Table of Contents
=================

I. Adding the canboat layer to your build
=================================================


In order to use this layer, you need to make the build system aware of
it.

Assuming the canboat layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the canboat layer to bblayers.conf, along with any
other layers needed. e.g.:

```
  BBLAYERS ?= " \
    /path/to/yocto/meta \
    /path/to/yocto/meta-poky \
    /path/to/yocto/meta-yocto-bsp \
    /path/to/yocto/meta-canboat \
    "
```

II. Compiling
=================================================

in `$BUILD` folder run:

    bitbake canboat

III. Installing
=================================================

in `$BUILD/conf/local.conf` file:

     INSTALL_IMAGE_append = " canboat"
