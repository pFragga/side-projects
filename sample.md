<!-- This is me trying out Markdown! -->
<!-- AUTHOR: Petros Frangatzis -->
<!-- Date: 18/02/2022, 06:18 PM -->

First Level Header
====================
Basically like < h1 ></ h1 >  in HTML.


Second Level Header
-------------------
Basically like < h2 ></ h2 >  in HTML.



One '=' or '-' is actually enough,  i guess underlining the whole sentence makes more sense though.

Also '---' creates this cool line.

---

### Third Level Header

> This is a blockquote. I have yet to try these in HTML lol.
> 
> Second paragraph.
>
> ## This is < h2 ></ h2 > in a blockquote.
> Cool
> Math
> Games

Some words can be *emphasized with asterisk* or _underline_.

Some words can be __emphasized with bold__.

Use can use two asterisks for **bold** too.


Lists (everyone's favourite!)
=============================
Unordered (bulleted) lists use [ *, +, - ] as list markers.

* Mew
* Mewtwo
* Mewthree
---
+ Windows
+ MacOS
+ Linux
---
- Red
- Green
- Blue

> The output is the same as:
> 
> < ul >
> 
> < li> Red </ li >
> 
> < li > Green </ li >
> 
> < li > Blue </ li >
> 
> </ ul >
>
> in HTML.

Ordered (numbered) list use regular numbers (+periods).

1. Keys
2. Phone
3. Money

**_HINT: Alt+Up/Down auto corrects indexes._**

> The output is the same as:
> 
> < ol >
> 
> < li > Keys </ li >
> 
> < li > Phone </ li >
> 
> < li> Money </ li >
> 
> </ ol >
>
> in HTML.

Tab (4 spaces) can be put between items in a list to create multi-paragraph list items

* First List Item

    (1st paragraph) qwiorueqopreuqopire
    
* Second List Item

    (1st paragraph) ajfakjlf;kf

    (2nd paragraph) zm,xcnvxbmcnvb,m

Links
=====
2 types of links: *inline* and *reference*.

- Inline

    e.g. Here's a [link](http://wikipedia.org) to wikipedia.
    
    _With optional title attribute after url:_

    e.g. Here's a [link](http://wikipedia.org "Wikipedia") to wikipedia.

- Reference

    These types of links allow you to refer to your links by names, which you define elsewhere in your document.

    e.g. Click [here][1] to visit wikipedia. Click [here][a_url] to visit duckduckgo.

    [1]: http://wikipedia.org   "Wikipedia"
    [a_url]: http://duckduckgo.com  "Duckduckgo"


Images
======
Image syntax is very much like link syntax.

+ Inline (titles are again optional)

    This pic goes hard.
    ![alt text](https://ahseeit.com//king-include/uploads/2021/04/man-on-white-studio-background-260nw-1820135141-9099283213.jpg "this_pic_goes_hard")

+ Reference

    Feel free to screenshot
    ![alt text][pic_that_goes_hard]

    [pic_that_goes_hard]: https://ahseeit.com//king-include/uploads/2021/04/man-on-white-studio-background-260nw-1820135141-9099283213.jpg "this_pic_goes_hard"

