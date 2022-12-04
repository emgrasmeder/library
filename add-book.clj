#!/usr/bin/env bb

(let [title (do (prn "Title:") (read-line))
      subtitle (do (prn "Subtitle:") (read-line))
      author (do (prn "Author:") (read-line))
      isbn (do (prn "ISBN-13:") (read-line))]
   (spit "db.csv" (format "%s\t%s\t%s\t%s\n" title subtitle author isbn) :append true))
