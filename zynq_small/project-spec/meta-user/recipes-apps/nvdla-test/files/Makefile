APP = nvdla-test

# Add any other object files to this list below
TOP = $(shell pwd)/umd

all: build

build:
	$(MAKE) -C umd TOP=$(TOP)

clean:
	rm -rf out

.PHONY: clean build all

