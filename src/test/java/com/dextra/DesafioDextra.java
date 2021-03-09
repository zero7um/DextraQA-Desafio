package com.dextra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import javax.lang.model.element.Element;


public class DesafioDextra {


    @Test
    public void  testPreencherPesquisaComDadosObrigatoriosValidos() {

        //Dado que eu acesse a página da VV Test
        System.setProperty("webdriver.chrome.driver" , "c:\\Windows\\temp\\drivers\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://bit.ly/3jOMrR9");

        //E acesse o menu "Pesquisa - QA"
        chrome.findElement(By.id("menu-item-226")).click();

        //Quando eu preencher todos os campos obrigatórios
        //Então deve ser direcionado para uma página de sucesso

        chrome.findElement(By.id("nf-field-5")).sendKeys("Usuario");
        chrome.findElement(By.id("nf-field-6")).sendKeys("Sobrenome Ultimo Nome");
        chrome.findElement(By.id("nf-field-7")).sendKeys("usuariosobrenome@email.com");
        chrome.findElement(By.id("nf-field-8")).sendKeys("usuariosobrenome@email.com");
        chrome.findElement(By.id("nf-field-17")).sendKeys("71999887766");

        WebElement idade = chrome.findElement(By.id("nf-label-class-field-10-0"));
        ((JavascriptExecutor) chrome).executeScript("arguments[0]." +
                "scrollIntoView(true)", idade);
        idade.click();

        chrome.findElement(By.name("nf-field-11")).sendKeys("Menos de 5 anos");
        chrome.findElement(By.name("nf-field-12")).sendKeys("Sou meega chato");

        WebElement tecnico = chrome.findElement(By.id("nf-label-class-field-13-0"));
        ((JavascriptExecutor) chrome).executeScript("arguments[0]." +
                "scrollIntoView(true)", tecnico);
        tecnico.click();

        chrome.findElement(By.id("nf-field-14")).sendKeys("Java, Python e Ruby");
        chrome.findElement(By.id("nf-field-15")).sendKeys("Meu plano é secreto, um dia você verá.");
        chrome.findElement(By.id("nf-field-16")).click();

    }

}
