# accesos #

## Build & Run ##

    sh
    $ cd accesos
    $ ./sbt
    > jetty:start
    > browse

Autoreload

    $ sbt
    > ~;jetty:stop;jetty:start

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.
