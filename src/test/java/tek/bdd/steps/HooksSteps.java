package tek.bdd.steps;


import tek.bdd.utility.SeleniumUtility;

public class HooksSteps extends SeleniumUtility {
    @BeforepublicvoidbeforeEachScenario() {
        setupBrowser();
    }

    @AfterpublicvoidafterEachScenario() {
        quitBrowser();
    }
}