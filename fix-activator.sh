#!/bin/sh
watch -n 0.2 -p "grep 2.3.9 project/play-fork-run.sbt && sed -e 's/2.3.9/2.4.0/g' -i project/play-fork-run.sbt"
