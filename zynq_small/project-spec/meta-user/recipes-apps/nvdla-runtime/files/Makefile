APP = nvdla-runtime

# Add any other object files to this list below
TOP = $(shell pwd)/umd

all: build

build:
	${MAKE} -C umd/core/runtime TOP=$(TOP)

clean:
	rm -rf out

.PHONY: all build clean

