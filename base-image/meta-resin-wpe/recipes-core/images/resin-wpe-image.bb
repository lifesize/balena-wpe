include recipes-core/images/core-image-minimal.bb

IMAGE_FSTYPES = "tar.gz"

IMAGE_INSTALL_append += " \
	fbcp \
	fontconfig \
	fontconfig-utils \
	sthttpd \
	tslib-calibrate \
	tslib-tests \
	ttf-bitstream-vera \
	gstreamer1.0-plugins-base-alsa \
	wpebackend-rdk \
	wpeframework \
	wpeframework-plugins \
	wpewebkit \
	wpewebkit-web-inspector-plugin \
        strace \ 
        gdb \
        ldd \
	"

VIRTUAL-RUNTIME_init_manager="busybox"
