const utils = require("./utils.js");
const tests = {};
tests["login"] = async (driver, vars, opts = {}) => {
  await driver.get((new URL(`/login`, BASE_URL)).href);
  try {
    await driver.manage().window().setRect({
      width: 840,
      height: 1027
    });
  } catch (error) {
    console.log('Unable to resize window. Skipping.');
  };
  await driver.wait(until.elementLocated(By.id(`username`)), configuration.timeout);
  await driver.findElement(By.id(`username`)).then(element => {
    return element.clear().then(() => {
      return element.sendKeys(`tomsmith`);
    });
  });
  await driver.wait(until.elementLocated(By.id(`password`)), configuration.timeout);
  await driver.findElement(By.id(`password`)).then(element => {
    return element.clear().then(() => {
      return element.sendKeys(`SuperSecretPassword!`);
    });
  });
  await driver.wait(until.elementLocated(By.css(`.fa`)), configuration.timeout);
  await driver.findElement(By.css(`.fa`)).then(element => {
    return element.click();
  });
  await driver.wait(until.elementLocated(By.css(`h2`)), configuration.timeout);
  await expect(driver.findElement(By.css(`h2`))).resolves.toHaveText(`Secure Area`);
  await driver.wait(until.elementLocated(By.css(`.icon-2x`)), configuration.timeout);
  await driver.findElement(By.css(`.icon-2x`)).then(element => {
    return element.click();
  });
  await driver.close();
}
module.exports = tests;