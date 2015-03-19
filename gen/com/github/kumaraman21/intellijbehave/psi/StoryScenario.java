// This is a generated file. Not intended for manual editing.
package com.github.kumaraman21.intellijbehave.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface StoryScenario extends PsiElement {

  @Nullable
  StoryExamples getExamples();

  @Nullable
  StoryGivenStories getGivenStories();

  @Nullable
  StoryMetaStatement getMetaStatement();

  @Nullable
  StoryScenarioTitle getScenarioTitle();

  @NotNull
  List<StoryStep> getStepList();

  @Nullable
  PsiElement getTokenNewline();

}