# ComportexViz

A web-based visualization layer for
[Comportex](http://github.com/nupic-community/comportex/).

See it in action in [this blog
post](http://floybix.github.io/2014/07/11/visualization-driven-development-of-the-cortical-learning-algorithm/).


## Usage

Get [Leiningen](http://leiningen.org/) first.

Clone [Comportex](http://github.com/nupic-community/comportex/),
and install it to your local Maven repository (~/.m2):

```
lein install
```

Clone ComportexViz, and then build it:

```
lein do cljsbuild clean, cljsbuild once demos
```

Now open `public/demos/*.html` in a web browser, preferably Google
Chrome. Each HTML page loads the corresponding model defined
in `examples/demos/comportexviz/demos/`.


## License

Copyright © 2014 Felix Andrews

Distributed under your choice of
* the Eclipse Public License, the same as Clojure.
* the GNU Public Licence, Version 3 http://www.gnu.org/licenses/gpl.html, the same as NuPIC.
