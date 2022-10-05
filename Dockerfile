FROM openjdk:11-jdk-slim

ENV DEBIAN_FRONTEND noninteractive
ENV LANG 'en_US.UTF-8'
ENV ANDROID_SDK_ROOT=/opt/android
ENV ANDROID_HOME /opt/android-sdk-linux
ENV GRADLE_HOME=/opt/gradle/gradle-7.3.1
ENV PATH=${GRADLE_HOME}/bin:${ANDROID_SDK_ROOT}/cmdline-tools/latest/bin:${PATH}

RUN apt-get update && apt-get -y install git wget unzip default-jdk

RUN wget https://dl.google.com/android/repository/commandlinetools-linux-8512546_latest.zip -P /tmp && \
    mkdir -p /opt/android/cmdline-tools && \
    unzip -d /opt/android/cmdline-tools /tmp/commandlinetools-linux-8512546_latest.zip && \
    mv /opt/android/cmdline-tools/cmdline-tools /opt/android/cmdline-tools/latest && \
    wget https://services.gradle.org/distributions/gradle-7.3.1-bin.zip -P /tmp && \
    unzip -d /opt/gradle /tmp/gradle-7.3.1-bin.zip && \
    sdkmanager --update && \
    yes | sdkmanager --licenses  && \
    mkdir /var/appОбновил файлы

RUN dpkg --add-architecture i386 && apt-get update -yqq && apt-get install -y \
  curl \
  expect \
  git \
  make \
  git-core \
  libc6:i386 \
  libgcc1:i386 \
  libncurses5:i386 \
  libstdc++6:i386 \
  zlib1g:i386 \
  openjdk-11-jdk \
  wget \
  unzip \
  vim \
  openssh-client \
  locales \
  && apt-get clean \
  && rm -rf /var/lib/apt/lists/* \
  && localedef -i en_US -c -f UTF-8 -A /usr/share/locale/locale.alias en_US.UTF-8

RUN groupadd -g 1000 -r jenkins && \
  groupadd -g 999 -r docker && \
  groupadd -g 994 -r dockerroot && \
  useradd --create-home -d "/home/jenkins" -u 1000 -r -g jenkins -G docker,dockerroot jenkins

RUN mkdir "/sdk"
RUN chown -R jenkins "/sdk"