/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.decompiler.textBuilder;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/decompiler/decompiledText")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CommonDecompiledTextFromJsMetadataTestGenerated extends AbstractCommonDecompiledTextFromJsMetadataTest {
    @TestMetadata("DependencyOnNestedClasses")
    public void ignoredDependencyOnNestedClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/DependencyOnNestedClasses/");
        doTest(fileName);
    }

    @TestMetadata("FlexibleTypes")
    public void ignoredFlexibleTypes() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/FlexibleTypes/");
        doTest(fileName);
    }

    @TestMetadata("InnerClasses")
    public void ignoredInnerClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/InnerClasses/");
        doTest(fileName);
    }

    @TestMetadata("LocalClassAsTypeWithArgument")
    public void ignoredLocalClassAsTypeWithArgument() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/LocalClassAsTypeWithArgument/");
        doTest(fileName);
    }

    @TestMetadata("NestedClasses")
    public void ignoredNestedClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/NestedClasses/");
        doTest(fileName);
    }

    @TestMetadata("SecondaryConstructors")
    public void ignoredSecondaryConstructors() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/SecondaryConstructors/");
        doTest(fileName);
    }

    public void testAllFilesPresentInDecompiledText() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/decompiler/decompiledText"), Pattern.compile("^([^\\.]+)$"), true);
    }

    @TestMetadata("AnnotatedEnumEntry")
    public void testAnnotatedEnumEntry() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/AnnotatedEnumEntry/");
        doTest(fileName);
    }

    @TestMetadata("Annotations")
    public void testAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/Annotations/");
        doTest(fileName);
    }

    @TestMetadata("AnnotationsOnPrimaryCtr")
    public void testAnnotationsOnPrimaryCtr() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/AnnotationsOnPrimaryCtr/");
        doTest(fileName);
    }

    @TestMetadata("ClassWithClassObject")
    public void testClassWithClassObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/ClassWithClassObject/");
        doTest(fileName);
    }

    @TestMetadata("ClassWithNamedClassObject")
    public void testClassWithNamedClassObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/ClassWithNamedClassObject/");
        doTest(fileName);
    }

    @TestMetadata("Const")
    public void testConst() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/Const/");
        doTest(fileName);
    }

    @TestMetadata("Enum")
    public void testEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/Enum/");
        doTest(fileName);
    }

    @TestMetadata("FunctionTypes")
    public void testFunctionTypes() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/FunctionTypes/");
        doTest(fileName);
    }

    @TestMetadata("Inherited")
    public void testInherited() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/Inherited/");
        doTest(fileName);
    }

    @TestMetadata("Modifiers")
    public void testModifiers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/Modifiers/");
        doTest(fileName);
    }

    @TestMetadata("Object")
    public void testObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/Object/");
        doTest(fileName);
    }

    @TestMetadata("SimpleClass")
    public void testSimpleClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledText/SimpleClass/");
        doTest(fileName);
    }

}
