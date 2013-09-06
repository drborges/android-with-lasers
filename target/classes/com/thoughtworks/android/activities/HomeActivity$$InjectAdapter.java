// Code generated by dagger-compiler.  Do not edit.
package com.thoughtworks.android.activities;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<HomeActivity>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code HomeActivity} and its
 * dependencies.
 * 
 * Being a {@code Provider<HomeActivity>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<HomeActivity>} and handling injection
 * of annotated fields.
 */
public final class HomeActivity$$InjectAdapter extends Binding<HomeActivity>
    implements Provider<HomeActivity>, MembersInjector<HomeActivity> {
  private Binding<com.thoughtworks.android.searchengines.SearchEngine> searchEngine;
  private Binding<BaseActivity> supertype;

  public HomeActivity$$InjectAdapter() {
    super("com.thoughtworks.android.activities.HomeActivity", "members/com.thoughtworks.android.activities.HomeActivity", NOT_SINGLETON, HomeActivity.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    searchEngine = (Binding<com.thoughtworks.android.searchengines.SearchEngine>) linker.requestBinding("com.thoughtworks.android.searchengines.SearchEngine", HomeActivity.class, getClass().getClassLoader());
    supertype = (Binding<BaseActivity>) linker.requestBinding("members/com.thoughtworks.android.activities.BaseActivity", HomeActivity.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(searchEngine);
    injectMembersBindings.add(supertype);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<HomeActivity>}.
   */
  @Override
  public HomeActivity get() {
    HomeActivity result = new HomeActivity();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<HomeActivity>}.
   */
  @Override
  public void injectMembers(HomeActivity object) {
    object.searchEngine = searchEngine.get();
    supertype.injectMembers(object);
  }
}
