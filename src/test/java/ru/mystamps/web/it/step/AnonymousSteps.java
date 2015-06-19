/*
 * Copyright (C) 2009-2015 Slava Semushin <slava.semushin@gmail.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package ru.mystamps.web.it.step;

import net.thucydides.core.annotations.Step;

import ru.mystamps.web.it.page.AuthPage;
import ru.mystamps.web.it.page.IndexPage;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;

public class AnonymousSteps {
	
	private AuthPage authPage;
	private IndexPage indexPage;
	
	@Step
	public void opensIndexPage() {
		indexPage.open();
	}
	
	@Step
	public void cannotSeeTitleForActions() {
		assertThat(indexPage.hasTitleForActions(), is(false));
	}
	
	@Step
	public void cannotSeeLinkForAddingSeries() {
		assertThat(indexPage.linkForAddingSeriesIsPresent(), is(false));
	}
	
	@Step
	public void cannotSeeLinkForAddingCategories() {
		assertThat(indexPage.linkForAddingCategoriesIsPresent(), is(false));
	}
	
	@Step
	public void cannotSeeLinkForAddingCountries() {
		assertThat(indexPage.linkForAddingCountriesIsPresent(), is(false));
	}
	
	@Step
	public void loginAsUser(String login, String password) {
		authPage.loginAsUser(login, password);
	}
	
}
