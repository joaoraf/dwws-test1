#!/bin/bash
if [ "$1" == "" ] ; then
   echo "Run: sh rename-project.sh {new_name}"
else
  ATUAL=`grep '^name\s*:=' build.sbt | sed -e 's/.*"\(.*\)"/\1/g'`
  echo "Renaming from $ATUAL to $1"
  find . -name \*.sbt -or -name \*.scala -or -name \*.html -or -name \*.conf -or -name \*.xml -or -name \*.json -or -name \*.md | grep -v target | xargs -n1 sed -e "s/$ATUAL/$1/g" -i
fi
