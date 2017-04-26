# MSTCreator - Java
<h2> WIP </h2><br>

MSTCreator is a work in progress minimum spanning tree text file creator. The layout of the text file is as follows:<br>
line 1: [number of verts] [number of edges]<br>
line 2: [vert 1] [vert 2] [weight]<br>
line 3: [vert 1] [vert 2] [weight]<br>
line 4: ....and so on<br>

<h3> Sample File </h3><br>
4 5 <br>
1 2 5 <br>
1 3 4 <br>
2 4 2 <br>
2 3 3 <br>
3 4 7 <br>

<b> ie: </b><br>
4 verts 5 edges<br>
1 connects to 2 with a weight of 5<br>
1 connects to 3 with a weight of 4<br>
2 connects to 4 with a weight of 2<br>
2 connects to 3 with a weight of 3<br>
3 connects to 4 with a weight of 7<br>

<h3> Reason for project </h3>
For an assignment in second year (module: Software Engineering 2), we were asked to implement Prim's and Kruskal's algorithm. This format is the one we used to represent a minimum spanning tree in text. I decided to test my algorithms on larger tree's but didn't want to create them by hand, so I created this little piece of software. 

