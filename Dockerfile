FROM bellsoft/liberica-openjdk-alpine:17-35
VOLUME ./docs
COPY ./src ./src
RUN javac -d out -sourcepath ./src -encoding utf-8 ./src/ru/gbdanila/interviewbot/Main.java && \
    javadoc -d docs -sourcepath src -cp out -subpackages ru

CMD java -cp out ru.gbdanila.interviewbot.Main