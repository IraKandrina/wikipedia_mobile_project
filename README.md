# <img width="5%" title="Wikipedia" src="images/logo/Wikipedia.svg"> Дипломный проект по автоматизации тестирования мобильного приложения [Wikipedia](https://github.com/wikimedia/apps-android-wikipedia/)
>
![wiki_logo](images/logo/Wiki_Logo.jpg)
 
## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов в Browserstack</a>
____
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://appium.io/"><img src="images/logo/Appium.svg" width="50" height="50" alt="Appium" title="Appium"/></a>
<a href="https://www.browserstack.com/"><img src="images/logo/Browserstack.svg" width="50" height="50" alt="Browserstack" title="Browserstack"/></a>
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>

____
<a id="cases"></a>
## Реализованные проверки

- Поиск статьи
- Открытие статьи
- Добавление языка

____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/wiki-mobile-final/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/wiki-mobile-final/"><img src="images/screenshot/jenkinsBuild.png" alt="Jenkins" width="850"/></a>  
</p>

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
gradle clean local_test -DdeviceHost=local
```
> Внимание! Для запуска локальных тестов на компьютере должны быть установлены Android Studio, Appium Server и Appium Inspector.
>
***Удалённый запуск через Jenkins:***
```bash  
gradle clean browserstack_test -DdeviceHost=browserstack
```
> Для запуска необходимо нажать "Собрать сейчас".
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/wiki-mobile-final/6/allure/)</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshot/allureMain.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshot/allureTestCase.png" width="850">  
</p>

### *Графики*

<p align="center">  
<img title="Allure Graphics" src="images/screenshot/allureGraph.png" width="850">
</p>

___
<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="images/logo/Allure2.svg" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3646/dashboards">Allure TestOps</a>
____
### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screenshot/allureTestOpsMain.png" width="850">  
</p>  

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/screenshot/allureTestOpsAuto.png" width="850">  
</p>

___
<a id="jira"></a>
## <img alt="Allure" height="25" src="images/logo/Jira.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-867">Jira</a>
____
<p align="center">  
<img title="Jira" src="images/screenshot/jira.png" width="850">  
</p>

____
<a id="telegram"></a>
## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshot/telegram.png" width="550">
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов в Browserstack
____
<p align="center">
<img title="Browserstack Video" src="images/video/video.gif" height="550" alt="video">   
</p>

