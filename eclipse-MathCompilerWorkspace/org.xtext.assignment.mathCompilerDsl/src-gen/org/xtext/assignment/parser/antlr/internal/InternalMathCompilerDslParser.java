package org.xtext.assignment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.assignment.services.MathCompilerDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathCompilerDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'let'", "'='", "'in'", "'end'", "'('", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathCompilerDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathCompilerDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathCompilerDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathCompilerDsl.g"; }



     	private MathCompilerDslGrammarAccess grammarAccess;

        public InternalMathCompilerDslParser(TokenStream input, MathCompilerDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathLang";
       	}

       	@Override
       	protected MathCompilerDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathLang"
    // InternalMathCompilerDsl.g:64:1: entryRuleMathLang returns [EObject current=null] : iv_ruleMathLang= ruleMathLang EOF ;
    public final EObject entryRuleMathLang() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathLang = null;


        try {
            // InternalMathCompilerDsl.g:64:49: (iv_ruleMathLang= ruleMathLang EOF )
            // InternalMathCompilerDsl.g:65:2: iv_ruleMathLang= ruleMathLang EOF
            {
             newCompositeNode(grammarAccess.getMathLangRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathLang=ruleMathLang();

            state._fsp--;

             current =iv_ruleMathLang; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathLang"


    // $ANTLR start "ruleMathLang"
    // InternalMathCompilerDsl.g:71:1: ruleMathLang returns [EObject current=null] : ( ( (lv_mathList_0_0= ruleMathExp ) ) ( (lv_mathList_1_0= ruleMathExp ) )* ) ;
    public final EObject ruleMathLang() throws RecognitionException {
        EObject current = null;

        EObject lv_mathList_0_0 = null;

        EObject lv_mathList_1_0 = null;



        	enterRule();

        try {
            // InternalMathCompilerDsl.g:77:2: ( ( ( (lv_mathList_0_0= ruleMathExp ) ) ( (lv_mathList_1_0= ruleMathExp ) )* ) )
            // InternalMathCompilerDsl.g:78:2: ( ( (lv_mathList_0_0= ruleMathExp ) ) ( (lv_mathList_1_0= ruleMathExp ) )* )
            {
            // InternalMathCompilerDsl.g:78:2: ( ( (lv_mathList_0_0= ruleMathExp ) ) ( (lv_mathList_1_0= ruleMathExp ) )* )
            // InternalMathCompilerDsl.g:79:3: ( (lv_mathList_0_0= ruleMathExp ) ) ( (lv_mathList_1_0= ruleMathExp ) )*
            {
            // InternalMathCompilerDsl.g:79:3: ( (lv_mathList_0_0= ruleMathExp ) )
            // InternalMathCompilerDsl.g:80:4: (lv_mathList_0_0= ruleMathExp )
            {
            // InternalMathCompilerDsl.g:80:4: (lv_mathList_0_0= ruleMathExp )
            // InternalMathCompilerDsl.g:81:5: lv_mathList_0_0= ruleMathExp
            {

            					newCompositeNode(grammarAccess.getMathLangAccess().getMathListMathExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_mathList_0_0=ruleMathExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathLangRule());
            					}
            					add(
            						current,
            						"mathList",
            						lv_mathList_0_0,
            						"org.xtext.assignment.MathCompilerDsl.MathExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathCompilerDsl.g:98:3: ( (lv_mathList_1_0= ruleMathExp ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathCompilerDsl.g:99:4: (lv_mathList_1_0= ruleMathExp )
            	    {
            	    // InternalMathCompilerDsl.g:99:4: (lv_mathList_1_0= ruleMathExp )
            	    // InternalMathCompilerDsl.g:100:5: lv_mathList_1_0= ruleMathExp
            	    {

            	    					newCompositeNode(grammarAccess.getMathLangAccess().getMathListMathExpParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_mathList_1_0=ruleMathExp();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathLangRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mathList",
            	    						lv_mathList_1_0,
            	    						"org.xtext.assignment.MathCompilerDsl.MathExp");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathLang"


    // $ANTLR start "entryRuleMathExp"
    // InternalMathCompilerDsl.g:121:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathCompilerDsl.g:121:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathCompilerDsl.g:122:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathCompilerDsl.g:128:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'result' ( (lv_expName_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_expName_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMathCompilerDsl.g:134:2: ( (otherlv_0= 'result' ( (lv_expName_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalMathCompilerDsl.g:135:2: (otherlv_0= 'result' ( (lv_expName_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalMathCompilerDsl.g:135:2: (otherlv_0= 'result' ( (lv_expName_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalMathCompilerDsl.g:136:3: otherlv_0= 'result' ( (lv_expName_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
            		
            // InternalMathCompilerDsl.g:140:3: ( (lv_expName_1_0= RULE_STRING ) )
            // InternalMathCompilerDsl.g:141:4: (lv_expName_1_0= RULE_STRING )
            {
            // InternalMathCompilerDsl.g:141:4: (lv_expName_1_0= RULE_STRING )
            // InternalMathCompilerDsl.g:142:5: lv_expName_1_0= RULE_STRING
            {
            lv_expName_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_expName_1_0, grammarAccess.getMathExpAccess().getExpNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expName",
            						lv_expName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMathExpAccess().getIsKeyword_2());
            		
            // InternalMathCompilerDsl.g:162:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMathCompilerDsl.g:163:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMathCompilerDsl.g:163:4: (lv_exp_3_0= ruleExp )
            // InternalMathCompilerDsl.g:164:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"org.xtext.assignment.MathCompilerDsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMathCompilerDsl.g:185:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathCompilerDsl.g:185:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathCompilerDsl.g:186:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathCompilerDsl.g:192:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathCompilerDsl.g:198:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMathCompilerDsl.g:199:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMathCompilerDsl.g:199:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMathCompilerDsl.g:200:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathCompilerDsl.g:208:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMathCompilerDsl.g:209:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMathCompilerDsl.g:209:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==14) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalMathCompilerDsl.g:210:5: (otherlv_1= '+' () )
            	            {
            	            // InternalMathCompilerDsl.g:210:5: (otherlv_1= '+' () )
            	            // InternalMathCompilerDsl.g:211:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalMathCompilerDsl.g:215:6: ()
            	            // InternalMathCompilerDsl.g:216:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathCompilerDsl.g:224:5: (otherlv_3= '-' () )
            	            {
            	            // InternalMathCompilerDsl.g:224:5: (otherlv_3= '-' () )
            	            // InternalMathCompilerDsl.g:225:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalMathCompilerDsl.g:229:6: ()
            	            // InternalMathCompilerDsl.g:230:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathCompilerDsl.g:238:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMathCompilerDsl.g:239:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMathCompilerDsl.g:239:5: (lv_right_5_0= ruleFactor )
            	    // InternalMathCompilerDsl.g:240:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.assignment.MathCompilerDsl.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMathCompilerDsl.g:262:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMathCompilerDsl.g:262:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMathCompilerDsl.g:263:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMathCompilerDsl.g:269:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathCompilerDsl.g:275:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMathCompilerDsl.g:276:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMathCompilerDsl.g:276:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMathCompilerDsl.g:277:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathCompilerDsl.g:285:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMathCompilerDsl.g:286:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMathCompilerDsl.g:286:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==15) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==16) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMathCompilerDsl.g:287:5: (otherlv_1= '*' () )
            	            {
            	            // InternalMathCompilerDsl.g:287:5: (otherlv_1= '*' () )
            	            // InternalMathCompilerDsl.g:288:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalMathCompilerDsl.g:292:6: ()
            	            // InternalMathCompilerDsl.g:293:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathCompilerDsl.g:301:5: (otherlv_3= '/' () )
            	            {
            	            // InternalMathCompilerDsl.g:301:5: (otherlv_3= '/' () )
            	            // InternalMathCompilerDsl.g:302:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalMathCompilerDsl.g:306:6: ()
            	            // InternalMathCompilerDsl.g:307:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathCompilerDsl.g:315:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMathCompilerDsl.g:316:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMathCompilerDsl.g:316:5: (lv_right_5_0= rulePrimary )
            	    // InternalMathCompilerDsl.g:317:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.assignment.MathCompilerDsl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMathCompilerDsl.g:339:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathCompilerDsl.g:339:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathCompilerDsl.g:340:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathCompilerDsl.g:346:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableBinding_2 = null;

        EObject this_VariableUse_3 = null;



        	enterRule();

        try {
            // InternalMathCompilerDsl.g:352:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse ) )
            // InternalMathCompilerDsl.g:353:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse )
            {
            // InternalMathCompilerDsl.g:353:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMathCompilerDsl.g:354:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathCompilerDsl.g:363:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMathCompilerDsl.g:372:3: this_VariableBinding_2= ruleVariableBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableBinding_2=ruleVariableBinding();

                    state._fsp--;


                    			current = this_VariableBinding_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMathCompilerDsl.g:381:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleVariableBinding"
    // InternalMathCompilerDsl.g:393:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // InternalMathCompilerDsl.g:393:56: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // InternalMathCompilerDsl.g:394:2: iv_ruleVariableBinding= ruleVariableBinding EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableBinding=ruleVariableBinding();

            state._fsp--;

             current =iv_ruleVariableBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // InternalMathCompilerDsl.g:400:1: ruleVariableBinding returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_binding_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalMathCompilerDsl.g:406:2: ( ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) )
            // InternalMathCompilerDsl.g:407:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            {
            // InternalMathCompilerDsl.g:407:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            // InternalMathCompilerDsl.g:408:3: () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end'
            {
            // InternalMathCompilerDsl.g:408:3: ()
            // InternalMathCompilerDsl.g:409:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableBindingAccess().getLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getLetKeyword_1());
            		
            // InternalMathCompilerDsl.g:419:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMathCompilerDsl.g:420:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMathCompilerDsl.g:420:4: (lv_name_2_0= RULE_ID )
            // InternalMathCompilerDsl.g:421:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVariableBindingAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalMathCompilerDsl.g:441:3: ( (lv_binding_4_0= ruleExp ) )
            // InternalMathCompilerDsl.g:442:4: (lv_binding_4_0= ruleExp )
            {
            // InternalMathCompilerDsl.g:442:4: (lv_binding_4_0= ruleExp )
            // InternalMathCompilerDsl.g:443:5: lv_binding_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_binding_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_4_0,
            						"org.xtext.assignment.MathCompilerDsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableBindingAccess().getInKeyword_5());
            		
            // InternalMathCompilerDsl.g:464:3: ( (lv_body_6_0= ruleExp ) )
            // InternalMathCompilerDsl.g:465:4: (lv_body_6_0= ruleExp )
            {
            // InternalMathCompilerDsl.g:465:4: (lv_body_6_0= ruleExp )
            // InternalMathCompilerDsl.g:466:5: lv_body_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_body_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"org.xtext.assignment.MathCompilerDsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableBindingAccess().getEndKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMathCompilerDsl.g:491:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMathCompilerDsl.g:491:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMathCompilerDsl.g:492:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMathCompilerDsl.g:498:1: ruleVariableUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMathCompilerDsl.g:504:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMathCompilerDsl.g:505:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMathCompilerDsl.g:505:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMathCompilerDsl.g:506:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMathCompilerDsl.g:506:3: ()
            // InternalMathCompilerDsl.g:507:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarAction_0(),
            					current);
            			

            }

            // InternalMathCompilerDsl.g:513:3: ( (otherlv_1= RULE_ID ) )
            // InternalMathCompilerDsl.g:514:4: (otherlv_1= RULE_ID )
            {
            // InternalMathCompilerDsl.g:514:4: (otherlv_1= RULE_ID )
            // InternalMathCompilerDsl.g:515:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableUseAccess().getRefLetCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMathCompilerDsl.g:530:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMathCompilerDsl.g:530:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMathCompilerDsl.g:531:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMathCompilerDsl.g:537:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalMathCompilerDsl.g:543:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalMathCompilerDsl.g:544:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalMathCompilerDsl.g:544:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalMathCompilerDsl.g:545:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_13);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMathCompilerDsl.g:565:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMathCompilerDsl.g:565:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMathCompilerDsl.g:566:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathCompilerDsl.g:572:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMathCompilerDsl.g:578:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMathCompilerDsl.g:579:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMathCompilerDsl.g:579:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMathCompilerDsl.g:580:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMathCompilerDsl.g:580:3: (lv_value_0_0= RULE_INT )
            // InternalMathCompilerDsl.g:581:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000220060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});

}