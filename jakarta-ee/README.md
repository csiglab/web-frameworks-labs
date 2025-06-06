# 🚀 Jakarta EE

> ⚙️ Jakarta EE Labs – Empowering developers to build robust, scalable, and modern enterprise applications with the power of open standards.

> Jakarta EE is the evolution of Java EE, driving innovation in enterprise Java development by fostering a vibrant community and embracing cloud-native architectures, microservices, and modular design.

> Whether you are a seasoned Java developer or just starting your journey, mastering Jakarta EE opens the door to building resilient, high-performance applications that power businesses worldwide. Let’s dive in and explore the tools, APIs, and best practices that make Jakarta EE a cornerstone of enterprise software development!

## Apache Tomcat

### Build, Test & Debug

```bash
## Code
git clone https://github.com/apache/tomcat.git
cd tomcat

git checkout 10.1.x

## Java
sdk use java 17.0.8-oracle

## Build
ant

## Run
cd output/build
./bin/catalina.sh run

## Debug
-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005
jps
```

### Configuration

- Users: `tomcat-users.xml`
- ...

### Deploy

> ...


## 📚 Refernces

- [Jakarta EE](https://en.wikipedia.org/wiki/Jakarta_EE)
- [Java EE (Jakarta EE)](https://righteous-guardian-68f.notion.site/Java-EE-Jakarta-EE-161c0f5171ec80fbaedae02728d10c9a?pvs=4)
- [Apache Tomcat](https://righteous-guardian-68f.notion.site/Apache-Tomcat-4f886e3534ad4265ab2334634dcc392c?pvs=4)
- [Wildfly](https://righteous-guardian-68f.notion.site/Wildfly-2102df8381204f9ca3195384b3021a79?pvs=4)
