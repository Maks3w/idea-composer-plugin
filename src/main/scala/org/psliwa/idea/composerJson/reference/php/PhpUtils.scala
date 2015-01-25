package org.psliwa.idea.composerJson.reference.php

import com.jetbrains.php.lang.psi.elements.PhpClass

private object PhpUtils {
  def getFixedFQNamespace(phpClass: PhpClass) = escapeSlashes(phpClass.getNamespaceName.stripPrefix("\\"))

  def getFixedFQN(phpClass: PhpClass) = escapeSlashes(phpClass.getFQN.stripPrefix("\\"))

  def getFixedReferenceName(s: String) = s.replace("IntellijIdeaRulezzz ", "").replace("\\\\", "\\").stripPrefix("\"").stripSuffix("\"")

  def ensureLandingSlash(s: String) = if(s.isEmpty || s.charAt(0) != '\\') "\\"+s else s

  def escapeSlashes(s: String) = s.replace("\\", "\\\\")
}
