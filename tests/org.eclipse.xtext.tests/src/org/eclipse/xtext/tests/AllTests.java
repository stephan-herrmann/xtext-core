package org.eclipse.xtext.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

/*
 * automatically generated by org.eclipse.emf.mwe.releng.GenerateTestSuite 
 * 
 * @generated 
 */
public class AllTests {
   public static Test suite() {
      TestSuite suite = new TestSuite("Tests for org.eclipse.xtext.tests");
      suite.addTestSuite(org.eclipse.xtext.EcoreUtil2Test.class);
      suite.addTestSuite(org.eclipse.xtext.GrammarUtilGetReferenceTest.class);
      suite.addTestSuite(org.eclipse.xtext.GrammarUtilTest.class);
      suite.addTestSuite(org.eclipse.xtext.MweReaderTest.class);
      suite.addTestSuite(org.eclipse.xtext.XtextGrammarTest.class);
      suite.addTestSuite(org.eclipse.xtext.actions.AntlrParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.common.services.DefaultTerminalConverterTest.class);
      suite.addTestSuite(org.eclipse.xtext.concurrent.StateAccessTest.class);
      suite.addTestSuite(org.eclipse.xtext.enumrules.AntlrEnumAndReferenceTest.class);
      suite.addTestSuite(org.eclipse.xtext.enumrules.AntlrParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.enumrules.GrammarParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.enumrules.SerializationTest.class);
      suite.addTestSuite(org.eclipse.xtext.generator.ManifestMergerTest.class);
      suite.addTestSuite(org.eclipse.xtext.generator.ecore.Bug283278Test.class);
      suite.addTestSuite(org.eclipse.xtext.generator.grammarAccess.ElementFinderTest.class);
      suite.addTestSuite(org.eclipse.xtext.generator.grammarAccess.EmptyPackageAwareGrammarAccessFragmentTest.class);
      suite.addTestSuite(org.eclipse.xtext.generator.grammarAccess.FragmentFakingEcoreResourceTest.class);
      suite.addTestSuite(org.eclipse.xtext.generator.grammarAccess.GrammarAccessUtilTest.class);
      suite.addTestSuite(org.eclipse.xtext.generator.grammarAccess.ParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.generator.grammarAccess.UnicodeCharacterDatabaseNamesTest.class);
      suite.addTestSuite(org.eclipse.xtext.generator.resource.ResourceTest.class);
      suite.addTestSuite(org.eclipse.xtext.grammarinheritance.AnotherInheritanceTest.class);
      suite.addTestSuite(org.eclipse.xtext.grammarinheritance.Bug265111Test.class);
      suite.addTestSuite(org.eclipse.xtext.grammarinheritance.Inheritance2Test.class);
      suite.addTestSuite(org.eclipse.xtext.grammarinheritance.InheritanceTest.class);
      suite.addTestSuite(org.eclipse.xtext.grammarinheritance.ToEcoreTrafoTest.class);
      suite.addTestSuite(org.eclipse.xtext.lexer.Bug282355Test.class);
      suite.addTestSuite(org.eclipse.xtext.lexer.IgnoreCaseTest.class);
      suite.addTestSuite(org.eclipse.xtext.lexer.LexerErrorTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.Bug266082Test.class);
      suite.addTestSuite(org.eclipse.xtext.linking.Bug287988Test.class);
      suite.addTestSuite(org.eclipse.xtext.linking.Bug287988WithEagerLinkingTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.CrossRefTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.IgnoreCaseLinkingWithNamespaceImportsTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.IgnoreCaseLinkingWithURIImportsTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.LinkingErrorTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.PartialLinkingTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.SimpleAttributeResolverTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.lazy.BasicLazyLinkingTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.lazy.Bug281990Test.class);
      suite.addTestSuite(org.eclipse.xtext.linking.lazy.Bug289059Test.class);
      suite.addTestSuite(org.eclipse.xtext.linking.lazy.LazyLinkerTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.lazy.LazyLinkingResourceTest.class);
      suite.addTestSuite(org.eclipse.xtext.linking.lazy.LazyURIEncoderTest.class);
      suite.addTestSuite(org.eclipse.xtext.metamodelreferencing.tests.ExceptionTest.class);
      suite.addTestSuite(org.eclipse.xtext.metamodelreferencing.tests.MetamodelRefTest.class);
      suite.addTestSuite(org.eclipse.xtext.metamodelreferencing.tests.MultiGenMMTest.class);
      suite.addTestSuite(org.eclipse.xtext.mwe.PathTraverserTest.class);
      suite.addTestSuite(org.eclipse.xtext.mwe.ReaderTest.class);
      suite.addTestSuite(org.eclipse.xtext.mwe.UriBasedReaderTest.class);
      suite.addTestSuite(org.eclipse.xtext.parseerrorhandling.ParseErrorHandlingTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.AntlrDatatypeRuleTokenTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.CrossContainmentTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.DefaultEcoreElementFactoryTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.OffsetInformationTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.PartialParserCrossContainmentMultiTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.PartialParserCrossContainmentSingleTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.PartialParserReplaceTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.PartialParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.PartialParsingPerformanceTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.PartialParsingPointerTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.XtextParserBugsTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.XtextParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.antlr.Bug289515Test.class);
      suite.addTestSuite(org.eclipse.xtext.parser.antlr.Bug289524ExTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.antlr.Bug289524Test.class);
      suite.addTestSuite(org.eclipse.xtext.parser.antlr.Bug296889ExTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.antlr.Bug296889Test.class);
      suite.addTestSuite(org.eclipse.xtext.parser.antlr.Bug299237Test.class);
      suite.addTestSuite(org.eclipse.xtext.parser.antlr.Bug301935ExTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.antlr.Bug301935Test.class);
      suite.addTestSuite(org.eclipse.xtext.parser.antlr.LexerProviderTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.antlr.TokenAcceptorTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.assignments.Bug287184Test.class);
      suite.addTestSuite(org.eclipse.xtext.parser.assignments.Bug288432Test.class);
      suite.addTestSuite(org.eclipse.xtext.parser.assignments.ParserBug281962Test.class);
      suite.addTestSuite(org.eclipse.xtext.parser.datatyperules.EFactoryValueConverterTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.datatyperules.GrammarTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.datatyperules.MetamodelTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.datatyperules.MetamodelTransformationErrorTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.datatyperules.MetamodelTransformationTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.datatyperules.ParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.datatyperules.PartialParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.datatyperules.SerializationTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.datatyperules.ValueConverterTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.encoding.EncodingTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.keywords.AntlrParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.keywords.GrammarAccessTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.terminalrules.Bug292245Test.class);
      suite.addTestSuite(org.eclipse.xtext.parser.terminalrules.Bug297105Test.class);
      suite.addTestSuite(org.eclipse.xtext.parser.terminalrules.DynamicChannelTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.terminalrules.HiddensTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.terminalrules.ParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.unorderedGroups.ConcreteSyntaxValidatorTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.unorderedGroups.ErrorMessagesTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.unorderedGroups.GrammarParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.unorderedGroups.GrammarSerializerTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.unorderedGroups.MetamodelTransformationTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.unorderedGroups.ParserExTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.unorderedGroups.ParserTest.class);
      suite.addTestSuite(org.eclipse.xtext.parser.unorderedGroups.SerializerTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.ASTChangeTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.CommentTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.EmptyModelTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.HiddenTokensTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.InvalidTokenTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.LengthOffsetLineTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.NodeContentAdapterTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.NodeModelTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.NodeTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.NodeUtilTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.ParseTreeUtilTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.SerializeTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.formatter.FormatterTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.formatter.XtextFormatterTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.impl.Bug305397Test.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.impl.CommentAssociaterTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.impl.ParsetreeUtilLinuxAndMacTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.impl.ParsetreeUtilTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.impl.ParsetreeUtilWindowsTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.impl.TransientContainerReferencesTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.Bug285381Test.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.Bug299395Test.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.Bug302128Test.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.HiddenTokensMergerTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.PartialSerializationTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.SerializationBug269362Test.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.SerializationErrorTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.SimpleReconstrTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.TreeConstTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.WhitespacePreservingCallbackTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.reconstr.XtextGrammarReconcilationTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.transientvalues.TransientValuesTest.class);
      suite.addTestSuite(org.eclipse.xtext.parsetree.unassignedtext.UnassignedTextTest.class);
      suite.addTestSuite(org.eclipse.xtext.reference.CommentOnEofBug_234135_Test.class);
      suite.addTestSuite(org.eclipse.xtext.reference.LeafNodeBug_234132_Test.class);
      suite.addTestSuite(org.eclipse.xtext.resource.Bug306325Test.class);
      suite.addTestSuite(org.eclipse.xtext.resource.ClassloaderClasspathUriResolverTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.EObjectAtOffsetTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.EObjectHandleImplTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.ExternalContentSupportTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.LocationInFileProviderTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.ResourceSetReferencingResourceSetTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.XtextResourcePerformanceTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.XtextResourceTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.ecore.EcoreResourceDescriptionManagerTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.ecore.EcoreResourceDescriptionTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.ecore.XMLEncodingProviderTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.ignorecase.IgnoreCaseResourceDescriptionManagerTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.impl.DefaultReferenceDescriptionTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.impl.DefaultResourceDescription2Test.class);
      suite.addTestSuite(org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDeltaTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.impl.DefaultResourceDescriptionTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.impl.ResourceDescriptionsBasedContainerTest.class);
      suite.addTestSuite(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptionsTest.class);
      suite.addTestSuite(org.eclipse.xtext.scoping.ScopeTest.class);
      suite.addTestSuite(org.eclipse.xtext.scoping.ScopesTest.class);
      suite.addTestSuite(org.eclipse.xtext.scoping.impl.DeclarativeScopeProviderTest.class);
      suite.addTestSuite(org.eclipse.xtext.scoping.impl.ProfilingTest.class);
      suite.addTestSuite(org.eclipse.xtext.scoping.impl.QualifiedNameScopeProviderTest.class);
      suite.addTestSuite(org.eclipse.xtext.scoping.impl.SimpleNameScopeProviderTest.class);
      suite.addTestSuite(org.eclipse.xtext.service.GenericModuleTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.AutoBoxingDispatcherTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.ChainedIteratorTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.EcoreGenericsTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.FilteringIteratorTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.LineFilterOutputStreamTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.MappingIteratorTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.OnChangeEvictingCacheAdapterTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.PolymorphicDispatcherTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.ReflectionTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.SimpleCacheTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.StringsTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.TailWriterTest.class);
      suite.addTestSuite(org.eclipse.xtext.util.TuplesTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.AssignmentAllocatorTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.CompositeValidatorWithEObjectValidatorTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.CompositeValidatorWithoutEObjectValidatorTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.ConcreteSyntaxConstraintProviderTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.ConcreteSyntaxValidationTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.ConcurrentValidationTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.DeclarativeValidatorTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.ImportUriValidatorTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.NamesAreUniqueValidationHelperTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.NamesAreUniqueValidatorTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.ResourceValidatorImplTest.class);
      suite.addTestSuite(org.eclipse.xtext.validation.ValidatorTestingTest.class);
      suite.addTestSuite(org.eclipse.xtext.valueconverter.Bug250313AntlrTest.class);
      suite.addTestSuite(org.eclipse.xtext.valueconverter.DeprecatedIdConverterTest.class);
      suite.addTestSuite(org.eclipse.xtext.valueconverter.DeprecatedIntConverterTest.class);
      suite.addTestSuite(org.eclipse.xtext.valueconverter.DeprecatedStringConverterTest.class);
      suite.addTestSuite(org.eclipse.xtext.valueconverter.IDValueConverterTest.class);
      suite.addTestSuite(org.eclipse.xtext.valueconverter.IgnoreCaseIDValueConverterTest.class);
      suite.addTestSuite(org.eclipse.xtext.valueconverter.INTValueConverterTest.class);
      suite.addTestSuite(org.eclipse.xtext.valueconverter.STRINGConverterTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.Bug285605Test.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.Bug290919Test.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.ExceptionTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.KeywordInspectorTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.OverriddenValueInspectorTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.ResourceLoadTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.RuleWithoutInstantiationInspectorTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.ValidEntryRuleInspectorTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.XtextGrammarSerializationTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.XtextLinkerTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.XtextScopingTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.XtextValidationTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.ecoreInference.MultiValueFeatureTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.ecoreInference.TransformationDiagnosticTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.ecoreInference.TypeHierarchyHelperTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.ecoreInference.UnassignedRuleCallTest.class);
      suite.addTestSuite(org.eclipse.xtext.xtext.ecoreInference.Xtext2EcoreTransformerTest.class);
      return suite;
   }
}
