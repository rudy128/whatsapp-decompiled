package X;

import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.Application;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.chip.Chip;
import com.whatsapp.Conversation;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.LockableCoodinatorLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.bot.prompts.BonsaiPromptsViewModel;
import com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.conversation.ConversationEntryActionButton;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel;
import com.whatsapp.conversation.selection.ui.MessageSelectionBottomMenu;
import com.whatsapp.conversation.selectlist.Hilt_SelectListBottomSheet;
import com.whatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.whatsapp.ctwa.icebreaker.IceBreakerPickerView;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import com.whatsapp.dobverification.DosaRepository;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.expressions.BaseExpressionsTray;
import com.whatsapp.expressionstray.ExpressionsTrayView;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.media.share.ShareMediaViewModel;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;
import com.whatsapp.tosgating.viewmodel.ToSGatingViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4aY  reason: invalid class name */
public class AnonymousClass4aY {
    public static final AnonymousClass4MZ A8K = new AnonymousClass4MZ(true, true);
    public static final HashMap A8L = C17880vN.A11();
    public static final HashMap A8M = C17880vN.A11();
    public int A00 = 8;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public int A06;
    public long A07;
    public long A08 = -1;
    public ObjectAnimator A09 = null;
    public BroadcastReceiver A0A;
    public Intent A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public ViewGroup A0R;
    public ViewGroup A0S;
    public ViewGroup A0T;
    public ViewGroup A0U;
    public ViewGroup A0V;
    public FrameLayout A0W;
    public ImageButton A0X;
    public ImageButton A0Y;
    public LinearLayout A0Z;
    public TextView A0a;
    public TextView A0b;
    public AnonymousClass02n A0c = null;
    public AnonymousClass02H A0d;
    public AnonymousClass02B A0e;
    public Toolbar A0f;
    public CIZ A0g = null;
    public AnonymousClass3TF A0h;
    public BottomSheetBehavior A0i;
    public Chip A0j;
    public C19880zA A0k;
    public C19880zA A0l;
    public C19880zA A0m;
    public C19880zA A0n;
    public C19880zA A0o;
    public C19880zA A0p;
    public C19880zA A0q;
    public AnonymousClass1L9 A0r;
    public C446324e A0s;
    public C42201xn A0t;
    public AnonymousClass1LA A0u;
    public AnonymousClass190 A0v;
    public AnonymousClass4PS A0w;
    public C56332hI A0x;
    public AnonymousClass2X4 A0y;
    public AnonymousClass2X5 A0z;
    public AnonymousClass2X6 A10;
    public AnonymousClass2X7 A11;
    public AnonymousClass2X8 A12;
    public AnonymousClass4JH A13;
    public C56392hO A14;
    public AnonymousClass2X9 A15;
    public AnonymousClass2XA A16;
    public AnonymousClass2XB A17;
    public AnonymousClass2XC A18;
    public AnonymousClass2XD A19;
    public AnonymousClass2XE A1A;
    public AnonymousClass2XF A1B;
    public AnonymousClass2XG A1C;
    public AnonymousClass2XH A1D;
    public AnonymousClass2XI A1E;
    public AnonymousClass4JK A1F;
    public AnonymousClass6ZQ A1G;
    public AnonymousClass4JL A1H;
    public AnonymousClass4JM A1I;
    public AnonymousClass2XJ A1J;
    public C85884Pc A1K;
    public AnonymousClass1KB A1L;
    public KeyboardPopupLayout A1M;
    public LockableCoodinatorLayout A1N;
    public AnonymousClass11S A1O;
    public AnonymousClass194 A1P;
    public C132216mP A1Q;
    public C34531kd A1R;
    public AnonymousClass1DM A1S;
    public AnonymousClass181 A1T;
    public C72043Kk A1U;
    public C33251iW A1V;
    public WaEditText A1W;
    public AnonymousClass3T0 A1X;
    public C22417B6z A1Y;
    public AnonymousClass4OK A1Z;
    public AnonymousClass1NP A1a;
    public C180579Nc A1b = null;
    public AnonymousClass8F7 A1c;
    public BDO A1d;
    public C85424Ni A1e;
    public AnonymousClass3US A1f;
    public AnonymousClass3V2 A1g;
    public AnonymousClass3RG A1h;
    public BonsaiPromptsViewModel A1i;
    public AnonymousClass3Uv A1j;
    public AnonymousClass1VP A1k;
    public AnonymousClass1V7 A1l;
    public AnonymousClass1HS A1m;
    public C36771oR A1n;
    public AnonymousClass5Z1 A1o;
    public ConversationCommunityViewModel A1p;
    public C678531c A1q;
    public C203411t A1r;
    public AnonymousClass17T A1s;
    public AEW A1t = null;
    public AnonymousClass1VW A1u;
    public C24671Lf A1v;
    public AnonymousClass1PM A1w;
    public C25491Ok A1x;
    public C37451pZ A1y;
    public C27191Vc A1z;
    public C27171Va A20;
    public C37311pJ A21;
    public AnonymousClass12E A22;
    public C75433hU A23;
    public C115095tO A24;
    public C88184Yq A25;
    public C95644mZ A26;
    public C85814Ov A27;
    public AnonymousClass4VN A28;
    public AnonymousClass4PL A29;
    public AnonymousClass4RK A2A;
    public ConversationListView A2B;
    public C87644Wj A2C;
    public C826449e A2D;
    public C32791hl A2E;
    public C73133Pz A2F;
    public C86414Rn A2G;
    public C32951i1 A2H;
    public C85704Ok A2I;
    public MessageSelectionViewModel A2J;
    public C34811l7 A2K;
    public CtwaQualitySurveyViewModel A2L;
    public AnonymousClass4XJ A2M;
    public AnonymousClass4MT A2N;
    public AnonymousClass4NF A2O;
    public C56182h2 A2P;
    public C108865cQ A2Q;
    public AnonymousClass4ZY A2R;
    public AnonymousClass4PC A2S;
    public C108715cB A2T;
    public AnonymousClass4RS A2U;
    public MessageSelectionBottomMenu A2V;
    public AnonymousClass1RW A2W;
    public C73293Ub A2X;
    public AnonymousClass3V4 A2Y;
    public AnonymousClass3UY A2Z;
    public C86434Rp A2a;
    public AnonymousClass3VQ A2b;
    public AnonymousClass3V0 A2c;
    public AnonymousClass3TA A2d;
    public AnonymousClass1NM A2e;
    public AnonymousClass11C A2f;
    public C29781cr A2g;
    public AnonymousClass11P A2h;
    public C27301Vn A2i;
    public C19830z4 A2j;
    public C18000vb A2k;
    public CountryGatingViewModel A2l;
    public C223819r A2m;
    public C26031Qo A2n;
    public C30801eX A2o;
    public C87814Xd A2p;
    public AnonymousClass4VR A2q;
    public AnonymousClass4QB A2r;
    public C58692l6 A2s;
    public AnonymousClass4VG A2t = null;
    public C22621Co A2u;
    public C28741ap A2v;
    public AnonymousClass1CJ A2w;
    public C25181Nf A2x;
    public AnonymousClass1NA A2y;
    public AnonymousClass122 A2z;
    public AnonymousClass1Q9 A30;
    public AnonymousClass1R3 A31;
    public AnonymousClass1Cd A32;
    public AnonymousClass1NJ A33;
    public C34591kk A34;
    public AnonymousClass1E7 A35;
    public C24751Ln A36;
    public C1193267r A37;
    public AnonymousClass1KW A38;
    public EmojiSearchKeyboardContainer A39;
    public AnonymousClass4QD A3A;
    public C32231gr A3B;
    public BaseExpressionsTray A3C;
    public ExpressionsTrayView A3D;
    public C131196kh A3E;
    public C18030ve A3F;
    public AnonymousClass12L A3G;
    public C87894Xm A3H;
    public C125946bw A3I;
    public C134206qD A3J;
    public C117015z4 A3K;
    public C80753xv A3L;
    public AnonymousClass736 A3M;
    public AnonymousClass77J A3N;
    public C140126zz A3O;
    public AnonymousClass3SU A3P = null;
    public AnonymousClass1LU A3Q;
    public AnonymousClass1BI A3R;
    public UserJid A3S;
    public C32011gU A3T;
    public AnonymousClass689 A3U;
    public AnonymousClass2P2 A3V;
    public C26421Sb A3W;
    public AnonymousClass1T6 A3X;
    public ShareMediaViewModel A3Y;
    public MentionableEntry A3Z;
    public C219017v A3a;
    public WhatsAppLibLoader A3b;
    public AnonymousClass440 A3c;
    public C32291gx A3d;
    public C70313Ao A3e;
    public C30251dd A3f;
    public C63552tI A3g;
    public C34441kU A3h;
    public AnonymousClass2UJ A3i;
    public AnonymousClass1QD A3j;
    public AnonymousClass1QJ A3k;
    public AnonymousClass1QO A3l;
    public AQF A3m;
    public C85754Op A3n;
    public AnonymousClass8FO A3o;
    public PaymentMerchantAccountViewModel A3p;
    public C191769n9 A3q;
    public C185059bx A3r;
    public AnonymousClass1R2 A3s;
    public C133846pb A3t;
    public C36711oL A3u;
    public AnonymousClass7MX A3v;
    public AnonymousClass4VP A3w;
    public C18010vc A3x;
    public C26241Rj A3y;
    public AnonymousClass206 A3z;
    public AnonymousClass206 A40 = null;
    public AnonymousClass1PQ A41;
    public AnonymousClass74G A42;
    public AnonymousClass1Nb A43;
    public WallPaperView A44;
    public CVV A45;
    public C111185ii A46;
    public C132676nN A47;
    public AnonymousClass722 A48;
    public C24901Mc A49;
    public AnonymousClass3UN A4A;
    public C144987Jl A4B;
    public ToSGatingViewModel A4C;
    public C36331ni A4D;
    public C36451nu A4E;
    public C27231Vg A4F;
    public C87684Wn A4G;
    public C25831Pu A4H;
    public C26521Sl A4I;
    public C32021gV A4J;
    public AnonymousClass1Ez A4K = null;
    public AnonymousClass1DC A4L;
    public C28931bI A4M;
    public C28931bI A4N;
    public C28931bI A4O;
    public C28931bI A4P;
    public C28931bI A4Q;
    public C28931bI A4R;
    public C28931bI A4S;
    public C28931bI A4T;
    public C28931bI A4U;
    public C28931bI A4V;
    public C28931bI A4W;
    public C28931bI A4X;
    public C28931bI A4Y;
    public C28931bI A4Z;
    public C28931bI A4a;
    public C28931bI A4b;
    public AnonymousClass10I A4c;
    public C22655BIe A4d;
    public C108645c3 A4e;
    public C86034Px A4f;
    public AnonymousClass73X A4g;
    public AnonymousClass74M A4h;
    public AnonymousClass4SK A4i;
    public AnonymousClass1VT A4j;
    public AnonymousClass00H A4k;
    public AnonymousClass00H A4l;
    public AnonymousClass00H A4m;
    public AnonymousClass00H A4n = C221618v.A00(C37151p3.class);
    public AnonymousClass00H A4o;
    public AnonymousClass00H A4p;
    public AnonymousClass00H A4q = C18150vq.A02(new C99054sC(this, 15));
    public AnonymousClass00H A4r;
    public AnonymousClass00H A4s;
    public AnonymousClass00H A4t;
    public AnonymousClass00H A4u;
    public AnonymousClass00H A4v;
    public AnonymousClass00H A4w;
    public AnonymousClass00H A4x;
    public AnonymousClass00H A4y;
    public AnonymousClass00H A4z;
    public AnonymousClass00H A50;
    public AnonymousClass00H A51;
    public AnonymousClass00H A52;
    public AnonymousClass00H A53;
    public AnonymousClass00H A54;
    public AnonymousClass00H A55;
    public AnonymousClass00H A56;
    public AnonymousClass00H A57 = C221618v.A00(C37161p4.class);
    public AnonymousClass00H A58;
    public AnonymousClass00H A59;
    public AnonymousClass00H A5A;
    public AnonymousClass00H A5B;
    public AnonymousClass00H A5C;
    public AnonymousClass00H A5D;
    public AnonymousClass00H A5E;
    public AnonymousClass00H A5F;
    public AnonymousClass00H A5G;
    public AnonymousClass00H A5H;
    public AnonymousClass00H A5I;
    public AnonymousClass00H A5J;
    public AnonymousClass00H A5K;
    public AnonymousClass00H A5L;
    public AnonymousClass00H A5M;
    public AnonymousClass00H A5N = C221618v.A00(C37171p5.class);
    public AnonymousClass00H A5O;
    public AnonymousClass00H A5P;
    public AnonymousClass00H A5Q;
    public AnonymousClass00H A5R;
    public AnonymousClass00H A5S;
    public AnonymousClass00H A5T;
    public AnonymousClass00H A5U;
    public AnonymousClass00H A5V;
    public AnonymousClass00H A5W;
    public AnonymousClass00H A5X;
    public AnonymousClass00H A5Y;
    public AnonymousClass00H A5Z;
    public AnonymousClass00H A5a;
    public AnonymousClass00H A5b;
    public AnonymousClass00H A5c;
    public AnonymousClass00H A5d;
    public AnonymousClass00H A5e;
    public AnonymousClass00H A5f;
    public AnonymousClass00H A5g;
    public AnonymousClass00H A5h;
    public AnonymousClass00H A5i;
    public AnonymousClass00H A5j;
    public AnonymousClass00H A5k;
    public AnonymousClass00H A5l;
    public AnonymousClass00H A5m;
    public AnonymousClass00H A5n;
    public AnonymousClass00H A5o;
    public AnonymousClass00H A5p;
    public AnonymousClass00H A5q;
    public AnonymousClass00H A5r;
    public AnonymousClass00H A5s;
    public AnonymousClass00H A5t = C221618v.A00(C216616x.class);
    public AnonymousClass00H A5u;
    public AnonymousClass00H A5v;
    public AnonymousClass00H A5w;
    public AnonymousClass00H A5x;
    public AnonymousClass00H A5y;
    public AnonymousClass00H A5z;
    public AnonymousClass00H A60;
    public AnonymousClass00H A61;
    public AnonymousClass00H A62;
    public AnonymousClass00H A63;
    public AnonymousClass00H A64;
    public AnonymousClass00H A65;
    public AnonymousClass00H A66;
    public AnonymousClass00H A67;
    public AnonymousClass00H A68;
    public AnonymousClass00H A69;
    public AnonymousClass00H A6A;
    public AnonymousClass00H A6B;
    public AnonymousClass00H A6C;
    public AnonymousClass00H A6D;
    public AnonymousClass00H A6E;
    public AnonymousClass00H A6F;
    public AnonymousClass00H A6G;
    public AnonymousClass00H A6H;
    public AnonymousClass00H A6I;
    public Boolean A6J;
    public Integer A6K;
    public Integer A6L = null;
    public Integer A6M;
    public Long A6N;
    public Runnable A6O;
    public Runnable A6P;
    public String A6Q;
    public String A6R;
    public String A6S;
    public String A6T;
    public String A6U;
    public String A6V = "";
    public boolean A6W = false;
    public boolean A6X;
    public boolean A6Y = false;
    public boolean A6Z;
    public boolean A6a = false;
    public boolean A6b = false;
    public boolean A6c = false;
    public boolean A6d;
    public boolean A6e = false;
    public boolean A6f = false;
    public boolean A6g;
    public boolean A6h;
    public boolean A6i;
    public boolean A6j = false;
    public boolean A6k = false;
    public boolean A6l = false;
    public boolean A6m = true;
    public boolean A6n;
    public boolean A6o;
    public boolean A6p = false;
    public boolean A6q = false;
    public boolean A6r;
    public boolean A6s = true;
    public boolean A6t;
    public boolean A6u = true;
    public boolean A6v;
    public boolean A6w;
    public boolean A6x = false;
    public boolean A6y;
    public boolean A6z = false;
    public boolean A70 = false;
    public boolean A71 = false;
    public boolean A72 = false;
    public boolean A73 = false;
    public boolean A74 = false;
    public boolean A75;
    public boolean A76;
    public boolean A77 = false;
    public int A78;
    public int A79 = 0;
    public long A7A = 0;
    public Handler A7B;
    public View A7C;
    public View A7D;
    public View A7E;
    public C010105w A7F;
    public AnonymousClass1DS A7G;
    public ConversationEntryActionButton A7H;
    public AnonymousClass4VJ A7I;
    public AnonymousClass4NE A7J;
    public AnonymousClass4OW A7K;
    public C85584Ny A7L;
    public C75403hR A7M;
    public AnonymousClass48C A7N;
    public AnonymousClass1Ez A7O;
    public C28931bI A7P;
    public C28931bI A7Q;
    public C18150vq A7R;
    public C121826Lq A7S;
    public boolean A7T;
    public boolean A7U;
    public boolean A7V;
    public boolean A7W = false;
    public final DataSetObserver A7X = new C72603Mu(this, 1);
    public final Handler A7Y = C17890vO.A0D();
    public final Handler A7Z = C17890vO.A0D();
    public final PhoneStateListener A7a = new AnonymousClass3NW(this, 0);
    public final TextWatcher A7b = new AnonymousClass48E(this, 7);
    public final ViewTreeObserver.OnGlobalLayoutListener A7c = new C90584eJ(this, 20);
    public final AnonymousClass1GV A7d = new C91264fP(this, 8);
    public final C107845ai A7e = new C92094gk(this, 2);
    public final C106655Wr A7f = new C92994iG(this, 1);
    public final C106765Xc A7g = new C95154lm(this, 2);
    public final AnonymousClass1L2 A7h = new Object();
    public final C1605588y A7i = new C96014nA(this);
    public final AnonymousClass4FJ A7j = new AnonymousClass41K(this, 0);
    public final C22459B8r A7k = new C97064or(this);
    public final AnonymousClass88B A7l = new C97864qB(this);
    public final AnonymousClass00H A7m = C23731Hk.A00(new C99054sC(this, 14));
    public final Runnable A7n = new C98794rj(this, 33);
    public final Set A7o = C17880vN.A12();
    public final Set A7p = C17880vN.A12();
    public final Set A7q = C17880vN.A12();
    public final Stack A7r = new Stack();
    public final DatePickerDialog.OnDateSetListener A7s = new C88774al(this, 1);
    public final TextWatcher A7t = new AnonymousClass48E(this, 5);
    public final TextWatcher A7u = new AnonymousClass48E(this, 6);
    public final View.OnClickListener A7v = new C825048f(this, 27);
    public final View.OnClickListener A7w = new C825048f(this, 28);
    public final View.OnClickListener A7x = new C825048f(this, 29);
    public final View.OnClickListener A7y = new C89914dE(this, 40);
    public final ViewTreeObserver.OnPreDrawListener A7z = new C90664eR(this, 3);
    public final AbsListView.OnScrollListener A80 = new C90784ed(this);
    public final TextView.OnEditorActionListener A81 = new C90954eu(this);
    public final AnonymousClass1M6 A82 = new C92864i2(this, 3);
    public final AnonymousClass4LO A83 = new AnonymousClass4LO(this);
    public final AnonymousClass4LR A84 = new AnonymousClass4LR(this);
    public final AnonymousClass4LU A85 = new AnonymousClass4LU(this);
    public final AnonymousClass4WU A86 = new AnonymousClass4WU(this);
    public final AnonymousClass4LV A87 = new AnonymousClass4LV(this);
    public final AnonymousClass4WV A88 = new AnonymousClass4WV(this);
    public final AnonymousClass4LW A89 = new AnonymousClass4LW(this);
    public final C107335Zh A8A = new C95704mf(this, 1);
    public final C106865Xm A8B = new C95984n7(this);
    public final C106875Xn A8C = new C95994n8(this);
    public final C180609Nf A8D = new AnonymousClass449(this);
    public final C134226qF A8E = new AnonymousClass6H5(this, 0);
    public final C123486Uq A8F = new C827449o(this);
    public final AnonymousClass1IV A8G = new C98404r5(this, 2);
    public final Set A8H = C17880vN.A12();
    public final int[] A8I = new int[2];
    public volatile Boolean A8J = null;

    private void A0P(View view, ViewGroup viewGroup) {
        C85704Ok r2;
        A2g(A2H(1));
        boolean z = false;
        ConversationListView conversationListView = this.A2B;
        if (conversationListView != null) {
            z = conversationListView.A0D(0);
        }
        this.A06 = -1;
        this.A1M.setClipChildren(false);
        int transcriptMode = this.A2B.getTranscriptMode();
        ViewGroup viewGroup2 = viewGroup;
        int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height);
        translateAnimation.setDuration(250);
        View view2 = view;
        view.startAnimation(translateAnimation);
        if (viewGroup == this.A0V && this.A0S.getVisibility() == 0) {
            this.A0S.startAnimation(translateAnimation);
        }
        if (viewGroup == this.A0V && (r2 = this.A2I) != null) {
            r2.A04.A03.setLayoutTransition((LayoutTransition) null);
        }
        if (AnonymousClass4ZT.A01(this)) {
            this.A0W.startAnimation(translateAnimation);
        }
        if (z) {
            this.A2B.setTranscriptMode(2);
            this.A2B.startAnimation(translateAnimation);
        }
        View view3 = this.A27.A02;
        Drawable background = view3.getBackground();
        if (!(background instanceof AnonymousClass3NK)) {
            background = new AnonymousClass3NK(view3.getBackground());
            view3.setBackground(background);
        }
        AnonymousClass3NK r3 = (AnonymousClass3NK) background;
        r3.A00 = height;
        r3.invalidateSelf();
        AnonymousClass3OV r22 = new AnonymousClass3OV(this, r3, height);
        r22.setDuration(250);
        this.A27.A02.startAnimation(r22);
        r22.setAnimationListener(new C74563bx(view2, viewGroup2, this, transcriptMode, z));
    }

    public static void A0Q(View view, ViewGroup viewGroup, AnonymousClass4aY r9) {
        boolean z = false;
        AnonymousClass4aY r4 = r9;
        ConversationListView conversationListView = r9.A2B;
        if (conversationListView != null) {
            z = conversationListView.A0D(0);
        }
        r9.A06 = 1;
        r9.A1M.setClipChildren(false);
        int transcriptMode = r9.A2B.getTranscriptMode();
        ConversationListView conversationListView2 = r9.A2B;
        if (z) {
            conversationListView2.setTranscriptMode(2);
        } else {
            conversationListView2.setTranscriptMode(0);
        }
        r9.A2g(r9.A2H(0));
        viewGroup.setVisibility(0);
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C90524eD(view, viewGroup, r4, transcriptMode, z));
    }

    public static void A0T(Toolbar toolbar, AnonymousClass4aY r6) {
        toolbar.A0L();
        toolbar.setPadding(toolbar.getPaddingLeft(), toolbar.getPaddingTop(), C72463Mc.A0I(r6).getDimensionPixelSize(2131166341), toolbar.getPaddingBottom());
        toolbar.setTouchscreenBlocksFocus(false);
        if (!r6.A6d) {
            r6.A2Q.setSupportActionBar(toolbar);
            C003401n supportActionBar = r6.A2Q.getSupportActionBar();
            C17960vV.A07(supportActionBar);
            supportActionBar.A0W(false);
            supportActionBar.A0Y(false);
        }
    }

    public static synchronized void A1I(AnonymousClass4aY r8) {
        boolean z;
        AnonymousClass1E7 A0E2;
        UserJid userJid;
        AnonymousClass1E7 A0E3;
        synchronized (r8) {
            if (r8.A8J == null) {
                AnonymousClass1BI r7 = r8.A3R;
                if (C22971Dz.A0e(r7)) {
                    AnonymousClass12L r3 = r8.A3G;
                    C18030ve r2 = r8.A3F;
                    AnonymousClass1M9 contactManager = r8.A2Q.getContactManager();
                    if (C42761yh.A01(r3, r7) || C43381zi.A01(r2, r7) || (A0E2 = contactManager.A0E(r7)) == null || (userJid = A0E2.A0K) == null || !((A0E3 = contactManager.A0E(userJid)) == null || (A0E3.A0H == null && A0E3.A0I == null))) {
                        z = false;
                    } else {
                        z = C18020vd.A05(C18040vf.A02, r2, 4579);
                    }
                    r8.A8J = Boolean.valueOf(z);
                } else {
                    AnonymousClass12L r5 = r8.A3G;
                    C18030ve r4 = r8.A3F;
                    r8.A8J = Boolean.valueOf(C60622oL.A00((C35771mm) r8.A4r.get(), r8.A2Q.getContactManager(), r8.A36, r4, r5, ((AnonymousClass4MU) r8.A5U.get()).A01, r7));
                }
            }
        }
    }

    public static void A1T(AnonymousClass4aY r11, AnonymousClass1E7 r12, AnonymousClass1BI r13, boolean z) {
        AnonymousClass1E7 r9 = r12;
        AnonymousClass1BI r10 = r13;
        if (!z || !AnonymousClass3Ma.A1Y(r11.A4E)) {
            try {
                r11.A2Q.startActivityForResult(r11.A4E.A02(r12, r13, z), 13);
            } catch (ActivityNotFoundException unused) {
                AnonymousClass4Yv.A01(AnonymousClass3MW.A0P(r11), 12);
                return;
            }
        } else {
            AnonymousClass1FY A0P2 = AnonymousClass3MW.A0P(r11);
            if (A0P2 != null && !A0P2.isFinishing()) {
                if (AnonymousClass3MX.A1W(r11.A3F)) {
                    r11.A21.A01(AnonymousClass3MW.A0P(r11), new C94304kP(A0P2, r11, r12, r13), 8);
                } else {
                    C36451nu r3 = r11.A4E;
                    AnonymousClass1GP supportFragmentManager = A0P2.getSupportFragmentManager();
                    C108865cQ r0 = r11.A2Q;
                    r3.A05(A0P2, supportFragmentManager, r0.getContactAccessHelper(), r0.getWaPermissionsHelper(), r11.A2Q.getWaSharedPreferences(), r9, r10);
                }
                A0P2.getSupportFragmentManager().A0t(new C91374fa(r11, 12), A0P2, "request_bottom_sheet_fragment");
            } else {
                return;
            }
        }
        C88654aI A012 = C88444Zs.A01(r11);
        UserJid A002 = C22941Dw.A00(r13);
        if (C18020vd.A05(C18040vf.A02, A012.A03, 2805)) {
            int i = 22;
            if (z) {
                i = 21;
            }
            C88654aI.A03(A012, A002, (String) null, i, true);
        }
        r11.A2Q.getAddContactLogUtil().A06(z, 5);
    }

    public static void A1g(AnonymousClass4aY r7, boolean z) {
        C94614ku r3 = new C94614ku(r7, 1);
        r7.A2I = new C85704Ok(AnonymousClass3MW.A0P(r7), r7.A2Q.getFMessageIO(), r3, r7.A2d, AnonymousClass3MX.A0w(r7), z);
        A0x(r7);
        C85834Ox r1 = (C85834Ox) C72473Md.A0f(r7);
        if (r1 != null && (r1.A04 || r1.A05)) {
            r7.A2q.A00();
        }
        r7.A0V.addView(r7.A2I.A04);
    }

    private void A1r(Integer num, Integer num2, Integer num3) {
        Integer num4 = num3;
        ExpressionsTrayView expressionsTrayView = this.A3D;
        if (expressionsTrayView != null) {
            if (expressionsTrayView.isShown()) {
                num4 = null;
            }
            Integer num5 = num;
            Integer num6 = num2;
            this.A3D.A0G(num4, num6, num5, A3P.A00(this.A3R), A01(this));
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A39;
            if (emojiSearchKeyboardContainer != null && emojiSearchKeyboardContainer.getVisibility() == 0) {
                this.A39.A03();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r6 = (X.AnonymousClass21V) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A2G(X.C18030ve r4, X.AnonymousClass206 r5, X.AnonymousClass206 r6, boolean r7) {
        /*
            r3 = 0
            boolean r0 = r6 instanceof X.C440922c
            r2 = 0
            if (r0 == 0) goto L_0x0030
            r1 = 7401(0x1ce9, float:1.0371E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0030
            X.205 r0 = r6.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001f
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x001f
            if (r7 != 0) goto L_0x001f
            return r3
        L_0x001f:
            X.21V r6 = (X.AnonymousClass21V) r6
            X.2rc r0 = r6.A02
            if (r0 == 0) goto L_0x0030
            java.io.File r0 = r0.A0G
            if (r0 == 0) goto L_0x0030
            boolean r0 = X.AnonymousClass25A.A12(r6)
            if (r0 == 0) goto L_0x0030
            r2 = 1
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2G(X.0ve, X.206, X.206, boolean):boolean");
    }

    public void A2n(ViewGroup viewGroup, AnonymousClass206 r9, AnonymousClass206 r10) {
        AnonymousClass206 fMessage = ((AnonymousClass5Z7) viewGroup).getFMessage();
        Stack stack = this.A7r;
        if (!stack.isEmpty() && ((AnonymousClass4NG) stack.peek()).A01.A0x != fMessage.A0x) {
            stack.clear();
        }
        stack.push(new AnonymousClass4NG(r9, fMessage, viewGroup.getTop()));
        A33(r9, fMessage, r10, AnonymousClass3MW.A04(this).getDimensionPixelSize(2131166321));
        if ((r9 instanceof C441322g) && AnonymousClass73J.A00) {
            AnonymousClass3uP A012 = this.A2B.A01(r9.A0v);
            if (A012 instanceof C108405be) {
                ((C108405be) A012).CNi();
            }
        }
    }

    public void A2u(AnonymousClass1E7 r6) {
        List asList = Arrays.asList(new AnonymousClass1E7[]{r6});
        AnonymousClass1FY A0Q2 = AnonymousClass3MW.A0Q(this);
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            A132.add(C72473Md.A0X(it));
        }
        Intent className = C17880vN.A0A().setClassName(A0Q2.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
        className.putStringArrayListExtra("jid", C22971Dz.A0B(A132));
        if (C18050vg.A00(A0Q2) == null) {
            className.setFlags(268435456);
        }
        className.setAction(AnonymousClass6Z8.A01);
        A0Q2.startActivity(className);
    }

    public void A34(AnonymousClass206 r13, AnonymousClass205 r14, AnonymousClass4QM r15, String str, String str2, Bitmap[] bitmapArr, int i) {
        Object[] objArr = new Object[3];
        AnonymousClass205 r6 = r14;
        String str3 = str;
        AnonymousClass001.A1Q(r14, str3, objArr);
        String str4 = str2;
        objArr[2] = str2;
        String.format("conversation/initInlineVideoPlayback rowKey:%s fullUrl:%s canonicalUrl:%s", objArr);
        if (A3G()) {
            AnonymousClass74M r1 = this.A4h;
            C17960vV.A07(r1);
            r1.A0U((File) null, (File) null);
        }
        C108645c3 r3 = this.A4e;
        AnonymousClass206 r5 = r13;
        AnonymousClass4QM r7 = r15;
        Bitmap[] bitmapArr2 = bitmapArr;
        int i2 = i;
        if (r3 == null || this.A4d == null) {
            C22655BIe bIe = new C22655BIe(AnonymousClass3MW.A0P(this), this.A2B);
            this.A4d = bIe;
            bIe.A01 = AnonymousClass3MW.A04(this).getDimensionPixelSize(2131167133);
            C93874jg r12 = new C93874jg(this);
            this.A1n = r12;
            this.A2B.A0U.A02(r12);
            this.A4d.getViewTreeObserver().addOnGlobalLayoutListener(new C90554eG(new AnonymousClass4LQ(this), this, r5, r6, r7, str3, str4, bitmapArr2, i2));
            ((ViewGroup) this.A2Q.getWindow().getDecorView()).addView(this.A4d, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        r3.BL2(new C143887Fe(this.A1T, this.A3F, this.A3T, str3), r5, r6, r7, str3, str4, bitmapArr2, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if ((!((X.C56722hv) X.AnonymousClass3MZ.A0k(r4).A0D.get()).A00(X.AnonymousClass2R0.A02, r4.A0s)) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.AnonymousClass3MX.A0h(r4), 5875) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass4VJ A03() {
        /*
            r4 = this;
            X.4VJ r0 = r4.A7I
            if (r0 != 0) goto L_0x008e
            X.0ve r3 = r4.A3F
            boolean r0 = r4.A3H()
            if (r0 != 0) goto L_0x0092
            X.00H r0 = r4.A5U
            java.lang.Object r0 = r0.get()
            X.4MU r0 = (X.AnonymousClass4MU) r0
            X.1MB r1 = r0.A01
            X.1BI r0 = r4.A3R
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0092
            boolean r0 = X.AnonymousClass3MZ.A1W(r4)
            if (r0 == 0) goto L_0x0032
            X.0ve r2 = X.AnonymousClass3MX.A0h(r4)
            r1 = 5875(0x16f3, float:8.233E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0092
        L_0x0032:
            X.1BI r0 = r4.A3R
            if (r0 == 0) goto L_0x0058
            X.24e r0 = r4.A0s
            if (r0 == 0) goto L_0x0058
            boolean r0 = A1y(r4)
            if (r0 == 0) goto L_0x0058
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r4)
            X.00H r0 = r0.A0D
            java.lang.Object r2 = r0.get()
            X.2hv r2 = (X.C56722hv) r2
            X.24e r1 = r4.A0s
            X.2R0 r0 = X.AnonymousClass2R0.A02
            boolean r0 = r2.A00(r0, r1)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0092
        L_0x0058:
            boolean r0 = A27(r4)
            if (r0 != 0) goto L_0x0092
            X.1DC r0 = r4.A4L
            boolean r0 = r0.BcY()
            if (r0 == 0) goto L_0x0086
            X.1Nb r0 = r4.A43
            boolean r0 = r0.A0v()
            if (r0 == 0) goto L_0x0086
            boolean r0 = X.AnonymousClass3MZ.A1W(r4)
            if (r0 != 0) goto L_0x0086
            boolean r0 = A1y(r4)
            if (r0 == 0) goto L_0x008f
            X.1Ps r1 = X.C72483Me.A0S(r4)
            X.1BI r0 = r4.A3R
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x008f
        L_0x0086:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x0088:
            X.4VJ r0 = X.C87414Vm.A00(r3, r0)
            r4.A7I = r0
        L_0x008e:
            return r0
        L_0x008f:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0088
        L_0x0092:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A03():X.4VJ");
    }

    public static C88064Ye A05(AnonymousClass4aY r0) {
        return (C88064Ye) r0.A5x.get();
    }

    public static C88504Zz A06(AnonymousClass4aY r0) {
        return (C88504Zz) ((AnonymousClass4O3) ((C88444Zs) r0.A5I.get()).A02.get()).A01.get();
    }

    public static C31161f7 A07(AnonymousClass4aY r0) {
        return (C31161f7) r0.A5m.get();
    }

    public static AnonymousClass778 A08(AnonymousClass4aY r4) {
        String A0I2 = r4.A2Q.getWAContactNames().A0I(r4.A35);
        if (A0I2 == null) {
            return null;
        }
        return new AnonymousClass778(Boolean.valueOf(r4.A35.A0F()), A0I2, C22971Dz.A06(r4.A3R));
    }

    private void A0C() {
        this.A4O.A04(8);
        C010105w r0 = this.A7F;
        if (r0 != null) {
            r0.dismiss();
            this.A7F = null;
        }
    }

    private void A0E() {
        if (this.A2F == null) {
            C73133Pz r3 = new C73133Pz(AnonymousClass3MW.A0Q(this), (C108675c7) this.A7m.get());
            this.A2F = r3;
            r3.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            C73133Pz r32 = this.A2F;
            AnonymousClass1BI r2 = this.A3R;
            C108865cQ r0 = this.A2Q;
            r32.A06(r0.getConversationRowInflater().A04(r0.CFa()), r2);
            this.A2F.getViewTreeObserver().addOnGlobalLayoutListener(new C90434e4(this));
            if (C40811vJ.A0P(this.A3F) || this.A2F.A01 > 0) {
                this.A2B.addFooterView(this.A2F);
            }
        }
    }

    private void A0G() {
        AnonymousClass205 r2;
        if (this.A3Z != null && AnonymousClass11S.A00(this.A1O) != null) {
            String A0G2 = C26302CxJ.A0G(this.A3Z.getStringText(), this.A6i);
            AnonymousClass3VQ r4 = this.A2b;
            List mentions = this.A3Z.getMentions();
            C42431yA r1 = r4.A0v;
            if (r1.BeW()) {
                AnonymousClass1BI r6 = r4.A0u;
                AnonymousClass25L BQq = r1.BQq(r6);
                if (BQq != null && BQq.A03() == C49472Qp.TEXT && A0G2.equals(BQq.A04())) {
                    AnonymousClass206 r0 = BQq.A01;
                    AnonymousClass205 r3 = null;
                    if (r0 != null) {
                        r2 = r0.A0v;
                    } else {
                        r2 = null;
                    }
                    AnonymousClass206 r02 = r4.A0G;
                    if (r02 != null) {
                        r3 = r02.A0v;
                    }
                    if (C42171xk.A00(r2, r3)) {
                        r1.CQo(BQq, AnonymousClass11P.A01(r4.A0i));
                        return;
                    }
                }
                if (!A0G2.isEmpty()) {
                    long A012 = AnonymousClass11P.A01(r4.A0i);
                    AnonymousClass206 r03 = r4.A0G;
                    C18070vi.A0d(r6, 0);
                    AnonymousClass2Dr r32 = new AnonymousClass2Dr(C49472Qp.TEXT, AnonymousClass25H.DRAFT, r6, (Long) null, A0G2, mentions, -1, 0, A012);
                    r32.A01 = r03;
                    r1.CGi(r32, r6);
                    return;
                }
                C49472Qp r22 = C49472Qp.TEXT;
                C42441yB r12 = (C42441yB) r1;
                C18070vi.A0d(r6, 0);
                AnonymousClass25L BQq2 = r12.BQq(r6);
                if (BQq2 != null && BQq2.A03() == r22) {
                    r12.BIH(r6);
                }
            }
        }
    }

    private void A0H() {
        AnonymousClass4OL r5 = (AnonymousClass4OL) this.A5O.get();
        AnonymousClass1BI r4 = this.A3R;
        C18070vi.A0d(r4, 0);
        if (C18020vd.A05(C18040vf.A02, r5.A02, 8977)) {
            r5.A04.set(new C193579qK(r4, AnonymousClass11P.A01(r5.A01)));
        }
        AnonymousClass1RW r42 = this.A2W;
        C108865cQ r3 = this.A2Q;
        r42.A00.set(new AnonymousClass1RX(r3, r3.getScreenLockStateProvider(), true));
    }

    private void A0I() {
        AnonymousClass1BI r0;
        AnonymousClass1RX A002 = this.A2W.A00();
        C17960vV.A07(A002);
        if (A002.A00 == this.A2Q) {
            AnonymousClass4OL r9 = (AnonymousClass4OL) this.A5O.get();
            AnonymousClass1BI r8 = this.A3R;
            C18070vi.A0d(r8, 0);
            AtomicReference atomicReference = r9.A04;
            C193579qK r6 = (C193579qK) atomicReference.get();
            if (C18020vd.A05(C18040vf.A02, r9.A02, 8977)) {
                if (r6 != null) {
                    r0 = r6.A01;
                } else {
                    r0 = null;
                }
                if (r8.equals(r0)) {
                    r9.A03.CGS(new C21451AkI(r9, r6, 0), "BizIntegrityLogger");
                    atomicReference.set((Object) null);
                }
            }
            AnonymousClass1RW r3 = this.A2W;
            C108865cQ r2 = this.A2Q;
            AnonymousClass00N.A00(A002, new AnonymousClass1RX(r2, r2.getScreenLockStateProvider(), false), r3.A00);
        }
    }

    private void A0K() {
        AnonymousClass1BI r15 = this.A3R;
        if (r15 != null && this.A1j == null) {
            AnonymousClass10E r2 = AnonymousClass3MZ.A0k(this).A05.A00.A01;
            AnonymousClass1KB A122 = AnonymousClass10E.A12(r2);
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r2);
            C33251iW A0U2 = AnonymousClass3MZ.A0U(r2);
            AnonymousClass1R3 r11 = (AnonymousClass1R3) r2.A5f.get();
            C24681Lg A0o2 = AnonymousClass3MZ.A0o(r2);
            C32951i1 A0U3 = AnonymousClass3Ma.A0U(r2);
            C25741Pl r6 = (C25741Pl) r2.A19.get();
            C51652Zc r7 = (C51652Zc) r2.A16.get();
            AnonymousClass3Uv r22 = new AnonymousClass3Uv(A122, A0U2, (C26911Ty) r2.A1J.get(), r6, r7, (AnonymousClass1UD) r2.A14.get(), A0U3, (AnonymousClass121) r2.A2y.get(), r11, A0o2, (AnonymousClass1NJ) r2.AA3.get(), (C25931Qe) r2.A3z.get(), r15, AL1);
            this.A1j = r22;
            C91594fw.A00(AnonymousClass3MX.A0P(this), r22.A03, this, 36);
        }
    }

    private void A0L(int i) {
        int height;
        BottomSheetBehavior bottomSheetBehavior = this.A0i;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0J != 5 && this.A1M != null && this.A1N != null) {
            ExpressionsTrayView expressionsTrayView = this.A3D;
            if ((expressionsTrayView == null || expressionsTrayView.getVisibility() != 8) && (height = this.A1N.getHeight()) > 0) {
                ViewGroup.LayoutParams layoutParams = this.A1M.getLayoutParams();
                layoutParams.height = (int) ((float) (height - i));
                this.A1M.requestLayout();
            }
        }
    }

    private void A0N(int i) {
        View view = this.A7E;
        if (view != null) {
            C27641Ww.A07(view, this.A2k, view.getPaddingLeft(), this.A7E.getPaddingTop(), this.A7E.getPaddingRight(), i);
        }
    }

    public static void A0O(Bundle bundle, AnonymousClass4aY r9, List list) {
        Context context;
        C77873rd r0;
        if (list != null && !list.isEmpty()) {
            C88204Ys A0Q2 = C72473Md.A0Q(r9);
            if (!(r9.A3Z == null || r9.A0W == null || ((r0 = A0Q2.A00) != null && r0.getVisibility() == 0))) {
                C92984iF r5 = new C92984iF(A0Q2, r9);
                FrameLayout frameLayout = r9.A0W;
                View view = r9.A3Z.A05;
                AnonymousClass1BI r1 = r9.A3R;
                AnonymousClass3Ma.A1O(frameLayout, 0, r1);
                A0Q2.A01 = r1;
                C77873rd r12 = new C77873rd(AnonymousClass3MY.A04(frameLayout), A0Q2.A04);
                frameLayout.addView(r12);
                r12.A01 = r5;
                r12.setAdapterListener(new C92974iE(A0Q2));
                if (view != null) {
                    r12.setupView(view);
                }
                A0Q2.A00 = r12;
                C134146q7 r13 = A0Q2.A06;
                r13.A03 = true;
                r13.A02 = true;
            }
            AnonymousClass1F9 A0P2 = AnonymousClass3MX.A0P(r9);
            C18070vi.A0d(A0P2, 1);
            C77873rd r52 = A0Q2.A00;
            if (r52 != null) {
                if (C18020vd.A00(C18040vf.A01, A0Q2.A03.A00, 8685) - r52.A05.A04.size() > 0) {
                    AnonymousClass5UW r3 = new AnonymousClass5UW(A0Q2, list);
                    if (bundle != null) {
                        AnonymousClass73D r02 = new AnonymousClass73D();
                        r02.A05(bundle);
                        Iterator it = r02.A04().iterator();
                        while (it.hasNext()) {
                            A0Q2.A04.A06((AnonymousClass72S) it.next());
                        }
                        r3.invoke(list);
                        return;
                    }
                    AnonymousClass3MY.A1K(A0P2, A0Q2.A01(list), r3, 11);
                    return;
                }
            }
            if (bundle != null) {
                A0Q2.A0A.CGF(new C21455AkM(A0Q2, list, bundle, 47));
            }
            C77873rd r03 = A0Q2.A00;
            if (r03 != null && (context = r03.getContext()) != null) {
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, C18020vd.A00(C18040vf.A01, A0Q2.A03.A00, 8685), 0);
                String string = context.getString(2131896124, objArr);
                if (string != null) {
                    A0Q2.A02.A0G(string, 0);
                }
            }
        }
    }

    public static void A0R(View view, AnonymousClass4aY r4) {
        int height;
        int y;
        LockableCoodinatorLayout lockableCoodinatorLayout = r4.A1N;
        if (lockableCoodinatorLayout != null && (height = lockableCoodinatorLayout.getHeight()) > 0) {
            if (view.getY() == 0.0f) {
                y = 0;
            } else {
                y = (int) (((float) height) - view.getY());
            }
            r4.A0L(y);
        }
    }

    public static void A0U(AnonymousClass1HO r5, AnonymousClass4aY r6) {
        if (r5 != null) {
            C33321id A072 = r5.A07(7);
            r6.A05 = A072.A03;
            if (r6.A0P != null) {
                C28281Zt.A05(AnonymousClass3MW.A0P(r6), 2131102739);
                ViewGroup.LayoutParams layoutParams = r6.A0P.getLayoutParams();
                layoutParams.height = r6.A05;
                r6.A0P.setLayoutParams(layoutParams);
                r6.A0P.requestLayout();
                ViewGroup viewGroup = r6.A0R;
                if (viewGroup != null) {
                    View childAt = viewGroup.getChildAt(0);
                    r6.A0K = childAt;
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    r6.A0K.setPadding(A072.A01, 0, A072.A02, 0);
                    C90574eI.A00(r6.A0K.getViewTreeObserver(), r6, layoutParams2, 1);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.3Q5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.3Q5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.3Q5} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0V(X.C106655Wr r5, X.AnonymousClass4aY r6, java.util.List r7) {
        /*
            com.whatsapp.conversation.ConversationListView r1 = r6.A2B
            r0 = 2131428306(0x7f0b03d2, float:1.8478253E38)
            android.view.View r4 = r1.findViewById(r0)
            X.3Q5 r4 = (X.AnonymousClass3Q5) r4
            if (r7 == 0) goto L_0x0042
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0042
            if (r5 == 0) goto L_0x0041
            if (r4 != 0) goto L_0x003e
            X.1FY r3 = X.AnonymousClass3MW.A0Q(r6)
            r2 = 1
            X.C18070vi.A0d(r3, r2)
            r1 = 0
            r0 = 0
            X.3Q5 r4 = new X.3Q5
            r4.<init>(r3, r1, r0)
            r0 = 2131428306(0x7f0b03d2, float:1.8478253E38)
            r4.setId(r0)
            r4.setOrientation(r2)
            r0 = 8388613(0x800005, float:1.175495E-38)
            r4.setGravity(r0)
            r0 = 2
            r4.setImportantForAccessibility(r0)
            com.whatsapp.conversation.ConversationListView r0 = r6.A2B
            r0.addFooterView(r4)
        L_0x003e:
            r4.setData(r7, r5)
        L_0x0041:
            return
        L_0x0042:
            com.whatsapp.conversation.ConversationListView r0 = r6.A2B
            r0.removeFooterView(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A0V(X.5Wr, X.4aY, java.util.List):void");
    }

    public static void A0W(C135166rl r6, AnonymousClass4aY r7) {
        if (!C61182pG.A00((C61182pG) r7.A4y.get())) {
            if (r7.A6c) {
                if (C40811vJ.A0G(r7.A1O, r7.A3F)) {
                    return;
                }
            }
            if (r7.A7C == null && r7.A0Z != null) {
                AnonymousClass17T r0 = r7.A1s;
                C18030ve r4 = r7.A3F;
                View BHS = r0.BHS(AnonymousClass3MW.A0P(r7), r7.A1O, r6, r4, r7.A3R);
                r7.A7C = BHS;
                int i = 1;
                if (r7.A0P == null) {
                    i = 0;
                }
                r7.A0Z.addView(BHS, i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        if (((X.AnonymousClass72A) r8.A04.get()).A02() == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0X(X.AEW r8, X.AnonymousClass4aY r9) {
        /*
            if (r8 != 0) goto L_0x0017
            X.1E7 r0 = r9.A35
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MZ.A0x(r0)
            if (r1 == 0) goto L_0x0016
            X.5cQ r0 = r9.A2Q
            X.1Ty r0 = r0.getBusinessProfileManager()
            X.AEW r8 = r0.A08(r1)
            if (r8 != 0) goto L_0x0017
        L_0x0016:
            return
        L_0x0017:
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r9)
            X.00H r0 = r0.A02
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            java.lang.Object r3 = r0.get()
            X.6mK r3 = (X.C132176mK) r3
            int r2 = r8.A00
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r9)
            X.00H r0 = r0.A02
            X.C18070vi.A0d(r0, r5)
            java.lang.Object r0 = r0.get()
            X.6mK r0 = (X.C132176mK) r0
            java.lang.Integer r1 = r0.A00
            r0 = 5
            r3.A00(r1, r0, r2)
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r9)
            X.1gh r8 = r0.A07
            X.1FY r6 = X.AnonymousClass3MW.A0P(r9)
            X.1gi r8 = (X.C32141gi) r8
            r4 = 0
            X.C18070vi.A0d(r6, r5)
            r3 = 1
            if (r2 == r3) goto L_0x00c5
            r0 = 3
            if (r2 == r0) goto L_0x00c2
            java.lang.String r5 = "com.bloks.www.whatsapp.ai.biz.third_party_consent"
        L_0x0056:
            X.00H r0 = r8.A03
            r0.get()
            if (r2 != r3) goto L_0x00c0
            java.util.LinkedHashMap r2 = X.C32141gi.A00(r8)
            X.0ve r7 = r8.A01
            r1 = 12820(0x3214, float:1.7965E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r1)
            if (r0 == 0) goto L_0x007c
            X.00H r0 = r8.A04
            java.lang.Object r0 = r0.get()
            X.72A r0 = (X.AnonymousClass72A) r0
            boolean r1 = r0.A02()
            r0 = 1
            if (r1 != 0) goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_meta_ai_tos_accepted"
            r2.put(r0, r1)
            java.lang.String r0 = "server_params"
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r2)
            java.util.Map r1 = X.C200610r.A04(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r1 = X.C18070vi.A0H(r0)
        L_0x0099:
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity"
            r2.setClassName(r6, r0)
            java.lang.String r0 = "screen_name"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "screen_params"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "is_async_component"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "restore_saved_instance"
            r2.putExtra(r0, r3)
            X.1FY r1 = X.AnonymousClass3MW.A0P(r9)
            r0 = 120(0x78, float:1.68E-43)
            r1.CNh(r2, r0)
            return
        L_0x00c0:
            r1 = 0
            goto L_0x0099
        L_0x00c2:
            java.lang.String r5 = "com.bloks.www.whatsapp.ai.biz.meta_ai_consent"
            goto L_0x0056
        L_0x00c5:
            java.lang.String r5 = "com.bloks.www.whatsapp.ai.biz.consent"
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A0X(X.AEW, X.4aY):void");
    }

    public static void A0Y(AnonymousClass4aY r4) {
        r4.A2T.CCH(r4.A2Q.getActivityNullable(), r4.A2Q.getConversationRowInflater().A02, r4.A3R);
    }

    public static void A0Z(AnonymousClass4aY r4) {
        BottomSheetBehavior bottomSheetBehavior;
        int A0R2;
        View view = r4.A0G;
        if (view != null && r4.A1N != null && (bottomSheetBehavior = r4.A0i) != null && r4.A3D != null) {
            AnonymousClass3MX.A1F(view, bottomSheetBehavior.A0C);
            r4.A0G.requestLayout();
            r4.A0G.getViewTreeObserver().addOnGlobalLayoutListener(new C90584eJ(r4, 21));
            if (r4.A3D.getVisibility() != 8) {
                BottomSheetBehavior bottomSheetBehavior2 = r4.A0i;
                if (bottomSheetBehavior2.A0J == 3) {
                    A0R2 = bottomSheetBehavior2.A0C;
                    r4.A0L(A0R2);
                }
            }
            if (r4.A3D.getVisibility() != 8) {
                BottomSheetBehavior bottomSheetBehavior3 = r4.A0i;
                if (bottomSheetBehavior3.A0J == 4) {
                    A0R2 = bottomSheetBehavior3.A0R();
                    r4.A0L(A0R2);
                }
            }
        }
    }

    public static void A0a(AnonymousClass4aY r6) {
        if (r6.A3R != null) {
            C121826Lq r1 = r6.A7S;
            if (r1 != null) {
                r1.A0B(true);
                r6.A7S = null;
            }
            AnonymousClass7O7 r4 = new AnonymousClass7O7(r6, 0);
            AnonymousClass1W6 fMessageDatabase = r6.A2Q.getFMessageDatabase();
            AnonymousClass73X r2 = r6.A4g;
            AnonymousClass1BI r12 = r6.A3R;
            C17960vV.A07(r12);
            r6.A7S = new C121826Lq(r12, fMessageDatabase, r4, r2);
            AnonymousClass3MW.A1T(r6.A7S, AnonymousClass3MX.A0w(r6), 0);
        }
    }

    public static void A0b(AnonymousClass4aY r2) {
        BaseExpressionsTray baseExpressionsTray = r2.A3C;
        if (baseExpressionsTray != null) {
            ExpressionsSearchView expressionsSearchView = (ExpressionsSearchView) baseExpressionsTray;
            expressionsSearchView.A0N = null;
            expressionsSearchView.A0E = null;
            expressionsSearchView.A0J = null;
            r2.A3C = null;
        }
    }

    public static void A0d(AnonymousClass4aY r3) {
        MentionableEntry mentionableEntry = r3.A3Z;
        TextWatcher textWatcher = r3.A7t;
        mentionableEntry.removeTextChangedListener(textWatcher);
        r3.A6i = false;
        try {
            r3.A3Z.setText("");
            r3.A2e();
            TextKeyListener.clear(r3.A3Z.getText());
            A0a(r3);
            if (r3.A2q.A02()) {
                A1h(r3, true);
            }
        } finally {
            if (!AnonymousClass3MZ.A1W(r3)) {
                r3.A3Z.addTextChangedListener(textWatcher);
            }
        }
    }

    public static void A0e(AnonymousClass4aY r2) {
        if (r2.A0p.A07()) {
            r2.A2Q.findViewById(2131435849);
            if (r2.A3Z != null) {
                r2.A0p.A03();
                r2.A4V.A02();
                C17960vV.A07(r2.A3R);
                throw AnonymousClass000.A0s("makeQuickReplyHelper");
            }
        }
    }

    public static void A0f(AnonymousClass4aY r4) {
        ViewGroup viewGroup = (ViewGroup) r4.A2Q.findViewById(2131434244);
        if (r4.A2Q.findViewById(2131434243) == null) {
            r4.A2Q.getLayoutInflater().inflate(2131626647, viewGroup, true);
        }
    }

    public static void A0g(AnonymousClass4aY r15) {
        int i;
        if (r15.A4h == null) {
            r15.A4b.A02();
            A1d(r15, "voice_recording_ui_start");
            r15.A2Q.getLayoutInflater().inflate(2131627463, (ViewGroup) r15.A2Q.findViewById(2131436905), true);
            r15.A7E = r15.A2Q.findViewById(2131436898);
            if (r15.A6h) {
                i = C72463Mc.A0I(r15).getDimensionPixelOffset(2131166327);
            } else {
                i = 0;
            }
            r15.A0N(i);
            C98374r2 r10 = new C98374r2(r15);
            AnonymousClass4SK r1 = r15.A4i;
            AnonymousClass1FY A0P2 = AnonymousClass3MW.A0P(r15);
            KeyboardPopupLayout keyboardPopupLayout = r15.A1M;
            AnonymousClass3V4 r6 = r15.A2Y;
            AnonymousClass1FY r5 = A0P2;
            AnonymousClass74M A002 = r1.A01.A00(keyboardPopupLayout, A0P2, r5, r6, r1.A00.A01(A0P2, keyboardPopupLayout), r1.A04, r1.A05.BGi(A0P2), r10, (C126726dC) null, true, true, false);
            r15.A4h = A002;
            AnonymousClass1BI r2 = r15.A3R;
            C17960vV.A0H(!AnonymousClass000.A1W(A002.A0J), "Do not update the ptt receiver once the recording has started");
            A002.A0C = r2;
            if (C18020vd.A05(C18040vf.A02, A002.A0q, 2832)) {
                AnonymousClass1BI r12 = A002.A0C;
                if (!C22971Dz.A0V(r12) && !C22971Dz.A0S(r12) && !C42701yb.A01(r12) && !A002.A0r.Bey(A002.A0C)) {
                    View view = A002.A15.A01;
                    view.setVisibility(0);
                    view.setOnClickListener(new AnonymousClass78L(A002, 36));
                }
            }
            r15.A4h.A0E = r15.A2b.A0G;
            A1F(r15);
            A1d(r15, "voice_recording_ui_end");
        }
    }

    public static void A0h(AnonymousClass4aY r5) {
        boolean z;
        C87684Wn.A00(r5.A4G, 8);
        if (A27(r5)) {
            A1f(r5, (String) null, true, false, false);
            return;
        }
        C85834Ox r4 = (C85834Ox) C72473Md.A0f(r5);
        if (r4 == null || (!r4.A04 && !r4.A05)) {
            z = false;
        } else {
            z = true;
        }
        if (C72473Md.A08(r5) == 2 || !z || r5.A2q.A02() || !A28(r5)) {
            A0p(r5);
            return;
        }
        if (r5.A4S.A02().getVisibility() == 0) {
            C72463Mc.A1G(r5.A4S);
            C88654aI.A02(C88444Zs.A01(r5), AnonymousClass3MW.A0j(r5), (String) null, 42);
        }
        r5.A2q.A00();
        AnonymousClass4VG r1 = r5.A2t;
        if (r1 != null && r1.A09 != null) {
            r5.A2q.A01(r1, r4, (String) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0i(X.AnonymousClass4aY r3) {
        /*
            X.4VR r0 = r3.A2q
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            int r0 = r3.A2H(r0)
            r3.A2g(r0)
        L_0x0010:
            X.4VR r2 = r3.A2q
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x0049
            int r3 = r2.A00
            r0 = 3
            r1 = 8
            if (r3 != r0) goto L_0x004a
            com.whatsapp.ctwa.icebreaker.IceBreakerPickerView r0 = r2.A09
        L_0x001f:
            X.C17960vV.A05(r0)
            r0.setVisibility(r1)
        L_0x0025:
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x0049
            r0 = 0
            r2.A0G = r0
            int r1 = r2.A00
            r0 = 2
            if (r1 == r0) goto L_0x0034
            r0 = 3
            if (r1 != r0) goto L_0x0049
        L_0x0034:
            android.view.ViewGroup r1 = r2.A02
            android.view.View r0 = r2.A01
            r1.removeView(r0)
            android.view.ViewGroup r1 = r2.A02
            X.3Zj r0 = r2.A0A
            r1.removeView(r0)
            android.widget.TextView r1 = r2.A04
            android.text.TextWatcher r0 = r2.A0K
            r1.removeTextChangedListener(r0)
        L_0x0049:
            return
        L_0x004a:
            r0 = 2
            if (r3 != r0) goto L_0x0050
            X.3Zj r0 = r2.A0A
            goto L_0x001f
        L_0x0050:
            X.1bI r0 = r2.A0D
            X.C17960vV.A07(r0)
            r0.A04(r1)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A0i(X.4aY):void");
    }

    public static void A0k(AnonymousClass4aY r5) {
        C143887Fe r1 = r5.A2d.A00;
        if (r1 instanceof C75373hL) {
            C20941Abv abv = ((C75373hL) r1).A00;
            C88654aI A012 = C88444Zs.A01(r5);
            UserJid A0j2 = AnonymousClass3MW.A0j(r5);
            int i = 4;
            if (abv != null) {
                i = 17;
            }
            C88654aI.A03(A012, A0j2, (String) null, i, true);
        }
    }

    public static void A0l(AnonymousClass4aY r3) {
        if (!TextUtils.isEmpty(r3.A0B.getStringExtra("extra_deep_link_session_id")) && r3.A35.A0C()) {
            if (C18020vd.A05(C18040vf.A02, r3.A3F, 9568)) {
                A4F.A01((A4F) AnonymousClass3Ma.A0Z(r3).A07.get(), AnonymousClass3MW.A0j(r3), 3);
            }
        }
    }

    public static void A0n(AnonymousClass4aY r6) {
        String str;
        if (r6.A44 != null) {
            ViewGroup viewGroup = (ViewGroup) C110885hR.A0A(AnonymousClass3MW.A0P(r6), 2131434738);
            ViewGroup viewGroup2 = r6.A1N;
            if (viewGroup2 == null) {
                viewGroup2 = r6.A1M;
            }
            boolean A2B2 = A2B(r6);
            ViewParent parent = r6.A44.getParent();
            WallPaperView wallPaperView = r6.A44;
            if (A2B2) {
                if (parent == viewGroup2) {
                    viewGroup2.removeView(wallPaperView);
                    viewGroup.addView(r6.A44, 0);
                    return;
                } else if (wallPaperView.getParent() != viewGroup) {
                    str = "conversation/maybeUpdateWallPaperParent/Wallpaper view should be in root view";
                } else {
                    return;
                }
            } else if (parent == viewGroup) {
                viewGroup.removeView(wallPaperView);
                viewGroup2.addView(r6.A44, 0);
                return;
            } else if (wallPaperView.getParent() != viewGroup2) {
                str = "conversation/maybeUpdateWallPaperParent/Wallpaper view should be in content view group";
            } else {
                return;
            }
            Log.e(str);
        }
    }

    public static void A0o(AnonymousClass4aY r3) {
        if (r3.A6k) {
            if (C18020vd.A05(C18040vf.A02, r3.A3F, 3403)) {
                ((C136766uM) AnonymousClass3Ma.A0Z(r3).A0C.get()).A00();
                r3.A7i.CAy((String) null);
                return;
            }
        }
        if (!r3.A1u() || !C72463Mc.A1R(r3)) {
            if (r3.A3D == null) {
                A0y(r3);
                r3.A0E.post(new C98834rn((Object) r3, 36));
                return;
            }
        } else if (r3.A3D == null) {
            A0y(r3);
        }
        if (!r3.A1M.A09) {
            ExpressionsTrayView expressionsTrayView = r3.A3D;
            if (expressionsTrayView == null || expressionsTrayView.getVisibility() != 8) {
                A1A(r3);
            } else {
                A18(r3);
            }
        }
    }

    public static void A0p(AnonymousClass4aY r4) {
        BottomSheetBehavior bottomSheetBehavior;
        if (r4.A2B.getLastVisiblePosition() >= (r4.A2B.getCount() - r4.A2B.getFooterViewsCount()) - 1) {
            r4.A2B.setTranscriptMode(2);
            r4.A2B.A0B(true);
        }
        A0w(r4);
        if (A26(r4) && (bottomSheetBehavior = r4.A0i) != null && bottomSheetBehavior.A0J != 2) {
            r4.A2O();
        }
    }

    public static void A0q(AnonymousClass4aY r3) {
        int i;
        r3.A2b.A0b((AnonymousClass206) null);
        if (r3.A0S.getVisibility() == 0 && (i = r3.A06) >= 0 && r3.A0I != null) {
            C17900vP.A0j("conversation/hidelinkpreview/start ", AnonymousClass000.A10(), i);
            r3.A0P(r3.A0I, r3.A0S);
        }
        r3.A2e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r4 = r5.A2B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0r(X.AnonymousClass4aY r5) {
        /*
            java.lang.Boolean r0 = r5.A8J
            if (r0 == 0) goto L_0x0027
            java.lang.Boolean r0 = r5.A8J
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0027
            com.whatsapp.conversation.ConversationListView r4 = r5.A2B
            int r3 = r4.getFirstVisiblePosition()
            int r2 = r4.getLastVisiblePosition()
            if (r3 > r2) goto L_0x0027
        L_0x0018:
            android.view.View r1 = r4.getChildAt(r3)
            boolean r0 = r1 instanceof X.C78953tz
            if (r0 == 0) goto L_0x0050
            X.3tz r1 = (X.C78953tz) r1
            if (r1 == 0) goto L_0x0027
            r0 = 1
            r1.A09 = r0
        L_0x0027:
            X.12E r0 = r5.A22
            r3 = 0
            r0.A0D(r3)
            X.1E7 r0 = r5.A35
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0046
            X.1E7 r0 = r5.A35
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass3MZ.A0x(r0)
            if (r2 == 0) goto L_0x0046
            X.5cQ r1 = r5.A2Q
            X.1Ty r0 = r1.getBusinessProfileManager()
            r0.A0F(r1, r2, r3)
        L_0x0046:
            X.5cQ r0 = r5.A2Q
            X.1q1 r0 = r0.getAddContactLogUtil()
            r0.A02()
            return
        L_0x0050:
            if (r3 == r2) goto L_0x0027
            int r3 = r3 + 1
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A0r(X.4aY):void");
    }

    public static void A0t(AnonymousClass4aY r7) {
        ((C38751rp) r7.A5g.get()).A00(true);
        AnonymousClass4ZG r6 = (AnonymousClass4ZG) r7.A5h.get();
        AnonymousClass1FY A0P2 = AnonymousClass3MW.A0P(r7);
        Integer num = r7.A6K;
        String str = r7.A6Q;
        C18070vi.A0d(A0P2, 0);
        AnonymousClass4ZG.A01(AnonymousClass3MX.A0O(A0P2), r6, new C99334se(A0P2, r6, num, str), 19);
    }

    public static void A0u(AnonymousClass4aY r2) {
        r2.A2Q.getMessageAudioPlayerProvider().A04();
        r2.A2Q.invalidateOptionsMenu();
        C108645c3 r1 = r2.A4e;
        if (r1 != null && r1.BT1()) {
            r1.CBJ();
        }
        C108865cQ r0 = r2.A2Q;
        AnonymousClass4aV.A02(r0.getContentView(), r0.getMessageAudioPlayerProvider());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A2Q.Bg6() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0v(X.AnonymousClass4aY r4) {
        /*
            android.view.View r3 = r4.A0D
            X.02B r0 = r4.A0e
            r2 = 8
            if (r0 != 0) goto L_0x0011
            X.5cQ r0 = r4.A2Q
            boolean r1 = r0.Bg6()
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0011:
            r0 = 8
        L_0x0013:
            r3.setVisibility(r0)
            r4.A0C()
            X.4Ye r0 = A05(r4)
            r0.A02(r2)
            X.4NE r0 = r4.A7J
            X.1bI r0 = r0.A00
            if (r0 == 0) goto L_0x0029
            r0.A04(r2)
        L_0x0029:
            X.4Ye r0 = A05(r4)
            r0.A01(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A0v(X.4aY):void");
    }

    public static void A0w(AnonymousClass4aY r8) {
        AnonymousClass206 r2;
        AnonymousClass3uP A012;
        if (r8.A2Q.getSelectedMessages() == null || r8.A2Q.getSelectedMessages().A03.isEmpty()) {
            r2 = null;
        } else {
            r2 = (AnonymousClass206) AnonymousClass4Z0.A00(r8.A2Q.getSelectedMessages().A00());
        }
        C108865cQ r1 = r8.A2Q;
        if (r1.getSelectionActionMode() != null && r1.getSelectedMessages() != null && r8.A2b.A0G == null && r2 != null && ((C139546z1) r8.A5z.get()).A02(r2) && (A012 = r8.A2B.A01(r2.A0v)) != null) {
            if (A012.A1j() && A012.A03 == 0) {
                View view = A012.A0j;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{(float) (A012.getWidth() / 6)});
                ofFloat.setDuration(600).setInterpolator(new C23621Gz());
                AnonymousClass3Mo.A00(ofFloat, A012, 11);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f});
                ofFloat2.setDuration(200).setInterpolator(new DecelerateInterpolator());
                AnonymousClass3Mo.A00(ofFloat2, A012, 12);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat);
                animatorSet.play(ofFloat2).after(900);
                animatorSet.start();
                A012.A03 = 2;
                A012.invalidate();
            }
            AnonymousClass3MX.A0U(r8).A08(2131896649, 1);
            r8.A2Q.BLL();
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.3Zj, android.view.View, androidx.recyclerview.widget.RecyclerView] */
    public static void A0x(AnonymousClass4aY r11) {
        AnonymousClass4LS r9 = new AnonymousClass4LS(r11);
        boolean A282 = A28(r11);
        AnonymousClass4VR r5 = r11.A2q;
        AnonymousClass1BI r4 = r11.A3R;
        ConversationListView conversationListView = r11.A2B;
        if (A282) {
            FrameLayout frameLayout = r11.A0W;
            MentionableEntry mentionableEntry = r11.A3Z;
            r5.A00 = 3;
            r5.A0B = r4;
            r5.A08 = r9;
            r5.A03 = conversationListView;
            r5.A04 = mentionableEntry;
            r5.A02 = frameLayout;
            r5.A07 = null;
            if (!r5.A0F) {
                View inflate = LayoutInflater.from(r5.A0J).inflate(2131624743, r5.A02, false);
                r5.A01 = inflate;
                C17960vV.A05(inflate);
                r5.A06 = (ShimmerFrameLayout) AnonymousClass1HF.A06(inflate, 2131435408);
                r5.A01.setVisibility(8);
                frameLayout.addView(r5.A01);
                IceBreakerPickerView iceBreakerPickerView = (IceBreakerPickerView) AnonymousClass3MZ.A0D(mentionableEntry).inflate(2131625564, frameLayout, false);
                r5.A09 = iceBreakerPickerView;
                iceBreakerPickerView.setupView(mentionableEntry.A05);
                r5.A0G = true;
                frameLayout.addView(r5.A09);
                r5.A04.addTextChangedListener(r5.A0K);
                return;
            }
            return;
        }
        MentionableEntry mentionableEntry2 = r11.A3Z;
        ViewGroup viewGroup = r11.A0V;
        C85704Ok r1 = r11.A2I;
        KeyboardPopupLayout keyboardPopupLayout = r11.A1M;
        if (r5.A0W && !r5.A0G) {
            r5.A0B = r4;
            r5.A08 = r9;
            r5.A03 = conversationListView;
            r5.A04 = mentionableEntry2;
            r5.A02 = viewGroup;
            r5.A07 = r1;
            Activity activity = r5.A0J;
            boolean A1T2 = AnonymousClass000.A1T(C72453Mb.A08(activity), 2);
            if (r5.A00 != 2) {
                r5.A0D = C72453Mb.A0r(activity, r5.A0I);
            } else if (!A1T2) {
                View inflate2 = LayoutInflater.from(activity).inflate(2131624743, viewGroup, false);
                r5.A01 = inflate2;
                C17960vV.A05(inflate2);
                r5.A06 = (ShimmerFrameLayout) AnonymousClass1HF.A06(inflate2, 2131435408);
                r5.A01.setVisibility(8);
                viewGroup.addView(r5.A01);
                AnonymousClass1L4 r2 = r5.A0C;
                C84874Le r12 = new C84874Le(r5);
                ? recyclerView = new RecyclerView(activity, (AttributeSet) null);
                recyclerView.A05 = keyboardPopupLayout;
                recyclerView.A07 = mentionableEntry2;
                recyclerView.A06 = viewGroup;
                recyclerView.A0C = r2;
                recyclerView.A08 = r12;
                recyclerView.A02 = recyclerView.getResources().getDimensionPixelSize(2131167014);
                recyclerView.A00 = -1;
                recyclerView.A04 = -1;
                recyclerView.A09 = new C87734Wt(recyclerView);
                recyclerView.A0A = new C87734Wt(recyclerView);
                recyclerView.A0E = false;
                C72463Mc.A0v(recyclerView.getContext(), recyclerView.getContext(), recyclerView, 2130970078, 2131101213);
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                recyclerView.A0B = new AnonymousClass3WL();
                AnonymousClass3Ma.A15(recyclerView.getContext(), recyclerView);
                recyclerView.setAdapter(recyclerView.A0B);
                r5.A0A = recyclerView;
                recyclerView.setVisibility(8);
                r5.A0H = false;
                viewGroup.addView(r5.A0A);
                mentionableEntry2.addTextChangedListener(r5.A0K);
            } else {
                return;
            }
            r5.A0G = true;
        }
    }

    public static void A0y(AnonymousClass4aY r8) {
        if (r8.A1N != null) {
            r8.A3D = new ExpressionsTrayView(r8.A1M.getContext(), (AttributeSet) null, 0, false, r8.A3R, 1);
            C37891qK r3 = new C37891qK(-1, -1);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            bottomSheetBehavior.A0d(true);
            bottomSheetBehavior.A0W(4);
            bottomSheetBehavior.A0Y(AnonymousClass3MW.A04(r8).getDimensionPixelOffset(2131166738), false);
            r3.A00(bottomSheetBehavior);
            r8.A3D.setLayoutParams(r3);
            r8.A1N.addView(r8.A3D);
            r8.A3D.setExpressionsSheetHandleClickListener(new C89914dE(r8, 39));
        }
        r8.A0G = r8.A2Q.findViewById(2131430747);
        r8.A39 = (EmojiSearchKeyboardContainer) r8.A2Q.findViewById(2131430336);
        ((C133686pK) r8.A5P.get()).A01((Integer) null);
        if (r8.A3D != null) {
            if (!r8.A2Q.Bg6()) {
                AnonymousClass160 r1 = (AnonymousClass160) AnonymousClass3Ma.A0X(r8).A02.get();
                r1.A00 = AnonymousClass00R.A01;
                r1.A01 = false;
            }
            ExpressionsTrayView expressionsTrayView = r8.A3D;
            expressionsTrayView.A0M = r8.A7l;
            expressionsTrayView.A0J = new C96144nN(r8);
            expressionsTrayView.A02 = r8.A7e;
            expressionsTrayView.setExpressionsSearchListener(r8.A7i);
            r8.A3D.setExpressionsMultiSelectListener(r8.A8B);
            r8.A3D.setSendStickerPackListener(r8.A8C);
            r8.A3D.setAdapterFunStickerData(A08(r8));
            r8.A3D.setVisibility(8);
            r8.A3D.setTabSelectionListener(new C96004n9(r8));
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(r8.A3D);
            r8.A0i = A022;
            A022.A0Z(new C74483bk(r8, 1));
            LockableCoodinatorLayout lockableCoodinatorLayout = r8.A1N;
            if (lockableCoodinatorLayout != null) {
                lockableCoodinatorLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C90414e2(r8, 0, false));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.1HE, X.Cbm] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0z(X.AnonymousClass4aY r5) {
        /*
            android.view.ViewGroup r0 = r5.A0R
            if (r0 == 0) goto L_0x0085
            X.1FY r2 = X.AnonymousClass3MW.A0Q(r5)
            if (r2 == 0) goto L_0x0085
            boolean r1 = r2 instanceof com.whatsapp.Conversation
            r0 = 2131429583(0x7f0b08cf, float:1.8480843E38)
            if (r1 == 0) goto L_0x0014
            r0 = 2131434738(0x7f0b1cf2, float:1.8491298E38)
        L_0x0014:
            android.view.View r4 = r2.findViewById(r0)
            if (r4 == 0) goto L_0x0085
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            android.view.View r0 = r0.getLastRow()
            r3 = 0
            if (r0 != 0) goto L_0x0088
            r1 = 0
        L_0x0024:
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            int r0 = r0.getBottom()
            if (r1 < r0) goto L_0x0086
            X.1Il r0 = X.AnonymousClass3Ma.A0j(r5)
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x0086
            boolean r0 = A26(r5)
            if (r0 == 0) goto L_0x0086
            X.0ve r2 = r5.A3F
            X.0vf r1 = X.C18040vf.A01
            r0 = 4245(0x1095, float:5.949E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0086
            r2 = 1
        L_0x0049:
            r1 = 1
            X.BJm r0 = new X.BJm
            r0.<init>(r1)
            X.AnonymousClass1HF.A0k(r4, r0)
            X.AnonymousClass1HF.A0g(r4, r0)
            X.1FY r0 = X.AnonymousClass3MW.A0P(r5)
            android.view.Window r0 = r0.getWindow()
            X.AnonymousClass6VM.A00(r0, r3)
            com.whatsapp.KeyboardPopupLayout r1 = r5.A1M
            X.3SU r0 = new X.3SU
            r0.<init>(r1, r3, r2)
            r5.A3P = r0
            X.0ve r1 = r5.A3F
            boolean r0 = r5.A6n
            boolean r0 = X.C40811vJ.A0c(r1, r0)
            if (r0 == 0) goto L_0x007e
            X.3SU r2 = r5.A3P
            r1 = 45
            X.4sL r0 = new X.4sL
            r0.<init>(r5, r1)
            r2.A00 = r0
        L_0x007e:
            com.whatsapp.KeyboardPopupLayout r1 = r5.A1M
            X.3SU r0 = r5.A3P
            X.AnonymousClass1HF.A0k(r1, r0)
        L_0x0085:
            return
        L_0x0086:
            r2 = 0
            goto L_0x0049
        L_0x0088:
            int r1 = r0.getBottom()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A0z(X.4aY):void");
    }

    public static void A10(AnonymousClass4aY r4) {
        ViewGroup viewGroup;
        AnonymousClass1BI r3 = r4.A3R;
        if (C18020vd.A05(C18040vf.A01, C72473Md.A0R(r4).A00, 6358)) {
            C73343Uy r1 = (C73343Uy) AnonymousClass3MZ.A0k(r4).A08.get();
            r1.A0T(r4.A35, r3);
            C91594fw.A00(AnonymousClass3MX.A0P(r4), r1.A09, r4, 4);
        } else if (r3 != null && (viewGroup = (ViewGroup) r4.A2Q.findViewById(2131428139)) != null) {
            AnonymousClass3RG r0 = new AnonymousClass3RG(AnonymousClass3MW.A0Q(r4));
            r4.A1h = r0;
            r0.getViewModel().A0T(r4.A35, r3);
            viewGroup.addView(r4.A1h);
            r4.A1M.addOnLayoutChangeListener(new C90224dj(r4, 4));
        }
    }

    public static void A12(AnonymousClass4aY r3) {
        ExpressionsTrayView expressionsTrayView;
        if (r3.A39 != null && (expressionsTrayView = r3.A3D) != null && r3.A0i != null) {
            r3.A1M.A09 = true;
            expressionsTrayView.setVisibility(8);
            r3.A3D.post(new C98834rn((Object) r3, 31));
        }
    }

    public static void A13(AnonymousClass4aY r3) {
        C143887Fe r32;
        Log.i("conversation/showLinkPreviewShell");
        if (!A28(r3)) {
            if (r3.A2I == null) {
                A1g(r3, false);
            }
            if (r3.A0V.getVisibility() != 0 || r3.A06 < 0) {
                Log.i("conversation/showLinkPreviewShell/start");
                C85704Ok r0 = r3.A2I;
                if (r0 != null) {
                    A0Q(r0.A04, r3.A0V, r3);
                }
            }
            C85704Ok r1 = r3.A2I;
            if (r1 != null && (r32 = r3.A2d.A00) != null) {
                r1.A04.A0P(r32, (List) null, false);
            }
        }
    }

    public static void A14(AnonymousClass4aY r5) {
        AnonymousClass3Ma.A1M(r5.A7J.A00);
        AnonymousClass3MZ.A1S(r5);
        AnonymousClass1FY A0Q2 = AnonymousClass3MW.A0Q(r5);
        Object[] A1a2 = AnonymousClass3MW.A1a();
        C72483Me.A0c(AnonymousClass3MW.A0Q(r5), AnonymousClass3MW.A0Q(r5), A1a2);
        Spanned A012 = AnonymousClass1EG.A01(A0Q2, A1a2, 2131894898);
        C88064Ye A052 = A05(r5);
        C825048f r1 = new C825048f(r5, 32);
        C18070vi.A0d(A012, 0);
        A052.A01(0);
        A052.A02(0);
        TextEmojiLabel textEmojiLabel = A052.A01;
        if (textEmojiLabel != null) {
            textEmojiLabel.setOnClickListener(r1);
        }
        A052.A03(A012);
        TextEmojiLabel textEmojiLabel2 = A052.A01;
        if (textEmojiLabel2 != null) {
            AnonymousClass3Ma.A1I(textEmojiLabel2, A052.A03);
        }
        TextEmojiLabel textEmojiLabel3 = A052.A01;
        if (textEmojiLabel3 != null) {
            C72473Md.A1C(textEmojiLabel3);
        }
    }

    public static void A15(AnonymousClass4aY r2) {
        C98524rI A002 = r2.A2G.A00.A00(AnonymousClass3s0.class);
        if (A002 != null && A002.A08()) {
            C72453Mb.A1M(r2.A4Z);
        } else if (r2.A4Z != null && !r2.A6v && !r2.A1m.A01() && r2.A4W.A01() != 0 && !r2.A3H()) {
            if (r2.A4Z.A00 != null || C40811vJ.A0c(r2.A3F, r2.A6n)) {
                View A022 = r2.A4Z.A02();
                A022.setScaleX(0.0f);
                A022.setScaleY(0.0f);
                A022.setVisibility(0);
                A022.animate().setDuration(100).scaleX(1.0f).scaleY(1.0f);
            }
        }
    }

    public static void A16(AnonymousClass4aY r7) {
        C87684Wn.A00(r7.A4G, 2);
        if (A27(r7)) {
            A1f(r7, (String) null, false, false, true);
            return;
        }
        if (A25(r7)) {
            AnonymousClass3MY.A1P((AnonymousClass1BI) null, (C25771Po) AnonymousClass3MZ.A0k(r7).A0J.get(), 32, true);
        }
        if (A22(r7) && C72483Me.A0S(r7).A0C(AnonymousClass3MW.A0K(r7), new C99324sd(r7, (String) null, true))) {
            return;
        }
        if (A1y(r7) || !C83724Gk.A00(r7.A3F, r7.A4L)) {
            r7.A24.A0F(AnonymousClass6WK.A00(r7.A3R), A09(r7), A0A(r7), 2, 41, 9);
        } else {
            r7.A24.A0G(A09(r7), A0A(r7), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (X.AnonymousClass3MW.A03(r7.A2Q.getGroupParticipantsManager(), r2) <= 2) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A17(X.AnonymousClass4aY r7) {
        /*
            X.0ve r1 = r7.A3F
            r0 = 10056(0x2748, float:1.4091E-41)
            r3 = 0
            int r0 = X.C36301nf.A00(r1, r0, r3)
            if (r0 <= 0) goto L_0x000e
            r7.A0E()
        L_0x000e:
            X.1E7 r0 = r7.A35
            X.1EC r2 = X.AnonymousClass3Ma.A0n(r0)
            if (r2 == 0) goto L_0x0048
            X.5cQ r0 = r7.A2Q
            X.1MZ r0 = r0.getGroupParticipantsManager()
            boolean r0 = r0.A0J(r2)
            if (r0 == 0) goto L_0x0048
            boolean r0 = r7.A3H()
            if (r0 != 0) goto L_0x0048
            X.1Mc r1 = r7.A49
            X.5cQ r0 = r7.A2Q
            X.1MZ r0 = r0.getGroupParticipantsManager()
            boolean r0 = r0.A0O(r2)
            boolean r0 = r1.A09(r2, r0)
            if (r0 != 0) goto L_0x0048
            X.5cQ r0 = r7.A2Q
            X.1MZ r0 = r0.getGroupParticipantsManager()
            int r2 = X.AnonymousClass3MW.A03(r0, r2)
            r0 = 2
            r1 = 1
            if (r2 > r0) goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            boolean r0 = r7.A6r
            if (r0 == 0) goto L_0x005f
            if (r1 != 0) goto L_0x005e
            r7.A6r = r3
            X.00H r0 = r7.A6C
            java.lang.Object r0 = r0.get()
            X.4Km r0 = (X.C84694Km) r0
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r0 = r0.A00
            X.C72453Mb.A1D(r0)
        L_0x005e:
            return
        L_0x005f:
            if (r1 == 0) goto L_0x005e
            X.0ve r3 = r7.A3F
            X.1E7 r0 = r7.A35
            boolean r2 = r0.A0F()
            X.4VP r1 = r7.A3w
            X.1E7 r0 = r7.A35
            X.1BI r0 = r0.A0J
            boolean r0 = r1.A03(r0)
            if (r2 == 0) goto L_0x005e
            if (r0 == 0) goto L_0x005e
            X.0vf r1 = X.C18040vf.A01
            r0 = 9788(0x263c, float:1.3716E-41)
            int r0 = X.C18020vd.A00(r1, r3, r0)
            r0 = r0 & 1
            if (r0 == 0) goto L_0x005e
            X.5cQ r1 = r7.A2Q
            r0 = 2131436684(0x7f0b248c, float:1.8495245E38)
            android.view.View r1 = r1.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x00d6
            X.00H r0 = r7.A6C
            java.lang.Object r4 = r0.get()
            X.4Km r4 = (X.C84694Km) r4
            com.whatsapp.conversation.ConversationListView r3 = r7.A2B
            X.1E7 r0 = r7.A35
            X.1BI r5 = r0.A0J
            X.1EC r5 = (X.AnonymousClass1EC) r5
            android.view.View r2 = r7.A0D
            r0 = 40
            X.4sL r6 = new X.4sL
            r6.<init>(r7, r0)
            X.C18070vi.A0o(r3, r5, r2)
            r0 = 2131627456(0x7f0e0dc0, float:1.8882177E38)
            android.view.View r1 = X.AnonymousClass3MY.A0G(r1, r0)
            X.C18070vi.A0X(r1)
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r1 instanceof com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView
            if (r0 == 0) goto L_0x00e7
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r1 = (com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView) r1
        L_0x00c2:
            r4.A00 = r1
            if (r1 == 0) goto L_0x00cb
            r1.A02 = r3
            r1.setComposer(r2)
        L_0x00cb:
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r0 = r4.A00
            if (r0 == 0) goto L_0x00d6
            r0.A04 = r5
            r0.A0B = r6
            r0.A07()
        L_0x00d6:
            X.00H r0 = r7.A6C
            java.lang.Object r0 = r0.get()
            X.4Km r0 = (X.C84694Km) r0
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r7.A6r = r0
            return
        L_0x00e7:
            r1 = 0
            goto L_0x00c2
        L_0x00e9:
            X.4cs r0 = new X.4cs
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1.addOnAttachStateChangeListener(r0)
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A17(X.4aY):void");
    }

    public static void A1A(AnonymousClass4aY r3) {
        ExpressionsTrayView expressionsTrayView = r3.A3D;
        if (expressionsTrayView != null) {
            expressionsTrayView.A0E();
        }
        BottomSheetBehavior bottomSheetBehavior = r3.A0i;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0J != 3) {
            ExpressionsTrayView expressionsTrayView2 = r3.A3D;
            if (expressionsTrayView2 == null || expressionsTrayView2.getVisibility() != 8) {
                r3.A1M.A09 = true;
                ExpressionsTrayView expressionsTrayView3 = r3.A3D;
                if (expressionsTrayView3 != null) {
                    expressionsTrayView3.setVisibility(8);
                    r3.A3D.post(new C98794rj(r3, 14));
                    return;
                }
                return;
            }
            C72463Mc.A1C(r3);
            return;
        }
        r3.A71 = true;
        bottomSheetBehavior.A0W(4);
    }

    public static void A1B(AnonymousClass4aY r2) {
        ExpressionsTrayView expressionsTrayView = r2.A3D;
        if (expressionsTrayView != null) {
            A0R(expressionsTrayView, r2);
            r2.A3D.A0F(4);
            r2.A3D.A0C();
            r2.A2N();
        }
    }

    public static void A1E(AnonymousClass4aY r5) {
        AnonymousClass1E7 r4 = r5.A35;
        if (r4 != null) {
            if (r5.A7G == null) {
                C41731wy r3 = r5.A2R.A0Y;
                r5.A7G = r3;
                r3.A0A(AnonymousClass3MX.A0P(r5), new C91494fm(r4, r5, 13));
            }
            C98704ra.A00(r5.A4c, r5, r4, 25);
        }
    }

    public static void A1F(AnonymousClass4aY r3) {
        AnonymousClass74M r2 = r3.A4h;
        if (r2 != null) {
            C143887Fe r1 = r3.A2d.A00;
            if (r1 instanceof C75373hL) {
                C87814Xd r0 = r3.A2p;
                r2.A0A = (C75373hL) r1;
                r2.A0B = r0;
            }
        }
    }

    public static void A1G(AnonymousClass4aY r2) {
        ((C108615c0) r2.A4q.get()).CR4(r2.A35);
    }

    public static void A1H(AnonymousClass4aY r3) {
        if (r3.A35.A0E()) {
            if (C18020vd.A05(C18040vf.A02, r3.A3F, 5587) && !C72483Me.A1C(r3)) {
                C98794rj.A00(r3.A1L, r3, 19);
            }
        }
    }

    public static void A1J(AnonymousClass4aY r1, int i) {
        ((C88064Ye) r1.A5x.get()).A02(i);
        ((C88064Ye) r1.A5x.get()).A01(i);
    }

    public static void A1K(AnonymousClass4aY r50, int i) {
        List singletonList;
        AnonymousClass4aY r0 = r50;
        AnonymousClass74G r1 = r0.A42;
        int i2 = i;
        if (r1 == null || i2 != r1.A0N) {
            A0f(r0);
            if (!C39761tb.A02() || !r0.A1m.A03()) {
                r0.A4f.A00();
                AnonymousClass7DX r14 = new AnonymousClass7DX(r0, 1);
                AnonymousClass1BI r12 = r0.A3R;
                if (r12 == null) {
                    singletonList = Collections.emptyList();
                } else {
                    singletonList = Collections.singletonList(r12);
                }
                AnonymousClass2X9 r3 = r0.A15;
                AnonymousClass1FY A0P2 = AnonymousClass3MW.A0P(r0);
                ViewGroup A0C2 = AnonymousClass3MW.A0C(r0.A1M, 2131434243);
                View A062 = AnonymousClass1HF.A06(r0.A1M, 2131428625);
                View A063 = AnonymousClass1HF.A06(r0.A1M, 2131430490);
                View A064 = AnonymousClass1HF.A06(r0.A1M, 2131431654);
                AnonymousClass206 r20 = r0.A2b.A0G;
                AnonymousClass3TF r15 = r0.A0h;
                C98794rj r13 = new C98794rj(r0, 23);
                AnonymousClass1K2 r2 = r3.A00;
                AnonymousClass10E r16 = r2.A01;
                AnonymousClass118 A0l2 = AnonymousClass3MZ.A0l(r16);
                AnonymousClass11P A6O2 = AnonymousClass10E.A6O(r16);
                C18030ve A8r = AnonymousClass10E.A8r(r16);
                AnonymousClass1KB A122 = AnonymousClass10E.A12(r16);
                AnonymousClass190 A0N2 = AnonymousClass3MY.A0N(r16);
                C34531kd A0R2 = AnonymousClass3MZ.A0R(r16);
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r16);
                AnonymousClass18K A0g2 = AnonymousClass3Ma.A0g(r16);
                AnonymousClass1HS A0Z2 = AnonymousClass3MZ.A0Z(r16);
                AnonymousClass11C A0a2 = AnonymousClass3Ma.A0a(r16);
                C18000vb A6Q2 = AnonymousClass10E.A6Q(r16);
                C19830z4 A0c2 = AnonymousClass3Ma.A0c(r16);
                AnonymousClass1K1 r22 = r2.A00;
                C219217x A0b2 = AnonymousClass3Ma.A0b(r16);
                C18010vc A0r2 = AnonymousClass3Ma.A0r(r16);
                r0.A42 = new AnonymousClass74G(A062, A063, A064, A0C2, r15, A0N2, (AnonymousClass6ZO) r22.A2V.get(), (AnonymousClass6ZP) r22.A2W.get(), (AnonymousClass1T1) r16.A43.get(), A0P2, (C218617r) r16.A8v.get(), A122, A0R2, (CX1) r22.A4Y.get(), A0Z2, r14, (CX2) r22.A4Z.get(), (AnonymousClass1NM) r16.A6D.get(), A0a2, A6O2, A0l2, A0b2, A0c2, A6Q2, (AnonymousClass11Z) r16.AAV.get(), (C223819r) r16.AB3.get(), A8r, A0g2, (WamediaManager) r16.ABs.get(), A0r2, r20, AL1, (AnonymousClass1VT) r16.A1X.get(), r13, singletonList, i);
                return;
            }
            r0.A1L.A08(2131889961, 1);
        }
    }

    public static void A1N(AnonymousClass4aY r3, int i) {
        int A012;
        AnonymousClass1FY A0Q2;
        int i2;
        int i3;
        if (i == 0) {
            A012 = r3.A1s.getBackgroundColorRes();
        } else {
            if (AnonymousClass112.A01() || !C22891Dp.A02) {
                C28931bI r0 = r3.A4Y;
                if (r0 != null && r0.A01() == 0) {
                    A0Q2 = AnonymousClass3MW.A0Q(r3);
                    i2 = 2130969148;
                    i3 = 2131100157;
                } else if (!AnonymousClass112.A01() || !A2B(r3) || r3.A0P == null) {
                    boolean Bgg = ((C108605by) r3.A5F.get()).Bgg();
                    AnonymousClass1FY A0Q3 = AnonymousClass3MW.A0Q(r3);
                    if (Bgg) {
                        A012 = AnonymousClass4Z9.A01(A0Q3, true);
                    } else {
                        C18070vi.A0d(A0Q3, 0);
                        A012 = AnonymousClass4Z9.A01(A0Q3, false);
                    }
                } else {
                    A012 = 2131102739;
                }
            } else {
                A0Q2 = AnonymousClass3MW.A0Q(r3);
                i2 = 2130968798;
                i3 = 2131099872;
            }
            A012 = AnonymousClass1YL.A00(A0Q2, i2, i3);
        }
        int A002 = C19740yt.A00(AnonymousClass3MW.A0P(r3), A012);
        View view = r3.A0P;
        if (view != null) {
            view.setBackgroundColor(A002);
        } else {
            C28271Zs.A00(r3.A2Q.getWindow(), A002, true);
        }
    }

    public static void A1O(AnonymousClass4aY r3, int i) {
        SharedPreferences.Editor A002;
        String str;
        BottomSheetBehavior bottomSheetBehavior = r3.A0i;
        if (bottomSheetBehavior != null) {
            int i2 = bottomSheetBehavior.A0C;
            if (i2 <= 0 || i2 >= i) {
                int A082 = C72473Md.A08(r3);
                C19830z4 r0 = r3.A2j;
                if (A082 == 1) {
                    if (r0.A08() != i) {
                        A002 = C19830z4.A00(r3.A2j);
                        str = "expressions_tray_peek_height_portrait";
                    } else {
                        return;
                    }
                } else if (r0.A07() != i) {
                    A002 = C19830z4.A00(r3.A2j);
                    str = "expressions_tray_peek_height_landscape";
                } else {
                    return;
                }
                C17880vN.A1C(A002, str, i);
                BottomSheetBehavior bottomSheetBehavior2 = r3.A0i;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.A0Y(i, false);
                }
            }
        }
    }

    public static void A1Q(AnonymousClass4aY r11, int i, boolean z) {
        TextView textView = r11.A0b;
        C17960vV.A05(textView);
        textView.setText(r11.A2k.A0L().format((long) i));
        r11.A0b.setVisibility(0);
        if (i == 1) {
            if (z) {
                r11.A2B.A06();
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(100);
            r11.A0b.startAnimation(scaleAnimation);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r13.A08 == null) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1R(X.AnonymousClass4aY r12, X.AnonymousClass4SW r13) {
        /*
            X.1E7 r1 = r13.A05
            r12.A35 = r1
            X.AEW r0 = r13.A04
            r12.A1t = r0
            A1E(r12)
            X.4Ye r3 = A05(r12)
            r2 = 17
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            if (r0 == 0) goto L_0x0018
            r0.setGravity(r2)
        L_0x0018:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A02
            X.C72453Mb.A1D(r0)
            X.4NE r0 = r12.A7J
            X.1bI r0 = r0.A00
            X.AnonymousClass3Ma.A1M(r0)
            boolean r0 = r13.A0G
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0033
            X.1E7 r0 = r13.A06
            if (r0 == 0) goto L_0x0033
            X.1EC r0 = r13.A08
            r8 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r8 = 0
        L_0x0034:
            X.1EC r5 = r13.A08
            if (r5 == 0) goto L_0x0043
            com.whatsapp.community.ConversationCommunityViewModel r4 = r12.A1p
            if (r4 == 0) goto L_0x0043
            X.10I r3 = r4.A06
            r0 = 18
            X.C98804rk.A01(r3, r4, r5, r0)
        L_0x0043:
            boolean r0 = r13.A09
            java.lang.String r5 = "learn-more"
            r7 = 8
            if (r0 == 0) goto L_0x011f
            android.view.View r0 = r12.A0D
            r0.setVisibility(r7)
            r12.A0C()
            A1J(r12, r2)
            X.0ve r3 = r12.A3F
            r1 = 11410(0x2c92, float:1.5989E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x0068
            com.whatsapp.conversation.ConversationListView r1 = r12.A2B
            r0 = 7
            X.C98774rh.A00(r1, r0)
        L_0x0068:
            X.1E7 r0 = r12.A35
            boolean r0 = r0.A0j
            if (r0 == 0) goto L_0x00d3
            X.4Ye r4 = A05(r12)
            r3 = 2131887924(0x7f120734, float:1.9410469E38)
        L_0x0075:
            com.whatsapp.TextEmojiLabel r0 = r4.A01
            if (r0 == 0) goto L_0x007c
            r0.setText(r3)
        L_0x007c:
            X.4Ye r0 = A05(r12)
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            if (r0 == 0) goto L_0x0087
            r0.setClickable(r2)
        L_0x0087:
            X.4Ye r0 = A05(r12)
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00b8
            X.4ZY r1 = r12.A2R
            X.5bf r0 = r1.A06
            boolean r0 = r0 instanceof X.C97914qG
            if (r0 == 0) goto L_0x00b8
            X.1bI r3 = r1.A0a
            int r0 = r3.A01()
            if (r0 != 0) goto L_0x00b8
            android.view.ViewGroup$LayoutParams r2 = r3.A03()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            X.01E r1 = r1.A0C
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = X.C62762rw.A01(r1, r0)
            r2.bottomMargin = r0
            r3.A06(r2)
        L_0x00b8:
            android.view.View r0 = r12.A0D
            int r0 = r0.getVisibility()
            if (r0 != r7) goto L_0x00ce
            X.5cQ r0 = r12.A2Q
            boolean r0 = r0.Bg6()
            if (r0 != 0) goto L_0x00ce
            r12.A2P()
            A1w(r12)
        L_0x00ce:
            A17(r12)
            goto L_0x047b
        L_0x00d3:
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x00db
            r12.A1t(r2, r2)
            goto L_0x007c
        L_0x00db:
            X.4Cw r1 = r13.A07
            X.4Cw r0 = X.C82974Cw.DEACTIVATED
            if (r1 != r0) goto L_0x0101
            X.4Ye r4 = A05(r12)
            X.5cQ r3 = r12.A2Q
            r1 = 2131896638(0x7f12293e, float:1.9428143E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r2] = r5
            java.lang.String r3 = r3.getString(r1, r0)
            r1 = 43
            X.4sL r0 = new X.4sL
            r0.<init>(r12, r1)
            X.C18070vi.A0d(r3, r2)
            X.C88064Ye.A00(r4, r3, r0)
            goto L_0x007c
        L_0x0101:
            int r0 = r13.A00
            if (r0 != r6) goto L_0x0116
            int r1 = r13.A01
            X.4Ye r4 = A05(r12)
            r0 = 6
            r3 = 2131889212(0x7f120c3c, float:1.9413081E38)
            if (r1 != r0) goto L_0x0075
            r3 = 2131889211(0x7f120c3b, float:1.941308E38)
            goto L_0x0075
        L_0x0116:
            X.4Ye r4 = A05(r12)
            r3 = 2131887926(0x7f120736, float:1.9410473E38)
            goto L_0x0075
        L_0x011f:
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x016a
            android.view.View r0 = r12.A0D
            r0.setVisibility(r7)
            A1J(r12, r7)
            X.1bI r0 = r12.A4O
            r0.A04(r2)
            boolean r0 = r12.A3G()
            if (r0 == 0) goto L_0x013e
            X.74M r0 = r12.A4h
            X.C17960vV.A07(r0)
            r0.A0Z(r2, r2)
        L_0x013e:
            X.1bI r0 = r12.A4O
            android.widget.TextView r1 = X.AnonymousClass3MX.A0M(r0)
            r0 = 2131889068(0x7f120bac, float:1.941279E38)
            r1.setText(r0)
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = r12.A2l
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0087
            X.1FY r0 = X.AnonymousClass3MW.A0P(r12)
            X.3Rj r1 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131889069(0x7f120bad, float:1.9412791E38)
            r1.A0D(r0)
            X.C73203Rj.A06(r1)
            X.AnonymousClass3MY.A1G(r1)
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = r12.A2l
            r0.A00 = r6
            goto L_0x0087
        L_0x016a:
            boolean r0 = r13.A0I
            if (r0 == 0) goto L_0x01e4
            android.view.View r0 = r12.A0D
            r0.setVisibility(r7)
            A1J(r12, r7)
            X.1bI r0 = r12.A4O
            r0.A04(r2)
            X.1bI r0 = r12.A4O
            android.view.View r1 = r0.A02()
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            X.0ve r0 = r12.A3F
            X.AnonymousClass3Ma.A1L(r0, r1)
            boolean r0 = r12.A3G()
            if (r0 == 0) goto L_0x0196
            X.74M r0 = r12.A4h
            X.C17960vV.A07(r0)
            r0.A0Z(r2, r2)
        L_0x0196:
            X.5cQ r1 = r12.A2Q
            r0 = 2131896957(0x7f122a7d, float:1.942879E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r5 = X.AnonymousClass3MW.A09(r0)
            X.1FY r1 = X.AnonymousClass3MW.A0P(r12)
            r0 = 2
            X.3cF r3 = new X.3cF
            r3.<init>((android.content.Context) r1, (java.lang.Object) r12, (int) r0)
            int r1 = r5.length()
            r0 = 33
            r5.setSpan(r3, r2, r1, r0)
            X.5cQ r0 = r12.A2Q
            X.11S r0 = r0.getMeManager()
            boolean r4 = r0.A0N()
            X.1bI r0 = r12.A4O
            android.widget.TextView r3 = X.AnonymousClass3MX.A0M(r0)
            X.5cQ r1 = r12.A2Q
            r0 = 2131896948(0x7f122a74, float:1.9428772E38)
            if (r4 == 0) goto L_0x01d0
            r0 = 2131896949(0x7f122a75, float:1.9428774E38)
        L_0x01d0:
            java.lang.String r1 = r1.getString(r0)
            android.text.Spannable[] r0 = new android.text.Spannable[r6]
            r0[r2] = r5
            android.text.SpannableStringBuilder r0 = X.C26302CxJ.A04(r1, r0)
            r3.setText(r0)
            A1l(r12, r2)
            goto L_0x0087
        L_0x01e4:
            boolean r0 = r13.A0E
            if (r0 != 0) goto L_0x0262
            X.1BI r0 = r12.A3R
            boolean r0 = A2E(r12, r0)
            if (r0 != 0) goto L_0x0262
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x01fb
            A1H(r12)
            goto L_0x0087
        L_0x01fb:
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x025d
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3MZ.A0x(r1)
            if (r4 == 0) goto L_0x025d
            X.0ve r3 = r12.A3F
            X.C18070vi.A0d(r3, r2)
            r1 = 6743(0x1a57, float:9.449E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x025d
            X.0ve r3 = r12.A3F
            X.00H r0 = r12.A5G
            java.lang.Object r0 = r0.get()
            X.9Xq r0 = (X.C183279Xq) r0
            X.9x3 r0 = r0.A00
            java.lang.String r1 = X.C197659x3.A00(r0)
            X.C18070vi.A0d(r3, r2)
            java.util.HashSet r0 = X.C20045A4o.A00(r3)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x025d
            X.1eX r0 = r12.A2o
            X.2nM r0 = r0.A03(r4)
            if (r0 == 0) goto L_0x025d
            java.lang.String r1 = "business_search"
            java.lang.String r0 = r0.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x025d
            android.view.View r0 = r12.A0D
            r0.setVisibility(r7)
            X.1bI r0 = r12.A4O
            r0.A04(r7)
            A1J(r12, r2)
            X.4Ye r1 = A05(r12)
            java.lang.String r0 = "You can't send messages in this chat because Business Search isn't launched in your country"
            r1.A03(r0)
            goto L_0x007c
        L_0x025d:
            A0v(r12)
            goto L_0x0087
        L_0x0262:
            r4 = 3
            if (r8 == 0) goto L_0x0288
            int r0 = r13.A01
            if (r0 != r4) goto L_0x0276
            X.4Ye r0 = A05(r12)
            r1 = 17
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            if (r0 == 0) goto L_0x0276
            r0.setGravity(r1)
        L_0x0276:
            X.4Ye r3 = A05(r12)
            r0 = 45
            X.48h r1 = new X.48h
            r1.<init>(r12, r13, r0)
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x0288
            r0.setOnClickListener(r1)
        L_0x0288:
            android.view.View r0 = r12.A0D
            r0.setVisibility(r7)
            r12.A0C()
            boolean r0 = r12.A3G()
            if (r0 == 0) goto L_0x029e
            X.74M r0 = r12.A4h
            X.C17960vV.A07(r0)
            r0.A0Z(r2, r2)
        L_0x029e:
            X.4Ye r0 = A05(r12)
            r0.A01(r2)
            X.4Ye r0 = A05(r12)
            r0.A02(r2)
            if (r8 == 0) goto L_0x02d9
            int r0 = r13.A01
            if (r0 != r4) goto L_0x02d9
            X.4Ye r4 = A05(r12)
            X.5cQ r3 = r12.A2Q
            r1 = 2131890891(0x7f1212cb, float:1.9416487E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r2] = r5
            java.lang.String r3 = r3.getString(r1, r0)
            r1 = 44
            X.4sL r0 = new X.4sL
            r0.<init>(r12, r1)
            X.C18070vi.A0d(r3, r2)
            X.C88064Ye.A00(r4, r3, r0)
        L_0x02d0:
            com.whatsapp.TextEmojiLabel r0 = r4.A01
            if (r0 == 0) goto L_0x0087
            X.C72473Md.A1C(r0)
            goto L_0x0087
        L_0x02d9:
            X.1E7 r1 = r12.A35
            X.1BI r0 = r1.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x032a
            boolean r0 = r13.A0D
            if (r0 == 0) goto L_0x02eb
            boolean r0 = r13.A0C
            if (r0 != 0) goto L_0x032a
        L_0x02eb:
            X.4Ye r0 = A05(r12)
            r0.A02(r7)
            X.4Ny r8 = r12.A7L
            X.1E7 r1 = r12.A35
            java.lang.Class<X.1ch> r0 = X.C29681ch.class
            com.whatsapp.jid.Jid r10 = r1.A06(r0)
            X.C17960vV.A07(r10)
            X.1BI r10 = (X.AnonymousClass1BI) r10
            X.4Ye r5 = A05(r12)
            X.C18070vi.A0d(r10, r2)
            X.C18070vi.A0d(r5, r6)
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0323
            X.4mD r3 = r8.A01
            X.4Tp r0 = r3.A02(r10)
            if (r0 == 0) goto L_0x03b2
            X.2Dk r0 = r0.A00
            X.9Ig r1 = r0.A02
            X.9Ig r0 = X.C179509Ig.GUEST
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 != 0) goto L_0x03b2
        L_0x0323:
            r8.A00 = r6
            r5.A01(r7)
            goto L_0x0087
        L_0x032a:
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x0429
            X.0ve r0 = r12.A3F
            boolean r0 = X.C84104Hw.A00(r0)
            if (r0 != 0) goto L_0x0429
            X.00H r0 = r12.A4t
            java.lang.Object r10 = r0.get()
            X.4Om r10 = (X.C85724Om) r10
            X.1FY r9 = X.AnonymousClass3MW.A0Q(r12)
            X.4Ye r4 = A05(r12)
            X.C18070vi.A0d(r9, r2)
            X.C18070vi.A0d(r4, r6)
            X.0ve r3 = r10.A03
            r1 = 5985(0x1761, float:8.387E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r3, r1)
            if (r0 != r6) goto L_0x0366
            r1 = 2131887344(0x7f1204f0, float:1.9409292E38)
            com.whatsapp.TextEmojiLabel r0 = r4.A01
            if (r0 == 0) goto L_0x0087
            r0.setText(r1)
            goto L_0x0087
        L_0x0366:
            r8 = 2131887343(0x7f1204ef, float:1.940929E38)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            X.1vD r1 = r10.A01
            X.00H r0 = r10.A05
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1o3 r0 = (X.C36531o3) r0
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r0 = r1.A03()
            X.C18070vi.A0X(r0)
            r3 = 2131887345(0x7f1204f1, float:1.9409294E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = X.AnonymousClass3Ma.A10(r9, r0, r1, r2, r3)
            java.lang.String r3 = X.AnonymousClass3Ma.A10(r9, r0, r5, r2, r8)
            com.whatsapp.TextEmojiLabel r2 = r4.A01
            if (r2 == 0) goto L_0x03a7
            X.00H r0 = r4.A05
            java.lang.Object r1 = r0.get()
            X.1np r1 = (X.C36401np) r1
            android.content.Context r0 = r2.getContext()
            android.text.SpannableString r0 = r1.A03(r0, r3)
            r4.A03(r0)
        L_0x03a7:
            com.whatsapp.TextEmojiLabel r1 = r4.A01
            if (r1 == 0) goto L_0x02d0
            X.0ve r0 = r4.A03
            X.AnonymousClass3Ma.A1I(r1, r0)
            goto L_0x02d0
        L_0x03b2:
            java.lang.ref.WeakReference r0 = r8.A03
            java.lang.Object r9 = r0.get()
            X.1FB r9 = (X.AnonymousClass1FB) r9
            if (r9 == 0) goto L_0x0087
            X.1DT r1 = r3.A00
            X.5TY r0 = new X.5TY
            r0.<init>(r10)
            X.1Dg r3 = X.C22791Df.A01(r1, r0)
            X.5Ut r1 = new X.5Ut
            r1.<init>(r8, r5)
            r0 = 19
            X.C91644g1.A00(r9, r3, r1, r0)
            r5.A01(r2)
            r1 = 2131433066(0x7f0b166a, float:1.8487907E38)
            android.view.View r0 = r5.A00
            X.C17960vV.A05(r0)
            android.view.ViewStub r0 = X.AnonymousClass3MW.A0F(r0, r1)
            if (r0 == 0) goto L_0x0087
            android.view.View r4 = r0.inflate()
            if (r4 == 0) goto L_0x0087
            r0 = 2131434066(0x7f0b1a52, float:1.8489935E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r4, r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131892748(0x7f121a0c, float:1.9420253E38)
            java.lang.String r11 = X.C18070vi.A0F(r1, r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131100400(0x7f0602f0, float:1.781318E38)
            java.lang.String r1 = X.AnonymousClass1EG.A03(r1, r0)
            X.C18070vi.A0X(r1)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r2] = r1
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = X.AnonymousClass1EG.A0K(r0)
            java.lang.String r0 = java.lang.String.format(r1, r11, r0)
            X.AnonymousClass3MY.A1X(r0, r3)
            r1 = 2
            X.AnonymousClass3Ma.A1F(r3, r9, r8, r10, r1)
            r0 = 2131429147(0x7f0b071b, float:1.8479959E38)
            android.view.View r0 = r4.findViewById(r0)
            X.C90014dO.A00(r0, r8, r5, r1)
            goto L_0x0087
        L_0x0429:
            X.0ve r0 = r12.A3F
            boolean r0 = X.AnonymousClass3MX.A1X(r0)
            if (r0 == 0) goto L_0x0450
            X.00H r0 = r12.A4s
            X.1pj r1 = X.AnonymousClass3MW.A0V(r0)
            X.1E7 r0 = r12.A35
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r0)
            boolean r0 = r1.A0P(r0)
            if (r0 == 0) goto L_0x0450
            X.1BI r0 = r12.A3R
            boolean r0 = A2E(r12, r0)
            if (r0 != 0) goto L_0x0450
            A11(r12)
            goto L_0x0087
        L_0x0450:
            boolean r0 = r13.A0B
            if (r0 == 0) goto L_0x0459
            A14(r12)
            goto L_0x0087
        L_0x0459:
            boolean r3 = r13.A0F
            int r1 = r13.A00
            if (r1 != r6) goto L_0x0460
            r2 = 1
        L_0x0460:
            X.4Cw r0 = r13.A07
            A1W(r12, r0, r3, r2)
            if (r1 == r6) goto L_0x0087
            X.4Ye r2 = A05(r12)
            r0 = 31
            X.48f r1 = new X.48f
            r1.<init>(r12, r0)
            com.whatsapp.TextEmojiLabel r0 = r2.A01
            if (r0 == 0) goto L_0x0087
            r0.setOnClickListener(r1)
            goto L_0x0087
        L_0x047b:
            X.00H r3 = r12.A4q     // Catch:{ all -> 0x05ad }
            java.lang.Object r1 = r3.get()     // Catch:{ all -> 0x05ad }
            X.5c0 r1 = (X.C108615c0) r1     // Catch:{ all -> 0x05ad }
            X.1E7 r0 = r12.A35     // Catch:{ all -> 0x05ad }
            r1.CQk(r0)     // Catch:{ all -> 0x05ad }
            int r2 = r13.A03
            java.lang.Object r1 = r3.get()
            X.5c0 r1 = (X.C108615c0) r1
            X.1E7 r0 = r12.A35
            r1.CRD(r0, r2)
            int r2 = r13.A02
            java.lang.Object r1 = r3.get()
            X.5c0 r1 = (X.C108615c0) r1
            X.1BI r0 = r12.A3R
            r1.CQt(r0, r2)
            java.lang.Object r0 = r3.get()
            X.5c0 r0 = (X.C108615c0) r0
            r0.CR3()
            boolean r3 = r13.A0C
            boolean r2 = r13.A0D
            boolean r0 = X.AnonymousClass3MZ.A1W(r12)
            if (r0 == 0) goto L_0x0516
            X.3Oz r1 = X.AnonymousClass3MX.A0c(r12)
            boolean r0 = r1.A0G
            if (r0 == r2) goto L_0x04d6
            X.1BI r0 = r12.A3R
            X.1ch r0 = (X.C29681ch) r0
            r12.A1q(r0, r2)
            r1.A0G = r2
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
            com.whatsapp.conversation.ConversationListView r0 = r12.A2B
            r0.A05()
            X.5cQ r0 = r12.A2Q
            r0.invalidateOptionsMenu()
        L_0x04d6:
            if (r2 == 0) goto L_0x0516
            if (r3 == 0) goto L_0x0516
            X.4Ye r5 = A05(r12)
            r0 = 35
            X.4dE r4 = new X.4dE
            r4.<init>(r12, r0)
            r3 = 0
            android.view.View r1 = r5.A00
            boolean r0 = r1 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x0516
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            if (r1 == 0) goto L_0x0516
            com.whatsapp.wds.components.button.WDSButton r2 = r5.A02
            if (r2 == 0) goto L_0x0516
            r1.setOrientation(r6)
            r5.A02(r7)
            r2.setVisibility(r3)
            r0 = 2131892876(0x7f121a8c, float:1.9420513E38)
            r2.setText(r0)
            X.4DG r0 = X.AnonymousClass4DG.DESTRUCTIVE
            r2.setAction(r0)
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass3Ma.A0D()
            r0 = 17
            r1.gravity = r0
            r2.setLayoutParams(r1)
            r2.setOnClickListener(r4)
        L_0x0516:
            com.whatsapp.mentions.MentionableEntry r2 = r12.A3Z
            if (r2 == 0) goto L_0x0536
            X.1Ps r0 = X.C72483Me.A0S(r12)
            X.1BI r1 = r12.A3R
            X.1Pk r0 = r0.A00
            boolean r4 = r0.A01(r1)
            com.whatsapp.mentions.MentionPickerView r3 = r2.A0D
            if (r3 == 0) goto L_0x0536
            X.10I r2 = r3.A0K
            r1 = 13
            X.3Cp r0 = new X.3Cp
            r0.<init>((int) r1, (java.lang.Object) r3, (boolean) r4)
            r2.CGN(r0)
        L_0x0536:
            X.AEW r0 = r12.A1t
            if (r0 == 0) goto L_0x057b
            X.0ve r2 = r12.A3F
            r1 = 5747(0x1673, float:8.053E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x057b
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r12)
            X.00H r0 = r0.A0O
            java.lang.Object r4 = r0.get()
            X.72A r4 = (X.AnonymousClass72A) r4
            X.1E7 r3 = r12.A35
            X.4LN r2 = new X.4LN
            r2.<init>(r12)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r0 = r3.A0C()
            if (r0 == 0) goto L_0x057b
            int r0 = r3.A00
            if (r0 == 0) goto L_0x057b
            java.lang.String r1 = r4.A01()
            java.lang.String r0 = "unset"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0587
            boolean r1 = X.AnonymousClass72A.A00(r3, r4)
            X.4aY r0 = r2.A00
            r0.A6x = r1
        L_0x057b:
            boolean r0 = r12.A3H()
            if (r0 == 0) goto L_0x0586
            X.1bI r0 = r12.A4Z
            X.C72453Mb.A1M(r0)
        L_0x0586:
            return
        L_0x0587:
            X.00H r0 = r4.A02
            java.lang.Object r7 = r0.get()
            X.6xO r7 = (X.C138616xO) r7
            X.4r7 r1 = new X.4r7
            r1.<init>(r2, r3, r4)
            r4 = 20231027(0x134b373, double:9.9954554E-317)
            X.00H r0 = r7.A02
            java.lang.Object r3 = r0.get()
            X.6lo r3 = (X.C131876lo) r3
            X.7DD r2 = new X.7DD
            r2.<init>(r7, r1, r6)
            long[] r1 = new long[r6]
            r0 = 0
            r1[r0] = r4
            r3.A00(r2, r1)
            goto L_0x057b
        L_0x05ad:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A1R(X.4aY, X.4SW):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1S(X.AnonymousClass4aY r5, X.C87814Xd r6) {
        /*
            java.lang.String r3 = r6.A0K
            java.lang.String r1 = r6.A0J
            java.lang.String r4 = r6.A0L
            boolean r0 = X.AnonymousClass1EG.A0H(r4)
            if (r0 != 0) goto L_0x0049
            X.0ve r2 = X.AnonymousClass3MX.A0h(r5)
            r1 = 11413(0x2c95, float:1.5993E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "whatsapp://"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            android.net.Uri r2 = android.net.Uri.parse(r0)
            X.00H r0 = r5.A5K
            java.lang.Object r0 = r0.get()
            X.1i4 r0 = (X.C32981i4) r0
            int r0 = r0.A0E(r2)
            r1 = 1
            if (r0 == r1) goto L_0x0048
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r5)
            android.content.Intent r2 = X.AnonymousClass1LU.A0O(r0, r2, r1)
            X.1L9 r1 = r5.A0r
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r5)
            r1.A08(r0, r2)
        L_0x0048:
            return
        L_0x0049:
            boolean r0 = X.AnonymousClass1EG.A0H(r1)
            if (r0 == 0) goto L_0x0056
            boolean r0 = X.AnonymousClass1EG.A0H(r3)
            if (r0 == 0) goto L_0x0056
            return
        L_0x0056:
            boolean r0 = X.AnonymousClass1EG.A0H(r1)
            if (r0 != 0) goto L_0x006b
            X.0ve r2 = X.AnonymousClass3MX.A0h(r5)
            r1 = 3994(0xf9a, float:5.597E-42)
        L_0x0062:
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0078
            return
        L_0x006b:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0078
            X.0ve r2 = X.AnonymousClass3MX.A0h(r5)
            r1 = 2255(0x8cf, float:3.16E-42)
            goto L_0x0062
        L_0x0078:
            X.1E7 r0 = r5.A35
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MZ.A0x(r0)
            if (r1 == 0) goto L_0x0048
            r0 = 17
            X.AkY r2 = new X.AkY
            r2.<init>(r5, r1, r3, r0)
            X.00H r0 = r5.A51
            java.lang.Object r0 = r0.get()
            X.2gI r0 = (X.C55742gI) r0
            X.9tU r0 = r0.A00
            X.Af0 r1 = r0.A02(r1)
            r0 = 10
            X.C98334qx.A00(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A1S(X.4aY, X.4Xd):void");
    }

    public static void A1U(AnonymousClass4aY r7, C107305Ze r8, Integer num, Integer num2, boolean z) {
        AnonymousClass4DN r3;
        AnonymousClass8oR A002;
        UserJid A0x2;
        AnonymousClass1E7 r0 = r7.A35;
        C107305Ze r6 = r8;
        if (r0 != null && (A0x2 = AnonymousClass3MZ.A0x(r0)) != null && r7.A6z && !A06(r7).A04(A0x2)) {
            r7.A6z = false;
            r7.A3Z.setFocusableInTouchMode(true);
        } else if (!A29(r7)) {
            r7.A6z = false;
        } else {
            UserJid A0x3 = AnonymousClass3MZ.A0x(r7.A35);
            C88504Zz A062 = A06(r7);
            if (A0x3 == null || (A002 = C88504Zz.A00(A062, A0x3)) == null) {
                r3 = AnonymousClass4DN.DEFAULT;
            } else {
                r3 = A002.A02;
            }
            ((AnonymousClass4QV) ((C88444Zs) r7.A5I.get()).A01.get()).A00(AnonymousClass3MW.A0K(r7), r3, r7.A35, new C95544mP(r7, 6), r6, num, num2, z);
            return;
        }
        r8.Bkp();
    }

    public static void A1V(AnonymousClass4aY r16, AnonymousClass77J r17) {
        AnonymousClass77C r0;
        AnonymousClass77C r02;
        String str;
        AnonymousClass4aY r3 = r16;
        if (AnonymousClass3MW.A0V(r3.A4s).A0P(AnonymousClass3MZ.A0x(r3.A35))) {
            AnonymousClass4Yv.A01(AnonymousClass3MW.A0P(r3), 106);
            return;
        }
        ArrayList A132 = AnonymousClass000.A13();
        A132.add(r3.A3R);
        AnonymousClass77J r1 = r17;
        AnonymousClass77C r7 = r1.A01;
        if (r7.A02 > 0) {
            r0 = r7;
        } else {
            r0 = r1.A02;
        }
        int i = r0.A02;
        if (r7.A00 > 0) {
            r02 = r7;
        } else {
            r02 = r1.A02;
        }
        int i2 = r02.A00;
        MentionableEntry mentionableEntry = r3.A3Z;
        if (mentionableEntry != null) {
            str = mentionableEntry.getStringText();
        } else {
            str = null;
        }
        r3.A2Q.startActivityForResult(AnonymousClass1LU.A1e(AnonymousClass3MW.A0P(r3), r1.A02.A03, r7.A03, r1.A03.A03, r1.A04, A132, r1.A00, 22, r3.A6g, false).putExtra("media_width", i).putExtra("media_height", i2).putExtra("jid", C22971Dz.A06(r3.A3R)).putExtra("caption", str).putExtra("mentions", AnonymousClass4aJ.A01(r3.A3Z.getMentions())).putExtra("clear_message_after_send", !TextUtils.isEmpty(str)).putExtra("usage_quote", AnonymousClass000.A1W(r3.A2b.A0G)), 25);
    }

    public static void A1X(AnonymousClass4aY r2, UserJid userJid, boolean z, boolean z2) {
        AnonymousClass1E7 A0E2;
        C108865cQ r0 = r2.A2Q;
        if (z2) {
            AnonymousClass11S meManager = r0.getMeManager();
            meManager.A0I();
            A0E2 = meManager.A0D;
        } else {
            A0E2 = r0.getContactManager().A0E(userJid);
        }
        if (A0E2 != null) {
            A1T(r2, A0E2, C72463Mc.A0g(A0E2), z);
        }
    }

    public static void A1Y(AnonymousClass4aY r6, AnonymousClass206 r7) {
        int i;
        int height;
        ConversationListView conversationListView = r6.A2B;
        C18070vi.A0d(r7, 0);
        int firstVisiblePosition = conversationListView.getFirstVisiblePosition();
        int lastVisiblePosition = conversationListView.getLastVisiblePosition();
        int A052 = conversationListView.getConversationCursorAdapter().A05(r7);
        if (A052 >= 0 && (i = A052 + 1) >= firstVisiblePosition) {
            if (i <= lastVisiblePosition) {
                View childAt = conversationListView.getChildAt(i - firstVisiblePosition);
                if (childAt == null || childAt.getTop() <= (height = (conversationListView.getHeight() / 2) - (childAt.getHeight() / 2))) {
                    return;
                }
            } else {
                height = conversationListView.getHeight() / 2;
            }
            conversationListView.smoothScrollToPositionFromTop(i, height);
            if (!conversationListView.A0M) {
                conversationListView.setTranscriptMode(0);
                conversationListView.setVisibility(0);
                r6.A4W.A04(0);
                r6.A2b.A03 = 0;
                A1j(r6, false);
            }
        }
    }

    public static void A1Z(AnonymousClass4aY r14, C692236j r15, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        Uri parse;
        byte[] bArr;
        String str7 = str;
        AnonymousClass4aY r3 = r14;
        if (!TextUtils.isEmpty(str7) || !TextUtils.isEmpty(str2)) {
            C62572rc r6 = new C62572rc();
            byte[] bArr2 = null;
            if (!TextUtils.isEmpty(str7)) {
                File file = new File(str7);
                r6.A0G = file;
                bArr = C1408873l.A04(file);
                parse = null;
            } else {
                parse = Uri.parse(str2);
                r6.A08 = i;
                r6.A06 = i2;
                String str8 = str6;
                if (str6 != null) {
                    bArr2 = r14.A3M.A03(str8);
                }
                bArr = bArr2;
            }
            String str9 = str3;
            if (str3 != null) {
                r6.A0H = str9;
            }
            if (!(parse == null && r6.A0G == null)) {
                r6.A05 = i3;
                C63642tS A042 = r14.A3W.A04(parse, r6, r14.A2b.A0G, r15, str4, list, AnonymousClass4aJ.A03(str5), (List) null, 13, 0, 0, r14.A6g);
                A042.A00 = 1;
                AnonymousClass3MX.A0X(r3).A0n(A042, bArr, z2, z3);
                r3.A1L.CGP(new AnonymousClass7RK(42, (Object) r3, z));
            }
        }
        r3.A1L.CGP(new C98794rj(r3, 22));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (((X.C85084Ma) r8.A63.get()).A00.A02(r1) != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
        if (r8.A6W == false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1a(X.AnonymousClass4aY r8, java.lang.Boolean r9, java.util.List r10) {
        /*
            if (r10 == 0) goto L_0x00ac
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00ac
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00ac
            X.4OV r0 = X.AnonymousClass3MY.A0T(r8)
            X.00H r0 = r0.A03
            r0.get()
            X.AEW r0 = r8.A1t
            if (r0 == 0) goto L_0x003c
            boolean r1 = r0.A0a
            r0 = 1
            if (r1 != r0) goto L_0x003c
            com.whatsapp.jid.UserJid r0 = r8.A3S
            if (r0 == 0) goto L_0x00ac
            X.00H r0 = r8.A63
            java.lang.Object r2 = r0.get()
            X.4Ma r2 = (X.C85084Ma) r2
            com.whatsapp.jid.UserJid r1 = r8.A3S
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.44c r0 = r2.A00
            java.lang.Object r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x00ac
        L_0x003c:
            r0 = 1
            r8.A6W = r0
            java.util.Iterator r2 = r10.iterator()
            r4 = 0
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r2.next()
            X.9rM r0 = (X.C194209rM) r0
            long r0 = r0.A00
            long r4 = r4 + r0
            goto L_0x0045
        L_0x0055:
            android.view.View$OnClickListener r6 = r8.A7v
            r2 = 0
            r1 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a4
            X.1bI r0 = r8.A4M
            r0.A04(r1)
            X.1bI r0 = r8.A4M
            r0.A05(r6)
            X.1FY r1 = X.AnonymousClass3MW.A0P(r8)
            r0 = 2131427550(0x7f0b00de, float:1.847672E38)
            android.widget.TextView r7 = X.AnonymousClass3MW.A0I(r1, r0)
            X.0vb r6 = r8.A2k
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = ""
        L_0x007b:
            r7.setText(r0)
            return
        L_0x007f:
            r2 = 99
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x008e
            java.text.NumberFormat r0 = r6.A0L()
            java.lang.String r0 = r0.format(r4)
            goto L_0x007b
        L_0x008e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.text.NumberFormat r0 = r6.A0L()
            java.lang.String r0 = r0.format(r2)
            r1.append(r0)
            java.lang.String r0 = "+"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x007b
        L_0x00a4:
            X.1bI r2 = r8.A4M
            boolean r1 = r8.A6W
            r0 = 0
            if (r1 != 0) goto L_0x00b3
            goto L_0x00b1
        L_0x00ac:
            r0 = 0
            r8.A6W = r0
            X.1bI r2 = r8.A4M
        L_0x00b1:
            r0 = 8
        L_0x00b3:
            r2.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A1a(X.4aY, java.lang.Boolean, java.util.List):void");
    }

    public static void A1b(AnonymousClass4aY r1, CharSequence charSequence, int i) {
        AnonymousClass4W7.A01(r1.A0E, i);
        r1.A0E.setContentDescription(charSequence);
    }

    public static void A1c(AnonymousClass4aY r3, String str) {
        if (str == null || str.length() <= 0 || r3.A2N.A00.A0O() || r3.A1a.A01() != 512) {
            C28931bI r0 = r3.A4R;
            if (r0 == null) {
                r0 = C72453Mb.A0t(r3.A2Q, 2131429572);
                r3.A4R = r0;
            }
            r0.A04(8);
            C73103Oz.A00(r3);
            return;
        }
        C28931bI r02 = r3.A4R;
        if (r02 == null) {
            r02 = C72453Mb.A0t(r3.A2Q, 2131429572);
            r3.A4R = r02;
        }
        r02.A04(0);
    }

    public static void A1d(AnonymousClass4aY r1, String str) {
        r1.A2Q.Biz(str);
        if (r1.A7V) {
            C17900vP.A0f("ConversationDelegate/marker point: ", str, AnonymousClass000.A10());
        }
    }

    public static void A1h(AnonymousClass4aY r4, boolean z) {
        Jid A0g2 = AnonymousClass3MW.A0g(r4.A35);
        A8L.remove(A0g2);
        r4.A40 = null;
        C88654aI A012 = C88444Zs.A01(r4);
        UserJid A002 = C22941Dw.A00(A0g2);
        if (A002 != null) {
            C88654aI.A00(A012, A002).A01 = false;
        }
        AnonymousClass74M r0 = r4.A4h;
        if (r0 != null) {
            r0.A0A = null;
            r0.A0B = null;
        }
        C88654aI A013 = C88444Zs.A01(r4);
        if (A002 != null) {
            C88654aI.A00(A013, A002).A02 = false;
        }
        if (z) {
            AnonymousClass4VR r02 = r4.A2q;
            AnonymousClass1BI r1 = r02.A0B;
            if (r1 != null) {
                AnonymousClass4XK r03 = r02.A0R;
                r03.A01.remove(r1.getRawString());
            }
            A0i(r4);
        }
    }

    public static void A1i(AnonymousClass4aY r2, boolean z) {
        View A022;
        View A023;
        View findViewById = r2.A2Q.findViewById(16908298);
        if (findViewById != null) {
            int i = 4;
            if (z) {
                i = 1;
            }
            findViewById.setImportantForAccessibility(i);
        }
        C28931bI r1 = r2.A4W;
        if (!(r1.A00 == null || (A023 = r1.A02()) == null)) {
            int i2 = 4;
            if (z) {
                i2 = 1;
            }
            A023.setImportantForAccessibility(i2);
        }
        C28931bI r12 = r2.A4X;
        if (r12.A00 != null && (A022 = r12.A02()) != null) {
            int i3 = 4;
            if (z) {
                i3 = 1;
            }
            A022.setImportantForAccessibility(i3);
        }
    }

    public static void A1j(AnonymousClass4aY r4, boolean z) {
        if (r4.A4M.A00 != null) {
            int dimensionPixelSize = AnonymousClass3MW.A04(r4).getDimensionPixelSize(2131165287);
            int dimensionPixelSize2 = AnonymousClass3MW.A04(r4).getDimensionPixelSize(2131165286);
            View A022 = r4.A4M.A02();
            int i = 0;
            if (!z) {
                i = dimensionPixelSize2;
                dimensionPixelSize2 = 0;
            }
            A022.setPadding(dimensionPixelSize, i, dimensionPixelSize, dimensionPixelSize2);
        }
    }

    public static void A1k(AnonymousClass4aY r3, boolean z) {
        if (r3.A3D != null) {
            if (!r3.A2Q.Bg6()) {
                AnonymousClass160 r1 = (AnonymousClass160) AnonymousClass3Ma.A0X(r3).A02.get();
                r1.A00 = AnonymousClass00R.A01;
                r1.A01 = false;
            }
            r3.A3D.setCurrentChatJid(r3.A3R);
            r3.A3D.setVisibility(0);
            r3.A3D.getViewTreeObserver().addOnGlobalLayoutListener(new C90414e2(r3, 1, z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r0.A0v.A02 != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1l(X.AnonymousClass4aY r5, boolean r6) {
        /*
            if (r6 != 0) goto L_0x0009
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r5.A4C
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            X.05w r0 = r5.A7F
            if (r0 == 0) goto L_0x0010
            r0.dismiss()
        L_0x0010:
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r5.A4C
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MW.A0j(r5)
            X.00H r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.1R3 r0 = (X.AnonymousClass1R3) r0
            X.206 r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x002b
            X.205 r0 = r0.A0v
            boolean r0 = r0.A02
            r4 = 1
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            X.5cQ r0 = r5.A2Q
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131625044(0x7f0e0454, float:1.8877285E38)
            r2 = 0
            android.view.View r1 = r1.inflate(r0, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131896954(0x7f122a7a, float:1.9428784E38)
            r1.setText(r0)
            X.1FY r0 = X.AnonymousClass3MW.A0P(r5)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r0)
            r3.A0R(r1)
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r5.A4C
            X.00H r0 = r0.A06
            X.11S r0 = X.C17880vN.A0H(r0)
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x009d
            r0 = 2131896953(0x7f122a79, float:1.9428782E38)
            if (r4 == 0) goto L_0x0063
            r0 = 2131896947(0x7f122a73, float:1.942877E38)
        L_0x0063:
            r3.A0D(r0)
            X.5cQ r0 = r5.A2Q
            X.11S r0 = r0.getMeManager()
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0087
            r0 = 2131893144(0x7f121b98, float:1.9421056E38)
            r3.setPositiveButton(r0, r2)
        L_0x0078:
            X.05w r0 = r3.create()
            r5.A7F = r0
            r0.show()
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r1 = r5.A4C
            r0 = 1
            r1.A00 = r0
            return
        L_0x0087:
            r2 = 2131896951(0x7f122a77, float:1.9428778E38)
            r1 = 22
            X.4bA r0 = new X.4bA
            r0.<init>(r5, r1)
            r3.setPositiveButton(r2, r0)
            r1 = 2131896950(0x7f122a76, float:1.9428776E38)
            r0 = 23
            X.AnonymousClass4bA.A00(r3, r5, r0, r1)
            goto L_0x0078
        L_0x009d:
            r0 = 2131896952(0x7f122a78, float:1.942878E38)
            if (r4 == 0) goto L_0x0063
            r0 = 2131896946(0x7f122a72, float:1.9428768E38)
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A1l(X.4aY, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r1.A02 != 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1m(X.AnonymousClass4aY r6, boolean r7) {
        /*
            if (r7 != 0) goto L_0x000f
            X.3Pz r0 = r6.A2F
            if (r0 != 0) goto L_0x000f
            X.0ve r0 = r6.A3F
            boolean r0 = X.C40811vJ.A0P(r0)
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            r6.A0E()
            X.3Pz r1 = r6.A2F
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x001f
            int r1 = r1.A02
            r0 = 1
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r7 != r0) goto L_0x0034
            X.3Pz r1 = r6.A2F
            int r0 = r1.A01
            if (r0 != 0) goto L_0x002d
            android.widget.FrameLayout r0 = r1.A05
        L_0x002a:
            if (r0 == 0) goto L_0x0034
            return
        L_0x002d:
            X.1bI r0 = r1.A0K
            if (r0 == 0) goto L_0x0034
            android.view.View r0 = r0.A00
            goto L_0x002a
        L_0x0034:
            X.3Pz r3 = r6.A2F
            int r5 = X.C72453Mb.A07(r7)
            r2 = 0
            if (r7 == 0) goto L_0x007e
            r0 = 41
            X.4sL r4 = new X.4sL
            r4.<init>(r6, r0)
        L_0x0044:
            r3.A02 = r5
            if (r5 != 0) goto L_0x004b
            r3.A05()
        L_0x004b:
            android.animation.Animator r0 = r3.A03
            if (r0 == 0) goto L_0x005d
            boolean r1 = r0.isRunning()
            r0 = 1
            if (r1 != r0) goto L_0x005d
            android.animation.Animator r0 = r3.A03
            if (r0 == 0) goto L_0x005d
            r0.end()
        L_0x005d:
            if (r5 != 0) goto L_0x007b
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
        L_0x0061:
            r0 = 0
            android.animation.ValueAnimator r0 = X.C73133Pz.A01(r3, r3, r1, r0, r0)
            if (r0 == 0) goto L_0x0079
            r6 = 1
            X.3Mj r1 = new X.3Mj
            r1.<init>(r2, r3, r4, r5, r6)
            r0.addListener(r1)
        L_0x0071:
            r3.A03 = r0
            if (r0 == 0) goto L_0x000e
            r0.start()
            return
        L_0x0079:
            r0 = 0
            goto L_0x0071
        L_0x007b:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x0061
        L_0x007e:
            r4 = r2
            r0 = 42
            X.4sL r2 = new X.4sL
            r2.<init>(r6, r0)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A1m(X.4aY, boolean):void");
    }

    public static void A1n(AnonymousClass4aY r4, boolean z) {
        r4.A1M.A09 = true;
        r4.A6j = true;
        BottomSheetBehavior bottomSheetBehavior = r4.A0i;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0W(5);
        }
        r4.A1M.postDelayed(new AnonymousClass7RK(41, (Object) r4, z), (long) (A00(r4) * 300.0f));
    }

    public static void A1o(AnonymousClass4aY r7, boolean z) {
        int A012;
        int A013;
        int A014;
        C75433hU r1 = r7.A23;
        if (r1 instanceof AnonymousClass3rU) {
            ((AnonymousClass3rU) r1).A0K(z);
            C75433hU r4 = r7.A23;
            ImageView A0H2 = AnonymousClass3MW.A0H(r4.A01(), 2131437074);
            AnonymousClass01E r72 = r4.A0U;
            Resources resources = r72.getResources();
            C18070vi.A0X(resources);
            if (z) {
                A012 = AnonymousClass3Ma.A01(r72, resources, 2130971557, 2131102703);
                Resources resources2 = r72.getResources();
                C18070vi.A0X(resources2);
                A014 = AnonymousClass3Ma.A01(r72, resources2, 2130971558, 2131102704);
                A013 = A012;
            } else {
                A012 = AnonymousClass3Ma.A01(r72, resources, 2130971068, 2131102412);
                Resources resources3 = r72.getResources();
                C18070vi.A0X(resources3);
                A013 = AnonymousClass3Ma.A01(r72, resources3, 2130969225, 2131102412);
                Resources resources4 = r72.getResources();
                C18070vi.A0X(resources4);
                A014 = AnonymousClass3Ma.A01(r72, resources4, 2130969226, 2131102411);
            }
            if (A0H2 != null) {
                C28081Yu.A00(ColorStateList.valueOf(A012), A0H2);
            }
            TextView textView = r4.A0A;
            if (textView != null) {
                textView.setTextColor(A013);
                r4.A0A().setTextColor(A014);
                return;
            }
            C18070vi.A11("contactNameView");
            throw null;
        }
    }

    private void A1q(C29681ch r8, boolean z) {
        String str;
        String string;
        C46162Dk r1;
        View findViewById = this.A2Q.findViewById(2131435947);
        if (findViewById != null) {
            C28931bI A0p2 = AnonymousClass3MW.A0p(findViewById);
            if (z) {
                TextView A0M2 = AnonymousClass3MX.A0M(A0p2);
                this.A2B.setEmptyView(A0M2);
                C29691ci A0A2 = ((C86454Rr) AnonymousClass3Ma.A0Y(this).A0I.get()).A00.A0A(r8);
                C179459Ia r3 = null;
                if ((A0A2 instanceof C46162Dk) && (r1 = (C46162Dk) A0A2) != null) {
                    r3 = r1.A04;
                }
                if (r3 == C179459Ia.NOT_ENFORCED || r3 == null) {
                    C26031Qo r2 = this.A2n;
                    C80483xF r12 = C80483xF.A00;
                    if (r3 != null) {
                        str = r3.toString();
                    } else {
                        str = null;
                    }
                    r2.A00(r12, str);
                } else {
                    if (r3.ordinal() != 2) {
                        AnonymousClass3MY.A1X(AnonymousClass3MW.A0Q(this).getString(2131896642), A0M2);
                    } else {
                        String A012 = ((C133836pa) AnonymousClass3Ma.A0Y(this).A0A.get()).A01(((C133836pa) AnonymousClass3Ma.A0Y(this).A0A.get()).A00());
                        if (A012 == null) {
                            string = this.A2Q.getString(2131892821);
                        } else {
                            string = this.A2Q.getString(2131890761, A012);
                        }
                        A0M2.setText(string);
                        C89914dE.A00(A0M2, this, 37);
                    }
                    A0M2.setTextSize(this.A28.A03(AnonymousClass3MW.A04(this)));
                    C72473Md.A14(A0M2, this.A4w);
                    C72463Mc.A0w(AnonymousClass3MW.A0Q(this), AnonymousClass3MW.A0P(this), A0M2, 2130969234, 2131100231);
                    return;
                }
            }
            A0p2.A04(8);
        }
    }

    private void A1s(boolean z) {
        if (!z) {
            if (!C18020vd.A05(C18040vf.A02, this.A3F, 8841) || AnonymousClass3MX.A1T(C17890vO.A0B(this.A2j), "pref_unread_message_clear_notification")) {
                this.A3d.A0E(true);
                return;
            }
        }
        this.A3d.A09(this.A3R);
        this.A6w = true;
        this.A2H.A0C(this.A3R, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r15 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A1t(boolean r14, boolean r15) {
        /*
            r13 = this;
            X.5cQ r0 = r13.A2Q
            r0.getActivityNullable()
            X.1BI r0 = r13.A3R
            X.1EC r1 = X.AnonymousClass3MW.A0i(r0)
            if (r1 == 0) goto L_0x00a5
            X.5cQ r0 = r13.A2Q
            X.1kb r0 = r0.getCommunityChatManager()
            X.1EC r5 = r0.A05(r1)
        L_0x0017:
            r9 = 1
            if (r5 == 0) goto L_0x001d
            r0 = 1
            if (r15 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r14 == 0) goto L_0x00a2
            if (r0 == 0) goto L_0x00a2
        L_0x0022:
            X.4Ye r3 = A05(r13)
            X.1FY r6 = X.AnonymousClass3MW.A0P(r13)
            r0 = 4
            X.4dL r7 = new X.4dL
            r7.<init>(r0, r13, r15)
            r12 = 0
            X.C18070vi.A0d(r6, r12)
            android.view.View r8 = r3.A00
            boolean r0 = r8 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x00a1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x00a1
            com.whatsapp.wds.components.button.WDSButton r4 = r3.A02
            if (r4 == 0) goto L_0x00a1
            r2 = 1
            r8.setOrientation(r2)
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass3Ma.A0D()
            r1.gravity = r2
            com.whatsapp.TextEmojiLabel r0 = r3.A01
            if (r0 == 0) goto L_0x0053
            r0.setLayoutParams(r1)
        L_0x0053:
            r4.setVisibility(r12)
            if (r9 == 0) goto L_0x00a8
            X.00H r9 = r3.A04
            java.lang.Object r10 = r9.get()
            X.4RD r10 = (X.AnonymousClass4RD) r10
            com.whatsapp.TextEmojiLabel r8 = r3.A01
            X.C17960vV.A05(r8)
            X.C18070vi.A0X(r8)
            android.content.Context r11 = r8.getContext()
            X.1np r7 = r10.A03
            r1 = 2131888606(0x7f1209de, float:1.9411852E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "learn-more"
            java.lang.String r2 = X.C17880vN.A0q(r11, r3, r0, r12, r1)
            r1 = 37
            X.4rk r0 = new X.4rk
            r0.<init>(r10, r6, r1)
            android.text.SpannableStringBuilder r0 = X.AnonymousClass3MY.A0A(r11, r7, r0, r2, r3)
            r8.setText(r0)
            X.0ve r0 = r10.A02
            X.AnonymousClass3Ma.A1I(r8, r0)
            X.11C r0 = r10.A01
            X.AnonymousClass3MZ.A1Q(r8, r0)
            java.lang.Object r1 = r9.get()
            X.4RD r1 = (X.AnonymousClass4RD) r1
            X.C17960vV.A07(r5)
            X.C18070vi.A0X(r5)
            r0 = 0
            r1.A00(r6, r5, r4, r0)
        L_0x00a1:
            return
        L_0x00a2:
            r9 = 0
            goto L_0x0022
        L_0x00a5:
            r5 = 0
            goto L_0x0017
        L_0x00a8:
            r0 = 2131890195(0x7f121013, float:1.9415075E38)
            r4.setText(r0)
            android.content.Context r1 = r8.getContext()
            r0 = 2131896639(0x7f12293f, float:1.9428145E38)
            java.lang.String r0 = X.C18070vi.A0F(r1, r0)
            r3.A03(r0)
            r4.setOnClickListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A1t(boolean, boolean):void");
    }

    public static boolean A1w(AnonymousClass4aY r3) {
        r3.A3v.A04(false);
        C117015z4 r0 = r3.A3K;
        if (r0 != null && r0.isShowing()) {
            r3.A3K.dismiss();
            return true;
        } else if (!A26(r3)) {
            return false;
        } else {
            r3.A2O();
            return true;
        }
    }

    public static boolean A1x(AnonymousClass4aY r2) {
        if (!r2.A6n || 3 != r2.A2w.A06(AnonymousClass3MW.A0i(r2.A3R))) {
            return false;
        }
        return true;
    }

    public static boolean A1y(AnonymousClass4aY r2) {
        if (!C42701yb.A01(r2.A3R) || !C72483Me.A0S(r2).A0D(r2.A3R)) {
            return false;
        }
        return true;
    }

    public static boolean A20(AnonymousClass4aY r3) {
        if (r3.A3Z == null || ((AnonymousClass1PW) AnonymousClass3MZ.A0k(r3).A0C.get()).A03(r3.A3Z.getMentions()) == null) {
            return false;
        }
        return true;
    }

    public static boolean A28(AnonymousClass4aY r4) {
        C85834Ox r0;
        AnonymousClass1E7 r02 = r4.A35;
        if (r02 == null || (r0 = (C85834Ox) A8L.get(AnonymousClass3MW.A0g(r02))) == null || !r0.A06) {
            return false;
        }
        if (C18020vd.A05(C18040vf.A02, r4.A3F, 10399)) {
            return true;
        }
        return false;
    }

    public static boolean A29(AnonymousClass4aY r3) {
        AnonymousClass1E7 r0 = r3.A35;
        if (r0 != null) {
            UserJid A0x2 = AnonymousClass3MZ.A0x(r0);
            if (!r3.A6z || A0x2 == null || !A06(r3).A04(A0x2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A2C(AnonymousClass4aY r3) {
        AnonymousClass1E7 r0;
        AEW aew = r3.A1t;
        if (aew == null) {
            UserJid A0j2 = AnonymousClass3MW.A0j(r3);
            if (A0j2 == null || (r0 = r3.A35) == null || !r0.A0C()) {
                return false;
            }
            C26911Ty businessProfileManager = r3.A2Q.getBusinessProfileManager();
            UserJid A012 = C22941Dw.A01(A0j2);
            if (A012 == null || ((AnonymousClass9CB) businessProfileManager.A04.getValue()).A0I(A012) != 1) {
                return false;
            }
            return true;
        } else if (aew.A00 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int A2H(int i) {
        if (i != 0) {
            if (i != 1) {
                if (this.A0S.getVisibility() == 0) {
                    return 2131231608;
                }
            } else if (AnonymousClass4ZT.A01(this)) {
                return 2131231609;
            } else {
                if (this.A0S.getVisibility() != 0) {
                    return 2131231611;
                }
            }
            if (this.A0V.getVisibility() == 0) {
                return 2131231608;
            }
            return 2131231611;
        } else if (!AnonymousClass4ZT.A01(this)) {
            return 2131231608;
        } else {
            return 2131231609;
        }
    }

    public Dialog A2I(int i) {
        AnonymousClass74M r0 = this.A4h;
        if (r0 != null && r0.A0b()) {
            AnonymousClass74M r1 = this.A4h;
            if (!r1.A0w.A0B) {
                r1.A01 = i;
                return null;
            }
        }
        C010105w A002 = this.A7M.A00(this.A35, i);
        if (A002 == null) {
            return this.A2Q.C7r(i);
        }
        return A002;
    }

    public C90594eK A2J(String str, int i, boolean z) {
        View contentView = this.A2Q.getContentView();
        List emptyList = Collections.emptyList();
        return new C90594eK(contentView, AnonymousClass3MX.A0P(this), this.A2f, str, emptyList, i, z);
    }

    public C18150vq A2K() {
        C18150vq r0 = this.A7R;
        if (r0 != null) {
            return r0;
        }
        C18150vq A022 = C18150vq.A02(new C99054sC(this, 13));
        this.A7R = A022;
        return A022;
    }

    public void A2L() {
        boolean A052 = AnonymousClass3MX.A0g(this.A5j).A05();
        AnonymousClass1E7 r1 = this.A35;
        if (A052) {
            AnonymousClass1BI r12 = r1.A0J;
            A1X(this, (UserJid) r12, true, this.A1O.A0O(r12));
            return;
        }
        CreateOrAddToContactsDialog.A00(r1, AnonymousClass3Ma.A1V(this.A1O, r1)).A2C(AnonymousClass3MW.A0K(this), (String) null);
    }

    public void A2M() {
        C26204Cub cub;
        if (C18020vd.A05(C18040vf.A02, this.A3F, 6129) && (cub = C26204Cub.A0W) != null) {
            this.A4f.A00();
            cub.A04();
            Log.i("ConversationDelegate/continueVoiceMemoSequence/clearAllPlayers");
        }
    }

    public void A2N() {
        KeyboardPopupLayout keyboardPopupLayout = this.A1M;
        keyboardPopupLayout.A09 = false;
        keyboardPopupLayout.requestLayout();
        if (A1u()) {
            LockableCoodinatorLayout lockableCoodinatorLayout = this.A1N;
            lockableCoodinatorLayout.A01 = false;
            lockableCoodinatorLayout.requestLayout();
        }
    }

    public void A2P() {
        if (this.A3Z == null) {
            return;
        }
        if (A26(this)) {
            int A022 = A02(this);
            MentionableEntry mentionableEntry = this.A3Z;
            if (mentionableEntry != null) {
                mentionableEntry.A0H();
            }
            if (A022 > 0) {
                A1O(this, A022);
                return;
            }
            return;
        }
        this.A3Z.A0H();
    }

    public void A2Q() {
        int i;
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A3F, 9315);
        if (this.A2q.A03()) {
            C98794rj r6 = new C98794rj(this, 1);
            AnonymousClass7RK r7 = new AnonymousClass7RK(39, (Object) this, A052);
            AnonymousClass4VR r4 = this.A2q;
            if (r4.A0G && !r4.A0E && r4.A00 == 2) {
                r4.A0E = true;
                C21470Akb akb = r4.A05;
                if (akb != null) {
                    r4.A0L.A0I(akb);
                }
                C74323Zj r5 = r4.A0A;
                C17960vV.A05(r5);
                int i2 = r4.A02.getLayoutParams().height;
                AnonymousClass3OU r2 = new AnonymousClass3OU(r4, r4.A02.getHeight(), 0);
                r2.setDuration(400);
                r2.setAnimationListener(new C74593c0(r4, r5, r6, r7, i2));
                r4.A02.startAnimation(r2);
            }
        } else if (this.A0V.getVisibility() == 0 && (i = this.A06) >= 0) {
            C17900vP.A0j("conversation/hidelinkpreview/start ", AnonymousClass000.A10(), i);
            C85704Ok r0 = this.A2I;
            if (r0 != null) {
                A0P(r0.A04, this.A0V);
            }
            if (!A052 && !A28(this)) {
                A1h(this, false);
            }
        }
    }

    public void A2R() {
        AnonymousClass3MX.A0u(this.A5k).A0B = Integer.valueOf(this.A78);
        C30361do A0u2 = AnonymousClass3MX.A0u(this.A5k);
        AnonymousClass1BI r2 = this.A3R;
        int i = 4;
        if (C22971Dz.A0V(r2)) {
            i = 26;
        }
        A0u2.A02(r2, i);
    }

    public void A2S() {
        if (this.A0B.getIntExtra("calling-tooltip-scenario", 0) == 1) {
            C108865cQ r5 = this.A2Q;
            ViewGroup viewGroup = this.A0R;
            Toolbar toolbar = this.A0f;
            int i = this.A05;
            C18070vi.A0d(r5, 0);
            ((C86134Qi) ((AnonymousClass4LX) this.A6A.get()).A00.get()).A00(viewGroup, toolbar, r5, AnonymousClass00R.A00, i, 10000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d6, code lost:
        if ((X.AnonymousClass11P.A01(r12.A2Q.getTime()) - r12.A0s.A03) >= X.C17890vO.A03(X.C18020vd.A00(X.C18040vf.A01, X.C72473Md.A0R(r12).A00, 11168))) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0380, code lost:
        if (X.C18070vi.A18(r1, "DEFAULT") != false) goto L_0x0382;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2T() {
        /*
            r12 = this;
            X.00H r0 = r12.A4m
            java.lang.Object r3 = r0.get()
            X.2mz r3 = (X.C59852mz) r3
            X.1F9 r2 = X.AnonymousClass3MX.A0P(r12)
            r1 = 2
            X.Alk r0 = new X.Alk
            r0.<init>(r12, r1)
            r3.A01(r2, r0)
            X.3VQ r4 = r12.A2b
            X.1WF r1 = r4.A0r
            X.1BI r0 = r4.A0u
            java.util.LinkedHashMap r3 = r1.A00(r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0031
            android.os.Handler r2 = r4.A0Q
            r1 = 47
            X.4ra r0 = new X.4ra
            r0.<init>(r4, r3, r1)
            r2.post(r0)
        L_0x0031:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x0045
            r0 = 21
            if (r1 != r0) goto L_0x0071
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0071
        L_0x0045:
            X.5cQ r0 = r12.A2Q
            X.11C r0 = r0.getSystemServices()
            android.app.KeyguardManager r0 = r0.A06()
            X.C17960vV.A07(r0)
            boolean r0 = r0.isKeyguardLocked()
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "conversation/locked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.265 r3 = new X.265
            r3.<init>(r12, r0)
            r12.A0A = r3
            X.5cQ r2 = r12.A2Q
            java.lang.String r1 = "android.intent.action.USER_PRESENT"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r2.CE4(r3, r0)
        L_0x0071:
            X.1cr r0 = r12.A2g
            r0.A01()
            X.5cQ r0 = r12.A2Q
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r0 = "fromNotification"
            r5 = 0
            boolean r0 = r4.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = "last_notification_keep_in_chat"
            boolean r0 = r4.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x009f
            X.1gr r1 = r12.A3B
            java.lang.String r0 = "kic_notification_taps"
            r1.A00(r0)
            boolean r0 = r12.A6n
            if (r0 == 0) goto L_0x009f
            X.1gr r1 = r12.A3B
            java.lang.String r0 = "kic_group_notification_taps"
            r1.A00(r0)
        L_0x009f:
            java.lang.String r0 = "notificationContainsUrlPreview"
            boolean r0 = r4.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x00b0
            X.1i1 r2 = r12.A2H
            X.1BI r1 = r12.A3R
            r0 = 12
            r2.A0C(r1, r0)
        L_0x00b0:
            java.lang.String r0 = "notificationContainsUrlPreviewFb"
            boolean r0 = r4.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x00c1
            X.1i1 r2 = r12.A2H
            X.1BI r1 = r12.A3R
            r0 = 14
            r2.A0C(r1, r0)
        L_0x00c1:
            java.lang.String r0 = "notificationContainsUrlPreviewIg"
            boolean r0 = r4.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x00d2
            X.1i1 r2 = r12.A2H
            X.1BI r1 = r12.A3R
            r0 = 16
            r2.A0C(r1, r0)
        L_0x00d2:
            X.1BI r3 = r12.A3R
            java.lang.String r0 = "fromMessageReminderNotification"
            boolean r0 = r4.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x00ef
            X.0ve r2 = r12.A3F
            r1 = 5544(0x15a8, float:7.769E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00ef
            X.1i1 r1 = r12.A2H
            r0 = 10
            r1.A0C(r3, r0)
        L_0x00ef:
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r12)
            X.00H r0 = r0.A09
            java.lang.Object r0 = r0.get()
            X.6pl r0 = (X.C133946pl) r0
            r0.A00(r4)
            X.00H r0 = r12.A5i
            java.lang.Object r5 = r0.get()
            X.2jj r5 = (X.C57842jj) r5
            X.1BI r4 = r12.A3R
            X.4LM r3 = new X.4LM
            r3.<init>(r12)
            boolean r0 = r4 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 != 0) goto L_0x0115
            boolean r0 = r4 instanceof X.AnonymousClass1E9
            if (r0 == 0) goto L_0x0135
        L_0x0115:
            X.00H r0 = r5.A00
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 10180(0x27c4, float:1.4265E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0135
            X.00H r0 = r5.A03
            X.10I r2 = X.AnonymousClass3MX.A0x(r0)
            r1 = 11
            X.7R0 r0 = new X.7R0
            r0.<init>(r4, r3, r5, r1)
            r2.CGF(r0)
        L_0x0135:
            X.10I r2 = X.AnonymousClass3MX.A0w(r12)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MW.A0j(r12)
            if (r1 == 0) goto L_0x0144
            r0 = 26
            X.C98704ra.A00(r2, r12, r1, r0)
        L_0x0144:
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r12)
            X.00H r0 = r0.A09
            java.lang.Object r4 = r0.get()
            X.2l7 r4 = (X.C58702l7) r4
            X.1BI r3 = r12.A3R
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r0 = X.C42701yb.A01(r3)
            if (r0 == 0) goto L_0x017e
            X.00H r0 = r4.A03
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x017e
            boolean r0 = X.C22971Dz.A0d(r3)
            r2 = 1
            if (r0 == 0) goto L_0x047d
            X.1PW r1 = r4.A00
            r0 = r3
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.24e r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x047d
            boolean r0 = r0.A0I
            if (r0 != r2) goto L_0x047d
        L_0x017e:
            X.1E7 r0 = r12.A35
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x01ae
            A1H(r12)
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r12)
            X.00H r0 = r0.A0O
            java.lang.Object r2 = r0.get()
            X.72A r2 = (X.AnonymousClass72A) r2
            X.1BI r1 = r12.A3R
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1M9 r0 = r2.A00
            X.1E7 r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x01ae
            boolean r0 = X.AnonymousClass72A.A00(r0, r2)
            if (r0 == 0) goto L_0x01ae
            X.AEW r0 = r12.A1t
            A0X(r0, r12)
        L_0x01ae:
            X.1BI r2 = r12.A3R
            if (r2 == 0) goto L_0x0206
            X.0ve r3 = r12.A3F
            r1 = 5869(0x16ed, float:8.224E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x01c9
            X.00H r0 = r12.A5A
            java.lang.Object r0 = r0.get()
            X.73F r0 = (X.AnonymousClass73F) r0
            r0.A04(r2)
        L_0x01c9:
            X.00H r0 = r12.A59
            java.lang.Object r1 = r0.get()
            X.9ox r1 = (X.C192769ox) r1
            X.1E7 r0 = r12.A35
            boolean r0 = r0.A0C()
            r1.A01(r2, r0)
            int r1 = r2.getType()
            r0 = 18
            if (r1 != r0) goto L_0x0206
            X.3Ub r0 = r12.A2X
            X.1wy r5 = r0.A09
            X.1Ln r4 = r12.A36
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A01(r2)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r0 = X.C42701yb.A01(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0203
            boolean r0 = r3 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0471
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3
        L_0x01fd:
            if (r3 == 0) goto L_0x0203
            X.1E1 r1 = r4.A0A(r3)
        L_0x0203:
            r5.A0E(r1)
        L_0x0206:
            r5 = 0
            X.1KB r1 = r12.A1L
            r0 = 9
            X.C98794rj.A00(r1, r12, r0)
            A1I(r12)
            X.1KB r1 = r12.A1L
            r0 = 10
            X.C98794rj.A00(r1, r12, r0)
            X.1E7 r0 = r12.A35
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MZ.A0x(r0)
            X.AEW r1 = r12.A1t
            if (r1 != 0) goto L_0x022e
            X.5cQ r0 = r12.A2Q
            X.1Ty r0 = r0.getBusinessProfileManager()
            X.AEW r1 = r0.A08(r3)
            r12.A1t = r1
        L_0x022e:
            X.3VQ r0 = r12.A2b
            r0.A0C = r1
            if (r1 == 0) goto L_0x025d
            boolean r0 = r1.A0b
            if (r0 == 0) goto L_0x025d
            X.0ve r1 = r12.A3F
            r0 = 7152(0x1bf0, float:1.0022E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 == 0) goto L_0x025d
            X.0ve r1 = r12.A3F
            r0 = 8869(0x22a5, float:1.2428E-41)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 != 0) goto L_0x025d
            X.00H r0 = r12.A5S
            java.lang.Object r1 = r0.get()
            X.7Gq r1 = (X.C144267Gq) r1
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r12)
            r1.A01(r0)
        L_0x025d:
            boolean r0 = A1y(r12)
            if (r0 != 0) goto L_0x0282
            X.3V0 r7 = r12.A2c
            X.0z4 r0 = r7.A02
            android.content.SharedPreferences r4 = X.C17890vO.A0B(r0)
            java.lang.String r1 = "push_to_video_sending_enabled"
            r0 = -1
            int r0 = r4.getInt(r1, r0)
            r6 = 0
            r4 = 1
            if (r0 != r4) goto L_0x045e
            r0 = 0
        L_0x0277:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x027b:
            int r0 = r0.intValue()
            X.AnonymousClass3V0.A00(r7, r6, r6, r0)
        L_0x0282:
            X.0vb r10 = r12.A2k
            X.1KB r7 = r12.A1L
            X.1F9 r6 = X.AnonymousClass3MX.A0P(r12)
            X.1bI r11 = r12.A7P
            X.3V4 r8 = r12.A2Y
            X.3V0 r9 = r12.A2c
            X.AnonymousClass4HU.A00(r6, r7, r8, r9, r10, r11)
            X.1BI r0 = r12.A3R
            X.1EC r1 = X.AnonymousClass3MW.A0i(r0)
            if (r1 == 0) goto L_0x045b
            X.00H r0 = r12.A58
            X.1EC r10 = X.C72453Mb.A0n(r1, r0)
        L_0x02a1:
            if (r3 == 0) goto L_0x02fd
            boolean r0 = A1y(r12)
            if (r0 == 0) goto L_0x02fd
            boolean r0 = A22(r12)
            if (r0 != 0) goto L_0x02fd
            X.24e r0 = r12.A0s
            if (r0 == 0) goto L_0x02d8
            X.5cQ r0 = r12.A2Q
            X.11P r0 = r0.getTime()
            long r8 = X.AnonymousClass11P.A01(r0)
            X.24e r0 = r12.A0s
            long r0 = r0.A03
            long r8 = r8 - r0
            X.1UD r0 = X.C72473Md.A0R(r12)
            X.0ve r4 = r0.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 11168(0x2ba0, float:1.565E-41)
            int r0 = X.C18020vd.A00(r1, r4, r0)
            long r6 = X.C17890vO.A03(r0)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x02fd
        L_0x02d8:
            X.1UD r0 = X.C72473Md.A0R(r12)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x02fd
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r12)
            X.00H r0 = r0.A0H
            java.lang.Object r4 = r0.get()
            X.24f r4 = (X.C446424f) r4
            java.util.List r1 = java.util.Collections.singletonList(r3)
            X.C18070vi.A0d(r1, r5)
            X.2iZ r0 = new X.2iZ
            r0.<init>(r4)
            r0.A00(r1)
        L_0x02fd:
            X.00H r0 = r12.A6G
            java.lang.Object r0 = r0.get()
            X.4S5 r0 = (X.AnonymousClass4S5) r0
            if (r3 == 0) goto L_0x0458
            com.whatsapp.jid.UserJid r0 = r0.A00(r3)
        L_0x030b:
            r12.A3S = r0
            boolean r0 = r12.A6o
            if (r0 == 0) goto L_0x032d
            X.00H r0 = r12.A5a
            java.lang.Object r0 = r0.get()
            X.2cA r0 = (X.C53212cA) r0
            X.0zA r0 = r0.A00
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x032d
            X.1KB r3 = r12.A1L
            r1 = 32
            X.4ra r0 = new X.4ra
            r0.<init>(r12, r2, r1)
            r3.A0J(r0)
        L_0x032d:
            X.00H r0 = r12.A5F
            java.lang.Object r0 = r0.get()
            X.5by r0 = (X.C108605by) r0
            boolean r0 = r0.Bgg()
            if (r0 == 0) goto L_0x0342
            X.1KB r1 = r12.A1L
            r0 = 16
            X.C98794rj.A00(r1, r12, r0)
        L_0x0342:
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r12)
            X.00H r0 = r0.A0D
            java.lang.Object r4 = r0.get()
            X.4RE r4 = (X.AnonymousClass4RE) r4
            X.1FY r3 = X.AnonymousClass3MW.A0Q(r12)
            if (r10 == 0) goto L_0x0355
            r5 = 1
        L_0x0355:
            X.C18070vi.A0h(r3, r2)
            X.0ve r7 = r4.A01
            r1 = 8320(0x2080, float:1.1659E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r1)
            if (r0 == 0) goto L_0x03e2
            X.4aW r0 = r4.A04
            X.4SC r6 = r0.A0E(r3, r2)
            X.3zq r3 = new X.3zq
            r3.<init>()
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "NONE"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0382
            java.lang.String r0 = "DEFAULT"
            boolean r1 = X.C18070vi.A18(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0383
        L_0x0382:
            r0 = 0
        L_0x0383:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.A00 = r0
            com.whatsapp.jid.GroupJid r9 = X.C36321nh.A00(r2)
            android.os.Parcelable$Creator r0 = X.C47712Jo.CREATOR
            boolean r0 = r2 instanceof X.C47712Jo
            r8 = 0
            if (r0 == 0) goto L_0x039b
            r8 = r2
        L_0x039b:
            X.1cg r0 = X.C29671cg.A00
            boolean r0 = r2 instanceof X.C29671cg
            r5 = 0
            if (r0 == 0) goto L_0x03a3
            r5 = r2
        L_0x03a3:
            X.25J r0 = X.C29681ch.A03
            boolean r0 = r2 instanceof X.C29681ch
            if (r0 == 0) goto L_0x0455
            r1 = r2
        L_0x03aa:
            if (r9 == 0) goto L_0x0445
            r0 = 2
        L_0x03ad:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
            X.1Nl r0 = r4.A03
            java.lang.String r0 = X.AnonymousClass3Ma.A14(r0, r2)
            r3.A06 = r0
            boolean r0 = X.AnonymousClass1J8.A01(r7)
            if (r0 == 0) goto L_0x03dd
            X.4Nz r1 = r4.A00(r2, r6)
            java.lang.String r0 = r1.A03
            r3.A04 = r0
            int r0 = r1.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x03d7
            r3.A07 = r0
        L_0x03d7:
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x03dd
            r3.A05 = r0
        L_0x03dd:
            X.18K r0 = r4.A02
            r0.CC7(r3)
        L_0x03e2:
            X.5cQ r0 = r12.A2Q
            X.0zA r0 = r0.getHostedGroupUtilsOptional()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0443
            X.5cQ r0 = r12.A2Q
            X.0zA r0 = r0.getHostedGroupUtilsOptional()
            java.lang.Object r3 = r0.A03()
            X.1gl r3 = (X.C32171gl) r3
        L_0x03fa:
            boolean r0 = r12.A6n
            if (r0 == 0) goto L_0x0422
            X.0z4 r0 = r12.A2j
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "secure_bottomsheet_shown"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x0422
            if (r3 == 0) goto L_0x0422
            X.1BI r0 = r12.A3R
            boolean r0 = r3.Bey(r0)
            if (r0 == 0) goto L_0x0422
            X.1KB r2 = r12.A1L
            r1 = 37
            X.4ra r0 = new X.4ra
            r0.<init>(r12, r3, r1)
            r2.A0J(r0)
        L_0x0422:
            X.1KB r1 = r12.A1L
            r0 = 17
            X.C98794rj.A00(r1, r12, r0)
            X.00H r0 = r12.A5r
            java.lang.Object r1 = r0.get()
            X.2eH r1 = (X.C54522eH) r1
            r0 = 1
            r1.A00 = r0
            X.1KB r1 = r12.A1L
            r0 = 20
            X.C98794rj.A00(r1, r12, r0)
            X.1KB r1 = r12.A1L
            r0 = 21
            X.C98794rj.A00(r1, r12, r0)
            return
        L_0x0443:
            r3 = 0
            goto L_0x03fa
        L_0x0445:
            if (r8 == 0) goto L_0x044a
            r0 = 4
            goto L_0x03ad
        L_0x044a:
            if (r5 == 0) goto L_0x044f
            r0 = 3
            goto L_0x03ad
        L_0x044f:
            r0 = 1
            if (r1 == 0) goto L_0x03ad
            r0 = 5
            goto L_0x03ad
        L_0x0455:
            r1 = 0
            goto L_0x03aa
        L_0x0458:
            r0 = 0
            goto L_0x030b
        L_0x045b:
            r10 = 0
            goto L_0x02a1
        L_0x045e:
            X.4VJ r1 = r7.A01
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x046a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x027b
        L_0x046a:
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x0282
            r0 = 2
            goto L_0x0277
        L_0x0471:
            boolean r0 = r3 instanceof X.AnonymousClass1E1
            if (r0 == 0) goto L_0x0203
            X.1E1 r3 = (X.AnonymousClass1E1) r3
            com.whatsapp.jid.PhoneUserJid r3 = r4.A0D(r3)
            goto L_0x01fd
        L_0x047d:
            X.1CJ r0 = r4.A01
            X.206 r0 = r0.A0E(r3)
            if (r0 != 0) goto L_0x017e
            X.121 r0 = r4.A02
            boolean r0 = r0.BEj(r3)
            if (r0 != 0) goto L_0x017e
            X.00H r0 = r4.A04
            java.lang.Object r0 = r0.get()
            X.9oI r0 = (X.C192379oI) r0
            r0.A00(r3, r2)
            goto L_0x017e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2T():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2U() {
        /*
            r4 = this;
            X.1BI r1 = r4.A3R
            boolean r0 = X.C22971Dz.A0O(r1)
            if (r0 == 0) goto L_0x0041
            java.lang.String r3 = "ConversationBroadcastList"
        L_0x000a:
            X.1KB r2 = r4.A1L
            r1 = 9
            X.7Qs r0 = new X.7Qs
            r0.<init>(r1, r3, r4)
            r2.A0J(r0)
        L_0x0016:
            X.3hU r1 = r4.A23
            boolean r0 = r1 instanceof X.AnonymousClass3rW
            if (r0 == 0) goto L_0x0023
            X.3rW r1 = (X.AnonymousClass3rW) r1
            if (r1 == 0) goto L_0x0023
            X.AnonymousClass3rW.A05(r1)
        L_0x0023:
            boolean r0 = A2C(r4)
            if (r0 == 0) goto L_0x003a
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r4)
            X.00H r0 = r0.A0P
            java.lang.Object r1 = r0.get()
            X.2k1 r1 = (X.C58022k1) r1
            X.1BI r0 = r4.A3R
            r1.A00(r0)
        L_0x003a:
            X.1KB r1 = r4.A1L
            r0 = 5
            X.C98794rj.A00(r1, r4, r0)
            return
        L_0x0041:
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x004a
            java.lang.String r3 = "ConversationGroupChat"
            goto L_0x000a
        L_0x004a:
            boolean r0 = X.C22971Dz.A0V(r1)
            if (r0 == 0) goto L_0x0016
            java.lang.String r3 = "ConversationNewsletter"
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2U():void");
    }

    public void A2W() {
        AnonymousClass3VQ r3 = this.A2b;
        C54242dp BUp = r3.A0m.BUp(r3.A0u, AnonymousClass3VQ.A03(r3), r3.A0A, r3.A0O);
        r3.A0W(BUp.A01);
        r3.A0X(BUp.A02);
        r3.A0Z(BUp);
        r3.A0Q.post(new C98704ra(r3, new AnonymousClass4SI((AnonymousClass1IX) null, BUp, (Boolean) null, (Boolean) null, (Collection) null, false, false), 48));
    }

    public void A2X() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        C115095tO r0;
        if (this.A6a && !AnonymousClass3MW.A0Y(this.A52).A01) {
            AnonymousClass3MW.A0Y(this.A52).A03 = false;
            this.A6a = false;
        }
        AnonymousClass02B selectionActionMode = this.A2Q.getSelectionActionMode();
        if (selectionActionMode != null) {
            selectionActionMode.A05();
        }
        AnonymousClass02B r02 = this.A0e;
        if (r02 != null) {
            r02.A05();
        }
        AnonymousClass1BI r2 = this.A3R;
        if (r2 != null) {
            C95184lp r1 = (C95184lp) this.A2T;
            synchronized (r1) {
                r1.A00.remove(r2);
                r1.A01.remove(r2);
            }
        }
        ObjectAnimator objectAnimator = this.A09;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.A09 = null;
        C117015z4 r12 = this.A3K;
        if (r12 != null) {
            C144547Hs r03 = r12.A09;
            if (r03 != null) {
                r03.A02 = null;
            }
            r12.A0N((AnonymousClass88B) null);
            r12.A0M();
        }
        if (C87544Vz.A01(this.A3F) && (r0 = this.A24) != null) {
            r0.A0K();
            r0.A02 = null;
        }
        AnonymousClass74M r04 = this.A4h;
        if (r04 != null) {
            r04.A0M();
        }
        Runnable runnable = this.A6P;
        if (runnable != null) {
            this.A4c.CEz(runnable);
        }
        A0I();
        AnonymousClass1RX A002 = this.A2W.A00();
        C17960vV.A07(A002);
        C22559BCs bCs = A002.A00;
        C108865cQ r05 = this.A2Q;
        if (bCs == r05) {
            AnonymousClass00N.A00(A002, new AnonymousClass1RX((C22559BCs) null, r05.getScreenLockStateProvider(), false), this.A2W.A00);
        }
        AnonymousClass3VQ r13 = this.A2b;
        if (r13 != null) {
            r13.A0J = AnonymousClass3MW.A0P(this).isChangingConfigurations();
            if (this.A2Q.isFinishing()) {
                ((C25441Of) AnonymousClass3Ma.A0Z(this).A0A.get()).A00(C99244sV.A00(new C91244fN(1), 48));
                AnonymousClass3VQ r3 = this.A2b;
                r3.A0o.A03(r3.A0u, AnonymousClass3MW.A0P(this).getLocalClassName());
            }
        }
        C826449e r06 = this.A2D;
        if (r06 != null) {
            r06.A0B(true);
        }
        View view = this.A0D;
        if (!(view == null || (onGlobalLayoutListener = this.A7c) == null)) {
            AnonymousClass3MY.A1D(view, onGlobalLayoutListener);
        }
        if (!C18020vd.A05(C18040vf.A01, this.A3F, 10202)) {
            this.A4j.unregisterObserver(this.A8G);
            C17880vN.A0V(this.A6D).unregisterObserver(this.A8F);
            C17880vN.A0V(this.A5d).unregisterObserver(this.A86);
            C17880vN.A0V(this.A5N).unregisterObserver(this.A87);
            C17880vN.A0V(this.A5n).unregisterObserver(this.A8D);
        }
        C17880vN.A0V(AnonymousClass3MY.A0T(this).A04).unregisterObserver(this.A82);
        C17880vN.A0V(AnonymousClass3Ma.A0X(this).A04).unregisterObserver(this.A8E);
        if (this.A1b != null) {
            C17880vN.A0V(this.A50).unregisterObserver(this.A1b);
        }
        AnonymousClass722 r07 = this.A48;
        if (r07 != null) {
            r07.A0B.unregisterObserver(r07.A09);
        }
        C17880vN.A0V(AnonymousClass3Ma.A0X(this).A05).unregisterObserver(this.A89);
        C17880vN.A0V(this.A5o).unregisterObserver(this.A88);
        C17880vN.A0V(this.A61).unregisterObserver(this.A83);
        C121826Lq r08 = this.A7S;
        if (r08 != null) {
            r08.A0B(true);
            this.A7S = null;
        }
        if (this.A3Z != null) {
            A0G();
            this.A3Z.removeTextChangedListener(this.A7u);
            this.A3Z.removeTextChangedListener(this.A7t);
            AnonymousClass48C r14 = this.A7N;
            if (r14 != null) {
                this.A3Z.removeTextChangedListener(r14);
            }
            this.A3Z.setFilters(new InputFilter[0]);
            this.A3Z.A0L();
            this.A3Z = null;
        }
        AnonymousClass7MX r09 = this.A3v;
        if (r09 != null) {
            r09.A04 = null;
            r09.A01 = null;
            r09.A00();
        }
        WaEditText waEditText = this.A1W;
        if (waEditText != null) {
            waEditText.removeTextChangedListener(this.A7b);
        }
        BroadcastReceiver broadcastReceiver = this.A0A;
        if (broadcastReceiver != null) {
            this.A2Q.unregisterReceiver(broadcastReceiver);
            this.A0A = null;
        }
        C108865cQ r010 = this.A2Q;
        AnonymousClass4aV.A07(r010.getMessageAudioPlayerProvider(), this.A3R, r010.CFa().A0F, this.A4c);
        AnonymousClass4aV.A01(this.A0H, this.A2Q.getMessageAudioPlayerProvider());
        C37451pZ r011 = this.A1y;
        if (r011 != null) {
            r011.A02();
            this.A1y = null;
        }
        if (C87724Ws.A00(this).A03) {
            this.A3g.A03();
            C87724Ws.A00(this).A03 = false;
        }
        if (this.A3R != null && AnonymousClass3MX.A0y(((C87724Ws) this.A5s.get()).A03).A0A(this.A3R)) {
            ((C37181p6) ((C87724Ws) this.A5s.get()).A00.get()).clear();
        }
        C108645c3 r15 = this.A4e;
        if (r15 != null && r15.BT1()) {
            r15.BF9();
        }
        if (this.A4d != null) {
            ((ViewGroup) this.A2Q.getWindow().getDecorView()).removeView(this.A4d);
            ConversationListView conversationListView = this.A2B;
            C36771oR r32 = this.A1n;
            C18070vi.A0d(r32, 0);
            Set set = conversationListView.A0U.A00;
            synchronized (set) {
                set.remove(r32);
            }
            this.A4d = null;
        }
        C18150vq r012 = this.A7R;
        if (r012 != null && r012.A03()) {
            ((C20005A2v) this.A7R.get()).A02();
        }
        Set<Application.ActivityLifecycleCallbacks> set2 = this.A7p;
        for (Application.ActivityLifecycleCallbacks onActivityDestroyed : set2) {
            onActivityDestroyed.onActivityDestroyed(AnonymousClass3MW.A0P(this));
        }
        set2.clear();
        this.A7q.clear();
        this.A7o.clear();
        this.A8H.clear();
        this.A23 = null;
        ((AnonymousClass8AF) ((C87724Ws) this.A5s.get()).A02.get()).CIb();
        ConversationListView conversationListView2 = this.A2B;
        if (conversationListView2 != null) {
            DataSetObserver dataSetObserver = this.A7X;
            conversationListView2.removeCallbacks(conversationListView2.A0L);
            C73103Oz conversationCursorAdapter = conversationListView2.getConversationCursorAdapter();
            conversationCursorAdapter.unregisterDataSetObserver(dataSetObserver);
            Cursor cursor = conversationCursorAdapter.getCursor();
            if (cursor != null) {
                cursor.close();
            }
            ((C200710s) ((AnonymousClass4RG) conversationListView2.getNewsletterMediaDownloadManager().get()).A04.getValue()).A03();
        }
        ((C88444Zs) this.A5I.get()).A02.get();
        if (C88444Zs.A02(this).A00.BfT(1029386189)) {
            C88444Zs.A02(this).A02((String) null, 4);
        }
        if (C42761yh.A01(this.A3G, this.A3R)) {
            C17880vN.A1F(C19830z4.A00(this.A2Q.getWaSharedPreferences()), "wac_consent_shown", true);
        }
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A39;
        if (emojiSearchKeyboardContainer != null) {
            emojiSearchKeyboardContainer.setOnTouchListener((View.OnTouchListener) null);
            emojiSearchKeyboardContainer.A09 = null;
        }
        ExpressionsTrayView expressionsTrayView = this.A3D;
        if (expressionsTrayView != null) {
            expressionsTrayView.A0M = null;
            expressionsTrayView.A0D();
            this.A3D = null;
            this.A0i = null;
        }
        A0b(this);
        C216616x A0d2 = AnonymousClass3MX.A0d(this.A5t);
        if (A0d2.A03.A06() != null) {
            A0d2.A00((AnonymousClass205) null);
        }
        if (this.A0R != null) {
            AnonymousClass1FY A0Q2 = AnonymousClass3MW.A0Q(this);
            if (A0Q2 instanceof Conversation) {
                View A0A2 = C110885hR.A0A(A0Q2, 2131434738);
                AnonymousClass1HF.A0k(A0A2, (C25247Cbm) null);
                AnonymousClass1HF.A0g(A0A2, (AnonymousClass1HE) null);
            }
            AnonymousClass1HF.A0k(this.A1M, (C25247Cbm) null);
        }
        this.A3P = null;
        C86414Rn r013 = this.A2G;
        if (r013 != null) {
            C98524rI A003 = r013.A00();
            if (A003 instanceof C77973ru) {
                PinInChatBannerViewModel pinInChatBannerViewModel = ((C77973ru) A003).A04;
                Runnable runnable2 = pinInChatBannerViewModel.A00;
                if (runnable2 != null) {
                    pinInChatBannerViewModel.A02.A0I(runnable2);
                }
                pinInChatBannerViewModel.A00 = null;
            }
        }
        if (A0B().contains(AnonymousClass4YH.A03)) {
            ((C25771Po) AnonymousClass3MZ.A0k(this).A0I.get()).A05((Long) null);
        }
        if (C18020vd.A05(C18040vf.A02, this.A3F, 3403)) {
            ((AnonymousClass4XX) this.A5D.get()).A01();
        }
        if (AnonymousClass1J8.A03(this.A3F)) {
            ((AnonymousClass1LT) this.A6E.get()).A01.clear();
        }
        AEW aew = this.A1t;
        if (aew != null && aew.A0b) {
            ((C144267Gq) this.A5S.get()).A00();
        }
        AnonymousClass4R4 A0a2 = AnonymousClass3MZ.A0a(this);
        AnonymousClass1BI r33 = this.A3R;
        int i = 4;
        if (this.A6s) {
            i = 5;
        }
        int i2 = 4;
        if (C22971Dz.A0V(r33)) {
            i2 = 26;
        }
        A0a2.A00(r33, i, i2);
        A0M(0);
        if (A25(this)) {
            ((C57382iz) C72473Md.A0Q(this).A06.A0A.get()).A00();
        }
        if (this.A6r) {
            C84694Km r16 = (C84694Km) this.A6C.get();
            VCOverscrollEntryPointView vCOverscrollEntryPointView = r16.A00;
            if (vCOverscrollEntryPointView != null) {
                vCOverscrollEntryPointView.A08();
            }
            r16.A00 = null;
        }
        if (this.A6p) {
            AnonymousClass4X0 r17 = (AnonymousClass4X0) AnonymousClass3Ma.A0X(this).A01.get();
            ((AbstractMap) r17.A05.getValue()).clear();
            ((AbstractMap) r17.A04.getValue()).clear();
        }
        Log.i("ConversationDelegate/onDestroy");
    }

    public void A2Y() {
        C46162Dk r3;
        long j;
        Object copyOf;
        C18030ve r2 = this.A3F;
        C18040vf r32 = C18040vf.A02;
        boolean A052 = C18020vd.A05(r32, r2, 10079);
        if (A052) {
            this.A2Q.C3A();
        }
        if (!this.A6X) {
            if (!A052) {
                this.A2Q.C3A();
            }
            if (this.A0B.hasExtra("start_t")) {
                this.A2Q.getTime();
                long uptimeMillis = SystemClock.uptimeMillis() - this.A0B.getLongExtra("start_t", 0);
                AnonymousClass4RV r8 = (AnonymousClass4RV) this.A54.get();
                r8.A04.markerEnd(703934026, 2);
                boolean z = r8.A01;
                AnonymousClass2H8 r7 = r8.A00;
                AnonymousClass2H8 r10 = null;
                if (r7 != null) {
                    if (z && C72453Mb.A1a(r8.A08)) {
                        AnonymousClass00H r5 = r8.A06;
                        if (((AnonymousClass1CP) r5.get()).A00.containsKey("chat_open")) {
                            AnonymousClass1CR A012 = ((AnonymousClass1CP) r5.get()).A01("chat_open");
                            long j2 = (Long) A012.A02.get("msgstore.db");
                            if (j2 == null) {
                                j2 = 0L;
                            }
                            r7.A07 = j2;
                            long j3 = (Long) A012.A03.get("msgstore.db");
                            if (j3 == null) {
                                j3 = 0L;
                            }
                            r7.A08 = j3;
                            long j4 = (Long) A012.A00.get("msgstore.db");
                            if (j4 == null) {
                                j4 = 0L;
                            }
                            r7.A06 = j4;
                        }
                    }
                    r10 = r7;
                }
                C85764Oq r9 = (C85764Oq) r8.A05.get();
                AnonymousClass18K r72 = r8.A03;
                C18100vl r4 = r9.A04;
                if (C72453Mb.A1a(r4)) {
                    if (!C72453Mb.A1a(r4)) {
                        copyOf = C18460wS.A00;
                    } else {
                        r9.A05 = false;
                        ConcurrentLinkedDeque concurrentLinkedDeque = r9.A02;
                        C18070vi.A0d(concurrentLinkedDeque, 0);
                        copyOf = AnonymousClass1IX.copyOf((Collection) concurrentLinkedDeque);
                        C18070vi.A0X(copyOf);
                        concurrentLinkedDeque.clear();
                    }
                    r9.A01.CGF(new AnonymousClass3C5(copyOf, r9, r72, 5));
                }
                r8.A00 = null;
                r8.A01 = false;
                AnonymousClass1BI r11 = this.A3R;
                if (r11 instanceof AnonymousClass1E9) {
                    AnonymousClass3MX.A0w(this).CGF(new AnonymousClass3C8(this, r11, r10, 5, uptimeMillis));
                } else {
                    C36331ni r12 = this.A4D;
                    r12.A0C.CGF(new AnonymousClass3CQ(r10, r11, r12, 3, 0, 0, uptimeMillis));
                }
                this.A0B.removeExtra("start_t");
                int A002 = C18020vd.A00(r32, AnonymousClass3MX.A0h(this), 1550);
                C36331ni r82 = this.A4D;
                long j5 = (long) A002;
                if (j5 > 0 && uptimeMillis >= j5) {
                    AnonymousClass2FR r22 = new AnonymousClass2FR();
                    r22.A02 = "chat_open";
                    r22.A00 = Long.valueOf(uptimeMillis);
                    r22.A01 = Long.valueOf(j5);
                    r82.A09.CC4(r22);
                }
            }
            ((C25441Of) AnonymousClass3Ma.A0Z(this).A0A.get()).A00(C99244sV.A00(new C91264fP(this, 6), 48));
            C144987Jl r52 = this.A4B;
            AnonymousClass1BI r42 = this.A3R;
            C18070vi.A0d(r42, 0);
            r52.A02.execute(new AnonymousClass7RD(r52, r42, 12));
            AnonymousClass4PC r6 = this.A2S;
            boolean A0N2 = C22971Dz.A0N(this.A35.A0J);
            AnonymousClass1BI r53 = this.A3R;
            if (A0N2) {
                Parcelable.Creator creator = C47712Jo.CREATOR;
                if ((r53 instanceof C47712Jo) && r53 != null) {
                    C63082sT r43 = (C63082sT) r6.A07.get();
                    AnonymousClass3MX.A0x(r43.A00).CGS(new C21451AkI(r43, r53, 40), "BroadcastAnalyticsManager");
                    C19880zA r23 = r6.A00;
                    if (r23.A07()) {
                        r23.A03();
                        throw AnonymousClass000.A0s("logBroadcastSmbJourneyOpenChatAction");
                    }
                }
            }
            if (AnonymousClass3MZ.A1W(this)) {
                Integer A003 = AnonymousClass4aS.A00(this.A0B);
                if (!C1402570p.A02(A003) || !AnonymousClass4X5.A00(this).A06()) {
                    AnonymousClass440 r1 = this.A3c;
                    if (r1 != null) {
                        r3 = r1.A0U();
                        if (r3 != null) {
                            j = (long) r3.A0A;
                        }
                        j = 0;
                    } else {
                        r3 = null;
                        j = 0;
                    }
                    A6Q.A02((A6Q) AnonymousClass3Ma.A0Y(this).A0G.get(), this.A6M, 2);
                    ((AnonymousClass74D) AnonymousClass3Ma.A0Y(this).A0C.get()).A0B(this.A2X.A0T(), (C29681ch) this.A3R, A003, this.A6N, (String) null, -1, -1, j);
                    if (r3 != null && AnonymousClass000.A1Z(r3.A02, C179509Ig.SUBSCRIBED) && !AnonymousClass1c4.A02(AnonymousClass4X5.A00(this), 0)) {
                        C98834rn.A01(this.A4c, this, 25);
                    }
                }
            }
        }
    }

    public void A2a() {
        this.A2Q.getStartupTracker().A06(this.A2B, new C98794rj(this, 26), "Conversation", 2);
    }

    /* JADX WARNING: type inference failed for: r4v179, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05bd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05be, code lost:
        A1d(r0, "on_resume_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05c1, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04c3 A[Catch:{ IllegalStateException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04ec A[Catch:{ IllegalStateException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04f3 A[Catch:{ IllegalStateException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04fc A[Catch:{ IllegalStateException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0509 A[Catch:{ IllegalStateException -> 0x0288 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2b() {
        /*
            r28 = this;
            java.lang.String r3 = "on_resume_end"
            r0 = r28
            com.whatsapp.expressionstray.ExpressionsTrayView r2 = r0.A3D     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = "ExpressionsTrayView/onResume"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x05bb }
            r1 = 0
            r2.A0V = r1     // Catch:{ all -> 0x05bb }
        L_0x0010:
            boolean r2 = r0.A74     // Catch:{ all -> 0x05bb }
            r1 = 0
            if (r2 == 0) goto L_0x001a
            r0.A74 = r1     // Catch:{ all -> 0x05bb }
            r0.A0F()     // Catch:{ all -> 0x05bb }
        L_0x001a:
            java.lang.String r2 = "on_resume_start"
            A1d(r0, r2)     // Catch:{ all -> 0x05bb }
            r0.A76 = r1     // Catch:{ all -> 0x05bb }
            java.lang.String r2 = "conversation/resume"
            X.1Ez r6 = new X.1Ez     // Catch:{ all -> 0x05bb }
            r6.<init>((java.lang.String) r2)     // Catch:{ all -> 0x05bb }
            X.00H r2 = r0.A52     // Catch:{ all -> 0x05bb }
            X.1fA r4 = X.AnonymousClass3MW.A0Y(r2)     // Catch:{ all -> 0x05bb }
            X.1BI r2 = r0.A3R     // Catch:{ all -> 0x05bb }
            boolean r2 = r4.A0M(r2)     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x0059
            X.00H r2 = r0.A52     // Catch:{ all -> 0x05bb }
            X.1fA r2 = X.AnonymousClass3MW.A0Y(r2)     // Catch:{ all -> 0x05bb }
            boolean r2 = r2.A02     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x00b1
            X.1FY r2 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
            r2.finish()     // Catch:{ all -> 0x05bb }
            X.00H r2 = r0.A52     // Catch:{ all -> 0x05bb }
            X.1fA r2 = X.AnonymousClass3MW.A0Y(r2)     // Catch:{ all -> 0x05bb }
            boolean r2 = r2.A01     // Catch:{ all -> 0x05bb }
            if (r2 != 0) goto L_0x0059
            X.00H r2 = r0.A52     // Catch:{ all -> 0x05bb }
            X.1fA r2 = X.AnonymousClass3MW.A0Y(r2)     // Catch:{ all -> 0x05bb }
            r2.A02 = r1     // Catch:{ all -> 0x05bb }
        L_0x0059:
            X.1CJ r5 = r0.A2w     // Catch:{ all -> 0x05bb }
            X.5cQ r2 = r0.A2Q     // Catch:{ all -> 0x05bb }
            X.1M9 r4 = r2.getContactManager()     // Catch:{ all -> 0x05bb }
            X.1BI r2 = r0.A3R     // Catch:{ all -> 0x05bb }
            int r2 = X.C43391zj.A00(r4, r5, r2)     // Catch:{ all -> 0x05bb }
            if (r2 <= 0) goto L_0x011e
            X.1kU r2 = r0.A3h     // Catch:{ all -> 0x05bb }
            java.lang.String r5 = "ephemeral"
            r4 = 0
            X.1aA r2 = r2.A00     // Catch:{ all -> 0x05bb }
            boolean r2 = r2.A01(r4, r5)     // Catch:{ all -> 0x05bb }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0084
            X.4QD r7 = r0.A3A     // Catch:{ all -> 0x05bb }
            X.1GP r5 = X.AnonymousClass3MW.A0K(r0)     // Catch:{ all -> 0x05bb }
            X.1BI r4 = r0.A3R     // Catch:{ all -> 0x05bb }
            r2 = 5
            r7.A00(r5, r4, r2)     // Catch:{ all -> 0x05bb }
        L_0x0084:
            com.whatsapp.mentions.MentionableEntry r2 = r0.A3Z     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x011e
            boolean r2 = A20(r0)     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x011e
            com.whatsapp.mentions.MentionableEntry r4 = r0.A3Z     // Catch:{ all -> 0x05bb }
            X.0zA r2 = r4.A07     // Catch:{ all -> 0x05bb }
            java.lang.Object r2 = r2.A04()     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x011e
            android.text.Editable r10 = r4.getText()     // Catch:{ all -> 0x05bb }
            if (r10 == 0) goto L_0x011e
            android.text.Editable r5 = r4.getText()     // Catch:{ all -> 0x05bb }
            int r4 = r10.length()     // Catch:{ all -> 0x05bb }
            java.lang.Class<X.3Nm> r2 = X.C72783Nm.class
            r9 = 0
            java.lang.Object[] r8 = r5.getSpans(r1, r4, r2)     // Catch:{ all -> 0x05bb }
            X.3Nm[] r8 = (X.C72783Nm[]) r8     // Catch:{ all -> 0x05bb }
            int r7 = r8.length     // Catch:{ all -> 0x05bb }
            goto L_0x0102
        L_0x00b1:
            r2 = 1
            r0.A6a = r2     // Catch:{ all -> 0x05bb }
            android.content.Intent r5 = r0.A0B     // Catch:{ all -> 0x05bb }
            java.lang.String r4 = "chatlockEntryPoint"
            r2 = 8
            int r8 = r5.getIntExtra(r4, r2)     // Catch:{ all -> 0x05bb }
            X.02n r2 = r0.A0c     // Catch:{ all -> 0x05bb }
            if (r2 != 0) goto L_0x00f3
            X.00H r2 = r0.A52     // Catch:{ all -> 0x05bb }
            X.1fA r9 = X.AnonymousClass3MW.A0Y(r2)     // Catch:{ all -> 0x05bb }
            X.1FY r2 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
            X.1GP r4 = r2.getSupportFragmentManager()     // Catch:{ all -> 0x05bb }
            java.lang.String r2 = "com.whatsapp.HomeActivity.ConversationFragment"
            androidx.fragment.app.Fragment r7 = r4.A0Q(r2)     // Catch:{ all -> 0x05bb }
            if (r7 != 0) goto L_0x00dc
            X.1FY r7 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
        L_0x00dc:
            X.1FY r5 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
            X.AnonymousClass3Ma.A1N(r7, r1, r5)     // Catch:{ all -> 0x05bb }
            X.02i r4 = new X.02i     // Catch:{ all -> 0x05bb }
            r4.<init>()     // Catch:{ all -> 0x05bb }
            X.4f4 r2 = new X.4f4     // Catch:{ all -> 0x05bb }
            r2.<init>(r5, r9, r8)     // Catch:{ all -> 0x05bb }
            X.02n r2 = r7.CDw(r2, r4)     // Catch:{ all -> 0x05bb }
            r0.A0c = r2     // Catch:{ all -> 0x05bb }
        L_0x00f3:
            X.00H r2 = r0.A52     // Catch:{ all -> 0x05bb }
            X.1fA r5 = X.AnonymousClass3MW.A0Y(r2)     // Catch:{ all -> 0x05bb }
            X.1BI r4 = r0.A3R     // Catch:{ all -> 0x05bb }
            X.02n r2 = r0.A0c     // Catch:{ all -> 0x05bb }
            r5.A09(r2, r4, r8)     // Catch:{ all -> 0x05bb }
            goto L_0x0059
        L_0x0102:
            if (r9 >= r7) goto L_0x011e
            r5 = r8[r9]     // Catch:{ all -> 0x05bb }
            java.lang.String r4 = r5.A01     // Catch:{ all -> 0x05bb }
            r2 = 1
            java.lang.String r2 = r4.substring(r2)     // Catch:{ all -> 0x05bb }
            boolean r2 = X.C42701yb.A02(r2)     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x011b
            X.3Nl r2 = r5.A00     // Catch:{ all -> 0x05bb }
            r10.removeSpan(r2)     // Catch:{ all -> 0x05bb }
            r10.removeSpan(r5)     // Catch:{ all -> 0x05bb }
        L_0x011b:
            int r9 = r9 + 1
            goto L_0x0102
        L_0x011e:
            X.1HS r2 = r0.A1m     // Catch:{ all -> 0x05bb }
            boolean r2 = r2.A01()     // Catch:{ all -> 0x05bb }
            if (r2 != 0) goto L_0x012e
            X.1HS r2 = r0.A1m     // Catch:{ all -> 0x05bb }
            boolean r2 = r2.A02()     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x014a
        L_0x012e:
            X.00H r2 = r0.A4y     // Catch:{ all -> 0x05bb }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x05bb }
            X.2pG r2 = (X.C61182pG) r2     // Catch:{ all -> 0x05bb }
            boolean r2 = X.C61182pG.A00(r2)     // Catch:{ all -> 0x05bb }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x014a
            X.1V7 r5 = r0.A1l     // Catch:{ all -> 0x05bb }
            java.lang.String r4 = "show_voip_activity"
            X.A69 r2 = new X.A69     // Catch:{ all -> 0x05bb }
            r2.<init>(r4)     // Catch:{ all -> 0x05bb }
            r5.A00(r2)     // Catch:{ all -> 0x05bb }
        L_0x014a:
            X.5cQ r2 = r0.A2Q     // Catch:{ all -> 0x05bb }
            r2.C7y()     // Catch:{ all -> 0x05bb }
            X.1E7 r2 = r0.A35     // Catch:{ all -> 0x05bb }
            if (r2 != 0) goto L_0x0162
            X.5cQ r1 = r0.A2Q     // Catch:{ all -> 0x05bb }
            r1.finish()     // Catch:{ all -> 0x05bb }
            r6.A02()     // Catch:{ all -> 0x05bb }
            java.lang.String r1 = "conversation/resume/no contact"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x05bb }
            goto L_0x05b7
        L_0x0162:
            X.0ve r5 = r0.A3F     // Catch:{ all -> 0x05bb }
            r4 = 5386(0x150a, float:7.547E-42)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ all -> 0x05bb }
            int r7 = X.C18020vd.A00(r2, r5, r4)     // Catch:{ all -> 0x05bb }
            if (r7 < 0) goto L_0x017f
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05bb }
            long r4 = r0.A7A     // Catch:{ all -> 0x05bb }
            long r8 = r8 - r4
            long r4 = (long) r7     // Catch:{ all -> 0x05bb }
            int r7 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x017f
            X.3V4 r4 = r0.A2Y     // Catch:{ all -> 0x05bb }
            r4.A0U(r1)     // Catch:{ all -> 0x05bb }
        L_0x017f:
            r0.A0H()     // Catch:{ all -> 0x05bb }
            X.0ve r5 = r0.A3F     // Catch:{ all -> 0x05bb }
            r4 = 10320(0x2850, float:1.4461E-41)
            boolean r4 = X.C18020vd.A05(r2, r5, r4)     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0279
            X.1dd r7 = r0.A3f     // Catch:{ all -> 0x05bb }
            X.1BI r5 = r0.A3R     // Catch:{ all -> 0x05bb }
            X.C18070vi.A0d(r5, r1)     // Catch:{ all -> 0x05bb }
            boolean r4 = r5 instanceof X.AnonymousClass1EC     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x019c
            java.util.concurrent.ConcurrentHashMap r4 = r7.A01     // Catch:{ all -> 0x05bb }
            r4.remove(r5)     // Catch:{ all -> 0x05bb }
        L_0x019c:
            X.1Nf r5 = r0.A2x     // Catch:{ all -> 0x05bb }
            X.1E7 r4 = r0.A35     // Catch:{ all -> 0x05bb }
            java.lang.Class<X.1BI> r7 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r4 = r4.A06(r7)     // Catch:{ all -> 0x05bb }
            X.1BI r4 = (X.AnonymousClass1BI) r4     // Catch:{ all -> 0x05bb }
            X.1E7 r4 = r5.A01(r4)     // Catch:{ all -> 0x05bb }
            r0.A35 = r4     // Catch:{ all -> 0x05bb }
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            boolean r4 = r4.hasWindowFocus()     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x01c8
            X.1hl r8 = r0.A2E     // Catch:{ all -> 0x05bb }
            X.1E7 r4 = r0.A35     // Catch:{ all -> 0x05bb }
            com.whatsapp.jid.Jid r9 = r4.A06(r7)     // Catch:{ all -> 0x05bb }
            X.1BI r9 = (X.AnonymousClass1BI) r9     // Catch:{ all -> 0x05bb }
            r11 = 3
            r10 = 1
            r13 = r10
            r12 = r10
            r14 = r1
            r8.A00(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x05bb }
        L_0x01c8:
            X.10I r8 = r0.A4c     // Catch:{ all -> 0x05bb }
            r5 = 8
            X.4rj r4 = new X.4rj     // Catch:{ all -> 0x05bb }
            r4.<init>((X.AnonymousClass4aY) r0, (int) r5)     // Catch:{ all -> 0x05bb }
            r8.CGF(r4)     // Catch:{ all -> 0x05bb }
            X.1E7 r4 = r0.A35     // Catch:{ all -> 0x05bb }
            boolean r4 = r4.A0F()     // Catch:{ all -> 0x05bb }
            if (r4 != 0) goto L_0x01f4
            X.1E7 r8 = r0.A35     // Catch:{ all -> 0x05bb }
            X.1BI r4 = r8.A0J     // Catch:{ all -> 0x05bb }
            boolean r4 = X.C22971Dz.A0V(r4)     // Catch:{ all -> 0x05bb }
            if (r4 != 0) goto L_0x01f4
            X.1Rj r5 = r0.A3y     // Catch:{ all -> 0x05bb }
            com.whatsapp.jid.Jid r4 = r8.A06(r7)     // Catch:{ all -> 0x05bb }
            X.1BI r4 = (X.AnonymousClass1BI) r4     // Catch:{ all -> 0x05bb }
            X.C17960vV.A07(r4)     // Catch:{ all -> 0x05bb }
            r5.A0B(r4)     // Catch:{ all -> 0x05bb }
        L_0x01f4:
            X.1BI r4 = r0.A3R     // Catch:{ all -> 0x05bb }
            boolean r4 = X.C22971Dz.A0V(r4)     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0224
            X.4X5 r4 = X.AnonymousClass3Ma.A0Y(r0)     // Catch:{ all -> 0x05bb }
            X.00H r4 = r4.A0D     // Catch:{ all -> 0x05bb }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x05bb }
            X.1md r5 = (X.C35681md) r5     // Catch:{ all -> 0x05bb }
            X.1BI r4 = r0.A3R     // Catch:{ all -> 0x05bb }
            X.1ch r4 = (X.C29681ch) r4     // Catch:{ all -> 0x05bb }
            r5.A06(r4)     // Catch:{ all -> 0x05bb }
            boolean r4 = r0.A7T     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0224
            X.4X5 r4 = X.AnonymousClass3Ma.A0Y(r0)     // Catch:{ all -> 0x05bb }
            X.00H r4 = r4.A07     // Catch:{ all -> 0x05bb }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x05bb }
            X.170 r5 = (X.AnonymousClass170) r5     // Catch:{ all -> 0x05bb }
            r4 = 1
            r5.A03 = r4     // Catch:{ all -> 0x05bb }
            r5.A02 = r4     // Catch:{ all -> 0x05bb }
        L_0x0224:
            X.4ZY r5 = r0.A2R     // Catch:{ all -> 0x05bb }
            X.3PO r4 = r5.A01     // Catch:{ all -> 0x05bb }
            if (r4 != 0) goto L_0x0234
            X.5bf r4 = r5.A06     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0237
            boolean r4 = r4.isVisible()     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0237
        L_0x0234:
            A1E(r0)     // Catch:{ all -> 0x05bb }
        L_0x0237:
            boolean r4 = X.AnonymousClass4IT.A00     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x025b
            boolean r4 = r0.A7U     // Catch:{ all -> 0x05bb }
            if (r4 != 0) goto L_0x025b
            boolean r4 = r0.A75     // Catch:{ all -> 0x05bb }
            if (r4 != 0) goto L_0x025b
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            android.content.Intent r5 = r4.getIntent()     // Catch:{ all -> 0x05bb }
            java.lang.String r4 = "fromNotification"
            boolean r4 = r5.getBooleanExtra(r4, r1)     // Catch:{ all -> 0x05bb }
            r0.A1s(r4)     // Catch:{ all -> 0x05bb }
            X.10I r5 = X.AnonymousClass3MX.A0w(r0)     // Catch:{ all -> 0x05bb }
            r4 = 33
            X.C98834rn.A01(r5, r0, r4)     // Catch:{ all -> 0x05bb }
        L_0x025b:
            X.AnonymousClass4IT.A00 = r1     // Catch:{ all -> 0x05bb }
            java.util.ArrayList r5 = X.AnonymousClass4IT.A01     // Catch:{ all -> 0x05bb }
            X.1E7 r4 = r0.A35     // Catch:{ all -> 0x05bb }
            com.whatsapp.jid.Jid r4 = r4.A06(r7)     // Catch:{ all -> 0x05bb }
            boolean r4 = r5.remove(r4)     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0282
            java.lang.String r4 = "conversation/dialog_ask_gps"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x05bb }
            X.1FY r5 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
            r4 = 2
            X.AnonymousClass4Yv.A01(r5, r4)     // Catch:{ all -> 0x05bb }
            goto L_0x0282
        L_0x0279:
            X.1dd r4 = r0.A3f     // Catch:{ all -> 0x05bb }
            java.util.concurrent.ConcurrentHashMap r4 = r4.A01     // Catch:{ all -> 0x05bb }
            r4.clear()     // Catch:{ all -> 0x05bb }
            goto L_0x019c
        L_0x0282:
            X.1Vg r4 = r0.A4F     // Catch:{ IllegalStateException -> 0x0288 }
            r4.A01()     // Catch:{ IllegalStateException -> 0x0288 }
            goto L_0x028e
        L_0x0288:
            r5 = move-exception
            java.lang.String r4 = "conversation/ap/stateerror"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ all -> 0x05bb }
        L_0x028e:
            boolean r4 = r0.A7U     // Catch:{ all -> 0x05bb }
            if (r4 != 0) goto L_0x029b
            boolean r4 = X.AnonymousClass73J.A00     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x029b
            com.whatsapp.conversation.ConversationListView r4 = r0.A2B     // Catch:{ all -> 0x05bb }
            r4.A03()     // Catch:{ all -> 0x05bb }
        L_0x029b:
            boolean r4 = r0.A7U     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x02c2
            r0.A7U = r1     // Catch:{ all -> 0x05bb }
        L_0x02a1:
            X.1DM r4 = r0.A1S     // Catch:{ all -> 0x05bb }
            int r4 = r4.A00()     // Catch:{ all -> 0x05bb }
            if (r4 <= 0) goto L_0x02b7
            java.lang.String r4 = "conversation/dialog_software_expire_warning"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x05bb }
            X.1FY r5 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
            r4 = 115(0x73, float:1.61E-43)
            X.AnonymousClass4Yv.A01(r5, r4)     // Catch:{ all -> 0x05bb }
        L_0x02b7:
            X.00H r4 = r0.A5Z     // Catch:{ all -> 0x05bb }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x05bb }
            X.1Do r4 = (X.C22881Do) r4     // Catch:{ all -> 0x05bb }
            boolean r4 = r4.A01     // Catch:{ all -> 0x05bb }
            goto L_0x02d3
        L_0x02c2:
            boolean r4 = r0.A75     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x02a1
            X.3NR r7 = new X.3NR     // Catch:{ all -> 0x05bb }
            r7.<init>(r0)     // Catch:{ all -> 0x05bb }
            r0.A7B = r7     // Catch:{ all -> 0x05bb }
            r4 = 3000(0xbb8, double:1.482E-320)
            r7.sendEmptyMessageDelayed(r1, r4)     // Catch:{ all -> 0x05bb }
            goto L_0x02a1
        L_0x02d3:
            if (r4 == 0) goto L_0x02fb
            java.lang.String r4 = "conversation/dialog_login_failed"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x05bb }
            X.1Vn r7 = r0.A2i     // Catch:{ all -> 0x05bb }
            java.lang.String r5 = "ConvPreReg"
            r4 = 20
            r7.BEJ(r4, r5)     // Catch:{ all -> 0x05bb }
            X.1FY r8 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
            X.0ve r7 = r0.A3F     // Catch:{ all -> 0x05bb }
            X.00H r4 = r0.A5Z     // Catch:{ all -> 0x05bb }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x05bb }
            X.1Do r5 = (X.C22881Do) r5     // Catch:{ all -> 0x05bb }
            X.00H r4 = r0.A4l     // Catch:{ all -> 0x05bb }
            X.1cN r4 = X.C17880vN.A0I(r4)     // Catch:{ all -> 0x05bb }
            X.C88364Zk.A01(r8, r4, r7, r5)     // Catch:{ all -> 0x05bb }
            goto L_0x0340
        L_0x02fb:
            X.00H r4 = r0.A4k     // Catch:{ all -> 0x05bb }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x05bb }
            X.1ec r4 = (X.C30851ec) r4     // Catch:{ all -> 0x05bb }
            X.2lz r4 = r4.A00()     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x035a
            X.0ve r5 = r0.A3F     // Catch:{ all -> 0x05bb }
            r4 = 2466(0x9a2, float:3.456E-42)
            boolean r4 = X.C18020vd.A05(r2, r5, r4)     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x035a
            java.lang.String r4 = "home/show-account-logout-request"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x05bb }
            X.00H r4 = r0.A4k     // Catch:{ all -> 0x05bb }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x05bb }
            X.1ec r4 = (X.C30851ec) r4     // Catch:{ all -> 0x05bb }
            X.2lz r8 = r4.A00()     // Catch:{ all -> 0x05bb }
            X.00H r4 = r0.A4k     // Catch:{ all -> 0x05bb }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x05bb }
            X.1ec r5 = (X.C30851ec) r5     // Catch:{ all -> 0x05bb }
            r4 = 0
            r5.A01(r4)     // Catch:{ all -> 0x05bb }
            X.1Vn r7 = r0.A2i     // Catch:{ all -> 0x05bb }
            java.lang.String r5 = "HomeActivityShowingDialog"
            r4 = 52
            r7.BEJ(r4, r5)     // Catch:{ all -> 0x05bb }
            X.1FY r4 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
            X.C88364Zk.A00(r4, r8)     // Catch:{ all -> 0x05bb }
        L_0x0340:
            X.0zA r5 = r0.A0n     // Catch:{ all -> 0x05bb }
            boolean r4 = r5.A07()     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x037d
            X.0zA r4 = r0.A0o     // Catch:{ all -> 0x05bb }
            boolean r4 = r4.A07()     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x037d
            r5.A03()     // Catch:{ all -> 0x05bb }
            java.lang.String r1 = "getHasReceivedCertRelatedNack"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r1)     // Catch:{ all -> 0x05bb }
            throw r1     // Catch:{ all -> 0x05bb }
        L_0x035a:
            X.11P r5 = r0.A2h     // Catch:{ all -> 0x05bb }
            X.0z4 r4 = r0.A2j     // Catch:{ all -> 0x05bb }
            boolean r4 = X.C30861ed.A00(r5, r4)     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0340
            X.5cQ r7 = r0.A2Q     // Catch:{ all -> 0x05bb }
            X.0z4 r4 = r0.A2j     // Catch:{ all -> 0x05bb }
            android.content.SharedPreferences r5 = X.C17890vO.A0B(r4)     // Catch:{ all -> 0x05bb }
            java.lang.String r4 = "device_switching_code"
            java.lang.String r4 = X.C17880vN.A0r(r5, r4)     // Catch:{ all -> 0x05bb }
            r4.getClass()     // Catch:{ all -> 0x05bb }
            com.whatsapp.registration.VerificationCodeBottomSheet r4 = X.C83904Hc.A00(r4)     // Catch:{ all -> 0x05bb }
            r7.CMl(r4)     // Catch:{ all -> 0x05bb }
            goto L_0x0340
        L_0x037d:
            X.0ve r5 = r0.A3F     // Catch:{ all -> 0x05bb }
            r4 = 3181(0xc6d, float:4.458E-42)
            boolean r4 = X.C18020vd.A05(r2, r5, r4)     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x03c5
            boolean r4 = r0.A6n     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x03c5
            X.1CJ r5 = r0.A2w     // Catch:{ all -> 0x05bb }
            X.1E7 r4 = r0.A35     // Catch:{ all -> 0x05bb }
            X.1BI r4 = r4.A0J     // Catch:{ all -> 0x05bb }
            X.1ci r9 = r5.A0A(r4)     // Catch:{ all -> 0x05bb }
            if (r9 == 0) goto L_0x03c5
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            X.0z4 r5 = r4.getWaSharedPreferences()     // Catch:{ all -> 0x05bb }
            X.1BI r4 = r9.A08()     // Catch:{ all -> 0x05bb }
            long r10 = r5.A0S(r4)     // Catch:{ all -> 0x05bb }
            r7 = 0
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x03c5
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05bb }
            long r7 = X.C17880vN.A04(r4)     // Catch:{ all -> 0x05bb }
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x03c5
            X.1KB r7 = X.AnonymousClass3MX.A0U(r0)     // Catch:{ all -> 0x05bb }
            r5 = 35
            X.4ra r4 = new X.4ra     // Catch:{ all -> 0x05bb }
            r4.<init>(r0, r9, r5)     // Catch:{ all -> 0x05bb }
            r7.A0J(r4)     // Catch:{ all -> 0x05bb }
        L_0x03c5:
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            X.1f4 r4 = r4.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x05bb }
            boolean r4 = r4.A0B()     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x03da
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            X.1f4 r4 = r4.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x05bb }
            r4.A05()     // Catch:{ all -> 0x05bb }
        L_0x03da:
            X.4Ol r4 = X.C87724Ws.A00(r0)     // Catch:{ all -> 0x05bb }
            boolean r4 = r4.A04     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x03e9
            X.206 r4 = r0.A3z     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x03e9
            A1Y(r0, r4)     // Catch:{ all -> 0x05bb }
        L_0x03e9:
            r0.A2e()     // Catch:{ all -> 0x05bb }
            java.util.Set r4 = r0.A7p     // Catch:{ all -> 0x05bb }
            java.util.Iterator r7 = r4.iterator()     // Catch:{ all -> 0x05bb }
        L_0x03f2:
            boolean r4 = r7.hasNext()     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0406
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x05bb }
            X.5cG r5 = (X.C108765cG) r5     // Catch:{ all -> 0x05bb }
            X.1FY r4 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
            r5.onActivityResumed(r4)     // Catch:{ all -> 0x05bb }
            goto L_0x03f2
        L_0x0406:
            X.1oL r5 = r0.A3u     // Catch:{ all -> 0x05bb }
            X.1FY r4 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
            r5.A02(r4)     // Catch:{ all -> 0x05bb }
            X.1f7 r4 = A07(r0)     // Catch:{ all -> 0x05bb }
            X.22l r7 = r4.A00     // Catch:{ all -> 0x05bb }
            if (r7 == 0) goto L_0x0435
            r0.A3z = r7     // Catch:{ all -> 0x05bb }
            X.4Ol r5 = X.C87724Ws.A00(r0)     // Catch:{ all -> 0x05bb }
            r4 = 1
            r5.A04 = r4     // Catch:{ all -> 0x05bb }
            X.3Oz r4 = X.AnonymousClass3MX.A0c(r0)     // Catch:{ all -> 0x05bb }
            X.205 r5 = r7.A0v     // Catch:{ all -> 0x05bb }
            X.C18070vi.A0d(r5, r1)     // Catch:{ all -> 0x05bb }
            java.util.Set r4 = r4.A0V     // Catch:{ all -> 0x05bb }
            r4.add(r5)     // Catch:{ all -> 0x05bb }
            X.1f7 r5 = A07(r0)     // Catch:{ all -> 0x05bb }
            r4 = 0
            r5.A00 = r4     // Catch:{ all -> 0x05bb }
        L_0x0435:
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            X.1f4 r4 = r4.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x05bb }
            X.7Mo r8 = r4.A00()     // Catch:{ all -> 0x05bb }
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            X.1f4 r4 = r4.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x05bb }
            X.22l r7 = r4.A01()     // Catch:{ all -> 0x05bb }
            X.1f7 r4 = A07(r0)     // Catch:{ all -> 0x05bb }
            boolean r4 = r4.A02     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0463
            if (r8 == 0) goto L_0x0463
            if (r7 == 0) goto L_0x0463
            X.4Ol r5 = X.C87724Ws.A00(r0)     // Catch:{ all -> 0x05bb }
            r4 = 1
            r5.A03 = r4     // Catch:{ all -> 0x05bb }
            X.4lO r4 = new X.4lO     // Catch:{ all -> 0x05bb }
            r4.<init>(r8, r0, r7)     // Catch:{ all -> 0x05bb }
            r8.A0G = r4     // Catch:{ all -> 0x05bb }
        L_0x0463:
            X.1f7 r4 = A07(r0)     // Catch:{ all -> 0x05bb }
            boolean r4 = r4.A04     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x049d
            X.1f7 r4 = A07(r0)     // Catch:{ all -> 0x05bb }
            X.1BI r5 = r0.A3R     // Catch:{ all -> 0x05bb }
            if (r5 == 0) goto L_0x0487
            X.1f4 r4 = r4.A07     // Catch:{ all -> 0x05bb }
            X.22l r4 = r4.A01()     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0487
            X.205 r4 = r4.A0v     // Catch:{ all -> 0x05bb }
            X.1BI r4 = r4.A00     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x0487
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x05bb }
            if (r4 != 0) goto L_0x049d
        L_0x0487:
            X.1f7 r5 = A07(r0)     // Catch:{ all -> 0x05bb }
            X.1BI r4 = r0.A3R     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x054f
            X.1f4 r4 = r5.A07     // Catch:{ all -> 0x05bb }
            X.22l r4 = r4.A01()     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x054f
            X.205 r4 = r4.A0v     // Catch:{ all -> 0x05bb }
            X.1BI r4 = r4.A00     // Catch:{ all -> 0x05bb }
            if (r4 != 0) goto L_0x054f
        L_0x049d:
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            android.view.View r4 = r4.getContentView()     // Catch:{ all -> 0x05bb }
            boolean r4 = X.C31181f9.A00(r4)     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x053c
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            X.1f4 r7 = r4.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x05bb }
            X.00H r5 = r0.A5m     // Catch:{ all -> 0x05bb }
            android.view.View r4 = r4.getContentView()     // Catch:{ all -> 0x05bb }
            X.AnonymousClass4aV.A03(r4, r7, r5)     // Catch:{ all -> 0x05bb }
        L_0x04b8:
            X.1f7 r4 = A07(r0)     // Catch:{ all -> 0x05bb }
            r4.A00()     // Catch:{ all -> 0x05bb }
            X.74G r4 = r0.A42     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x04c6
            X.AnonymousClass74G.A04(r4)     // Catch:{ all -> 0x05bb }
        L_0x04c6:
            X.1E7 r4 = r0.A35     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x04e6
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass3MZ.A0x(r4)     // Catch:{ all -> 0x05bb }
            if (r5 == 0) goto L_0x04e6
            boolean r4 = r0.A6z     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x04e6
            X.4Zz r4 = A06(r0)     // Catch:{ all -> 0x05bb }
            boolean r4 = r4.A04(r5)     // Catch:{ all -> 0x05bb }
            if (r4 != 0) goto L_0x04e6
            r0.A6z = r1     // Catch:{ all -> 0x05bb }
            com.whatsapp.mentions.MentionableEntry r5 = r0.A3Z     // Catch:{ all -> 0x05bb }
            r4 = 1
            r5.setFocusableInTouchMode(r4)     // Catch:{ all -> 0x05bb }
        L_0x04e6:
            com.whatsapp.conversation.ConversationListView r5 = r0.A2B     // Catch:{ all -> 0x05bb }
            boolean r4 = r5.A0P     // Catch:{ all -> 0x05bb }
            if (r4 != 0) goto L_0x04ef
            r5.setTranscriptMode(r1)     // Catch:{ all -> 0x05bb }
        L_0x04ef:
            X.3T0 r1 = r0.A1X     // Catch:{ all -> 0x05bb }
            if (r1 == 0) goto L_0x04f8
            X.9p3 r1 = r1.A00     // Catch:{ all -> 0x05bb }
            r1.A00()     // Catch:{ all -> 0x05bb }
        L_0x04f8:
            X.8F7 r1 = r0.A1c     // Catch:{ all -> 0x05bb }
            if (r1 == 0) goto L_0x04ff
            r1.A0V()     // Catch:{ all -> 0x05bb }
        L_0x04ff:
            X.0ve r4 = r0.A3F     // Catch:{ all -> 0x05bb }
            r1 = 7149(0x1bed, float:1.0018E-41)
            boolean r1 = X.C18020vd.A05(r2, r4, r1)     // Catch:{ all -> 0x05bb }
            if (r1 == 0) goto L_0x0527
            java.lang.String r1 = "ConversationDelegate/addStickerTrayListeners"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x05bb }
            X.7MX r2 = r0.A3v     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x0516
            X.88B r1 = r0.A7l     // Catch:{ all -> 0x05bb }
            r2.A04 = r1     // Catch:{ all -> 0x05bb }
        L_0x0516:
            X.5z4 r2 = r0.A3K     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x051f
            X.88B r1 = r0.A7l     // Catch:{ all -> 0x05bb }
            r2.A0N(r1)     // Catch:{ all -> 0x05bb }
        L_0x051f:
            com.whatsapp.expressionstray.ExpressionsTrayView r2 = r0.A3D     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x0527
            X.88B r1 = r0.A7l     // Catch:{ all -> 0x05bb }
            r2.A0M = r1     // Catch:{ all -> 0x05bb }
        L_0x0527:
            X.4Rn r1 = r0.A2G     // Catch:{ all -> 0x05bb }
            X.4rI r2 = r1.A00()     // Catch:{ all -> 0x05bb }
            if (r2 == 0) goto L_0x0538
            boolean r1 = r2 instanceof X.C77953rs     // Catch:{ all -> 0x05bb }
            if (r1 == 0) goto L_0x0538
            X.3rs r2 = (X.C77953rs) r2     // Catch:{ all -> 0x05bb }
            X.C77953rs.A00(r2)     // Catch:{ all -> 0x05bb }
        L_0x0538:
            r6.A02()     // Catch:{ all -> 0x05bb }
            goto L_0x05b7
        L_0x053c:
            X.1f7 r7 = A07(r0)     // Catch:{ all -> 0x05bb }
            boolean r4 = r7.A01     // Catch:{ all -> 0x05bb }
            if (r4 == 0) goto L_0x04b8
            X.195 r5 = r7.A06     // Catch:{ all -> 0x05bb }
            X.1f8 r4 = r7.A08     // Catch:{ all -> 0x05bb }
            r5.unregisterObserver(r4)     // Catch:{ all -> 0x05bb }
            r7.A01 = r1     // Catch:{ all -> 0x05bb }
            goto L_0x04b8
        L_0x054f:
            X.5cQ r5 = r0.A2Q     // Catch:{ all -> 0x05bb }
            r4 = 2131433352(0x7f0b1788, float:1.8488487E38)
            A1p(r5, r4)     // Catch:{ all -> 0x05bb }
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            android.view.View r11 = r4.getContentView()     // Catch:{ all -> 0x05bb }
            X.0ve r22 = X.AnonymousClass3MX.A0h(r0)     // Catch:{ all -> 0x05bb }
            X.1FY r10 = X.AnonymousClass3MW.A0P(r0)     // Catch:{ all -> 0x05bb }
            X.1KB r13 = X.AnonymousClass3MX.A0U(r0)     // Catch:{ all -> 0x05bb }
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            X.11S r14 = r4.getMeManager()     // Catch:{ all -> 0x05bb }
            X.10I r24 = X.AnonymousClass3MX.A0w(r0)     // Catch:{ all -> 0x05bb }
            X.5cQ r4 = r0.A2Q     // Catch:{ all -> 0x05bb }
            X.1Vd r18 = r4.getContactPhotos()     // Catch:{ all -> 0x05bb }
            X.1M9 r15 = r4.getContactManager()     // Catch:{ all -> 0x05bb }
            X.1Me r16 = r4.getWAContactNames()     // Catch:{ all -> 0x05bb }
            X.0vb r9 = r0.A2k     // Catch:{ all -> 0x05bb }
            X.6qC r19 = r4.getMessageAudioPlayerFactory()     // Catch:{ all -> 0x05bb }
            X.1f4 r20 = r4.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x05bb }
            X.00H r8 = r0.A5m     // Catch:{ all -> 0x05bb }
            X.00H r7 = r0.A60     // Catch:{ all -> 0x05bb }
            android.view.View r12 = r0.A0H     // Catch:{ all -> 0x05bb }
            X.1pZ r5 = r0.A1y     // Catch:{ all -> 0x05bb }
            X.1FY r4 = r4.CFa()     // Catch:{ all -> 0x05bb }
            X.1L1 r4 = r4.A0F     // Catch:{ all -> 0x05bb }
            java.lang.String r27 = "conversation-activity"
            r21 = r9
            r23 = r4
            r25 = r8
            r26 = r7
            r17 = r5
            android.util.Pair r5 = X.AnonymousClass4aV.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x05bb }
            java.lang.Object r4 = r5.first     // Catch:{ all -> 0x05bb }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x05bb }
            r0.A0H = r4     // Catch:{ all -> 0x05bb }
            java.lang.Object r4 = r5.second     // Catch:{ all -> 0x05bb }
            X.1pZ r4 = (X.C37451pZ) r4     // Catch:{ all -> 0x05bb }
            r0.A1y = r4     // Catch:{ all -> 0x05bb }
            goto L_0x04b8
        L_0x05b7:
            A1d(r0, r3)
            return
        L_0x05bb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05bd }
        L_0x05bd:
            r1 = move-exception
            A1d(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2b():void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x039b  */
    public void A2c() {
        /*
            r51 = this;
            java.lang.String r26 = "on_start_end"
            r3 = r51
            java.lang.String r0 = "on_start_start"
            A1d(r3, r0)     // Catch:{ all -> 0x053d }
            java.lang.String r1 = "conversation/start"
            X.1Ez r0 = new X.1Ez     // Catch:{ all -> 0x053d }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x053d }
            r3.A4K = r0     // Catch:{ all -> 0x053d }
            X.1ap r0 = r3.A2v     // Catch:{ all -> 0x053d }
            if (r0 != 0) goto L_0x0030
            X.0ve r2 = r3.A3F     // Catch:{ all -> 0x053d }
            r1 = 11410(0x2c92, float:1.5989E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x053d }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x053d }
            if (r0 != 0) goto L_0x009c
            X.1BI r0 = r3.A3R     // Catch:{ all -> 0x053d }
            boolean r0 = X.C22971Dz.A0V(r0)     // Catch:{ all -> 0x053d }
            if (r0 != 0) goto L_0x009c
            boolean r0 = A1y(r3)     // Catch:{ all -> 0x053d }
            if (r0 != 0) goto L_0x009c
        L_0x0030:
            X.00H r0 = r3.A4n     // Catch:{ all -> 0x053d }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x053d }
            X.1p3 r1 = (X.C37151p3) r1     // Catch:{ all -> 0x053d }
            X.4LR r0 = r3.A84     // Catch:{ all -> 0x053d }
            r1.registerObserver(r0)     // Catch:{ all -> 0x053d }
            X.0ve r2 = r3.A3F     // Catch:{ all -> 0x053d }
            X.0vf r1 = X.C18040vf.A01     // Catch:{ all -> 0x053d }
            r0 = 10202(0x27da, float:1.4296E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x053d }
            if (r0 == 0) goto L_0x0086
            X.00H r0 = r3.A51     // Catch:{ all -> 0x053d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x053d }
            X.2gI r0 = (X.C55742gI) r0     // Catch:{ all -> 0x053d }
            X.00H r0 = r0.A06     // Catch:{ all -> 0x053d }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x053d }
            X.2Kq r4 = (X.C47962Kq) r4     // Catch:{ all -> 0x053d }
            X.5cQ r2 = r3.A2Q     // Catch:{ all -> 0x053d }
            X.1F9 r1 = r2.getLifecycleOwner()     // Catch:{ all -> 0x053d }
            X.1Wq r0 = X.C27581Wq.ON_STOP     // Catch:{ all -> 0x053d }
            r4.observeUntil(r2, r1, r0)     // Catch:{ all -> 0x053d }
        L_0x0064:
            X.5cQ r0 = r3.A2Q     // Catch:{ all -> 0x053d }
            r0.C7z()     // Catch:{ all -> 0x053d }
            X.5cQ r0 = r3.A2Q     // Catch:{ all -> 0x053d }
            boolean r0 = r0.isFinishing()     // Catch:{ all -> 0x053d }
            if (r0 != 0) goto L_0x0537
            X.1BI r4 = r3.A3R     // Catch:{ all -> 0x053d }
            if (r4 != 0) goto L_0x00b1
            X.5cQ r0 = r3.A2Q     // Catch:{ all -> 0x053d }
            r0.finish()     // Catch:{ all -> 0x053d }
            X.1Ez r0 = r3.A4K     // Catch:{ all -> 0x053d }
            r0.A02()     // Catch:{ all -> 0x053d }
            java.lang.String r0 = "conversation/start/no jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x053d }
            goto L_0x0537
        L_0x0086:
            X.00H r0 = r3.A51     // Catch:{ all -> 0x053d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x053d }
            X.2gI r0 = (X.C55742gI) r0     // Catch:{ all -> 0x053d }
            X.00H r0 = r0.A06     // Catch:{ all -> 0x053d }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x053d }
            X.2Kq r1 = (X.C47962Kq) r1     // Catch:{ all -> 0x053d }
            X.5cQ r0 = r3.A2Q     // Catch:{ all -> 0x053d }
            r1.registerObserver(r0)     // Catch:{ all -> 0x053d }
            goto L_0x0064
        L_0x009c:
            r1 = 12
            X.4mC r0 = new X.4mC     // Catch:{ all -> 0x053d }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x053d }
            r3.A2v = r0     // Catch:{ all -> 0x053d }
            X.00H r0 = r3.A53     // Catch:{ all -> 0x053d }
            X.10T r1 = X.C17880vN.A0V(r0)     // Catch:{ all -> 0x053d }
            X.1ap r0 = r3.A2v     // Catch:{ all -> 0x053d }
            r1.registerObserver(r0)     // Catch:{ all -> 0x053d }
            goto L_0x0030
        L_0x00b1:
            X.4OK r2 = r3.A1Z     // Catch:{ all -> 0x053d }
            X.1gt r0 = r2.A00     // Catch:{ all -> 0x053d }
            java.util.HashMap r1 = r0.A00     // Catch:{ all -> 0x053d }
            monitor-enter(r1)     // Catch:{ all -> 0x053d }
            r1.remove(r4)     // Catch:{ all -> 0x0531 }
            monitor-exit(r1)     // Catch:{ all -> 0x053d }
            X.2bi r1 = r2.A01     // Catch:{ all -> 0x053d }
            X.1CJ r0 = r2.A02     // Catch:{ all -> 0x053d }
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r4)     // Catch:{ all -> 0x053d }
            if (r0 != 0) goto L_0x00c8
            r0 = 0
            goto L_0x00d0
        L_0x00c8:
            int r0 = r0.A0A     // Catch:{ all -> 0x053d }
            int r0 = r0 + -1
            X.1D6 r0 = X.AnonymousClass1D6.A00(r4, r0)     // Catch:{ all -> 0x053d }
        L_0x00d0:
            r1.A00 = r0     // Catch:{ all -> 0x053d }
            X.4VN r4 = r3.A28     // Catch:{ all -> 0x053d }
            X.5cQ r0 = r3.A2Q     // Catch:{ all -> 0x053d }
            X.0z4 r0 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x053d }
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r0)     // Catch:{ all -> 0x053d }
            java.lang.String r1 = "interface_font_size"
            java.lang.String r0 = "0"
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x053d }
            r11 = 0
            int r0 = X.C20099A7c.A01(r0, r11)     // Catch:{ all -> 0x053d }
            r4.A00 = r0     // Catch:{ all -> 0x053d }
            r3.A0H()     // Catch:{ all -> 0x053d }
            X.5cQ r0 = r3.A2Q     // Catch:{ all -> 0x053d }
            r0.BmU()     // Catch:{ all -> 0x053d }
            X.4ZY r0 = r3.A2R     // Catch:{ all -> 0x053d }
            android.view.View r1 = r0.A00     // Catch:{ all -> 0x053d }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ all -> 0x053d }
            X.5cQ r0 = r3.A2Q     // Catch:{ all -> 0x052d }
            android.content.Intent r1 = r0.getIntent()     // Catch:{ all -> 0x052d }
            java.lang.String r0 = "open_comment_thread"
            boolean r27 = r1.getBooleanExtra(r0, r11)     // Catch:{ all -> 0x052d }
            X.5cQ r0 = r3.A2Q     // Catch:{ all -> 0x052d }
            android.content.Intent r1 = r0.getIntent()     // Catch:{ all -> 0x052d }
            java.lang.String r25 = "row_id"
            r4 = 0
            r0 = r25
            long r16 = r1.getLongExtra(r0, r4)     // Catch:{ all -> 0x052d }
            X.3VQ r0 = r3.A2b     // Catch:{ all -> 0x052d }
            X.4RS r12 = r3.A2U     // Catch:{ all -> 0x052d }
            X.1CJ r1 = r0.A0l     // Catch:{ all -> 0x052d }
            r44 = r1
            X.1BI r6 = r0.A0u     // Catch:{ all -> 0x052d }
            X.2Rv r2 = r1.A0B(r6)     // Catch:{ all -> 0x052d }
            int r8 = r2.A00     // Catch:{ all -> 0x052d }
            r0.A05 = r8     // Catch:{ all -> 0x052d }
            int r7 = r2.A01     // Catch:{ all -> 0x052d }
            r0.A06 = r7     // Catch:{ all -> 0x052d }
            if (r8 > 0) goto L_0x0136
            if (r7 > 0) goto L_0x0136
            r9 = 0
            goto L_0x0141
        L_0x0136:
            int r9 = r2.A02     // Catch:{ all -> 0x052d }
            r0.A07 = r9     // Catch:{ all -> 0x052d }
            boolean r1 = X.C22971Dz.A0V(r6)     // Catch:{ all -> 0x052d }
            if (r1 == 0) goto L_0x0143
            r9 = r8
        L_0x0141:
            r0.A07 = r9     // Catch:{ all -> 0x052d }
        L_0x0143:
            long r1 = r2.A03     // Catch:{ all -> 0x052d }
            r0.A09 = r1     // Catch:{ all -> 0x052d }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x052d }
            java.lang.String r1 = "messagesViewModel/start/unseen "
            r2.append(r1)     // Catch:{ all -> 0x052d }
            r2.append(r9)     // Catch:{ all -> 0x052d }
            java.lang.String r1 = "/"
            r2.append(r1)     // Catch:{ all -> 0x052d }
            r2.append(r8)     // Catch:{ all -> 0x052d }
            X.C17900vP.A0j(r1, r2, r7)     // Catch:{ all -> 0x052d }
            X.AnonymousClass3VQ.A06(r0)     // Catch:{ all -> 0x052d }
            int r1 = r0.A07     // Catch:{ all -> 0x052d }
            boolean r41 = X.AnonymousClass000.A1R(r1)
            r24 = 0
            r43 = r24
            r45 = r24
            r47 = 0
            X.1wy r1 = r0.A11     // Catch:{ all -> 0x052d }
            r50 = r1
            java.lang.Object r2 = r50.A06()     // Catch:{ all -> 0x052d }
            X.4SI r2 = (X.AnonymousClass4SI) r2     // Catch:{ all -> 0x052d }
            if (r2 == 0) goto L_0x0187
            boolean r1 = r2.A05     // Catch:{ all -> 0x052d }
            if (r1 == 0) goto L_0x0181
            r47 = r1
        L_0x0181:
            java.util.Collection r1 = r2.A04     // Catch:{ all -> 0x052d }
            if (r1 == 0) goto L_0x0187
            r45 = r1
        L_0x0187:
            android.content.Intent r7 = r0.A0P     // Catch:{ all -> 0x052d }
            r1 = r25
            long r8 = r7.getLongExtra(r1, r4)     // Catch:{ all -> 0x052d }
            java.lang.String r1 = "parent_row_id"
            long r33 = r7.getLongExtra(r1, r4)     // Catch:{ all -> 0x052d }
            java.lang.String r23 = "sort_id"
            r1 = -9223372036854775808
            r10 = r23
            long r31 = r7.getLongExtra(r10, r1)     // Catch:{ all -> 0x052d }
            java.lang.String r10 = "parent_sort_id"
            long r35 = r7.getLongExtra(r10, r1)     // Catch:{ all -> 0x052d }
            java.lang.String r22 = "carousel_card_idx"
            r2 = -1
            r1 = r22
            int r21 = r7.getIntExtra(r1, r2)     // Catch:{ all -> 0x052d }
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x01d7
            X.1HB r1 = r12.A01     // Catch:{ all -> 0x052d }
            X.4pu r2 = new X.4pu     // Catch:{ all -> 0x052d }
            r2.<init>(r12, r8)     // Catch:{ all -> 0x052d }
            X.19a r1 = r1.A01     // Catch:{ all -> 0x052d }
            X.19Y r10 = r1.A06     // Catch:{ all -> 0x052d }
            X.19b r1 = r1.A05     // Catch:{ all -> 0x052d }
            int r1 = r1.A06     // Catch:{ all -> 0x052d }
            r10.Bit(r2, r1)     // Catch:{ all -> 0x052d }
        L_0x01c4:
            int r20 = X.AnonymousClass3VQ.A03(r0)     // Catch:{ all -> 0x052d }
            X.2dp r1 = r0.A0D     // Catch:{ all -> 0x052d }
            r19 = 1
            if (r1 == 0) goto L_0x01df
            r19 = 0
            boolean r1 = r0.A0J     // Catch:{ all -> 0x052d }
            r40 = 0
            if (r1 == 0) goto L_0x01e1
            goto L_0x01df
        L_0x01d7:
            X.1HB r2 = r12.A01     // Catch:{ all -> 0x052d }
            java.lang.String r1 = "is_starred"
            r2.A00(r1, r11, r11)     // Catch:{ all -> 0x052d }
            goto L_0x01c4
        L_0x01df:
            r40 = 1
        L_0x01e1:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x01e6
            goto L_0x01e9
        L_0x01e6:
            r18 = r24
            goto L_0x01f2
        L_0x01e9:
            X.4Uc r18 = new X.4Uc     // Catch:{ all -> 0x052d }
            r28 = r18
            r29 = r8
            r28.<init>(r29, r31, r33, r35)     // Catch:{ all -> 0x052d }
        L_0x01f2:
            X.5cB r10 = r0.A0g     // Catch:{ all -> 0x052d }
            long r13 = r0.A0A     // Catch:{ all -> 0x052d }
            long r1 = r0.A0B     // Catch:{ all -> 0x052d }
            r38 = r1
            long r1 = r0.A0O     // Catch:{ all -> 0x052d }
            r48 = r1
            int r1 = r0.A07     // Catch:{ all -> 0x052d }
            r28 = r1
            X.4lp r10 = (X.C95184lp) r10     // Catch:{ all -> 0x052d }
            X.C18070vi.A0d(r6, r11)     // Catch:{ all -> 0x052d }
            X.4Ur r2 = X.C95184lp.A01(r10, r6)     // Catch:{ all -> 0x052d }
            java.lang.String r15 = "messagesViewModel/loadMessages/jid="
            if (r2 == 0) goto L_0x0279
            X.4Uc r11 = r2.A02     // Catch:{ all -> 0x052d }
            r1 = r18
            boolean r1 = X.C18070vi.A18(r11, r1)     // Catch:{ all -> 0x052d }
            if (r1 == 0) goto L_0x025b
            long r11 = r2.A01     // Catch:{ all -> 0x052d }
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x025b
        L_0x021f:
            X.2dp r1 = r2.A03     // Catch:{ all -> 0x052d }
            int r2 = r2.A00     // Catch:{ all -> 0x052d }
            r38 = r2
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0299
            r2 = r25
            r7.putExtra(r2, r4)     // Catch:{ all -> 0x052d }
            r8 = -9223372036854775808
            r2 = r23
            r7.putExtra(r2, r8)     // Catch:{ all -> 0x052d }
            r8 = -1
            r2 = r22
            r7.putExtra(r2, r8)     // Catch:{ all -> 0x052d }
            X.205 r12 = X.AnonymousClass4aU.A02(r7)     // Catch:{ all -> 0x052d }
            if (r21 < 0) goto L_0x0290
            X.16v r18 = new X.16v     // Catch:{ all -> 0x052d }
            r18.<init>()     // Catch:{ all -> 0x052d }
            r2 = r21
            java.lang.Integer r8 = X.C72463Mc.A0k(r12, r2)     // Catch:{ all -> 0x052d }
            r2 = r18
            java.util.concurrent.ConcurrentHashMap r2 = r2.A00     // Catch:{ all -> 0x052d }
            r2.put(r12, r8)     // Catch:{ all -> 0x052d }
            X.2M2 r8 = new X.2M2     // Catch:{ all -> 0x052d }
            r2 = r21
            r8.<init>(r12, r2)     // Catch:{ all -> 0x052d }
            goto L_0x028e
        L_0x025b:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A11(r15)     // Catch:{ all -> 0x052d }
            r11.append(r6)     // Catch:{ all -> 0x052d }
            java.lang.String r1 = " cannot use preloaded result="
            r11.append(r1)     // Catch:{ all -> 0x052d }
            r11.append(r2)     // Catch:{ all -> 0x052d }
            java.lang.String r1 = " scrollToMessage="
            r11.append(r1)     // Catch:{ all -> 0x052d }
            r1 = r18
            r11.append(r1)     // Catch:{ all -> 0x052d }
            java.lang.String r1 = " startRef="
            X.C17900vP.A0l(r1, r11, r13)     // Catch:{ all -> 0x052d }
        L_0x0279:
            r29 = r18
            r30 = r10
            r31 = r6
            r32 = r20
            r33 = r28
            r34 = r13
            r36 = r38
            r38 = r48
            X.4Ur r2 = X.C95184lp.A00(r29, r30, r31, r32, r33, r34, r36, r38, r40)     // Catch:{ all -> 0x052d }
            goto L_0x021f
        L_0x028e:
            r12 = r8
            goto L_0x0292
        L_0x0290:
            r18 = r24
        L_0x0292:
            r35 = r24
            r19 = 1
            r40 = 1
            goto L_0x02cd
        L_0x0299:
            X.2Zx r2 = r0.A0e     // Catch:{ all -> 0x052d }
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x052d }
            java.util.Map r2 = r2.A00     // Catch:{ all -> 0x052d }
            java.lang.Object r8 = r2.get(r6)     // Catch:{ all -> 0x052d }
            X.4MK r8 = (X.AnonymousClass4MK) r8     // Catch:{ all -> 0x052d }
            boolean r2 = r0.A0J     // Catch:{ all -> 0x052d }
            if (r2 == 0) goto L_0x02c7
            if (r41 != 0) goto L_0x02c7
            if (r8 == 0) goto L_0x02c7
            int r2 = r8.A01     // Catch:{ all -> 0x052d }
            if (r2 >= 0) goto L_0x02b7
            java.lang.Boolean r43 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x052d }
            goto L_0x02c0
        L_0x02b7:
            r38 = r2
            int r2 = r8.A00     // Catch:{ all -> 0x052d }
            java.lang.Integer r35 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x052d }
            goto L_0x02c2
        L_0x02c0:
            r35 = r24
        L_0x02c2:
            r12 = r24
            r18 = r12
            goto L_0x02cd
        L_0x02c7:
            r12 = r24
            r35 = r12
            r18 = r12
        L_0x02cd:
            android.database.Cursor r14 = r1.A00     // Catch:{ all -> 0x052d }
            if (r14 == 0) goto L_0x0459
            boolean r2 = r14.isClosed()     // Catch:{ all -> 0x052d }
            if (r2 != 0) goto L_0x0459
            if (r19 == 0) goto L_0x02dc
            if (r41 == 0) goto L_0x0322
            goto L_0x02df
        L_0x02dc:
            if (r41 == 0) goto L_0x0322
            goto L_0x0305
        L_0x02df:
            r2 = r44
            X.1ci r2 = X.C72463Mc.A0a(r2, r6)     // Catch:{ all -> 0x052d }
            if (r2 == 0) goto L_0x0305
            long r8 = r2.A0N     // Catch:{ all -> 0x052d }
            r10 = 1
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0305
            X.10I r10 = r0.A1C     // Catch:{ all -> 0x052d }
            X.1DT r2 = r0.A0V     // Catch:{ all -> 0x052d }
            r2.getClass()     // Catch:{ all -> 0x052d }
            X.4LY r9 = new X.4LY     // Catch:{ all -> 0x052d }
            r9.<init>(r2)     // Catch:{ all -> 0x052d }
            r8 = 49
            X.4ra r2 = new X.4ra     // Catch:{ all -> 0x052d }
            r2.<init>(r9, r0, r8)     // Catch:{ all -> 0x052d }
            r10.CGN(r2)     // Catch:{ all -> 0x052d }
        L_0x0305:
            int r8 = r0.A07     // Catch:{ all -> 0x052d }
            int r2 = r14.getCount()     // Catch:{ all -> 0x052d }
            if (r8 <= r2) goto L_0x0322
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x052d }
            java.lang.String r2 = "messagesViewModel/start/unseen greater than cursor count "
            r8.append(r2)     // Catch:{ all -> 0x052d }
            int r2 = r14.getCount()     // Catch:{ all -> 0x052d }
            X.C17900vP.A0o(r8, r2)     // Catch:{ all -> 0x052d }
            X.AnonymousClass3VQ.A07(r0)     // Catch:{ all -> 0x052d }
            r41 = 0
        L_0x0322:
            long r8 = r1.A01     // Catch:{ all -> 0x052d }
            r0.A0W(r8)     // Catch:{ all -> 0x052d }
            long r9 = r1.A02     // Catch:{ all -> 0x052d }
            r0.A0X(r9)     // Catch:{ all -> 0x052d }
            if (r41 == 0) goto L_0x0338
            int r8 = r0.A07     // Catch:{ all -> 0x052d }
            int r2 = r14.getCount()     // Catch:{ all -> 0x052d }
            r42 = 1
            if (r8 == r2) goto L_0x033a
        L_0x0338:
            r42 = 0
        L_0x033a:
            int r11 = r14.getCount()     // Catch:{ all -> 0x052d }
            r8 = 0
            r2 = r20
            if (r11 < r2) goto L_0x0344
            r8 = 1
        L_0x0344:
            r0.A0K = r8     // Catch:{ all -> 0x052d }
            r2 = r44
            X.1ci r2 = X.C72463Mc.A0a(r2, r6)     // Catch:{ all -> 0x052d }
            if (r2 != 0) goto L_0x0350
            r2 = 0
            goto L_0x0352
        L_0x0350:
            int r2 = r2.A04     // Catch:{ all -> 0x052d }
        L_0x0352:
            r0.A01 = r2     // Catch:{ all -> 0x052d }
            boolean r2 = r0.A0K     // Catch:{ all -> 0x052d }
            int r39 = X.C72453Mb.A07(r2)
            r2 = r44
            X.1ci r2 = X.C72463Mc.A0a(r2, r6)     // Catch:{ all -> 0x052d }
            if (r2 != 0) goto L_0x0364
            r13 = 0
            goto L_0x0366
        L_0x0364:
            int r13 = r2.A04     // Catch:{ all -> 0x052d }
        L_0x0366:
            r0.A0Z(r1)     // Catch:{ all -> 0x052d }
            X.AnonymousClass3VQ.A09(r0, r9)     // Catch:{ all -> 0x052d }
            java.lang.String r8 = X.AnonymousClass2WR.A01     // Catch:{ all -> 0x052d }
            java.lang.String r2 = r7.getAction()     // Catch:{ all -> 0x052d }
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x052d }
            if (r2 == 0) goto L_0x039b
            int r2 = r14.getCount()     // Catch:{ all -> 0x052d }
            if (r2 <= 0) goto L_0x039b
            X.205 r7 = X.AnonymousClass4aU.A02(r7)     // Catch:{ all -> 0x052d }
            if (r7 == 0) goto L_0x039b
            X.1W6 r2 = r0.A0y     // Catch:{ all -> 0x052d }
            X.1W2 r2 = r2.A01     // Catch:{ all -> 0x052d }
            X.206 r33 = r2.A05(r7)     // Catch:{ all -> 0x052d }
        L_0x038c:
            X.1wy r11 = r0.A12     // Catch:{ all -> 0x052d }
            int r8 = r0.A05     // Catch:{ all -> 0x052d }
            int r7 = r0.A06     // Catch:{ all -> 0x052d }
            int r2 = r0.A07     // Catch:{ all -> 0x052d }
            X.4Rv r10 = new X.4Rv     // Catch:{ all -> 0x052d }
            r10.<init>(r8, r7, r2)     // Catch:{ all -> 0x052d }
            monitor-enter(r0)     // Catch:{ all -> 0x052d }
            goto L_0x039e
        L_0x039b:
            r33 = 0
            goto L_0x038c
        L_0x039e:
            X.206 r15 = r0.A0F     // Catch:{ all -> 0x0456 }
            monitor-exit(r0)     // Catch:{ all -> 0x052d }
            X.1wy r2 = r0.A15     // Catch:{ all -> 0x052d }
            java.util.concurrent.atomic.AtomicBoolean r9 = r2.A00     // Catch:{ all -> 0x052d }
            r8 = 1
            r7 = 0
            boolean r7 = r9.compareAndSet(r8, r7)     // Catch:{ all -> 0x052d }
            if (r7 == 0) goto L_0x03e7
            java.lang.Object r7 = r2.A06()     // Catch:{ all -> 0x052d }
        L_0x03b1:
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x052d }
            X.4ST r8 = new X.4ST     // Catch:{ all -> 0x052d }
            r28 = r8
            r29 = r18
            r30 = r10
            r31 = r1
            r32 = r15
            r34 = r12
            r36 = r7
            r37 = r13
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x052d }
            r11.A0F(r8)     // Catch:{ all -> 0x052d }
            int r7 = r0.A07     // Catch:{ all -> 0x052d }
            if (r7 <= 0) goto L_0x03d8
            int r1 = r14.getCount()     // Catch:{ all -> 0x052d }
            if (r7 != r1) goto L_0x03d8
            X.AnonymousClass3VQ.A07(r0)     // Catch:{ all -> 0x052d }
        L_0x03d8:
            int r1 = r0.A07     // Catch:{ all -> 0x052d }
            if (r1 <= 0) goto L_0x03f6
            boolean r1 = r0.A1K     // Catch:{ all -> 0x052d }
            if (r1 == 0) goto L_0x03f6
            boolean r1 = r14.moveToFirst()     // Catch:{ all -> 0x052d }
            if (r1 == 0) goto L_0x0447
            goto L_0x044b
        L_0x03e7:
            r7 = 0
            goto L_0x03b1
        L_0x03e9:
            X.205 r7 = r1.A0v     // Catch:{ all -> 0x052d }
            boolean r7 = r7.A02     // Catch:{ all -> 0x052d }
            if (r7 == 0) goto L_0x03f6
            int r7 = r1.A0D()     // Catch:{ all -> 0x052d }
            r1 = 6
            if (r7 == r1) goto L_0x0441
        L_0x03f6:
            java.util.List r1 = r0.A1H     // Catch:{ all -> 0x052d }
            r1.clear()     // Catch:{ all -> 0x052d }
            X.1IX r41 = X.AnonymousClass1IX.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x052d }
            X.1wy r6 = r0.A10     // Catch:{ all -> 0x052d }
            r1 = r24
            r6.A0F(r1)     // Catch:{ all -> 0x052d }
            X.1wy r6 = r0.A14     // Catch:{ all -> 0x052d }
            r6.A0F(r1)     // Catch:{ all -> 0x052d }
            r2.A0F(r1)     // Catch:{ all -> 0x052d }
            X.AnonymousClass3VQ.A08(r0)     // Catch:{ all -> 0x052d }
            r46 = 1
            X.4SI r2 = new X.4SI     // Catch:{ all -> 0x052d }
            r44 = r1
            r40 = r2
            r42 = r1
            r40.<init>(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ all -> 0x052d }
            r1 = r50
            r1.A0F(r2)     // Catch:{ all -> 0x052d }
            X.206 r1 = r0.A0T()     // Catch:{ all -> 0x052d }
            X.AnonymousClass3VQ.A0C(r0, r1)     // Catch:{ all -> 0x052d }
            X.10I r6 = r0.A1C     // Catch:{ all -> 0x052d }
            r2 = 12
            X.4rL r1 = new X.4rL     // Catch:{ all -> 0x052d }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x052d }
            r6.CGN(r1)     // Catch:{ all -> 0x052d }
            r2 = 13
            X.4rL r1 = new X.4rL     // Catch:{ all -> 0x052d }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x052d }
            r6.CGF(r1)     // Catch:{ all -> 0x052d }
            goto L_0x045e
        L_0x0441:
            boolean r1 = r14.moveToNext()     // Catch:{ all -> 0x052d }
            if (r1 != 0) goto L_0x044b
        L_0x0447:
            X.AnonymousClass3VQ.A07(r0)     // Catch:{ all -> 0x052d }
            goto L_0x03f6
        L_0x044b:
            X.1W6 r1 = r0.A0y     // Catch:{ all -> 0x0454 }
            X.206 r1 = r1.A02(r14, r6)     // Catch:{ all -> 0x0454 }
            if (r1 == 0) goto L_0x0441
            goto L_0x03e9
        L_0x0454:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x052d }
        L_0x0456:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x052d }
            throw r1     // Catch:{ all -> 0x052d }
        L_0x0459:
            java.lang.String r0 = "messagesViewModel/start/cursor is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x052d }
        L_0x045e:
            if (r27 == 0) goto L_0x0472
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0472
            X.10I r5 = r3.A4c     // Catch:{ all -> 0x052d }
            r4 = 11
            X.7Ph r2 = new X.7Ph     // Catch:{ all -> 0x052d }
            r0 = r16
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x052d }
            r5.CGF(r2)     // Catch:{ all -> 0x052d }
        L_0x0472:
            X.1Il r2 = X.AnonymousClass3Ma.A0j(r3)     // Catch:{ all -> 0x053d }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r3)     // Catch:{ all -> 0x053d }
            X.1GV r0 = r3.A7d     // Catch:{ all -> 0x053d }
            r2.A04(r1, r0)     // Catch:{ all -> 0x053d }
            X.1Il r0 = X.AnonymousClass3Ma.A0j(r3)     // Catch:{ all -> 0x053d }
            boolean r0 = r0.A0A()     // Catch:{ all -> 0x053d }
            if (r0 == 0) goto L_0x0494
            X.00H r0 = r3.A64     // Catch:{ all -> 0x053d }
            X.10T r1 = X.C17880vN.A0V(r0)     // Catch:{ all -> 0x053d }
            X.4FJ r0 = r3.A7j     // Catch:{ all -> 0x053d }
            r1.registerObserver(r0)     // Catch:{ all -> 0x053d }
        L_0x0494:
            X.1BI r0 = r3.A3R     // Catch:{ all -> 0x053d }
            boolean r0 = X.C22971Dz.A0V(r0)     // Catch:{ all -> 0x053d }
            if (r0 == 0) goto L_0x0537
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r3)     // Catch:{ all -> 0x053d }
            X.00H r0 = r0.A0B     // Catch:{ all -> 0x053d }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x053d }
            X.9mz r5 = (X.C191679mz) r5     // Catch:{ all -> 0x053d }
            X.1BI r4 = r3.A3R     // Catch:{ all -> 0x053d }
            X.25J r0 = X.C29681ch.A03     // Catch:{ all -> 0x053d }
            boolean r0 = r4 instanceof X.C29681ch     // Catch:{ all -> 0x053d }
            if (r0 == 0) goto L_0x04b4
            X.1ch r4 = (X.C29681ch) r4     // Catch:{ all -> 0x053d }
        L_0x04b2:
            monitor-enter(r5)     // Catch:{ all -> 0x053d }
            goto L_0x04b6
        L_0x04b4:
            r4 = 0
            goto L_0x04b2
        L_0x04b6:
            r0 = 0
            X.C18070vi.A0d(r4, r0)     // Catch:{ all -> 0x0534 }
            X.1CJ r2 = r5.A00     // Catch:{ all -> 0x0534 }
            X.00H r1 = r5.A04     // Catch:{ all -> 0x0534 }
            java.lang.Object r0 = X.C18070vi.A0E(r1)     // Catch:{ all -> 0x0534 }
            X.1c4 r0 = (X.AnonymousClass1c4) r0     // Catch:{ all -> 0x0534 }
            boolean r0 = X.AnonymousClass4aS.A08(r2, r4, r0)     // Catch:{ all -> 0x0534 }
            if (r0 == 0) goto L_0x04e9
            X.1ch r0 = r5.A06     // Catch:{ all -> 0x0534 }
            if (r0 == 0) goto L_0x04d1
            r5.A00()     // Catch:{ all -> 0x0534 }
        L_0x04d1:
            r5.A06 = r4     // Catch:{ all -> 0x0534 }
            boolean r0 = X.C72453Mb.A1X(r1)     // Catch:{ all -> 0x0534 }
            if (r0 == 0) goto L_0x04e9
            X.1ch r4 = r5.A06     // Catch:{ all -> 0x0534 }
            if (r4 == 0) goto L_0x04e9
            X.10I r2 = r5.A02     // Catch:{ all -> 0x0534 }
            r1 = 18
            X.AkP r0 = new X.AkP     // Catch:{ all -> 0x0534 }
            r0.<init>(r5, r4, r1)     // Catch:{ all -> 0x0534 }
            r2.CGF(r0)     // Catch:{ all -> 0x0534 }
        L_0x04e9:
            monitor-exit(r5)     // Catch:{ all -> 0x053d }
            X.1c4 r0 = X.AnonymousClass4X5.A00(r3)     // Catch:{ all -> 0x053d }
            X.0ve r2 = r0.A02     // Catch:{ all -> 0x053d }
            r1 = 7588(0x1da4, float:1.0633E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x053d }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x053d }
            r3.A7T = r0     // Catch:{ all -> 0x053d }
            if (r0 == 0) goto L_0x0537
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r3)     // Catch:{ all -> 0x053d }
            X.00H r0 = r0.A08     // Catch:{ all -> 0x053d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x053d }
            X.171 r0 = (X.AnonymousClass171) r0     // Catch:{ all -> 0x053d }
            X.A58 r4 = r0.A00     // Catch:{ all -> 0x053d }
            if (r4 != 0) goto L_0x0512
            X.A58 r4 = X.A58.A00()     // Catch:{ all -> 0x053d }
            r0.A00 = r4     // Catch:{ all -> 0x053d }
        L_0x0512:
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r3)     // Catch:{ all -> 0x053d }
            X.00H r0 = r0.A07     // Catch:{ all -> 0x053d }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x053d }
            X.170 r2 = (X.AnonymousClass170) r2     // Catch:{ all -> 0x053d }
            com.whatsapp.KeyboardPopupLayout r0 = r3.A1M     // Catch:{ all -> 0x053d }
            X.8d3 r1 = new X.8d3     // Catch:{ all -> 0x053d }
            r1.<init>(r0)     // Catch:{ all -> 0x053d }
            com.whatsapp.conversation.ConversationListView r0 = r3.A2B     // Catch:{ all -> 0x053d }
            r4.A04(r0, r1)     // Catch:{ all -> 0x053d }
            r4.A00 = r2     // Catch:{ all -> 0x053d }
            goto L_0x0537
        L_0x052d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x052f }
        L_0x052f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x053d }
        L_0x0531:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x053d }
            goto L_0x0536
        L_0x0534:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x053d }
        L_0x0536:
            throw r0     // Catch:{ all -> 0x053d }
        L_0x0537:
            r0 = r26
            A1d(r3, r0)
            return
        L_0x053d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x053f }
        L_0x053f:
            r1 = move-exception
            r0 = r26
            A1d(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2c():void");
    }

    public void A2f(int i) {
        Integer num;
        C17960vV.A07(this.A2Q.getReactionsTrayViewModel());
        if (i == 2) {
            if (A26(this)) {
                if (this.A3D == null) {
                    A0y(this);
                }
                AnonymousClass160 r3 = (AnonymousClass160) AnonymousClass3Ma.A0X(this).A02.get();
                r3.A01 = true;
                if (C18020vd.A05(C18040vf.A02, this.A3F, 11848)) {
                    num = AnonymousClass00R.A00;
                } else {
                    num = AnonymousClass00R.A01;
                }
                r3.A00 = num;
                this.A1M.post(new C98834rn((Object) this, 49));
                return;
            }
            C117015z4 r0 = this.A3K;
            if (r0 != null) {
                C117015z4.A03(r0, 0);
                AnonymousClass3MZ.A1S(this);
                C98794rj.A00(this.A1L, this, 0);
            }
        } else if (i == 0 && !A3H()) {
            if (A26(this)) {
                EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A39;
                if (emojiSearchKeyboardContainer != null) {
                    emojiSearchKeyboardContainer.A03();
                }
            } else {
                C80753xv r02 = this.A3L;
                if (r02 != null && r02.A01()) {
                    this.A3L.A00(false);
                }
            }
            this.A0D.setVisibility(0);
        }
    }

    public void A2g(int i) {
        C85814Ov r0 = this.A27;
        C18000vb r2 = r0.A05;
        View view = r0.A02;
        AnonymousClass3NK.A00(AnonymousClass3NL.A00(view.getContext(), r2, i), view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[SYNTHETIC, Splitter:B:14:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2i(android.app.assist.AssistContent r5) {
        /*
            r4 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x002f
            X.1BI r3 = r4.A3R
            r0 = 1
            X.C17960vV.A0C(r0)
            java.lang.String r1 = "Invalid"
            if (r3 == 0) goto L_0x004d
            boolean r0 = X.C22971Dz.A0e(r3)
            if (r0 != 0) goto L_0x004a
            boolean r0 = X.C22971Dz.A0N(r3)
            if (r0 != 0) goto L_0x004a
            boolean r0 = X.C22971Dz.A0d(r3)
            if (r0 == 0) goto L_0x004d
            java.lang.String r2 = "Individual"
        L_0x0024:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "conversation/provide-assist-content/invalid-conversation-id"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002f:
            return
        L_0x0030:
            org.json.JSONObject r1 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0057 }
            java.lang.String r0 = "conversation_type"
            org.json.JSONObject r2 = r1.put(r0, r2)     // Catch:{ JSONException -> 0x0057 }
            java.lang.String r1 = "conversation_id"
            X.C17960vV.A07(r3)     // Catch:{ JSONException -> 0x0057 }
            java.lang.String r0 = r3.getRawString()     // Catch:{ JSONException -> 0x0057 }
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x0057 }
            if (r0 == 0) goto L_0x002f
            goto L_0x004f
        L_0x004a:
            java.lang.String r2 = "Group"
            goto L_0x0024
        L_0x004d:
            r2 = r1
            goto L_0x0024
        L_0x004f:
            java.lang.String r0 = r0.toString()
            r5.setStructuredData(r0)
            return
        L_0x0057:
            r1 = move-exception
            java.lang.String r0 = "assistant-utils/get-conversation-structured-data/exception"
            com.whatsapp.util.Log.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2i(android.app.assist.AssistContent):void");
    }

    public void A2j(Configuration configuration) {
        LockableCoodinatorLayout lockableCoodinatorLayout;
        ConversationListView conversationListView = this.A2B;
        if (conversationListView != null) {
            if (conversationListView.A0M) {
                conversationListView.setTranscriptMode(2);
                conversationListView.A0T.sendEmptyMessageDelayed(0, 1000);
            } else {
                conversationListView.setSelection(conversationListView.A00);
            }
        }
        C108645c3 r2 = this.A4e;
        if (r2 != null) {
            int i = configuration.orientation;
            r2.CIa(i);
            if (!r2.BT0()) {
                r2.CJk(i);
            }
        }
        if (this.A24 != null && ((Build.VERSION.SDK_INT >= 24 && this.A2Q.isInMultiWindowMode()) || C87544Vz.A01(this.A3F))) {
            C115095tO r1 = this.A24;
            AnonymousClass3RS r0 = r1.A01;
            if (r0 != null && r0.isShowing() && !C87544Vz.A01(r1.A0Q)) {
                AnonymousClass3RS r02 = r1.A01;
                AnonymousClass3RS.A03(r02);
                AnonymousClass3RS.A02(r02);
            }
            C74863d2 r03 = r1.A02;
            if (r03 != null && r03.isShowing()) {
                r1.A02.dismiss();
            }
        }
        AnonymousClass74M r22 = this.A4h;
        if (r22 != null) {
            AnonymousClass7OH r4 = r22.A15;
            r4.A0M.clear();
            File file = r22.A0L;
            if (file != null) {
                r22.A0T(r22.A0K, file);
                r4.A05(r22.A0I, r22.A0L, false, true);
            }
        }
        MentionableEntry mentionableEntry = this.A3Z;
        if (mentionableEntry != null) {
            if (configuration.orientation == 1) {
                float A002 = C72473Md.A00(mentionableEntry);
                int i2 = 6;
                if (A002 < 1.5f) {
                    i2 = 4;
                    if (A002 >= 1.0f) {
                        i2 = 5;
                    }
                }
                mentionableEntry.setMaxLines(i2);
            } else {
                mentionableEntry.setMaxLines(2);
                C108645c3 r12 = this.A4e;
                if (r12 != null && r12.BT1() && !r12.BT0()) {
                    r12.BKP();
                    this.A4e.CJk(1);
                }
                AnonymousClass74M r04 = this.A4h;
                if (r04 != null && r04.A0a()) {
                    A2P();
                }
            }
        }
        if (A1y(this)) {
            A1w(this);
        }
        AnonymousClass4VR r5 = this.A2q;
        if (r5 != null && r5.A0G) {
            boolean A1T2 = AnonymousClass000.A1T(configuration.orientation, 2);
            r5.A0F = A1T2;
            if (r5.A00 == 2) {
                C74323Zj r05 = r5.A0A;
                if (A1T2) {
                    C72453Mb.A1A(r05);
                } else {
                    C17960vV.A05(r05);
                    r05.setVisibility(0);
                }
            }
        }
        AnonymousClass3VQ r3 = this.A2b;
        if (r3 != null) {
            AnonymousClass1FY A0P2 = AnonymousClass3MW.A0P(this);
            Point A0D2 = C72483Me.A0D(A0P2);
            r3.A00 = (A0D2.y * 2) / A0P2.getResources().getDimensionPixelSize(2131166269);
        }
        AnonymousClass3Ma.A0j(this).A03(AnonymousClass3MW.A0P(this));
        boolean A1V2 = C72473Md.A1V(this);
        int i3 = configuration.screenWidthDp;
        if (i3 != this.A02) {
            this.A02 = i3;
            if (A1V2 != this.A6c) {
                this.A6c = A1V2;
                A0F();
                this.A2Q.finish();
            }
        }
        LinearLayout linearLayout = this.A0Z;
        if (linearLayout != null && this.A6c) {
            linearLayout.addOnLayoutChangeListener(new C90224dj(this, 6));
        }
        if (A26(this) && (lockableCoodinatorLayout = this.A1N) != null) {
            lockableCoodinatorLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C90414e2(this, 0, true));
        }
        C75433hU r06 = this.A23;
        if (r06 != null) {
            r06.A00 = configuration;
        }
        if (this.A7T) {
            AnonymousClass170 r32 = (AnonymousClass170) AnonymousClass3Ma.A0Y(this).A07.get();
            float f = 0.4f;
            if (configuration.orientation == 2) {
                f = 0.05f;
            }
            r32.A00 = f;
        }
    }

    public void A2o(AnonymousClass4PL r6, boolean z, boolean z2) {
        AnonymousClass7RF r4 = new AnonymousClass7RF(this, r6, 34, z);
        if (!z2 || this.A3c == null) {
            r4.run();
            return;
        }
        this.A2Q.CFa();
        ((C86064Qa) AnonymousClass3Ma.A0Y(this).A0M.get()).A00(this.A3c.A05, new C98434r8(this, r4, 0));
    }

    public void A2q(C87064Ud r6) {
        View view;
        View view2;
        this.A7O = new AnonymousClass1Ez("conversation/search/searchTask");
        if (!C60542oC.A00(this.A2N.A00)) {
            this.A2Q.CNA(2131895533);
        } else if (!C72473Md.A1V(this)) {
            AnonymousClass3MW.A0K(this).A0Q("search_fragment_conversation");
        } else if (this.A0N != null && this.A0L != null && (view = this.A0O) != null && (view2 = this.A0M) != null) {
            Integer num = r6.A02;
            if (num != AnonymousClass00R.A00) {
                if (num == AnonymousClass00R.A01) {
                    view = view2;
                }
                this.A0N.setEnabled(false);
                this.A0L.setEnabled(false);
            }
            view.setVisibility(0);
            this.A0N.setEnabled(false);
            this.A0L.setEnabled(false);
        }
    }

    public void A2r(C54242dp r5, AnonymousClass206 r6, int i) {
        EditText editText;
        EditText editText2;
        Cursor cursor;
        AnonymousClass3UY r0 = this.A2Z;
        if (r6 != null) {
            r0.A00 = r6;
        }
        if (!C60542oC.A00(this.A2N.A00)) {
            this.A2Q.CEx();
        } else if (!C72473Md.A1V(this)) {
            AnonymousClass3MW.A0K(this).A0Q("search_fragment_conversation");
        } else {
            View view = this.A0N;
            if (!(view == null || this.A0L == null || this.A0O == null || this.A0M == null)) {
                view.setEnabled(true);
                this.A0L.setEnabled(true);
                this.A0O.setVisibility(8);
                this.A0M.setVisibility(8);
            }
        }
        if (r6 != null) {
            C73103Oz A0c2 = AnonymousClass3MX.A0c(this);
            AnonymousClass205 r1 = r6.A0v;
            C18070vi.A0d(r1, 0);
            A0c2.A0V.add(r1);
            if (r5 == null || (cursor = r5.A00) == null) {
                this.A2B.A05();
            } else {
                this.A2b.A0W(r5.A01);
                this.A2b.A0X(r5.A02);
                this.A2b.A0Z(r5);
                this.A2b.A0U();
                this.A2B.A08(cursor);
            }
            ConversationListView conversationListView = this.A2B;
            int headerViewsCount = i + conversationListView.getHeaderViewsCount();
            int dimensionPixelSize = AnonymousClass3MW.A04(this).getDimensionPixelSize(2131166321);
            conversationListView.setTranscriptMode(0);
            conversationListView.setSelectionFromTop(headerViewsCount, dimensionPixelSize);
            this.A7O.A02();
        } else {
            AnonymousClass3MX.A0U(this).A08(2131892993, 0);
            if (!C72473Md.A1V(this)) {
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) AnonymousClass3MW.A0K(this).A0Q("search_fragment_conversation");
                if (conversationSearchFragment != null) {
                    WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                    if (!(wDSConversationSearchView == null || (editText2 = wDSConversationSearchView.A01) == null)) {
                        editText2.sendAccessibilityEvent(8);
                    }
                    WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
                    if (!(wDSConversationSearchView2 == null || (editText = wDSConversationSearchView2.A01) == null)) {
                        editText.requestFocus();
                    }
                    WDSConversationSearchView wDSConversationSearchView3 = conversationSearchFragment.A05;
                    if (wDSConversationSearchView3 != null) {
                        wDSConversationSearchView3.A02();
                    }
                }
            } else {
                this.A1W.sendAccessibilityEvent(8);
                this.A1W.requestFocus();
                this.A1W.A0I(false);
            }
        }
        this.A2D = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r1 == com.whatsapp.voipcalling.CallState.RECEIVED_CALL) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2s(X.C59822mw r6) {
        /*
            r5 = this;
            X.4Rn r0 = r5.A2G
            java.lang.Class<X.3s0> r1 = X.AnonymousClass3s0.class
            X.4XJ r0 = r0.A00
            X.4rI r4 = r0.A00(r1)
            X.3s0 r4 = (X.AnonymousClass3s0) r4
            if (r4 == 0) goto L_0x003a
            X.1HQ r0 = r4.A0E
            com.whatsapp.voipcalling.CallInfo r1 = r0.BO3()
            r3 = 0
            if (r1 == 0) goto L_0x0042
            com.whatsapp.jid.GroupJid r0 = r1.groupJid
        L_0x0019:
            X.1E7 r2 = r4.A0I
            boolean r0 = X.AnonymousClass3MZ.A1Y(r2, r0)
            if (r0 == 0) goto L_0x0029
            if (r1 == 0) goto L_0x0040
            com.whatsapp.voipcalling.CallState r1 = r1.callState
        L_0x0025:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x003d
        L_0x0029:
            X.1BI r1 = r2.A0J
            if (r6 == 0) goto L_0x003b
            X.1BI r0 = r6.A04
        L_0x002f:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003d
            r4.A07 = r6
        L_0x0037:
            X.AnonymousClass3s0.A02(r4)
        L_0x003a:
            return
        L_0x003b:
            r0 = r3
            goto L_0x002f
        L_0x003d:
            r4.A07 = r3
            goto L_0x0037
        L_0x0040:
            r1 = r3
            goto L_0x0025
        L_0x0042:
            r0 = r3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2s(X.2mw):void");
    }

    public void A2v(AnonymousClass1E7 r6) {
        AnonymousClass4VP r1 = this.A3w;
        if (r1.A03(r6.A0J)) {
            AnonymousClass1VP r3 = this.A1k;
            List A0a2 = C72483Me.A0a(this, r6);
            r3.BjS(AnonymousClass3MW.A0Q(this), (GroupJid) AnonymousClass3Ma.A0m(r6), A0a2, 25);
            return;
        }
        r1.A00(3);
    }

    public void A2x(AnonymousClass1E7 r14, boolean z, boolean z2, boolean z3) {
        CallConfirmationSheet A012;
        AnonymousClass4VP r1 = this.A3w;
        boolean z4 = z;
        if (r1.A03(r14.A0J)) {
            if (!z2) {
                C18030ve r12 = this.A3F;
                C18040vf r2 = C18040vf.A02;
                if (C18020vd.A05(r2, r12, 927) && r14.A0F()) {
                    AnonymousClass1VP r0 = this.A1k;
                    List A0a2 = C72483Me.A0a(this, r14);
                    r0.CO3(AnonymousClass3MW.A0P(this), (GroupJid) AnonymousClass3Ma.A0m(r14), (String) null, A0a2, 9, z4);
                    return;
                } else if (!r14.A0F() || !C18020vd.A05(r2, this.A3F, 7175)) {
                    C19830z4 waSharedPreferences = this.A2Q.getWaSharedPreferences();
                    AnonymousClass1FY A0P2 = AnonymousClass3MW.A0P(this);
                    int i = 8;
                    if (this.A6n) {
                        i = 25;
                    }
                    if (CallConfirmationFragment.A04(A0P2, waSharedPreferences, r14, Integer.valueOf(i), z)) {
                        return;
                    }
                } else {
                    if (z3) {
                        AnonymousClass1EC r13 = (AnonymousClass1EC) AnonymousClass3Ma.A0m(r14);
                        C18070vi.A0d(r13, 0);
                        A012 = new CallConfirmationSheet();
                        A012.A1R(AnonymousClass4Ft.A00(r13, (Boolean) null, 25));
                    } else {
                        A012 = C87384Vj.A01((AnonymousClass1EC) AnonymousClass3Ma.A0m(r14), 25, z);
                    }
                    C20098A7b.A03(A012, AnonymousClass3MW.A0K(this), "CallConfirmationSheet");
                    return;
                }
            }
            if (r14.A0F()) {
                GroupJid groupJid = (GroupJid) AnonymousClass3Ma.A0m(r14);
                AnonymousClass1VP r7 = this.A1k;
                List A0a3 = C72483Me.A0a(this, r14);
                AnonymousClass1FY A0P3 = AnonymousClass3MW.A0P(this);
                int i2 = 25;
                if (this.A0B.getIntExtra("calling-tooltip-scenario", 0) == 1) {
                    i2 = 48;
                }
                r7.CNy(A0P3, groupJid, A0a3, i2, z);
                return;
            }
            this.A1k.CNw(AnonymousClass3MW.A0P(this), r14, 8, z);
            return;
        }
        int i3 = 3;
        if (z) {
            i3 = 4;
        }
        r1.A00(i3);
    }

    public void A2z(UserJid userJid) {
        AnonymousClass3TA r3 = this.A2d;
        C20005A2v a2v = (C20005A2v) A2K().get();
        AEI A0B2 = r3.A0U.A0B(userJid);
        if (A0B2 != null) {
            a2v.A04((ImageView) null, A0B2, (B7F) null, new C20489ANa(userJid, r3, 0), 2);
        } else {
            r3.A0q.CGF(new C70633Bw(r3, userJid, 0));
        }
    }

    public void A30(AnonymousClass206 r4) {
        AnonymousClass3uP A012 = this.A2B.A01(r4.A0v);
        if (A012 == null) {
            ConversationListView conversationListView = this.A2B;
            conversationListView.smoothScrollToPosition(conversationListView.getConversationCursorAdapter().A05(r4) + 1);
        } else if (A012 instanceof C79053uH) {
            C87724Ws.A00(this).A03 = true;
            A012.addOnLayoutChangeListener(new C90224dj(this, 5));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A33(X.AnonymousClass206 r15, X.AnonymousClass206 r16, X.AnonymousClass206 r17, int r18) {
        /*
            r14 = this;
            r2 = r16
            X.3Oz r1 = X.AnonymousClass3MX.A0c(r14)
            X.3VQ r4 = r14.A2b
            int r10 = r1.A04()
            com.whatsapp.conversation.ConversationListView r0 = r14.A2B
            int r11 = r0.getFirstVisiblePosition()
            int r12 = r1.getCount()
            boolean r0 = r2 instanceof X.C438020z
            r6 = r15
            if (r0 == 0) goto L_0x006a
            X.206 r0 = r2.A0K()
            if (r0 == 0) goto L_0x006a
            X.205 r1 = r0.A0v
            X.205 r0 = new X.205
            r0.<init>(r1)
            X.205 r3 = r15.A0v
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006a
            boolean r0 = X.C20120A8f.A07(r15)
            if (r0 == 0) goto L_0x006a
            X.20z r2 = (X.C438020z) r2
            java.lang.Integer r2 = r2.BXm()
            if (r2 == 0) goto L_0x006b
            int r1 = r2.intValue()
            X.2M2 r0 = new X.2M2
            r0.<init>(r3, r1)
        L_0x0047:
            java.util.List r8 = java.util.Collections.singletonList(r0)
            r13 = 1
            if (r2 != 0) goto L_0x0057
            r5 = 0
        L_0x004f:
            r7 = r17
            r9 = r18
            r4.A0Y(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0057:
            X.16v r5 = new X.16v
            r5.<init>()
            int r0 = r2.intValue()
            java.lang.Integer r1 = X.C72463Mc.A0k(r3, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r5.A00
            r0.put(r3, r1)
            goto L_0x004f
        L_0x006a:
            r2 = 0
        L_0x006b:
            X.205 r0 = r15.A0v
            r3 = r0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A33(X.206, X.206, X.206, int):void");
    }

    public void A38(AnonymousClass206 r7, String str, String str2) {
        C33251iW A0X2 = AnonymousClass3MX.A0X(this);
        AnonymousClass1BI r1 = this.A3R;
        C17960vV.A07(r1);
        C438721g r3 = new C438721g(C17880vN.A0Z(r1, A0X2.A0x), AnonymousClass11P.A01(A0X2.A0K));
        A0X2.A10.A00(r3, r7);
        AE2 ae2 = new AE2((Integer) null, "menu_options", str2);
        C18070vi.A0d(str, 1);
        r3.A00 = new C20268AEb((AnonymousClass9Je) null, ae2, str);
        A0X2.A0b(r3);
        A0X2.A0U.BBM(r3);
    }

    public void A39(AnonymousClass206 r20, boolean z) {
        MentionableEntry mentionableEntry = this.A3Z;
        AnonymousClass02B r1 = this.A0e;
        KeyboardPopupLayout keyboardPopupLayout = this.A1M;
        ConversationListView conversationListView = this.A2B;
        ViewGroup viewGroup = this.A0U;
        ViewGroup viewGroup2 = this.A0S;
        ViewGroup viewGroup3 = this.A0T;
        AnonymousClass724 r3 = (AnonymousClass724) this.A5f.get();
        AnonymousClass206 r4 = r20;
        if (r20 != null && !A3H() && mentionableEntry != null) {
            if (r1 != null) {
                r1.A05();
            }
            this.A2b.A0b(r4);
            View view = this.A0Q;
            if (view == null) {
                view = new AnonymousClass3Pb(AnonymousClass3MW.A0P(this), new C21472Akd(this, viewGroup3, keyboardPopupLayout, conversationListView, viewGroup, viewGroup2, 11));
                this.A0Q = view;
                if (viewGroup3 != null) {
                    viewGroup3.addView(view);
                }
            }
            ((C139546z1) this.A5z.get()).A01(view, r3, r4, new C135486sH(this.A3R, false, false));
            boolean z2 = false;
            ConversationListView conversationListView2 = this.A2B;
            if (conversationListView2 != null) {
                z2 = conversationListView2.A0D(0);
            }
            C17960vV.A0F(AnonymousClass000.A1W(viewGroup3), "quotedContainerViewGroup is null");
            if (z || viewGroup3 == null) {
                keyboardPopupLayout.setClipChildren(false);
                int transcriptMode = conversationListView.getTranscriptMode();
                if (z2) {
                    conversationListView.setTranscriptMode(2);
                } else {
                    conversationListView.setTranscriptMode(0);
                }
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    viewGroup3.getViewTreeObserver().addOnGlobalLayoutListener(new C90544eF(view, viewGroup3, viewGroup, conversationListView, keyboardPopupLayout, transcriptMode, z2));
                    return;
                }
                return;
            }
            viewGroup3.setVisibility(0);
        }
    }

    public void A3A(C441822l r4) {
        if (C18020vd.A05(C18040vf.A02, this.A3F, 11089) && r4.A1L() && !r4.A0v.A02) {
            this.A2Y.A0V(4);
        }
    }

    public void A3B(C441822l r4, long j, boolean z) {
        if (z) {
            this.A08 = r4.A0x;
        }
        if (j == 0) {
            this.A2B.removeCallbacks(this.A6O);
        }
        C98704ra r1 = new C98704ra(this, r4, 24);
        this.A6O = r1;
        this.A2B.postDelayed(r1, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (X.C40811vJ.A0X(r1) != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3C(X.C178119Bw r6) {
        /*
            r5 = this;
            r4 = 9
            X.1VP r3 = r5.A1k
            X.1FY r2 = X.AnonymousClass3MW.A0P(r5)
            X.0ve r1 = r5.A3F
            boolean r0 = r6.A0W()
            if (r0 == 0) goto L_0x0017
            boolean r1 = X.C40811vJ.A0X(r1)
            r0 = 1
            if (r1 == 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.BhC(r2, r6, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A3C(X.9Bw):void");
    }

    public void A3E(boolean z) {
        AnonymousClass1BI r1;
        LockableCoodinatorLayout lockableCoodinatorLayout;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View.OnClickListener onClickListener;
        this.A6h = z;
        C75433hU r4 = this.A23;
        if (r4 != null) {
            boolean z2 = !z;
            if (r4 instanceof C77803rV) {
                r4.A03.findViewById(2131428012).setClickable(z2);
                View findViewById = r4.A03.findViewById(2131437074);
                if (findViewById != null) {
                    findViewById.setVisibility(C72453Mb.A07(z2));
                }
            } else {
                View view = r4.A01;
                if (view != null) {
                    C18070vi.A05(r4.A01(), 2131437074).setVisibility(C72453Mb.A07(z2 ? 1 : 0));
                    if (z2) {
                        onClickListener = r4.A0T;
                    } else {
                        onClickListener = null;
                    }
                    view.setOnClickListener(onClickListener);
                    view.setClickable(z2);
                }
            }
        }
        if (z) {
            r1 = this.A3R;
        } else {
            r1 = null;
        }
        C24001Il A0j2 = AnonymousClass3Ma.A0j(this);
        if (A0j2.A0A()) {
            A0j2.notifyAllObservers(new C97004ol(C72463Mc.A0n(r1), 0));
        }
        View findViewById2 = this.A2Q.findViewById(2131435555);
        if (findViewById2 != null) {
            AnonymousClass3MW.A0p(findViewById2).A04(C72453Mb.A07(z ? 1 : 0));
        }
        if (this.A27 != null) {
            if (this.A6h) {
                i = C72463Mc.A0I(this).getDimensionPixelOffset(2131166323);
                i2 = C72463Mc.A0I(this).getDimensionPixelOffset(2131166324);
                i3 = C72463Mc.A0I(this).getDimensionPixelOffset(2131166325);
                i4 = C72463Mc.A0I(this).getDimensionPixelOffset(2131166326);
                i5 = C72463Mc.A0I(this).getDimensionPixelOffset(2131166327);
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            C85814Ov r0 = this.A27;
            C18000vb r42 = r0.A05;
            View view2 = r0.A02;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                i6 = 0;
            } else {
                i6 = marginLayoutParams.topMargin;
            }
            C27641Ww.A06(view2, r42, i2, i6, i3, i);
            if (this.A4b.A00 != null) {
                C18000vb r5 = this.A2k;
                ViewGroup viewGroup = this.A0U;
                C27641Ww.A07(viewGroup, r5, viewGroup.getPaddingLeft(), this.A0U.getPaddingTop(), this.A0U.getPaddingRight(), i4);
            }
            A0N(i5);
            Resources A0I2 = C72463Mc.A0I(this);
            int i7 = 2131167148;
            if (this.A6h) {
                i7 = 2131166322;
            }
            int dimensionPixelOffset = A0I2.getDimensionPixelOffset(i7);
            FrameLayout frameLayout = this.A27.A03;
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = dimensionPixelOffset;
                frameLayout.setLayoutParams(marginLayoutParams2);
            } else {
                throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        AnonymousClass3M7 r02 = ((AnonymousClass17U) this.A1s).A00;
        if (r02 != null) {
            r02.setShouldShowGenericContactOrGroupName(z);
        }
        if (A26(this) && (lockableCoodinatorLayout = this.A1N) != null) {
            lockableCoodinatorLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C90414e2(this, 0, true));
        }
    }

    public void A3F(boolean z) {
        C108405be r1;
        AnonymousClass1E7 r2 = this.A35;
        if (r2 == null) {
            Log.e("conversation/window-focus-changed/no contact");
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("conversation/window-focus-changed ");
        A102.append(r2.A0J);
        C17900vP.A0n(" ", A102, z);
        if (z) {
            AnonymousClass3MW.A0P(this).getWindow().clearFlags(DefaultCrypto.BUFFER_SIZE);
            this.A2E.A00(AnonymousClass1E7.A00(this.A35), 1, 3, true, true, false);
            if (C22971Dz.A0d(this.A3R)) {
                this.A4c.CGS(new C98794rj(this, 18), "BizIntegritySignalsManager");
            }
            if (this.A6w) {
                this.A3d.A08();
                this.A6w = false;
            }
            this.A2B.A03();
            return;
        }
        C31191fA A0Y2 = AnonymousClass3MW.A0Y(this.A52);
        AnonymousClass1BI r12 = this.A3R;
        C18070vi.A0d(r12, 0);
        if (A0Y2.A05.A0S(r12)) {
            AnonymousClass3MW.A0P(this).getWindow().setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
        }
        ConversationListView conversationListView = this.A2B;
        int childCount = conversationListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = conversationListView.getChildAt(i);
            if ((childAt instanceof C108405be) && (r1 = (C108405be) childAt) != null) {
                r1.COV();
            }
        }
    }

    public boolean A3G() {
        AnonymousClass74M r0 = this.A4h;
        if (r0 == null || r0.A0J == null) {
            return false;
        }
        return true;
    }

    public boolean A3H() {
        C73293Ub r0 = this.A2X;
        if (!r0.A04.A00(r0.A00, r0.A05)) {
            return false;
        }
        return true;
    }

    public boolean A3I() {
        Number number = (Number) this.A2J.A01.A06();
        if (number != null && number.intValue() == 1) {
            return true;
        }
        Number number2 = (Number) this.A2J.A01.A06();
        if (number2 == null || number2.intValue() != 3) {
            return false;
        }
        return true;
    }

    public boolean A3J() {
        if (this.A0e == null) {
            this.A2Q.BLL();
            AnonymousClass3MX.A0w(this).CGN(new C98704ra(this, this.A2N.A00.A0B(this.A3R), 29));
            if (this.A2Z == null) {
                AnonymousClass1FD viewModelStoreOwner = this.A2Q.getViewModelStoreOwner();
                AnonymousClass2XT r8 = this.A2P.A07;
                AnonymousClass1BI r7 = this.A3R;
                Intent intent = this.A0B;
                C73103Oz A0c2 = AnonymousClass3MX.A0c(this);
                C18070vi.A0d(r8, 0);
                C18070vi.A0o(r7, intent, A0c2);
                AnonymousClass3UY r3 = (AnonymousClass3UY) new C24071It(new C91714g8(A0c2, r7, r8, intent, 2), viewModelStoreOwner).A00(AnonymousClass3UY.class);
                this.A2Z = r3;
                AnonymousClass1F9 A0P2 = AnonymousClass3MX.A0P(this);
                C91594fw r1 = new C91594fw(this, 48);
                C18070vi.A0d(A0P2, 0);
                r3.A04.A0A(A0P2, r1);
                AnonymousClass3UY r0 = this.A2Z;
                AnonymousClass1F9 A0P3 = AnonymousClass3MX.A0P(this);
                C91604fx r12 = new C91604fx(this, 0);
                C18070vi.A0d(A0P3, 0);
                r0.A07.A0A(A0P3, r12);
                AnonymousClass3UY r32 = this.A2Z;
                AnonymousClass1F9 A0P4 = AnonymousClass3MX.A0P(this);
                C91604fx r13 = new C91604fx(this, 1);
                C18070vi.A0d(A0P4, 0);
                r32.A08.A0A(A0P4, r13);
                AnonymousClass3UY r02 = this.A2Z;
                AnonymousClass1F9 A0P5 = AnonymousClass3MX.A0P(this);
                C91604fx r14 = new C91604fx(this, 2);
                C18070vi.A0d(A0P5, 0);
                r02.A0A.A0A(A0P5, r14);
                AnonymousClass3UY r33 = this.A2Z;
                AnonymousClass1F9 A0P6 = AnonymousClass3MX.A0P(this);
                C91604fx r15 = new C91604fx(this, 3);
                C18070vi.A0d(A0P6, 0);
                r33.A09.A0A(A0P6, r15);
            }
            if (!C72473Md.A1V(this)) {
                AnonymousClass1GP A0K2 = AnonymousClass3MW.A0K(this);
                Fragment A0Q2 = A0K2.A0Q("search_fragment_conversation");
                C28931bI r03 = this.A4Y;
                if (r03 != null) {
                    r03.A04(0);
                }
                if (A0Q2 == null && !AnonymousClass3MW.A0P(this).isFinishing() && !AnonymousClass3MW.A0P(this).isDestroyed()) {
                    A0Q2 = new ConversationSearchFragment();
                    C34001jj r16 = new C34001jj(A0K2);
                    r16.A0G = true;
                    r16.A0D(A0Q2, "search_fragment_conversation", 2131434890);
                    r16.A0H("search_fragment_conversation");
                    r16.A01();
                    A0K2.A0Z();
                }
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) A0Q2;
                AnonymousClass3UY r04 = this.A2Z;
                C18070vi.A0d(r04, 0);
                conversationSearchFragment.A02 = r04;
                WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A02();
                }
                DatePickerDialog.OnDateSetListener onDateSetListener = this.A7s;
                C18070vi.A0d(onDateSetListener, 0);
                conversationSearchFragment.A00 = onDateSetListener;
                A1N(this, this.A00);
            } else {
                AnonymousClass02H r17 = this.A0d;
                if (r17 == null) {
                    r17 = new C91094f8(this, 2);
                    this.A0d = r17;
                }
                this.A0e = this.A2Q.COJ(r17);
            }
            AnonymousClass74M r18 = this.A4h;
            if (r18 == null || (r18.A0J == null && !r18.A0a())) {
                AnonymousClass3MZ.A1S(this);
                A1w(this);
            }
            if (!C72463Mc.A1R(this)) {
                InputMethodManager A0N2 = this.A2Q.getSystemServices().A0N();
                C17960vV.A07(A0N2);
                A0N2.toggleSoftInput(0, 0);
            }
            C74863d2 r05 = this.A24.A02;
            if (r05 != null && r05.isShowing()) {
                this.A24.A0K();
            }
        }
        return false;
    }

    public boolean A3K(int i, KeyEvent keyEvent) {
        AnonymousClass74M r0;
        Iterator it = this.A8H.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (!keyEvent.isPrintingKey() || !this.A3Z.isShown() || this.A3Z.hasFocus() || !((r0 = this.A4h) == null || r0.A0J == null)) {
            AnonymousClass1E7 r02 = this.A35;
            if (r02 != null && C22971Dz.A0V(r02.A0J) && this.A7T && (i == 24 || i == 25)) {
                AnonymousClass4MQ r1 = (AnonymousClass4MQ) AnonymousClass3Ma.A0Y(this).A0L.get();
                C48002Ku r4 = r1.A00;
                if (r4.size() > 0) {
                    C19830z4 r2 = r1.A01;
                    if (C17890vO.A0B(r2).getBoolean("is_last_video_autoplay_mute", true)) {
                        C17880vN.A1F(C19830z4.A00(r2), "is_last_video_autoplay_mute", false);
                        C17890vO.A0q(r4, 11);
                        return true;
                    }
                }
            }
            return this.A2Q.C7u(i, keyEvent);
        }
        this.A3Z.requestFocus();
        this.A3Z.dispatchKeyEvent(keyEvent);
        return true;
    }

    public boolean A3L(int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (A23(this)) {
                this.A0i.A0W(5);
                this.A6v = false;
                A15(this);
                return false;
            } else if (!A26(this) && A1w(this)) {
                return false;
            } else {
                if (C87544Vz.A01(this.A3F) && this.A24.A0K()) {
                    return false;
                }
            }
        }
        if (this.A6l) {
            if (i == 23) {
                if (keyEvent.getAction() == 1 && A3G()) {
                    AnonymousClass74M r1 = this.A4h;
                    if (!r1.A0w.A0B) {
                        r1.A0Z(true, this.A6g);
                        return true;
                    }
                }
            } else if (A3G()) {
                AnonymousClass74M r12 = this.A4h;
                if (!r12.A0w.A0B) {
                    if (i == 19) {
                        r12.A0Y(this.A6g, false);
                        return true;
                    } else if (i == 21) {
                        r12.A0Z(false, this.A6g);
                        return true;
                    }
                }
            }
        }
        return this.A2Q.C7v(i, keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014b, code lost:
        if (r10.A0i.A0J != 2) goto L_0x0133;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A3M(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.String r3 = "conversation/dispatch-touch-event "
            X.3Oz r0 = X.AnonymousClass3MX.A0c(r10)
            boolean r0 = r0.A0E
            r2 = 0
            if (r0 == 0) goto L_0x0019
            X.5cQ r0 = r10.A2Q
            X.1f4 r0 = r0.getMessageAudioPlayerProvider()
            X.7Mo r0 = r0.A00
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            return r2
        L_0x001a:
            X.CIZ r0 = r10.A0g
            r1 = 1
            if (r0 == 0) goto L_0x0028
            android.view.GestureDetector r0 = r0.A00
            boolean r0 = r0.onTouchEvent(r11)
            if (r0 == 0) goto L_0x0028
            return r1
        L_0x0028:
            boolean r0 = r10.A6r
            if (r0 == 0) goto L_0x004d
            X.00H r0 = r10.A6C
            java.lang.Object r6 = r0.get()
            X.4Km r6 = (X.C84694Km) r6
            r5 = 0
            com.whatsapp.conversation.ConversationListView r0 = r10.A2B
            if (r0 == 0) goto L_0x003d
            boolean r5 = r0.A0D(r2)
        L_0x003d:
            android.view.View r0 = r10.A0D
            int r4 = r0.getHeight()
            X.C18070vi.A0d(r11, r2)
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r0 = r6.A00
            if (r0 == 0) goto L_0x004d
            r0.A09(r11, r4, r5)
        L_0x004d:
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x0059
            X.4Ol r0 = X.C87724Ws.A00(r10)
            r0.A04 = r2
        L_0x0059:
            boolean r0 = A26(r10)
            if (r0 != 0) goto L_0x009c
            X.3xv r0 = r10.A3L
            if (r0 == 0) goto L_0x009c
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x009c
            android.view.View r0 = r10.A0D
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x009c
            android.view.View r0 = r10.A0D
            int[] r6 = r10.A8I
            r0.getLocationOnScreen(r6)
            float r4 = r11.getRawY()
            r0 = r6[r1]
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x009c
            float r5 = r11.getRawY()
            r4 = r6[r1]
            android.view.View r0 = r10.A0D
            int r0 = X.AnonymousClass3MW.A02(r0, r4)
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x014e
            r10.A7W = r1
        L_0x009c:
            int r0 = r11.getActionMasked()
            r4 = 2
            if (r0 == r4) goto L_0x0166
            int r0 = r11.getActionMasked()
            if (r0 == r1) goto L_0x0166
            boolean r0 = A26(r10)
            if (r0 == 0) goto L_0x0166
            float r9 = r11.getX()
            float r8 = r11.getY()
            com.whatsapp.mentions.MentionableEntry r0 = r10.A3Z
            if (r0 == 0) goto L_0x0166
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0166
            int[] r1 = new int[r4]
            com.whatsapp.mentions.MentionableEntry r0 = r10.A3Z
            r0.getLocationInWindow(r1)
            r6 = r1[r2]
            r7 = 1
            r1 = r1[r7]
            boolean r0 = r10.A6h
            if (r0 == 0) goto L_0x00ef
            X.5cQ r5 = r10.A2Q
            r0 = 2131435555(0x7f0b2023, float:1.8492955E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x00ef
            X.1bI r0 = X.AnonymousClass3MW.A0p(r0)
            int[] r5 = new int[r4]
            android.view.View r0 = r0.A02()
            r0.getLocationInWindow(r5)
            r0 = r5[r2]
            int r6 = r6 - r0
            r0 = r5[r7]
            int r1 = r1 - r0
        L_0x00ef:
            float r0 = (float) r6
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0166
            com.whatsapp.mentions.MentionableEntry r0 = r10.A3Z
            int r0 = r0.getWidth()
            int r6 = r6 + r0
            float r0 = (float) r6
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0166
            float r0 = (float) r1
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0166
            com.whatsapp.mentions.MentionableEntry r0 = r10.A3Z
            int r0 = X.AnonymousClass3MW.A02(r0, r1)
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0166
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r10.A0i
            if (r0 == 0) goto L_0x0166
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r10.A3D
            if (r0 == 0) goto L_0x0166
            com.whatsapp.KeyboardPopupLayout r0 = r10.A1M
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x0019
            boolean r0 = A26(r10)
            if (r0 == 0) goto L_0x0137
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r10.A39
            if (r0 == 0) goto L_0x0137
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0137
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r10.A39
            r0.A03()
        L_0x0133:
            A1A(r10)
            goto L_0x0166
        L_0x0137:
            boolean r0 = A26(r10)
            if (r0 == 0) goto L_0x0166
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r10.A3D
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0166
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r10.A0i
            int r0 = r0.A0J
            if (r0 == r4) goto L_0x0166
            goto L_0x0133
        L_0x014e:
            int r0 = r11.getAction()
            if (r0 != r1) goto L_0x009c
            boolean r0 = r10.A7W
            if (r0 == 0) goto L_0x0162
            X.3xv r0 = r10.A3L
            r0.A00(r1)
            android.view.View r0 = r10.A0D
            r0.requestFocus()
        L_0x0162:
            r10.A7W = r2
            goto L_0x009c
        L_0x0166:
            X.5cQ r0 = r10.A2Q     // Catch:{ ActivityNotFoundException -> 0x0172, ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x016d }
            boolean r0 = r0.COm(r11)     // Catch:{ ActivityNotFoundException -> 0x0172, ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x016d }
            return r0
        L_0x016d:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            return r2
        L_0x0172:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            X.1KB r1 = X.AnonymousClass3MX.A0U(r10)
            r0 = 2131886448(0x7f120170, float:1.9407475E38)
            r1.A08(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A3M(android.view.MotionEvent):boolean");
    }

    public boolean A3N(AnonymousClass206 r4) {
        if (this.A2Q.getSeenMessages().contains(r4.A0v)) {
            return false;
        }
        C73103Oz A0c2 = AnonymousClass3MX.A0c(this);
        if (A0c2.A05(r4) > A0c2.A04()) {
            return true;
        }
        return A0c2.A07.contains(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r0 == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        if (A2G(r0, r4, r11, r6) != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009f, code lost:
        if ((r4 instanceof X.C441822l) == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        if (r0 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a5, code lost:
        r1 = r11 instanceof X.C441822l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a7, code lost:
        if (r1 == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ab, code lost:
        if ((r4 instanceof X.C440922c) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00af, code lost:
        if ((r4 instanceof X.C441822l) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b3, code lost:
        if ((r11 instanceof X.C440922c) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b5, code lost:
        A2M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b8, code lost:
        if (r1 == false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00bc, code lost:
        if ((r4 instanceof X.C441822l) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00be, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bf, code lost:
        r15 = X.AnonymousClass70T.A01(X.AnonymousClass3MX.A0h(r8));
        r9 = X.C87724Ws.A00(r8);
        r3 = true;
        r9.A03 = true;
        r9.A04 = true;
        r12 = r11;
        r0 = r8.A2Q;
        r10 = r0.getMessageAudioPlayerFactory().A01(r0.CFa(), r19, true);
        r10.A0K = r12;
        r10.A08 = 1;
        r1 = r12.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ed, code lost:
        if (r1 == 9) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f1, code lost:
        if (r1 == 10) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f3, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f4, code lost:
        r10.A0Q = r3;
        r10.A0G = new X.C94914lO(r10, r8, r12);
        r4 = X.AnonymousClass3MW.A0P(r8);
        r6 = X.AnonymousClass3MX.A0U(r8);
        r1 = r8.A4c;
        r5 = r1;
        r1.CGF(new X.AnonymousClass7Q7(r4, r5, r6, new X.AnonymousClass3CS(r8, r9, r10, r11, r12, r13, 2, r15), r9.A00, 18));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        if (A2G(r0, r4, r11, r6) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0146, code lost:
        if ((r11 instanceof X.C440922c) == false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0148, code lost:
        r3 = r4 instanceof X.C441822l;
        r0 = X.AnonymousClass3MX.A0d(r8.A5t);
        r1 = r11.A0v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0152, code lost:
        if (r3 == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0154, code lost:
        X.C18070vi.A0d(r1, 0);
        r0.A00 = null;
        r0.A02 = true;
        r0.A03.A0F(r1);
        A30(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0163, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0164, code lost:
        r0.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0166, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A3O(X.AnonymousClass206 r17, boolean r18, boolean r19) {
        /*
            r16 = this;
            r4 = r17
            r8 = r16
            X.3Oz r5 = X.AnonymousClass3MX.A0c(r8)
            android.database.Cursor r0 = r5.getCursor()
            r11 = 0
            if (r0 == 0) goto L_0x0037
            int r3 = r5.getCount()
            int r0 = r5.A05(r4)
            if (r0 < 0) goto L_0x0037
            int r2 = r0 + 1
            X.206 r11 = r5.getItem(r2)
        L_0x001f:
            if (r2 > r3) goto L_0x0037
            if (r11 == 0) goto L_0x0037
            X.205 r0 = r11.A0v
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x002f
            int r1 = r11.A0u
            r0 = 10
            if (r1 != r0) goto L_0x0037
        L_0x002f:
            int r0 = r2 + 1
            X.206 r11 = r5.getItem(r2)
            r2 = r0
            goto L_0x001f
        L_0x0037:
            X.4Ol r3 = X.C87724Ws.A00(r8)
            r5 = 0
            if (r11 != 0) goto L_0x0040
            r3.A03 = r5
        L_0x0040:
            boolean r0 = r3.A03
            r13 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0170
            X.C18070vi.A0d(r4, r5)
            X.C18070vi.A0d(r11, r2)
            X.11C r0 = r3.A01
            if (r0 == 0) goto L_0x0167
            android.view.accessibility.AccessibilityManager r6 = r0.A0M()
            X.0ve r1 = r3.A02
            if (r1 == 0) goto L_0x016a
            r0 = 1154(0x482, float:1.617E-42)
            X.0vf r7 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r7, r1, r0)
            if (r0 != 0) goto L_0x006b
            if (r6 == 0) goto L_0x006b
            boolean r0 = r6.isTouchExplorationEnabled()
            r6 = 0
            if (r0 != 0) goto L_0x006c
        L_0x006b:
            r6 = 1
        L_0x006c:
            X.0ve r1 = r3.A02
            if (r1 == 0) goto L_0x016a
            r0 = 7401(0x1ce9, float:1.0371E-41)
            boolean r0 = X.C18020vd.A05(r7, r1, r0)
            if (r0 == 0) goto L_0x013a
            if (r6 == 0) goto L_0x0136
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
        L_0x007c:
            int r1 = r0.intValue()
            r6 = r18
            if (r1 == r5) goto L_0x0128
            if (r1 == r2) goto L_0x011c
            r0 = 2
            if (r1 != r0) goto L_0x0170
            X.0ve r0 = r3.A02
            if (r0 == 0) goto L_0x016a
            boolean r0 = X.C83934Hf.A00(r0, r4, r11, r6)
            if (r0 != 0) goto L_0x009d
            X.0ve r0 = r3.A02
            if (r0 == 0) goto L_0x016a
            boolean r0 = A2G(r0, r4, r11, r6)
            if (r0 == 0) goto L_0x0170
        L_0x009d:
            boolean r0 = r4 instanceof X.C441822l
            if (r0 != 0) goto L_0x00a5
        L_0x00a1:
            boolean r0 = r4 instanceof X.C440922c
        L_0x00a3:
            if (r0 == 0) goto L_0x0170
        L_0x00a5:
            boolean r1 = r11 instanceof X.C441822l
            if (r1 == 0) goto L_0x00ad
            boolean r0 = r4 instanceof X.C440922c
            if (r0 != 0) goto L_0x00b5
        L_0x00ad:
            boolean r0 = r4 instanceof X.C441822l
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r11 instanceof X.C440922c
            if (r0 == 0) goto L_0x00b8
        L_0x00b5:
            r8.A2M()
        L_0x00b8:
            if (r1 == 0) goto L_0x0144
            boolean r0 = r4 instanceof X.C441822l
            if (r0 == 0) goto L_0x00bf
            r13 = r4
        L_0x00bf:
            X.0ve r0 = X.AnonymousClass3MX.A0h(r8)
            boolean r15 = X.AnonymousClass70T.A01(r0)
            X.4Ol r9 = X.C87724Ws.A00(r8)
            r3 = 1
            r9.A03 = r2
            r9.A04 = r2
            r12 = r11
            X.22l r12 = (X.C441822l) r12
            X.5cQ r0 = r8.A2Q
            X.6qC r1 = r0.getMessageAudioPlayerFactory()
            X.1FY r0 = r0.CFa()
            r4 = r19
            X.7Mo r10 = r1.A01(r0, r4, r2)
            r10.A0K = r12
            r10.A08 = r2
            int r1 = r12.A0D()
            r0 = 9
            if (r1 == r0) goto L_0x00f4
            r0 = 10
            if (r1 == r0) goto L_0x00f4
            r3 = 0
        L_0x00f4:
            r10.A0Q = r3
            X.4lO r0 = new X.4lO
            r0.<init>(r10, r8, r12)
            r10.A0G = r0
            X.1FY r4 = X.AnonymousClass3MW.A0P(r8)
            X.1KB r6 = X.AnonymousClass3MX.A0U(r8)
            X.10I r1 = r8.A4c
            int r0 = r9.A00
            r14 = 2
            X.3CS r7 = new X.3CS
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r9 = 18
            X.7Q7 r3 = new X.7Q7
            r5 = r1
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.CGF(r3)
            return r2
        L_0x011c:
            X.0ve r0 = r3.A02
            if (r0 == 0) goto L_0x016a
            boolean r0 = A2G(r0, r4, r11, r6)
            if (r0 == 0) goto L_0x0170
            goto L_0x00a1
        L_0x0128:
            X.0ve r0 = r3.A02
            if (r0 == 0) goto L_0x016a
            boolean r0 = X.C83934Hf.A00(r0, r4, r11, r6)
            if (r0 == 0) goto L_0x0170
            boolean r0 = r4 instanceof X.C441822l
            goto L_0x00a3
        L_0x0136:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x007c
        L_0x013a:
            if (r6 == 0) goto L_0x0140
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x007c
        L_0x0140:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            goto L_0x007c
        L_0x0144:
            boolean r0 = r11 instanceof X.C440922c
            if (r0 == 0) goto L_0x019b
            boolean r3 = r4 instanceof X.C441822l
            X.00H r0 = r8.A5t
            X.16x r0 = X.AnonymousClass3MX.A0d(r0)
            X.205 r1 = r11.A0v
            if (r3 == 0) goto L_0x0164
            X.C18070vi.A0d(r1, r5)
            r0.A00 = r13
            r0.A02 = r2
            X.1DT r0 = r0.A03
            r0.A0F(r1)
            r8.A30(r11)
            return r2
        L_0x0164:
            r0.A00 = r1
            return r2
        L_0x0167:
            java.lang.String r0 = "systemServices"
            goto L_0x016c
        L_0x016a:
            java.lang.String r0 = "abProps"
        L_0x016c:
            X.C18070vi.A11(r0)
            throw r13
        L_0x0170:
            boolean r0 = r4 instanceof X.C441822l
            if (r0 == 0) goto L_0x019b
            r3.A03 = r5
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0197
            X.1FY r6 = X.AnonymousClass3MW.A0P(r8)
            X.10I r1 = r8.A4c
            int r0 = r3.A00
            X.C83924He.A00(r6, r1, r0)
            X.22l r4 = (X.C441822l) r4
            X.5cQ r0 = r8.A2Q
            X.18O r1 = r0.getServerProps()
            X.18Q r0 = X.AnonymousClass18O.A0n
            int r0 = r1.A04(r0)
            long r0 = (long) r0
            r8.A3B(r4, r0, r2)
        L_0x0197:
            r3.A04 = r5
            r8.A3z = r13
        L_0x019b:
            r8.A2M()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A3O(X.206, boolean, boolean):boolean");
    }

    public static float A00(AnonymousClass4aY r2) {
        return Settings.Global.getFloat(AnonymousClass3MW.A0P(r2).getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static int A01(AnonymousClass4aY r1) {
        if (A1y(r1)) {
            return 6;
        }
        if (C22971Dz.A0S(r1.A3R)) {
            return 9;
        }
        if (AnonymousClass3MZ.A1W(r1)) {
            return 5;
        }
        return 0;
    }

    public static int A02(AnonymousClass4aY r4) {
        AnonymousClass1HO A0C2;
        int i = 0;
        if (!C72463Mc.A1R(r4)) {
            return 0;
        }
        Activity activity = (Activity) C008803x.A00(r4.A0C.getContext());
        if (!(activity == null || (A0C2 = AnonymousClass1HF.A0C(AnonymousClass3MZ.A0F(activity))) == null)) {
            i = A0C2.A07(8).A00 - A0C2.A07(2).A00;
        }
        int height = r4.A0C.getRootView().getHeight();
        if (i <= 0) {
            Rect A072 = AnonymousClass3MW.A07();
            r4.A0C.getWindowVisibleDisplayFrame(A072);
            i = height - A072.bottom;
            if (i <= 0) {
                return r4.A0C.getResources().getDimensionPixelOffset(2131166738);
            }
        }
        return Math.max(i, (int) (((float) height) * 0.3f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r0 == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C95134lk A04(X.AnonymousClass4aY r4) {
        /*
            boolean r0 = A1y(r4)
            if (r0 != 0) goto L_0x003f
            X.5cQ r0 = r4.A2Q
            X.4S9 r2 = r0.getSelectedMessages()
            if (r2 == 0) goto L_0x004c
            java.util.HashMap r0 = r2.A03
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x004c
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r4)
            X.00H r0 = r0.A0C
            r0.get()
            java.util.Collection r0 = r2.A00()
            java.util.Iterator r0 = r0.iterator()
            X.206 r3 = X.C17880vN.A0Y(r0)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r2 = X.C87494Vu.A01(r3)
            r0 = 8388608(0x800000, double:4.144523E-317)
            boolean r0 = r3.A11(r0)
            if (r2 != 0) goto L_0x003f
            if (r0 == 0) goto L_0x004c
        L_0x003f:
            X.1Ps r0 = X.C72483Me.A0S(r4)
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.4lk r0 = (X.C95134lk) r0
            return r0
        L_0x004c:
            X.4lk r0 = new X.4lk
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A04(X.4aY):X.4lk");
    }

    public static Integer A09(AnonymousClass4aY r2) {
        if (!A1y(r2) || !C72483Me.A0S(r2).A0E(r2.A3R)) {
            return null;
        }
        return C17880vN.A0h();
    }

    public static Integer A0A(AnonymousClass4aY r4) {
        int i;
        if (!A25(r4)) {
            return null;
        }
        C77873rd r0 = C72473Md.A0Q(r4).A00;
        if (r0 != null) {
            i = r0.A05.A04.size();
        } else {
            i = 0;
        }
        return Integer.valueOf(C18020vd.A00(C18040vf.A01, C72473Md.A0R(r4).A00, 8685) - i);
    }

    private HashSet A0B() {
        HashSet A122 = C17880vN.A12();
        boolean A0C2 = C72473Md.A0R(this).A0C();
        if (A22(this)) {
            if (C18020vd.A05(C18040vf.A01, C72473Md.A0R(this).A00, 8200)) {
                A122.add(AnonymousClass4YH.A02);
            }
            if (A0C2) {
                A122.add(AnonymousClass4YH.A03);
            }
        }
        C25811Ps A0S2 = C72483Me.A0S(this);
        if (A0S2.A00.A01(this.A3R) && A0C2) {
            A122.add(AnonymousClass4YH.A03);
        }
        return A122;
    }

    private void A0D() {
        HashSet A0B2 = A0B();
        AnonymousClass3V2 r0 = this.A1g;
        if ((r0 == null || !r0.A07.equals(A0B2)) && !A0B2.isEmpty()) {
            AnonymousClass1FD viewModelStoreOwner = this.A2Q.getViewModelStoreOwner();
            AnonymousClass2XL r4 = AnonymousClass3MZ.A0k(this).A04;
            AnonymousClass1BI r5 = this.A3R;
            C446324e r6 = this.A0s;
            C18070vi.A0h(r4, r5);
            this.A1g = (AnonymousClass3V2) new C24071It(new C91714g8(r4, r5, r6, A0B2, 0), viewModelStoreOwner).A00(AnonymousClass3V2.class);
        }
    }

    private void A0F() {
        if (AnonymousClass3Ma.A0j(this).A0A()) {
            this.A64.get();
            AnonymousClass1FY A0P2 = AnonymousClass3MW.A0P(this);
            Intent intent = this.A0B;
            C18070vi.A0h(A0P2, intent);
            Intent A022 = AnonymousClass1LU.A02(A0P2);
            A022.setData(intent.getData());
            A022.putExtras(intent);
            A022.putExtra("primary_container_class", "com.whatsapp.HomeActivity");
            A022.putExtra("secondary_container_class", "com.whatsapp.Conversation");
            AnonymousClass3Ma.A1H(this.A2Q.getWindow(), 0);
            this.A2Q.startActivity(A022);
        }
    }

    private void A0J() {
        C28281Zt.A04(AnonymousClass3MW.A0P(this));
        View A022 = this.A4a.A02();
        this.A0P = A022;
        A022.setVisibility(0);
        if (this.A6c) {
            A0U(AnonymousClass1HF.A0C(this.A2Q.getWindow().getDecorView()), this);
        }
        AnonymousClass1HF.A0g(this.A0R, new C91324fV(this, 0));
    }

    private void A0M(int i) {
        TelephonyManager A0K2;
        if (A22(this) && C72473Md.A0R(this).A0F() && !((C219217x) this.A6F.get()).A0J() && (A0K2 = this.A2Q.getSystemServices().A0K()) != null) {
            A0K2.listen(this.A7a, i);
        }
    }

    public static /* synthetic */ void A0S(ViewGroup viewGroup) {
        if (AnonymousClass112.A00()) {
            viewGroup.setAccessibilityTraversalBefore(16908298);
        }
    }

    public static void A0c(AnonymousClass4aY r2) {
        AnonymousClass8oR A022;
        UserJid A0j2 = AnonymousClass3MW.A0j(r2);
        if (A0j2 != null && (A022 = ((C30751eS) r2.A5H.get()).A02(A0j2)) != null) {
            ((C30741eR) r2.A5H.get()).A00(A022);
        }
    }

    public static void A0j(AnonymousClass4aY r3) {
        AnonymousClass73Z r2 = (AnonymousClass73Z) AnonymousClass3MZ.A0k(r3).A0A.get();
        if (r2.A00 == null) {
            r2.A00 = new C93074iO(r3, 3);
        }
    }

    public static void A0m(AnonymousClass4aY r3) {
        C85834Ox r0 = (C85834Ox) C72473Md.A0f(r3);
        if (r0 != null) {
            AnonymousClass4VR r1 = r3.A2q;
            boolean z = r0.A04;
            AnonymousClass1BI r02 = r1.A0B;
            if (r02 != null) {
                AnonymousClass4XK.A00(r1.A0R, r02.getRawString(), 1, z);
            }
        }
    }

    public static void A0s(AnonymousClass4aY r5) {
        Fragment A0Q2;
        Window window;
        AnonymousClass1GP A0K2 = AnonymousClass3MW.A0K(r5);
        if (A0K2.A0K() == 1 && (A0Q2 = A0K2.A0Q("search_fragment_conversation")) != null && A0Q2.A1e()) {
            ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) AnonymousClass3MW.A0K(r5).A0Q("search_fragment_conversation");
            if (conversationSearchFragment != null) {
                AnonymousClass1FL A1B2 = conversationSearchFragment.A1B();
                if (!(A1B2 == null || (window = A1B2.getWindow()) == null)) {
                    C28281Zt.A0A(window, false);
                }
                AnonymousClass3UY r1 = conversationSearchFragment.A02;
                if (r1 != null) {
                    r1.A0U("");
                }
                WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A00();
                }
                WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
                if (wDSConversationSearchView2 != null) {
                    AnonymousClass4CA r12 = conversationSearchFragment.A07;
                    C18070vi.A0d(r12, 0);
                    wDSConversationSearchView2.A01.removeTextChangedListener(r12);
                }
            }
            AnonymousClass3MW.A0K(r5).A0v("search_fragment_conversation", 1);
            C72453Mb.A1M(r5.A4Y);
            A1N(r5, r5.A00);
            A1N(r5, r5.A00);
        }
        AnonymousClass1FY A0Q3 = AnonymousClass3MW.A0Q(r5);
        if (C72473Md.A1V(r5) && (A0Q3 instanceof C23251Fh)) {
            C23251Fh.A0V((C23251Fh) A0Q3, 0);
        }
        AnonymousClass3UY r13 = r5.A2Z;
        if (r13 != null) {
            r13.A01 = null;
            r13.A03 = null;
        }
        C72453Mb.A1M(r5.A4R);
        if (r5.A3H()) {
            r5.A3Z.A0H();
        } else {
            r5.A0D.setVisibility(0);
            r5.A3Z.requestFocus();
        }
        C73103Oz.A00(r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        if (r2 != null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A11(X.AnonymousClass4aY r8) {
        /*
            X.AnonymousClass3MZ.A1S(r8)
            X.4NE r7 = r8.A7J
            X.1E7 r6 = r8.A35
            X.4Ye r5 = A05(r8)
            X.4LP r4 = new X.4LP
            r4.<init>(r8)
            boolean r3 = X.C18070vi.A15(r6, r5)
            r5.A01(r3)
            r0 = 8
            r5.A02(r0)
            X.1bI r2 = r7.A00
            if (r2 != 0) goto L_0x0036
            r1 = 2131428231(0x7f0b0387, float:1.84781E38)
            android.view.View r0 = r5.A00
            X.C17960vV.A05(r0)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x0047
            X.1bI r2 = X.AnonymousClass3MW.A0p(r0)
        L_0x0032:
            r7.A00 = r2
            if (r2 == 0) goto L_0x003f
        L_0x0036:
            r1 = 3
            X.4qq r0 = new X.4qq
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r7, (java.lang.Object) r6, (int) r1)
            r2.A07(r0)
        L_0x003f:
            X.1bI r0 = r7.A00
            if (r0 == 0) goto L_0x0046
            r0.A04(r3)
        L_0x0046:
            return
        L_0x0047:
            r2 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A11(X.4aY):void");
    }

    public static void A18(AnonymousClass4aY r3) {
        A1b(r3, r3.A2Q.getString(2131891546), 2131232028);
        r3.A1r(20, (Integer) null, 32);
        A19(r3);
        C87684Wn r2 = r3.A4G;
        C87684Wn.A00(r2, 5);
        if (r2.A01) {
            r2.A00.CC7(new C80933yQ());
        }
    }

    public static void A19(AnonymousClass4aY r4) {
        C74863d2 r0;
        AnonymousClass3SU r2;
        if (C72463Mc.A1R(r4)) {
            r4.A1M.A09 = true;
            r4.A6e = true;
            r4.A73 = true;
            if (A24(r4) && (r2 = r4.A3P) != null) {
                r2.A02 = new C99144sL(r4, 47);
                r2.A01 = new C99144sL(r4, 48);
                r4.A2P();
            } else if (r4.A1u()) {
                A1O(r4, 0);
                A1k(r4, false);
                r4.A3D.post(new C98794rj(r4, 29));
            } else {
                r4.A2P();
                r4.A1M.postDelayed(new C98794rj(r4, 30), (long) ((int) (A00(r4) * 50.0f)));
                r4.A1M.postDelayed(new C98794rj(r4, 31), (long) ((int) (A00(r4) * 300.0f)));
            }
        } else {
            if (C87544Vz.A01(r4.A3F) && (r0 = r4.A24.A02) != null && r0.isShowing()) {
                r4.A1M.A09 = true;
                r4.A24.A0K();
            }
            A1k(r4, true);
            r4.A6v = true;
            C72453Mb.A1M(r4.A4Z);
        }
    }

    public static void A1C(AnonymousClass4aY r3) {
        r3.A2N();
        MentionableEntry mentionableEntry = r3.A3Z;
        if (mentionableEntry != null) {
            mentionableEntry.requestFocus();
        }
        C18030ve r1 = r3.A3F;
        C18070vi.A0d(r1, 0);
        int i = 2131232116;
        if (C25291Nq.A04(r1, 10925)) {
            i = 2131232331;
        }
        A1b(r3, r3.A1M.getResources().getString(2131890250), i);
        r3.A1M.getLayoutParams().height = -1;
        r3.A1M.requestLayout();
    }

    public static void A1D(AnonymousClass4aY r5) {
        boolean A202;
        if (A1y(r5)) {
            A202 = true;
        } else {
            A202 = A20(r5);
        }
        AnonymousClass1FY A0P2 = AnonymousClass3MW.A0P(r5);
        C18030ve r1 = r5.A3F;
        AnonymousClass1DC r0 = r5.A4L;
        C18000vb r3 = r5.A2k;
        if (A202) {
            View A002 = AnonymousClass6W9.A00(A0P2, r1, r0);
            if (A002.getVisibility() != 8) {
                A002.setVisibility(8);
                if (A002.getId() == 2131431646) {
                    View A0A2 = C110885hR.A0A(A0P2, 2131430490);
                    C27641Ww.A05(A0A2, r3, A0P2.getResources().getDimensionPixelSize(2131168777), A0A2.getPaddingEnd());
                    return;
                }
                return;
            }
            return;
        }
        View A003 = AnonymousClass6W9.A00(A0P2, r1, r0);
        if (A003.getVisibility() != 0) {
            A003.setVisibility(0);
            if (A003.getId() == 2131431646) {
                View A0A3 = C110885hR.A0A(A0P2, 2131430490);
                C27641Ww.A05(A0A3, r3, 0, A0A3.getPaddingEnd());
            }
        }
    }

    public static void A1L(AnonymousClass4aY r3, int i) {
        C28931bI r0;
        if (C18020vd.A05(C18040vf.A02, AnonymousClass3MX.A0h(r3), 834) && A2D(r3, i) && (r0 = r3.A4U) != null && r0.A01() != 8) {
            C19830z4 waSharedPreferences = r3.A2Q.getWaSharedPreferences();
            C17880vN.A1E(C19830z4.A00(waSharedPreferences), "payment_chat_composer_entry_nux_shown", r3.A2Q.getWaSharedPreferences().A0n());
            ObjectAnimator objectAnimator = r3.A09;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
        }
    }

    public static void A1M(AnonymousClass4aY r7, int i) {
        if (C18020vd.A05(C18040vf.A02, AnonymousClass3MX.A0h(r7), 834) && A2D(r7, i)) {
            if (!r7.A2Q.getWaSharedPreferences().A0n().equals(C17890vO.A0B(r7.A2Q.getWaSharedPreferences()).getString("payment_chat_composer_entry_nux_shown", ""))) {
                C28931bI r0 = r7.A4U;
                if (r0 != null) {
                    ObjectAnimator objectAnimator = r7.A09;
                    if (objectAnimator == null) {
                        objectAnimator = ObjectAnimator.ofPropertyValuesHolder(r0.A02(), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.4f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.4f}), PropertyValuesHolder.ofFloat("alpha", new float[]{0.4f, 0.0f})});
                        r7.A09 = objectAnimator;
                    }
                    objectAnimator.setDuration(1500);
                    r7.A09.setRepeatCount(-1);
                    r7.A09.setRepeatMode(1);
                    r7.A09.start();
                    return;
                }
                return;
            }
            A1L(r7, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (((X.C88204Ys) r4.A0F.get()).A05() == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (((X.C56722hv) r4.A0D.get()).A00(X.AnonymousClass2R0.A03, r5.A0s) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r5.A0X.setVisibility(8);
        r0 = r5.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        r0.setVisibility(8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1P(X.AnonymousClass4aY r5, int r6) {
        /*
            boolean r0 = A1y(r5)
            r3 = 8
            if (r0 == 0) goto L_0x0044
            X.2hA r4 = X.AnonymousClass3MZ.A0k(r5)
            X.24e r0 = r5.A0s
            if (r0 == 0) goto L_0x002f
            X.00H r0 = r4.A0D
            java.lang.Object r2 = r0.get()
            X.2hv r2 = (X.C56722hv) r2
            X.24e r1 = r5.A0s
            X.2R0 r0 = X.AnonymousClass2R0.A03
            boolean r0 = r2.A00(r0, r1)
            if (r0 != 0) goto L_0x002f
        L_0x0022:
            android.widget.ImageButton r0 = r5.A0X
            r0.setVisibility(r3)
            android.widget.ImageButton r0 = r5.A0Y
            if (r0 == 0) goto L_0x002e
            r0.setVisibility(r3)
        L_0x002e:
            return
        L_0x002f:
            boolean r0 = A25(r5)
            if (r0 == 0) goto L_0x0044
            X.00H r0 = r4.A0F
            java.lang.Object r0 = r0.get()
            X.4Ys r0 = (X.C88204Ys) r0
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0044
            goto L_0x0022
        L_0x0044:
            if (r6 != 0) goto L_0x005c
            X.1DC r0 = r5.A4L
            boolean r1 = r0.BcY()
            android.widget.ImageButton r0 = r5.A0X
            if (r1 == 0) goto L_0x0051
            r3 = 0
        L_0x0051:
            r0.setVisibility(r3)
        L_0x0054:
            android.widget.ImageButton r0 = r5.A0Y
            if (r0 == 0) goto L_0x002e
            r0.setVisibility(r6)
            return
        L_0x005c:
            android.widget.ImageButton r0 = r5.A0X
            r0.setVisibility(r6)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A1P(X.4aY, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (X.C72483Me.A1C(r7) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1W(X.AnonymousClass4aY r7, X.C82974Cw r8, boolean r9, boolean r10) {
        /*
            X.1FY r6 = X.AnonymousClass3MW.A0Q(r7)
            X.4Ye r0 = A05(r7)
            r5 = 0
            r0.A02(r5)
            X.4NE r0 = r7.A7J
            X.1bI r0 = r0.A00
            X.AnonymousClass3Ma.A1M(r0)
            X.12L r1 = r7.A3G
            X.1BI r0 = r7.A3R
            boolean r0 = X.C42761yh.A01(r1, r0)
            if (r0 == 0) goto L_0x004e
            X.1BI r0 = r7.A3R
            boolean r0 = X.C22971Dz.A0d(r0)
            if (r0 == 0) goto L_0x002e
            boolean r1 = X.C72483Me.A1C(r7)
            r0 = 2131898329(0x7f122fd9, float:1.9431573E38)
            if (r1 != 0) goto L_0x0031
        L_0x002e:
            r0 = 2131898331(0x7f122fdb, float:1.9431577E38)
        L_0x0031:
            java.lang.String r1 = X.C80613xU.A04(r6, r0)
            X.4Ye r0 = A05(r7)
            r0.A03(r1)
            X.4Ye r0 = A05(r7)
            com.whatsapp.TextEmojiLabel r2 = r0.A01
            if (r2 == 0) goto L_0x004d
            r1 = 1
            X.BJf r0 = new X.BJf
            r0.<init>(r1)
            X.AnonymousClass1HF.A0f(r2, r0)
        L_0x004d:
            return
        L_0x004e:
            X.0ve r1 = r7.A3F
            X.1BI r0 = r7.A3R
            boolean r0 = X.C43381zi.A01(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0070
            X.1FY r3 = X.AnonymousClass3MW.A0Q(r7)
            r2 = 2131896631(0x7f122937, float:1.9428129E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r1 = X.C17880vN.A0q(r3, r0, r1, r5, r2)
        L_0x0068:
            X.4Ye r0 = A05(r7)
            r0.A03(r1)
            return
        L_0x0070:
            if (r10 == 0) goto L_0x007a
            r0 = 2131889212(0x7f120c3c, float:1.9413081E38)
        L_0x0075:
            java.lang.String r1 = r6.getString(r0)
            goto L_0x0068
        L_0x007a:
            if (r9 == 0) goto L_0x0080
            r7.A1t(r5, r1)
            return
        L_0x0080:
            X.4Cw r0 = X.C82974Cw.SUSPENDED
            if (r8 != r0) goto L_0x0088
            r7.A1t(r1, r1)
            return
        L_0x0088:
            X.1BI r0 = r7.A3R
            boolean r0 = A2E(r7, r0)
            if (r0 == 0) goto L_0x0094
            r0 = 2131896870(0x7f122a26, float:1.9428613E38)
            goto L_0x0075
        L_0x0094:
            X.1BI r0 = r7.A3R
            boolean r0 = X.C22971Dz.A0M(r0)
            if (r0 == 0) goto L_0x00a0
            r0 = 2131897242(0x7f122b9a, float:1.9429368E38)
            goto L_0x0075
        L_0x00a0:
            r4 = 2131890889(0x7f1212c9, float:1.9416483E38)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            X.1FY r2 = X.AnonymousClass3MW.A0Q(r7)
            r1 = 2130968583(0x7f040007, float:1.7545824E38)
            r0 = 2131099679(0x7f06001f, float:1.7811718E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            java.lang.String r0 = X.AnonymousClass1EG.A03(r6, r0)
            r3[r5] = r0
            android.text.Spanned r1 = X.AnonymousClass1EG.A01(r6, r3, r4)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A1W(X.4aY, X.4Cw, boolean, boolean):void");
    }

    public static void A1e(AnonymousClass4aY r4, String str, int i, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        int i2 = 10;
        if (z) {
            i2 = 3;
        }
        r4.A1r(valueOf, Integer.valueOf(i2), 31);
        A19(r4);
        r4.A1M.postDelayed(new C98574rN(r4, str, 3, z), 200);
    }

    public static void A1f(AnonymousClass4aY r5, String str, boolean z, boolean z2, boolean z3) {
        AnonymousClass73Z.A01(new C75853lr(str, false, z, z2, z3), (AnonymousClass73Z) AnonymousClass3MZ.A0k(r5).A0A.get(), AnonymousClass3MY.A0g(), 814, false);
    }

    public static void A1p(C108865cQ r0, int i) {
        View findViewById = r0.findViewById(i);
        C17960vV.A05(findViewById);
        new C28931bI(findViewById).A02();
    }

    private boolean A1u() {
        if (!A26(this) || !this.A3F.A0I(6409).contains("improved_keyboard_to_tray_transition")) {
            return false;
        }
        return true;
    }

    private boolean A1v() {
        if (!A22(this) || !C72473Md.A0R(this).A06()) {
            return false;
        }
        return true;
    }

    public static boolean A1z(AnonymousClass4aY r1) {
        C77873rd r0;
        if (!A25(r1) || (r0 = C72473Md.A0Q(r1).A00) == null || r0.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static boolean A21(AnonymousClass4aY r2) {
        if (!A1y(r2)) {
            C18030ve r1 = r2.A3F;
            C18070vi.A0h(r1, r2.A4L);
            if (!C25291Nq.A04(r1, 10358)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A22(AnonymousClass4aY r1) {
        C446324e r0;
        if (!A1y(r1) || (r0 = r1.A0s) == null || !r0.A0I) {
            return false;
        }
        return true;
    }

    public static boolean A23(AnonymousClass4aY r2) {
        ExpressionsTrayView expressionsTrayView;
        if (!A26(r2) || (expressionsTrayView = r2.A3D) == null || expressionsTrayView.getVisibility() == 8 || r2.A0i == null) {
            return false;
        }
        return true;
    }

    public static boolean A24(AnonymousClass4aY r1) {
        if (AnonymousClass3Ma.A0j(r1).A06() || !A26(r1) || !r1.A3F.A0I(6409).contains("use_keyboard_listener")) {
            return false;
        }
        return true;
    }

    public static boolean A25(AnonymousClass4aY r1) {
        if (!A1y(r1) || !C72473Md.A0R(r1).A0B()) {
            return false;
        }
        return true;
    }

    public static boolean A26(AnonymousClass4aY r2) {
        return C18020vd.A05(C18040vf.A02, AnonymousClass3MX.A0h(r2), 3792);
    }

    public static boolean A27(AnonymousClass4aY r3) {
        AnonymousClass3US r1;
        if (!r3.A1v() || (r1 = r3.A1f) == null) {
            return false;
        }
        Boolean bool = (Boolean) r1.A01.A06();
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        DosaRepository dosaRepository = (DosaRepository) r1.A04.get();
        if (!C18020vd.A05(C18040vf.A02, dosaRepository.A04, 10248) || dosaRepository.A02().getBoolean("dob_verified", false)) {
            return false;
        }
        return true;
    }

    public static boolean A2A(AnonymousClass4aY r1) {
        if (!A22(r1) || !C72473Md.A0R(r1).A0F()) {
            return false;
        }
        return true;
    }

    public static boolean A2B(AnonymousClass4aY r2) {
        AnonymousClass3US r0;
        if (!r2.A1v() || (r0 = r2.A1f) == null || r0.A00.A06() != C83014Da.A03) {
            return false;
        }
        return true;
    }

    public static boolean A2D(AnonymousClass4aY r3, int i) {
        if (!C18020vd.A05(C18040vf.A02, AnonymousClass3MX.A0h(r3), 743) || !r3.A3s.A0h(AnonymousClass3MW.A0P(r3), AnonymousClass3MZ.A0x(r3.A35), i) || ((i != 2 && i != 4) || A21(r3))) {
            return false;
        }
        return true;
    }

    public static boolean A2E(AnonymousClass4aY r5, Jid jid) {
        List list;
        if (!C22971Dz.A0S(jid)) {
            return false;
        }
        if (C72463Mc.A1X(r5.A5X)) {
            C33971jg A0k2 = AnonymousClass3MX.A0k(r5.A5W);
            AnonymousClass1ED r6 = (AnonymousClass1ED) jid;
            C18070vi.A0d(r6, 0);
            String A0r2 = C17880vN.A0r(C33971jg.A00(A0k2), String.valueOf(r6.A00));
            if (A0r2 != null) {
                Set<String> stringSet = C33971jg.A00(A0k2).getStringSet("optedInIntegratorNames", C25511Om.A00);
                if (stringSet != null) {
                    list = C29431cG.A0t(stringSet);
                } else {
                    list = C18460wS.A00;
                }
                if (!list.contains(A0r2)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A2F(X.AnonymousClass4aY r14, java.lang.String r15) {
        /*
            X.4Ys r1 = X.C72473Md.A0Q(r14)
            java.util.List r10 = r1.A02()
            X.73D r7 = r1.A04
            java.util.ArrayList r2 = r7.A04()
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x005b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x005b
        L_0x0018:
            java.util.List r0 = r1.A02()
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0071
        L_0x0025:
            r2 = 0
            if (r3 == 0) goto L_0x00f1
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00f1
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r14)
            X.00H r0 = r0.A0J
            java.lang.Object r5 = r0.get()
            X.1Po r5 = (X.C25771Po) r5
            r4 = 0
            r3 = 38
            r0 = 1
            r5.A04(r4, r3, r2, r0)
            boolean r0 = A22(r14)
            if (r0 == 0) goto L_0x0073
            X.1Ps r4 = X.C72483Me.A0S(r14)
            X.1GP r3 = X.AnonymousClass3MW.A0K(r14)
            X.4sd r0 = new X.4sd
            r0.<init>(r14, r15, r2)
            boolean r0 = r4.A0C(r3, r0)
            if (r0 == 0) goto L_0x0073
            return r2
        L_0x005b:
            java.util.Iterator r2 = r2.iterator()
        L_0x005f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r2.next()
            X.72S r0 = (X.AnonymousClass72S) r0
            java.io.File r0 = r0.A09()
            if (r0 != 0) goto L_0x005f
        L_0x0071:
            r3 = 0
            goto L_0x0025
        L_0x0073:
            java.lang.Object r0 = r10.get(r2)
            android.net.Uri r0 = (android.net.Uri) r0
            X.72S r0 = r7.A02(r0)
            r0.A0P(r15)
            X.4oQ r9 = new X.4oQ
            r9.<init>(r1, r14)
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r14)
            X.2XN r4 = r0.A06
            X.1BI r8 = r14.A3R
            boolean r12 = r14.A6g
            X.3rd r0 = r1.A00
            r13 = 0
            if (r0 == 0) goto L_0x00a2
            X.3Wj r0 = r0.A05
            java.util.List r3 = r0.A04
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00db
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00db
        L_0x00a2:
            X.6q7 r0 = r1.A06
            X.00H r0 = r0.A0A
            java.lang.Object r0 = r0.get()
            X.2iz r0 = (X.C57382iz) r0
            java.util.Map r11 = r0.A00
            X.1K2 r0 = r4.A00
            X.1K1 r3 = r0.A00
            android.app.Activity r5 = r3.AAO
            X.10E r0 = r0.A01
            X.00S r0 = r0.A14
            java.lang.Object r6 = r0.get()
            X.1UD r6 = (X.AnonymousClass1UD) r6
            X.69w r4 = new X.69w
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass1K1.A6e(r3, r4)
            X.10I r3 = r14.A4c
            java.lang.Void[] r0 = new java.lang.Void[r2]
            r3.CGM(r4, r0)
            X.3rd r0 = r1.A00
            if (r0 == 0) goto L_0x00d9
            r2 = 1
            X.4ZT r1 = r0.A02
            X.4DV r0 = r0.A06
            r1.A02(r0, r2)
        L_0x00d9:
            r0 = 1
            return r0
        L_0x00db:
            java.util.Iterator r3 = r3.iterator()
        L_0x00df:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r3.next()
            X.4cI r0 = (X.C89334cI) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00df
            r13 = 1
            goto L_0x00a2
        L_0x00f1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConversationDelegate/sendMediaToBot/cannot send media isSendUrisEmpty="
            r1.append(r0)
            boolean r0 = r10.isEmpty()
            java.lang.String r0 = X.AnonymousClass3MY.A0r(r1, r0)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2F(X.4aY, java.lang.String):boolean");
    }

    public void A2O() {
        if (A23(this)) {
            this.A0i.A0W(5);
        }
    }

    public void A2V() {
        AnonymousClass1E7 r0;
        C80753xv r02;
        Fragment A0Q2;
        AnonymousClass1GP A0K2 = AnonymousClass3MW.A0K(this);
        if (A0K2.A0K() == 1 && (A0Q2 = A0K2.A0Q("search_fragment_conversation")) != null && A0Q2.A1e()) {
            A0s(this);
        } else if (A23(this)) {
            this.A0i.A0W(5);
        } else if (A26(this) || (r02 = this.A3L) == null || !r02.A02()) {
            C108645c3 r1 = this.A4e;
            if (r1 == null || !r1.BT1() || !r1.BT0()) {
                AnonymousClass74G r2 = this.A42;
                if (r2 != null) {
                    AnonymousClass74G.A06(r2, AnonymousClass00R.A0C, false);
                    return;
                }
                if (C72473Md.A0f(this) != null) {
                    C88654aI.A03(C88444Zs.A01(this), AnonymousClass3MW.A0j(this), (String) null, 7, true);
                }
                if (!TextUtils.isEmpty(this.A0B.getStringExtra("extra_deep_link_session_id")) && (r0 = this.A35) != null && r0.A0C()) {
                    if (C18020vd.A05(C18040vf.A02, this.A3F, 9568)) {
                        A4F.A01((A4F) AnonymousClass3Ma.A0Z(this).A07.get(), AnonymousClass3MW.A0j(this), 2);
                    }
                }
                boolean booleanExtra = this.A2Q.getIntent().getBooleanExtra("fb_share_wa_redirect", false);
                if ((this.A2Q.isTaskRoot() || this.A2Q.getIntent().getBooleanExtra("fb_share_wa_redirect", false)) && !AnonymousClass3MW.A0P(this).getComponentName().getClassName().equals("com.whatsapp.HomeActivity")) {
                    Intent A022 = AnonymousClass1LU.A02(AnonymousClass3MW.A0P(this));
                    if (booleanExtra) {
                        A022.putExtra("fb_share_wa_redirect", true);
                    }
                    this.A2Q.finishAndRemoveTask();
                    this.A2Q.startActivity(A022);
                    return;
                }
                C29691ci A0a2 = C72463Mc.A0a(this.A2w, this.A3R);
                if (A0a2 != null && A0a2.A0t) {
                    C22621Co r12 = this.A2u;
                    AnonymousClass1BI r03 = this.A3R;
                    C17960vV.A07(r03);
                    r12.A06(r03);
                }
                if (A25(this)) {
                    C72473Md.A0Q(this).A03();
                }
                if (A28(this) && this.A40 != null) {
                    C98834rn.A01(this.A4c, this, 27);
                }
                AnonymousClass1FY A0P2 = AnonymousClass3MW.A0P(this);
                boolean z = this.A29.A0d;
                boolean A1W2 = AnonymousClass3MZ.A1W(this);
                C18030ve r3 = this.A3F;
                AnonymousClass1L9 r22 = this.A0r;
                if (!z || !A1W2 || !C18020vd.A05(C18040vf.A02, r3, 12470)) {
                    this.A2Q.C7p();
                    return;
                }
                C18070vi.A0d(A0P2, 0);
                Intent A023 = AnonymousClass1LU.A02(A0P2);
                A023.setAction(C28901bF.A03);
                A023.setFlags(335544320);
                r22.A0A(A0P2, A023);
                return;
            }
            r1.BKs(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2Z() {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r5.A7A = r0
            r0 = 1
            r5.A76 = r0
            r5.A0I()
            X.5cQ r0 = r5.A2Q
            X.1f4 r0 = r0.getMessageAudioPlayerProvider()
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0021
            X.5cQ r0 = r5.A2Q
            X.1f4 r0 = r0.getMessageAudioPlayerProvider()
            r0.A03()
        L_0x0021:
            X.5cQ r0 = r5.A2Q
            X.1f4 r0 = r0.getMessageAudioPlayerProvider()
            X.AnonymousClass4aV.A06(r0)
            X.1f7 r3 = A07(r5)
            X.5cQ r0 = r5.A2Q
            android.view.View r0 = r0.getContentView()
            r4 = 0
            X.C18070vi.A0d(r0, r4)
            boolean r2 = X.C31181f9.A00(r0)
            X.1f4 r0 = r3.A07
            boolean r1 = r0.A0B()
            r0 = 1
            if (r2 == 0) goto L_0x00c9
            r3.A05 = r0
            r3.A04 = r0
        L_0x0049:
            r3.A03 = r0
        L_0x004b:
            X.1E7 r1 = r5.A35
            if (r1 == 0) goto L_0x0079
            com.whatsapp.mentions.MentionableEntry r0 = r5.A3Z
            if (r0 == 0) goto L_0x0079
            java.util.HashMap r2 = X.AnonymousClass4IT.A02
            java.lang.Class<X.1BI> r3 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r1 = r1.A06(r3)
            com.whatsapp.mentions.MentionableEntry r0 = r5.A3Z
            java.lang.String r0 = r0.getStringText()
            r2.put(r1, r0)
            java.util.HashMap r2 = A8M
            X.1E7 r0 = r5.A35
            com.whatsapp.jid.Jid r1 = r0.A06(r3)
            com.whatsapp.mentions.MentionableEntry r0 = r5.A3Z
            java.util.List r0 = r0.getMentions()
            java.lang.String r0 = X.AnonymousClass4aJ.A01(r0)
            r2.put(r1, r0)
        L_0x0079:
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            if (r0 == 0) goto L_0x0086
            X.3Oz r0 = r0.getConversationCursorAdapter()
            X.1IX r0 = r0.A07
            r0.size()
        L_0x0086:
            android.os.Handler r0 = r5.A7B
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r0.hasMessages(r4)
            if (r0 == 0) goto L_0x00a6
            android.os.Handler r0 = r5.A7B
            r0.removeMessages(r4)
            X.5cQ r0 = r5.A2Q
            X.11C r0 = r0.getSystemServices()
            android.os.PowerManager r0 = r0.A0G()
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "conversation/pause pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00a6:
            X.0zA r1 = r5.A0n
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x00d9
            r1.A03()
            X.5cQ r0 = r5.A2Q
            r0.CFa()
            java.lang.String r0 = "unregisterActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00bd:
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L_0x00a6
            android.os.Handler r0 = r5.A7B
            r0.sendEmptyMessage(r4)
            goto L_0x00a6
        L_0x00c9:
            if (r1 == 0) goto L_0x00d1
            r3.A05 = r0
            r3.A04 = r4
            goto L_0x0049
        L_0x00d1:
            r3.A05 = r4
            r3.A04 = r4
            r3.A03 = r4
            goto L_0x004b
        L_0x00d9:
            X.74G r2 = r5.A42
            if (r2 == 0) goto L_0x00f7
            boolean r0 = r2.A0I
            if (r0 == 0) goto L_0x01cc
            X.6tV r1 = r2.A0u
            r0 = 1
            r1.A05 = r0
            X.1VT r1 = r2.A11
            X.1IV r0 = r2.A10
            r1.unregisterObserver(r0)
            r1 = 8
            X.7RB r0 = new X.7RB
            r0.<init>((java.lang.Object) r2, (int) r1)
            X.AnonymousClass74G.A07(r2, r0)
        L_0x00f7:
            X.C72473Md.A1E(r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0108
            X.5cQ r0 = r5.A2Q
            boolean r0 = r0.isInMultiWindowMode()
            if (r0 != 0) goto L_0x0116
        L_0x0108:
            boolean r0 = r5.A3G()
            if (r0 == 0) goto L_0x0116
            X.74M r0 = r5.A4h
            X.C17960vV.A07(r0)
            r0.A0N()
        L_0x0116:
            X.1BI r0 = r5.A3R
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x0160
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r5)
            X.00H r0 = r0.A0K
            java.lang.Object r3 = r0.get()
            X.4aG r3 = (X.C88634aG) r3
            X.1BI r1 = r5.A3R
            X.C18070vi.A0d(r1, r4)
            X.1ch r0 = r3.A00
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x0143
            X.10I r2 = r3.A05
            r1 = 22
            X.Ail r0 = new X.Ail
            r0.<init>(r3, r1)
            r2.CGF(r0)
        L_0x0143:
            boolean r0 = r5.A7T
            if (r0 == 0) goto L_0x0160
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r5)
            X.00H r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.170 r0 = (X.AnonymousClass170) r0
            r0.A03 = r4
            X.3uK r0 = r0.A01
            if (r0 == 0) goto L_0x0160
            X.4VQ r0 = r0.A06
            if (r0 == 0) goto L_0x0160
            r0.A01()
        L_0x0160:
            X.0ve r1 = r5.A3F
            r0 = 9744(0x2610, float:1.3654E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x017e
            X.00H r0 = r5.A5t
            X.16x r1 = X.AnonymousClass3MX.A0d(r0)
            X.1DT r0 = r1.A03
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x017e
            r0 = 0
            r1.A00(r0)
        L_0x017e:
            X.0ve r1 = r5.A3F
            r0 = 7149(0x1bed, float:1.0018E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = "ConversationDelegate/removeStickerTrayListeners"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.7MX r0 = r5.A3v
            r1 = 0
            if (r0 == 0) goto L_0x0194
            r0.A04 = r1
        L_0x0194:
            X.5z4 r0 = r5.A3K
            if (r0 == 0) goto L_0x019b
            r0.A0N(r1)
        L_0x019b:
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r5.A3D
            if (r0 == 0) goto L_0x01a1
            r0.A0M = r1
        L_0x01a1:
            X.0ve r1 = r5.A3F
            r0 = 3403(0xd4b, float:4.769E-42)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x01b6
            X.00H r0 = r5.A5D
            java.lang.Object r0 = r0.get()
            X.4XX r0 = (X.AnonymousClass4XX) r0
            r0.A01()
        L_0x01b6:
            com.whatsapp.expressionstray.ExpressionsTrayView r1 = r5.A3D
            if (r1 == 0) goto L_0x01c2
            java.lang.String r0 = "ExpressionsTrayView/onPause"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r1.A0V = r0
        L_0x01c2:
            X.1BI r2 = r5.A3R
            if (r2 == 0) goto L_0x01e2
            X.5cB r1 = r5.A2T
            X.4lp r1 = (X.C95184lp) r1
            monitor-enter(r1)
            goto L_0x01d3
        L_0x01cc:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            X.AnonymousClass74G.A06(r2, r0, r4)
            goto L_0x00f7
        L_0x01d3:
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x01de }
            r0.remove(r2)     // Catch:{ all -> 0x01de }
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x01de }
            r0.remove(r2)     // Catch:{ all -> 0x01de }
            goto L_0x01e1
        L_0x01de:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x01e1:
            monitor-exit(r1)
        L_0x01e2:
            java.util.Set r0 = r5.A7p
            java.util.Iterator r2 = r0.iterator()
        L_0x01e8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01fc
            java.lang.Object r1 = r2.next()
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1
            X.1FY r0 = X.AnonymousClass3MW.A0P(r5)
            r1.onActivityPaused(r0)
            goto L_0x01e8
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2Z():void");
    }

    public void A2d() {
        View view;
        AnonymousClass3Ma.A0j(this).A05(this.A7d);
        if (AnonymousClass3Ma.A0j(this).A0A()) {
            C17880vN.A0V(this.A64).unregisterObserver(this.A7j);
        }
        if (!C18020vd.A05(C18040vf.A01, this.A3F, 10202)) {
            C17880vN.A0V(((C55742gI) this.A51.get()).A06).unregisterObserver(this.A2Q);
        }
        C17880vN.A0V(this.A4n).unregisterObserver(this.A84);
        if (AnonymousClass3MW.A0P(this).isFinishing() && this.A2v != null) {
            C17880vN.A0V(this.A53).unregisterObserver(this.A2v);
            this.A2v = null;
        }
        if (this.A0D != null) {
            this.A6J = Boolean.valueOf(C72463Mc.A1R(this));
        }
        if (A3G()) {
            AnonymousClass74M r0 = this.A4h;
            C17960vV.A07(r0);
            r0.A0N();
        }
        A0I();
        C72473Md.A1E(this);
        this.A3m.A03(this.A7k);
        A2P();
        if (C18020vd.A05(C18040vf.A02, this.A3F, 12572)) {
            C98834rn.A01(this.A4c, this, 23);
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("conversation/stop/release ");
            A102.append(SQLiteDatabase.releaseMemory());
            A102.append(" jid=");
            C17900vP.A0b(this.A3R, A102);
        }
        if (this.A2b != null) {
            ConversationListView conversationListView = this.A2B;
            AnonymousClass1BI r6 = this.A3R;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.A7z;
            AnonymousClass3Ma.A1O(r6, 0, onPreDrawListener);
            if (conversationListView.getHeight() != 0) {
                if (conversationListView.A0D(0)) {
                    conversationListView.A0P = true;
                    C17960vV.A07(r6);
                    ((C51862Zx) conversationListView.getConversationsScrollStateCache().get()).A00.remove(r6);
                } else {
                    conversationListView.A02 = conversationListView.getFirstVisiblePosition();
                    View childAt = conversationListView.getChildAt(0);
                    conversationListView.A03 = 0;
                    if (childAt != null) {
                        conversationListView.A03 = childAt.getTop();
                    }
                    C17960vV.A07(r6);
                    ((C51862Zx) conversationListView.getConversationsScrollStateCache().get()).A00.put(r6, new AnonymousClass4MK(conversationListView.A02 - conversationListView.getHeaderViewsCount(), conversationListView.A03));
                    conversationListView.getHeaderViewsCount();
                    conversationListView.A0P = false;
                }
            }
            Cursor cursor = conversationListView.getConversationCursorAdapter().getCursor();
            if (cursor != null) {
                cursor.close();
            }
            AnonymousClass3MX.A1G(conversationListView, onPreDrawListener);
        }
        C117015z4 r1 = this.A3K;
        if (!(r1 == null || (view = r1.A0K) == null)) {
            AnonymousClass3MY.A1D(view, r1);
        }
        if (C22971Dz.A0V(this.A3R)) {
            ((C191679mz) AnonymousClass3Ma.A0Y(this).A0B.get()).A00();
            if (this.A7T) {
                ((AnonymousClass171) AnonymousClass3Ma.A0Y(this).A08.get()).A00 = null;
            }
        }
        this.A3d.A0B(this.A3R, (AnonymousClass206) null, 2000, false, false);
        AnonymousClass4OK r4 = this.A1Z;
        AnonymousClass1BI r3 = this.A3R;
        if (r3 != null) {
            r4.A03.CGF(new C21453AkK(r4, r3, 6));
        }
        r4.A01.A00 = null;
        for (Application.ActivityLifecycleCallbacks onActivityStopped : this.A7p) {
            onActivityStopped.onActivityStopped(AnonymousClass3MW.A0P(this));
        }
    }

    public void A2e() {
        int i;
        if (AnonymousClass3MZ.A1W(this)) {
            i = 2131888692;
        } else {
            i = 2131899167;
            if (A1z(this)) {
                i = 2131886742;
            }
        }
        MentionableEntry mentionableEntry = this.A3Z;
        if (mentionableEntry != null) {
            mentionableEntry.setHint(this.A2Q.getString(i));
        }
    }

    public void A2k(Drawable drawable, View view) {
        ImageView imageView = new ImageView(AnonymousClass3MW.A0P(this));
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(4);
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new C90444e5(this, imageView, view, 1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        this.A1M.addView(imageView, layoutParams);
    }

    public void A2m(Bundle bundle) {
        C77873rd r0;
        this.A6J = Boolean.valueOf(C72463Mc.A1R(this));
        bundle.putBoolean("added_by_qr_code", this.A6Z);
        bundle.putBoolean("has_number_from_url", this.A6g);
        bundle.putBoolean("has_text_from_url", this.A6i);
        bundle.putBoolean("keyboard_visible", this.A6J.booleanValue());
        bundle.putBoolean("added_by_number_search", this.A2b.A0I);
        bundle.putLong("ephemeral_session_start", this.A2b.A0n.A00);
        if (A25(this) && (r0 = C72473Md.A0Q(this).A00) != null) {
            bundle.putParcelableArrayList("saved_bot_media_array_list", C17880vN.A10(r0.A05.A04));
        }
        AnonymousClass4R4 A0a2 = AnonymousClass3MZ.A0a(this);
        AnonymousClass1BI r3 = this.A3R;
        int i = 4;
        if (this.A6s) {
            i = 5;
        }
        int i2 = 4;
        if (C22971Dz.A0V(r3)) {
            i2 = 26;
        }
        A0a2.A00(r3, i, i2);
        A0G();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.conversation.selectlist.Hilt_SelectListBottomSheet, com.whatsapp.conversation.selectlist.SelectListBottomSheet, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment] */
    public void A2p(C106795Xf r4, C20285AEt aEt) {
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putParcelable("arg_select_list_content", aEt);
        ? hilt_SelectListBottomSheet = new Hilt_SelectListBottomSheet();
        hilt_SelectListBottomSheet.A1R(A0D2);
        hilt_SelectListBottomSheet.A00 = r4;
        AnonymousClass1FY A0P2 = AnonymousClass3MW.A0P(this);
        if (A0P2 != null && (A0P2 instanceof C108885cS)) {
            C20098A7b.A02(hilt_SelectListBottomSheet, A0P2.getSupportFragmentManager());
        }
    }

    public void A2t(AnonymousClass1E7 r5) {
        ((AnonymousClass1V9) AnonymousClass3Ma.A0Z(this).A03.get()).A01(C17880vN.A0h(), 79, 4);
        if (this.A6z) {
            C87464Vr.A01(this, new C95564mR(this, r5, 1), AnonymousClass00R.A18);
        } else {
            A2u(r5);
        }
    }

    public void A2w(AnonymousClass1E7 r5, boolean z) {
        AnonymousClass1V9 r3 = (AnonymousClass1V9) AnonymousClass3Ma.A0Z(this).A03.get();
        int i = 80;
        if (z) {
            i = 81;
        }
        r3.A01(C17880vN.A0h(), i, 4);
        if (this.A1m.A01()) {
            this.A2Q.getTime();
            this.A2O = new AnonymousClass4NF(r5, System.currentTimeMillis(), z);
            AnonymousClass1VP r1 = this.A1k;
            this.A2Q.CFa();
            ((AnonymousClass1VQ) r1).A0A.A00(new A69("hangup_call"));
        }
    }

    public void A2y(AnonymousClass1BI r7, int i) {
        boolean z = false;
        if (i == 2131432524 || i == 2131432525) {
            if (r7 != null) {
                AnonymousClass1E7 A0E2 = this.A2Q.getContactManager().A0E(r7);
                if (i == 2131432524) {
                    z = true;
                }
                A1T(this, A0E2, r7, z);
                return;
            }
            Log.w("conversation/add-contact-failed");
            AnonymousClass3MX.A0U(this).A08(2131890877, 0);
        } else if (i != 2131432594) {
            if (i == 2131432650) {
                if (r7 != null) {
                    C72453Mb.A1P(AnonymousClass3Ma.A0Z(this).A0E);
                    this.A1k.CNw(AnonymousClass3MW.A0P(this), this.A2Q.getContactManager().A0H(r7), 8, false);
                    return;
                }
            } else if (i != 2131432648) {
                return;
            } else {
                if (r7 != null) {
                    C72453Mb.A1P(AnonymousClass3Ma.A0Z(this).A0E);
                    this.A1k.CNw(AnonymousClass3MW.A0P(this), this.A2Q.getContactManager().A0H(r7), 8, true);
                    return;
                }
            }
            Log.e("conversation/call-contact/error no-resource");
        } else if (r7 != null) {
            this.A2Q.getActivityUtils().A0B(AnonymousClass3MW.A0P(this), this.A3Q.A1w(AnonymousClass3MW.A0P(this), r7, 0), "Conversation:messageContact");
            this.A2Q.finish();
        } else {
            Log.e("conversation/message-contact/error no-resource");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0160, code lost:
        if (r0.getVisibility() != 0) goto L_0x0162;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A31(X.AnonymousClass206 r8) {
        /*
            r7 = this;
            boolean r0 = r7.A3H()
            if (r0 != 0) goto L_0x0025
            com.whatsapp.mentions.MentionableEntry r0 = r7.A3Z
            if (r0 == 0) goto L_0x0025
            X.74M r0 = r7.A4h
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r0.A0E = r8
            r7.A39(r8, r3)
        L_0x0014:
            if (r8 != 0) goto L_0x0026
            android.view.View r0 = r7.A7D
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0025
            android.view.ViewGroup r0 = r7.A0U
            if (r0 == 0) goto L_0x0025
            r0.getVisibility()
        L_0x0025:
            return
        L_0x0026:
            boolean r0 = A25(r7)
            if (r0 == 0) goto L_0x003f
            X.4Ys r0 = X.C72473Md.A0Q(r7)
            r0.A03()
            X.3rd r0 = r0.A00
            if (r0 == 0) goto L_0x003f
            r2 = 1
            X.4ZT r1 = r0.A02
            X.4DV r0 = r0.A06
            r1.A02(r0, r2)
        L_0x003f:
            X.02B r0 = r7.A0e
            if (r0 == 0) goto L_0x0046
            r0.A05()
        L_0x0046:
            android.view.View r0 = r7.A0I
            if (r0 != 0) goto L_0x00d4
            X.5cQ r0 = r7.A2Q
            android.view.LayoutInflater r2 = r0.getLayoutInflater()
            r1 = 2131626665(0x7f0e0aa9, float:1.8880573E38)
            r0 = 0
            android.view.View r1 = r2.inflate(r1, r0, r3)
            r7.A0I = r1
            r0 = 2131434295(0x7f0b1b37, float:1.84904E38)
            android.view.View r5 = r1.findViewById(r0)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            X.1FY r4 = X.AnonymousClass3MW.A0P(r7)
            X.00H r0 = r7.A4w
            java.lang.Object r2 = r0.get()
            X.5bZ r2 = (X.C108355bZ) r2
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            r0 = 2
            android.graphics.drawable.Drawable r1 = r2.BS0(r1, r0, r3)
            r0 = 2131100221(0x7f06023d, float:1.7812817E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A05(r4, r1, r0)
            r5.setForeground(r0)
            android.view.ViewGroup r1 = r7.A0S
            android.view.View r0 = r7.A0I
            r1.addView(r0)
            X.0vb r4 = r7.A2k
            android.view.View r1 = r7.A0I
            r0 = 2131434308(0x7f0b1b44, float:1.8490426E38)
            android.view.View r2 = r1.findViewById(r0)
            android.content.res.Resources r1 = X.AnonymousClass3MW.A04(r7)
            r0 = 2131166335(0x7f07047f, float:1.7946912E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.C27641Ww.A05(r2, r4, r3, r0)
            android.view.View r0 = r7.A0I
            r1 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            X.AnonymousClass3MY.A1B(r0, r1, r3)
            android.view.View r0 = r7.A0I
            android.view.View r1 = r0.findViewById(r1)
            r0 = 30
            X.C825048f.A00(r1, r7, r0)
            android.view.View r1 = r7.A0I
            r0 = 2131434307(0x7f0b1b43, float:1.8490424E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r1, r0)
            X.4VN r2 = r7.A28
            android.content.res.Resources r1 = X.AnonymousClass3MW.A04(r7)
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r7)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            float r0 = r2.A00(r0, r1)
            r4.setTextSize(r0)
            X.C43421zm.A04(r4)
        L_0x00d4:
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r7)
            X.00H r0 = r0.A0C
            r0.get()
            boolean r0 = X.C87494Vu.A01(r8)
            if (r0 == 0) goto L_0x0134
            X.1UD r0 = X.C72473Md.A0R(r7)
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0134
            com.whatsapp.mentions.MentionableEntry r6 = r7.A3Z
            X.1FU r5 = X.AnonymousClass3Ma.A0K(r6)
            X.0zA r0 = r6.A07
            java.lang.Object r4 = r0.A04()
            X.1Pk r4 = (X.C25731Pk) r4
            if (r5 == 0) goto L_0x0134
            if (r4 == 0) goto L_0x0134
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x0134
            X.00H r0 = r4.A03
            java.lang.Object r0 = r0.get()
            X.73d r0 = (X.C1408073d) r0
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0134
            java.util.List r1 = r6.getMentions()
            X.1PW r0 = r4.A00
            com.whatsapp.jid.UserJid r0 = r0.A03(r1)
            if (r0 != 0) goto L_0x0134
            X.4sW r2 = new X.4sW
            r2.<init>((java.lang.Object) r6, (int) r3)
            X.00H r0 = r4.A04
            java.lang.Object r1 = r0.get()
            X.1z1 r1 = (X.C42961z1) r1
            X.5Qe r0 = new X.5Qe
            r0.<init>(r2)
            r1.A03(r5, r0)
        L_0x0134:
            X.1BI r0 = r7.A3R
            X.6sH r4 = new X.6sH
            r4.<init>(r0, r3, r3)
            X.00H r0 = r7.A5z
            java.lang.Object r2 = r0.get()
            X.6z1 r2 = (X.C139546z1) r2
            android.view.View r1 = r7.A0I
            X.00H r0 = r7.A5f
            java.lang.Object r0 = r0.get()
            X.724 r0 = (X.AnonymousClass724) r0
            r2.A01(r1, r0, r8, r4)
            android.view.View r1 = r7.A0I
            r0 = 2131429433(0x7f0b0839, float:1.8480539E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0162
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x0163
        L_0x0162:
            r2 = 0
        L_0x0163:
            android.view.View r1 = r7.A0I
            r0 = 2131434306(0x7f0b1b42, float:1.8490422E38)
            android.view.View r0 = r1.findViewById(r0)
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x01f1
            if (r2 != 0) goto L_0x01f1
            android.view.View r1 = r7.A0I
            r0 = 2131428823(0x7f0b05d7, float:1.8479301E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setBackgroundColor(r3)
        L_0x0180:
            android.view.ViewGroup r0 = r7.A0S
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x018c
            int r0 = r7.A06
            if (r0 >= 0) goto L_0x0198
        L_0x018c:
            java.lang.String r0 = "conversation/replypreview/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.ViewGroup r1 = r7.A0S
            android.view.View r0 = r7.A0I
            A0Q(r0, r1, r7)
        L_0x0198:
            boolean r0 = A26(r7)
            if (r0 == 0) goto L_0x01c4
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r7.A3D
            if (r0 == 0) goto L_0x01cf
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01cf
        L_0x01a8:
            X.0ve r2 = r7.A3F
            r1 = 8952(0x22f8, float:1.2544E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0025
            android.view.View r0 = r7.A0D
            if (r0 == 0) goto L_0x0025
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0025
            android.view.View r0 = r7.A0D
            r0.setVisibility(r3)
            return
        L_0x01c4:
            X.5z4 r0 = r7.A3K
            if (r0 == 0) goto L_0x01cf
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x01cf
            goto L_0x01a8
        L_0x01cf:
            X.74M r0 = r7.A4h
            if (r0 == 0) goto L_0x01da
            boolean r0 = r0.A0a()
            if (r0 == 0) goto L_0x01da
            goto L_0x01a8
        L_0x01da:
            X.74G r0 = r7.A42
            if (r0 == 0) goto L_0x01e3
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x01e3
            goto L_0x01a8
        L_0x01e3:
            X.3VQ r0 = r7.A2b
            boolean r0 = r0.A0L
            if (r0 != 0) goto L_0x01a8
            com.whatsapp.mentions.MentionableEntry r0 = r7.A3Z
            if (r0 == 0) goto L_0x01a8
            r0.A0I(r3)
            goto L_0x01a8
        L_0x01f1:
            android.view.View r1 = r7.A0I
            r0 = 2131428823(0x7f0b05d7, float:1.8479301E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 2131232950(0x7f0808b6, float:1.8082024E38)
            r1.setBackgroundResource(r0)
            goto L_0x0180
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A31(X.206):void");
    }

    public void A32(AnonymousClass206 r3) {
        A33(r3, (AnonymousClass206) null, (AnonymousClass206) null, AnonymousClass3MW.A04(this).getDimensionPixelSize(2131166321));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.21T, X.210, X.206] */
    public void A35(AnonymousClass206 r9, C195309t8 r10) {
        C33251iW A0X2 = AnonymousClass3MX.A0X(this);
        AnonymousClass1BI r1 = this.A3R;
        C17960vV.A07(r1);
        String str = r10.A03;
        if (str == null) {
            str = "N/A - Empty Button Title";
        }
        AnonymousClass205 A0Z2 = C17880vN.A0Z(r1, A0X2.A0x);
        long A012 = AnonymousClass11P.A01(A0X2.A0K);
        String str2 = r10.A04;
        ? r12 = new AnonymousClass210(A0Z2, 49, A012);
        r12.A0i(str);
        r12.A00 = str2;
        A0X2.A10.A00(r12, r9);
        A0X2.A0b(r12);
        A0X2.A0U.BBM(r12);
    }

    public void A36(AnonymousClass206 r13, AEF aef) {
        C33251iW A0X2 = AnonymousClass3MX.A0X(this);
        AnonymousClass1BI r1 = this.A3R;
        C17960vV.A07(r1);
        AnonymousClass205 A0Z2 = C17880vN.A0Z(r1, A0X2.A0x);
        long A012 = AnonymousClass11P.A01(A0X2.A0K);
        C20268AEb aEb = new C20268AEb((AnonymousClass9Je) null, (AE2) null, aef.A03, aef.A00, aef.A02, 1);
        C438721g r2 = new C438721g(A0Z2, A012);
        r2.A00 = aEb;
        A0X2.A10.A00(r2, r13);
        A0X2.A0b(r2);
        A0X2.A0U.BBM(r2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.224, X.210, X.206] */
    public void A37(AnonymousClass206 r11, C61762qD r12) {
        C33251iW A0X2 = AnonymousClass3MX.A0X(this);
        AnonymousClass1BI r1 = this.A3R;
        C17960vV.A07(r1);
        String str = r12.A09;
        String str2 = r12.A01;
        int i = r12.A06;
        Integer num = r12.A08;
        ? r13 = new AnonymousClass210(C17880vN.A0Z(r1, A0X2.A0x), 32, AnonymousClass11P.A01(A0X2.A0K));
        r13.A0i(str);
        r13.A01 = str2;
        r13.A00 = i;
        r13.A03 = num;
        A0X2.A10.A00(r13, r11);
        A0X2.A0b(r13);
        A0X2.A0U.BBM(r13);
    }

    public void A3D(String str) {
        View A0A2 = C110885hR.A0A(AnonymousClass3MW.A0P(this), 16908290);
        List emptyList = Collections.emptyList();
        new C90594eK(A0A2, (AnonymousClass1F9) AnonymousClass3MW.A0P(this), this.A2f, str, emptyList, 0, false).A03();
    }

    /* JADX WARNING: type inference failed for: r0v111, types: [java.lang.Object, X.B5z] */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02fd, code lost:
        A2o(r11.A29, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0302, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0479, code lost:
        if (r7 != -1) goto L_0x0493;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x047f, code lost:
        if (A25(r11) == false) goto L_0x07da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0481, code lost:
        if (r29 == null) goto L_0x07da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0489, code lost:
        if (r0.hasExtra("android.intent.extra.STREAM") == false) goto L_0x07da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x048b, code lost:
        A0O((android.os.Bundle) null, r11, r0.getParcelableArrayListExtra("android.intent.extra.STREAM"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0492, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0493, code lost:
        if (r28 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0499, code lost:
        if (A25(r11) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x049b, code lost:
        ((X.AnonymousClass2K6) X.AnonymousClass3MZ.A0k(r11).A0J.get()).A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07da, code lost:
        A0m(r11);
        A0d(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x07e6, code lost:
        if (X.C87544Vz.A01(r11.A3F) == false) goto L_0x07ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x07e8, code lost:
        r11.A24.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x07ed, code lost:
        r11.A2B.A0B(true);
        r11.A0S.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2h(int r27, int r28, android.content.Intent r29) {
        /*
            r26 = this;
            r1 = 0
            r11 = r26
            r7 = r28
            r0 = r29
            if (r28 != 0) goto L_0x005c
            if (r29 == 0) goto L_0x005c
            java.lang.String r2 = "oom"
            boolean r2 = r0.getBooleanExtra(r2, r1)
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = "conversation/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            X.1KB r4 = X.AnonymousClass3MX.A0U(r11)
            X.1FY r3 = X.AnonymousClass3MW.A0P(r11)
            r2 = 2131889999(0x7f120f4f, float:1.9414677E38)
            r4.A0E(r3, r2)
        L_0x0026:
            java.lang.String r2 = "no-space"
            boolean r2 = r0.getBooleanExtra(r2, r1)
            if (r2 == 0) goto L_0x0041
            java.lang.String r2 = "conversation/activityres/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            X.1KB r4 = X.AnonymousClass3MX.A0U(r11)
            X.1FY r3 = X.AnonymousClass3MW.A0P(r11)
            r2 = 2131889993(0x7f120f49, float:1.9414665E38)
            r4.A0E(r3, r2)
        L_0x0041:
            java.lang.String r2 = "io-error"
            boolean r2 = r0.getBooleanExtra(r2, r1)
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = "conversation/activityres/fail/load-image"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            X.1KB r4 = X.AnonymousClass3MX.A0U(r11)
            X.1FY r3 = X.AnonymousClass3MW.A0P(r11)
            r2 = 2131889981(0x7f120f3d, float:1.941464E38)
            r4.A0E(r3, r2)
        L_0x005c:
            java.util.Set r2 = r11.A7o
            java.util.Iterator r3 = r2.iterator()
        L_0x0062:
            boolean r2 = r3.hasNext()
            r8 = r27
            if (r2 == 0) goto L_0x0077
            java.lang.Object r2 = r3.next()
            X.5Ye r2 = (X.C107045Ye) r2
            boolean r2 = r2.Bky(r0, r8, r7)
            if (r2 == 0) goto L_0x0062
        L_0x0076:
            return
        L_0x0077:
            r5 = 8
            r6 = 0
            r2 = 1
            r4 = -1
            switch(r27) {
                case 2: goto L_0x03f6;
                case 8: goto L_0x03ef;
                case 9: goto L_0x03d8;
                case 11: goto L_0x0525;
                case 13: goto L_0x0525;
                case 22: goto L_0x0442;
                case 25: goto L_0x0359;
                case 27: goto L_0x034c;
                case 40: goto L_0x041c;
                case 42: goto L_0x0319;
                case 51: goto L_0x0076;
                case 52: goto L_0x0076;
                case 53: goto L_0x0303;
                case 120: goto L_0x02e9;
                case 158: goto L_0x02b2;
                case 475: goto L_0x028d;
                case 476: goto L_0x0278;
                case 555: goto L_0x0232;
                case 802: goto L_0x03d8;
                case 806: goto L_0x0479;
                case 811: goto L_0x0519;
                case 813: goto L_0x0076;
                case 814: goto L_0x0506;
                case 816: goto L_0x018a;
                case 817: goto L_0x04f6;
                case 858: goto L_0x03d8;
                case 905: goto L_0x04ab;
                case 906: goto L_0x00ce;
                case 907: goto L_0x0159;
                default: goto L_0x007f;
            }
        L_0x007f:
            X.5cQ r1 = r11.A2Q     // Catch:{ NullPointerException -> 0x0085 }
            r1.CFa()     // Catch:{ NullPointerException -> 0x0085 }
            goto L_0x008a
        L_0x0085:
            java.lang.String r1 = "ConversationDelegate/onActivityResult/default/hostActivityIsNull"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x008a:
            X.1l7 r5 = r11.A2K
            X.00H r1 = r5.A09
            java.lang.Object r1 = r1.get()
            X.9ne r1 = (X.C192029ne) r1
            X.00H r1 = r1.A00
            java.lang.Object r1 = r1.get()
            java.util.Map r1 = (java.util.Map) r1
            java.util.Iterator r2 = X.C17890vO.A0l(r1)
        L_0x00a0:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0076
            java.lang.Object r4 = r2.next()
            X.9ul r4 = (X.C196289ul) r4
            java.lang.Integer r1 = r4.A06()
            if (r1 == 0) goto L_0x00a0
            int r1 = r1.intValue()
            if (r1 != r8) goto L_0x00a0
            X.10I r3 = r5.A04
            X.122 r2 = r5.A01
            X.00H r1 = r5.A06
            java.lang.Object r1 = X.C18070vi.A0E(r1)
            X.1W6 r1 = (X.AnonymousClass1W6) r1
            r8 = r4
            r9 = r0
            r10 = r2
            r11 = r1
            r12 = r3
            r13 = r7
            r8.A0C(r9, r10, r11, r12, r13)
            return
        L_0x00ce:
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r1 = r11.A2J
            X.1DT r1 = r1.A00
            java.lang.Object r3 = r1.A06()
            X.4S9 r3 = (X.AnonymousClass4S9) r3
            if (r3 == 0) goto L_0x00ee
            java.util.HashMap r1 = r3.A03
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00ee
            r1 = 2
            if (r7 != r1) goto L_0x00f4
            X.1FY r1 = X.AnonymousClass3MW.A0P(r11)
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
        L_0x00ee:
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r11.A2J
            r0.A0T()
            return
        L_0x00f4:
            r1 = 3
            if (r7 != r1) goto L_0x00ee
            java.lang.String r1 = "RESULT_EXTRA_ACTION_ID"
            int r6 = r0.getIntExtra(r1, r4)
            if (r6 == r4) goto L_0x00ee
            X.4Pc r0 = r11.A1K
            X.3vR r1 = r0.A00(r11)
            java.util.Collection r0 = r3.A00()
            boolean r0 = r1.BKp(r6, r0)
            if (r0 == 0) goto L_0x00ee
            X.00H r0 = r11.A5E
            java.lang.Object r0 = r0.get()
            X.4Wb r0 = (X.C87564Wb) r0
            X.0vl r0 = r0.A00
            java.util.Map r0 = X.AnonymousClass3MW.A12(r0)
            java.lang.Object r4 = X.AnonymousClass000.A0w(r0, r6)
            X.5bi r4 = (X.C108445bi) r4
            java.util.Collection r0 = r3.A00()
            java.util.Iterator r1 = r0.iterator()
            java.util.Collection r0 = r3.A00()
            int r0 = r0.size()
            if (r0 != r2) goto L_0x0150
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0150
            X.00H r0 = r11.A4z
            java.lang.Object r3 = r0.get()
            X.A4u r3 = (X.A4u) r3
            X.206 r1 = X.C17880vN.A0Y(r1)
            r0 = 5
            if (r6 == r0) goto L_0x014d
            if (r6 != r5) goto L_0x0150
            r2 = 3
        L_0x014d:
            X.A4u.A01(r3, r1, r2)
        L_0x0150:
            if (r4 == 0) goto L_0x00ee
            boolean r0 = r4.BRj()
            if (r0 == 0) goto L_0x0076
            goto L_0x00ee
        L_0x0159:
            boolean r1 = X.AnonymousClass3MZ.A1W(r11)
            if (r1 == 0) goto L_0x0076
            if (r29 == 0) goto L_0x0076
            boolean r1 = r11.A7T
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = "player_start_pos"
            int r1 = r0.getIntExtra(r1, r4)
            if (r1 == r4) goto L_0x0076
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r11)
            X.00H r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.170 r0 = (X.AnonymousClass170) r0
            X.3uK r0 = r0.A01
            if (r0 == 0) goto L_0x0076
            X.4VQ r0 = r0.A06
            if (r0 == 0) goto L_0x0076
            r0.hashCode()
            X.49n r0 = r0.A0E
            r0.A0M(r1)
            return
        L_0x018a:
            X.4Ys r5 = X.C72473Md.A0Q(r11)
            X.1F9 r6 = X.AnonymousClass3MX.A0P(r11)
            r2 = 2
            X.C18070vi.A0d(r6, r2)
            if (r29 == 0) goto L_0x0076
            java.lang.String r2 = "android.intent.extra.STREAM"
            java.util.ArrayList r2 = r0.getParcelableArrayListExtra(r2)
            if (r2 == 0) goto L_0x0076
            java.lang.Object r3 = X.C29431cG.A0c(r2)
            android.net.Uri r3 = (android.net.Uri) r3
            if (r3 == 0) goto L_0x0076
            X.3rd r2 = r5.A00
            if (r2 == 0) goto L_0x0076
            X.3Wj r2 = r2.A05
            java.util.List r2 = r2.A04
            java.util.Iterator r8 = r2.iterator()
        L_0x01b4:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x01cb
            java.lang.Object r2 = r8.next()
            X.4cI r2 = (X.C89334cI) r2
            android.net.Uri r2 = r2.A00
            boolean r2 = X.C18070vi.A18(r2, r3)
            if (r2 != 0) goto L_0x01cc
            int r1 = r1 + 1
            goto L_0x01b4
        L_0x01cb:
            r1 = -1
        L_0x01cc:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            if (r8 == 0) goto L_0x0076
            int r2 = r8.intValue()
            if (r2 == r4) goto L_0x0076
            X.3rd r1 = r5.A00
            if (r1 == 0) goto L_0x0076
            X.3Wj r1 = r1.A05
            java.util.List r1 = r1.A04
            java.lang.Object r4 = r1.get(r2)
            if (r4 == 0) goto L_0x0076
            if (r28 != 0) goto L_0x020f
            X.73D r0 = r5.A04
            X.72S r3 = r0.A03(r3)
            if (r3 == 0) goto L_0x01fc
            X.10I r2 = r5.A0A
            r1 = 16
            X.AkI r0 = new X.AkI
            r0.<init>(r5, r3, r1)
            r2.CGF(r0)
        L_0x01fc:
            java.util.List r0 = X.C18070vi.A0M(r4)
            X.1wy r2 = r5.A01(r0)
            X.5UX r1 = new X.5UX
            r1.<init>(r5, r8)
            r0 = 11
            X.AnonymousClass3MY.A1K(r6, r2, r1, r0)
            return
        L_0x020f:
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0076
            X.73D r1 = r5.A04
            android.os.Bundle r0 = r0.getExtras()
            r1.A05(r0)
            X.3rd r0 = r5.A00
            if (r0 == 0) goto L_0x0076
            X.3Wj r1 = r0.A05
            if (r2 < 0) goto L_0x0076
            java.util.List r0 = r1.A04
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0076
            r1.A0G(r2)
            return
        L_0x0232:
            if (r7 != r4) goto L_0x0076
            X.5cQ r0 = r11.A2Q
            android.view.View r4 = r0.getContentView()
            X.5cQ r2 = r11.A2Q
            r0 = 2131898397(0x7f12301d, float:1.943171E38)
            java.lang.String r7 = r2.getString(r0)
            java.util.List r8 = java.util.Collections.emptyList()
            X.11C r0 = r11.A2f
            X.1FY r5 = X.AnonymousClass3MW.A0P(r11)
            r9 = 2000(0x7d0, float:2.803E-42)
            X.4eK r3 = new X.4eK
            r6 = r0
            r10 = r1
            r3.<init>((android.view.View) r4, (X.AnonymousClass1F9) r5, (X.AnonymousClass11C) r6, (java.lang.String) r7, (java.util.List) r8, (int) r9, (boolean) r10)
            r2 = 2131897301(0x7f122bd5, float:1.9429488E38)
            r1 = 41
            X.4dE r0 = new X.4dE
            r0.<init>(r11, r1)
            r3.A06(r0, r2)
            X.1FY r2 = X.AnonymousClass3MW.A0Q(r11)
            r1 = 2130971311(0x7f040aaf, float:1.7551357E38)
            r0 = 2131102579(0x7f060b73, float:1.78176E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r3.A05(r0)
            r3.A03()
            return
        L_0x0278:
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r11)
            X.00H r0 = r0.A0L
            java.lang.Object r0 = r0.get()
            X.4iM r0 = (X.C93054iM) r0
            X.1rn r0 = r0.A00
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0076
            goto L_0x02fd
        L_0x028d:
            if (r29 == 0) goto L_0x0076
            java.lang.String r1 = "error_code"
            int r1 = r0.getIntExtra(r1, r4)
            r0 = 475(0x1db, float:6.66E-43)
            if (r1 != r0) goto L_0x0076
            X.00H r0 = r11.A6B
            java.lang.Object r1 = r0.get()
            X.A2V r1 = (X.A2V) r1
            X.1FY r0 = X.AnonymousClass3MW.A0P(r11)
            X.A2X r1 = r1.A01(r0)
            X.4qi r0 = new X.4qi
            r0.<init>()
            r1.A02(r0)
            return
        L_0x02b2:
            boolean r0 = A2A(r11)
            if (r0 == 0) goto L_0x0076
            X.00H r0 = r11.A6F
            java.lang.Object r0 = r0.get()
            X.17x r0 = (X.C219217x) r0
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0076
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r11)
            X.00H r0 = r0.A0N
            java.lang.Object r3 = r0.get()
            X.4XB r3 = (X.AnonymousClass4XB) r3
            r0 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 76
            X.2Hl r0 = new X.2Hl
            r0.<init>()
            X.AnonymousClass3MZ.A1T(r0, r2)
            X.AnonymousClass4XB.A00(r0, r3, r1)
            A0t(r11)
            return
        L_0x02e9:
            X.10I r4 = r11.A4c
            r3 = 4
            X.4rj r0 = new X.4rj
            r0.<init>((X.AnonymousClass4aY) r11, (int) r3)
            r4.CGF(r0)
            A1H(r11)
            X.1E7 r0 = r11.A35
            int r0 = r0.A00
            if (r0 != r2) goto L_0x0076
        L_0x02fd:
            X.4PL r0 = r11.A29
            r11.A2o(r0, r1, r1)
            return
        L_0x0303:
            if (r28 != 0) goto L_0x0076
            X.1FY r3 = X.AnonymousClass3MW.A0P(r11)
            X.5cQ r1 = r11.A2Q
            android.view.View r2 = r1.getContentView()
            r1 = 53
            X.Bik r0 = X.C87504Vv.A00(r3, r0, r2, r1)
            r0.A08()
            return
        L_0x0319:
            if (r7 != r4) goto L_0x0076
            if (r29 == 0) goto L_0x0076
            java.lang.String r2 = "contact"
            java.lang.String r0 = r0.getStringExtra(r2)
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A02(r0)
            if (r3 == 0) goto L_0x0076
            X.1FY r0 = X.AnonymousClass3MW.A0P(r11)
            android.content.Intent r2 = X.AnonymousClass1LU.A0C(r0, r1)
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A12(r2, r3, r0)
            X.1BI r0 = r11.A3R
            java.lang.String r1 = X.C22971Dz.A06(r0)
            java.lang.String r0 = "group_reply_jid"
            r2.putExtra(r0, r1)
            X.5cQ r0 = r11.A2Q
            r0.startActivity(r2)
            X.5cQ r0 = r11.A2Q
            r0.finish()
            return
        L_0x034c:
            if (r7 != r4) goto L_0x0076
            com.whatsapp.conversation.ConversationListView r0 = r11.A2B
            r0.A0Q = r2
            A0m(r11)
            A0d(r11)
            return
        L_0x0359:
            if (r29 == 0) goto L_0x0076
            if (r7 != r4) goto L_0x0076
            java.lang.Class<X.1BI> r3 = X.AnonymousClass1BI.class
            java.util.ArrayList r19 = X.C72463Mc.A0r(r0, r3)
            X.1BI r5 = X.C22971Dz.A01(r19)
            r3 = 0
            if (r5 == 0) goto L_0x036b
            r3 = 1
        L_0x036b:
            r12 = 0
            if (r3 == 0) goto L_0x03d3
            android.os.Bundle r5 = r0.getExtras()
            if (r5 == 0) goto L_0x037e
            X.36j r12 = new X.36j
            r12.<init>()
            X.00H r3 = r11.A65
            X.C72473Md.A0v(r5, r12, r3)
        L_0x037e:
            java.lang.String r3 = "audience_clicked"
            boolean r24 = r0.getBooleanExtra(r3, r1)
            java.lang.String r3 = "audience_updated"
            boolean r25 = r0.getBooleanExtra(r3, r1)
        L_0x038a:
            java.lang.String r3 = "file_path"
            java.lang.String r13 = r0.getStringExtra(r3)
            java.lang.String r3 = "media_url"
            java.lang.String r14 = r0.getStringExtra(r3)
            java.lang.String r3 = "media_width"
            int r20 = r0.getIntExtra(r3, r4)
            java.lang.String r3 = "media_height"
            int r21 = r0.getIntExtra(r3, r4)
            java.lang.String r3 = "content_description"
            java.lang.String r15 = r0.getStringExtra(r3)
            java.lang.String r3 = "caption"
            java.lang.String r16 = r0.getStringExtra(r3)
            java.lang.String r3 = "mentions"
            java.lang.String r17 = r0.getStringExtra(r3)
            java.lang.String r3 = "preview_media_url"
            java.lang.String r18 = r0.getStringExtra(r3)
            java.lang.String r3 = "provider"
            int r4 = r0.getIntExtra(r3, r1)
            r3 = 1
            if (r4 == r2) goto L_0x03c7
            r3 = 2
            if (r4 == r3) goto L_0x03c7
            r3 = 0
        L_0x03c7:
            java.lang.String r2 = "clear_message_after_send"
            boolean r23 = r0.getBooleanExtra(r2, r1)
            r22 = r3
            A1Z(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        L_0x03d3:
            r24 = 0
            r25 = 0
            goto L_0x038a
        L_0x03d8:
            if (r7 != r4) goto L_0x0076
            com.whatsapp.mentions.MentionableEntry r1 = r11.A3Z
            java.lang.String r0 = ""
            r1.setText(r0)
            X.0ve r0 = r11.A3F
            boolean r0 = X.C87544Vz.A01(r0)
            if (r0 == 0) goto L_0x0076
            X.5tO r0 = r11.A24
            r0.A0K()
            return
        L_0x03ef:
            if (r7 != r4) goto L_0x0076
            com.whatsapp.conversation.ConversationListView r0 = r11.A2B
            r0.A0Q = r2
            return
        L_0x03f6:
            if (r7 != r4) goto L_0x0076
            java.lang.String r3 = "ad_creation_tapped"
            boolean r3 = r0.getBooleanExtra(r3, r1)
            if (r3 == 0) goto L_0x0529
            X.0zA r1 = r11.A0k
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x054e
            r1.A03()
            X.5cQ r0 = r11.A2Q
            r0.getActivityNullable()
            X.5cQ r0 = r11.A2Q
            r0.getForwardMessages()
            java.lang.String r0 = "handleAdvertiseForwardClick"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x041c:
            X.1FY r1 = X.AnonymousClass3MW.A0P(r11)
            X.1GP r1 = r1.getSupportFragmentManager()
            X.1GR r1 = r1.A0U
            java.util.List r1 = r1.A04()
            java.util.Iterator r3 = r1.iterator()
        L_0x042e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0076
            java.lang.Object r2 = r3.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r1 = r2 instanceof com.whatsapp.events.EventInfoBottomSheet
            if (r1 == 0) goto L_0x042e
            r2.A1w(r8, r7, r0)
            return
        L_0x0442:
            com.whatsapp.mentions.MentionableEntry r1 = r11.A3Z
            r1.clearComposingText()
            X.0ve r8 = r11.A3F
            r3 = 11376(0x2c70, float:1.5941E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r8, r3)
            if (r1 == 0) goto L_0x0479
            X.5tO r1 = r11.A24
            java.util.List r1 = r1.A03
            r1.clear()
            if (r29 == 0) goto L_0x0479
            java.lang.String r1 = "result_extra_discard_selection"
            boolean r1 = r0.getBooleanExtra(r1, r2)
            if (r1 == 0) goto L_0x0479
            java.lang.String r3 = "result_extra_media_selection"
            boolean r1 = r0.hasExtra(r3)
            if (r1 == 0) goto L_0x0479
            java.util.ArrayList r3 = r0.getParcelableArrayListExtra(r3)
            if (r3 == 0) goto L_0x0479
            X.5tO r1 = r11.A24
            java.util.List r1 = r1.A03
            r1.addAll(r3)
        L_0x0479:
            if (r7 != r4) goto L_0x0493
            boolean r1 = A25(r11)
            if (r1 == 0) goto L_0x07da
            if (r29 == 0) goto L_0x07da
            java.lang.String r3 = "android.intent.extra.STREAM"
            boolean r1 = r0.hasExtra(r3)
            if (r1 == 0) goto L_0x07da
            java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r3)
            A0O(r6, r11, r0)
            return
        L_0x0493:
            if (r28 != 0) goto L_0x0076
            boolean r0 = A25(r11)
            if (r0 == 0) goto L_0x0076
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r11)
            X.00H r0 = r0.A0J
            java.lang.Object r0 = r0.get()
            X.2K6 r0 = (X.AnonymousClass2K6) r0
            r0.A06()
            return
        L_0x04ab:
            if (r7 != r4) goto L_0x04f0
            X.1BI r0 = r11.A3R
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x04f0
            X.0z4 r0 = r11.A2j
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r0)
            java.lang.String r3 = "first_channel_message_edit_modal_shown"
            boolean r0 = r0.getBoolean(r3, r1)
            if (r0 != 0) goto L_0x04f0
            X.0z4 r0 = r11.A2j
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)
            X.C17880vN.A1F(r0, r3, r2)
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r11)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131890426(0x7f1210fa, float:1.9415543E38)
            r3.A0D(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            r3.A0Z(r6, r0)
            r2 = 2131899101(0x7f1232dd, float:1.9433138E38)
            r1 = 24
            X.4bA r0 = new X.4bA
            r0.<init>(r11, r1)
            r3.A0X(r0, r2)
            r3.A0C()
        L_0x04f0:
            com.whatsapp.mentions.MentionableEntry r0 = r11.A3Z
            r0.requestFocus()
            return
        L_0x04f6:
            X.2hA r1 = X.AnonymousClass3MZ.A0k(r11)
            X.00H r1 = r1.A0A
            java.lang.Object r1 = r1.get()
            X.73Z r1 = (X.AnonymousClass73Z) r1
            r1.A04(r0)
            return
        L_0x0506:
            A0j(r11)
            X.2hA r1 = X.AnonymousClass3MZ.A0k(r11)
            X.00H r1 = r1.A0A
            java.lang.Object r1 = r1.get()
            X.73Z r1 = (X.AnonymousClass73Z) r1
            r1.A05(r0, r7, r5, r2)
            return
        L_0x0519:
            if (r7 != r4) goto L_0x0522
            X.77J r0 = r11.A3N
            if (r0 == 0) goto L_0x0522
            A1V(r11, r0)
        L_0x0522:
            r11.A3N = r6
            return
        L_0x0525:
            A0r(r11)
            return
        L_0x0529:
            X.5cQ r3 = r11.A2Q
            java.util.Collection r5 = r3.getForwardMessages()
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x07c9
            java.lang.String r3 = "share_action_id"
            int r3 = r0.getIntExtra(r3, r4)
            if (r3 == r4) goto L_0x0554
            X.CVV r2 = r11.A45
            java.util.Iterator r0 = r5.iterator()
            X.206 r1 = X.C17880vN.A0Y(r0)
            X.1FY r0 = X.AnonymousClass3MW.A0P(r11)
            r2.A00(r0, r1, r3)
        L_0x054e:
            X.5cQ r0 = r11.A2Q
            r0.BLL()
            return
        L_0x0554:
            java.lang.Class<X.1BI> r3 = X.AnonymousClass1BI.class
            java.util.ArrayList r3 = X.C72463Mc.A0r(r0, r3)
            java.lang.String r4 = "include_captions"
            boolean r20 = r0.getBooleanExtra(r4, r1)
            java.lang.String r4 = "appended_message"
            java.lang.String r18 = r0.getStringExtra(r4)
            X.1BI r4 = X.C22971Dz.A01(r3)
            if (r4 == 0) goto L_0x057d
            X.C17960vV.A07(r0)
            android.os.Bundle r4 = r0.getExtras()
            X.36j r6 = new X.36j
            r6.<init>()
            X.00H r0 = r11.A65
            X.C72473Md.A0v(r4, r6, r0)
        L_0x057d:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>(r3)
            X.1BI r0 = r11.A3R
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x0725
            X.1BI r7 = X.C22971Dz.A01(r3)
            if (r7 == 0) goto L_0x0725
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r11)
            X.00H r0 = r0.A0F
            java.lang.Object r0 = r0.get()
            X.61n r0 = (X.C1179361n) r0
            boolean r0 = r0.A05(r5)
            if (r0 == 0) goto L_0x0725
            X.1FY r14 = X.AnonymousClass3MW.A0Q(r11)
            X.5cQ r4 = r11.A2Q
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r4.CNA(r0)
            X.10I r4 = r11.A4c
            r19 = 5
            X.AkU r0 = new X.AkU
            r12 = r0
            r13 = r5
            r15 = r7
            r16 = r11
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r4.CGF(r0)
            r10 = 1
            r8.remove(r7)
        L_0x05c5:
            X.1iW r14 = X.AnonymousClass3MX.A0X(r11)
            X.1kd r15 = r11.A1R
            java.util.ArrayList r7 = X.C17880vN.A10(r5)
            r4 = 15
            X.4rw r0 = new X.4rw
            r0.<init>(r4)
            java.util.Collections.sort(r7, r0)
            r17 = r18
            r16 = r6
            r18 = r7
            r19 = r8
            r14.A0N(r15, r16, r17, r18, r19, r20)
            X.4Xm r6 = r11.A3H
            X.4fO r4 = new X.4fO
            r4.<init>(r2)
            r0 = 4
            r6.A01(r4, r0)
            X.1c4 r4 = X.AnonymousClass4X5.A00(r11)
            X.1BI r0 = r11.A3R
            boolean r9 = X.C22971Dz.A0V(r0)
            X.0ve r8 = r4.A02
            r7 = 12346(0x303a, float:1.73E-41)
            X.0vf r6 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r6, r8, r7)
            r0 = 2
            if (r4 == r0) goto L_0x060e
            if (r9 == 0) goto L_0x0728
            int r0 = X.C18020vd.A00(r6, r8, r7)
            if (r0 != r2) goto L_0x0728
        L_0x060e:
            X.4OW r0 = r11.A7K
            if (r0 != 0) goto L_0x0633
            X.2X4 r0 = r11.A0y
            X.1FY r5 = X.AnonymousClass3MW.A0P(r11)
            X.5cQ r1 = r11.A2Q
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.1LU r9 = X.AnonymousClass3MY.A0Z(r0)
            X.1M9 r6 = X.AnonymousClass10E.A4z(r0)
            X.11C r8 = X.AnonymousClass3Ma.A0a(r0)
            X.4OW r0 = new X.4OW
            r4 = r0
            r7 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r11.A7K = r0
        L_0x0633:
            X.1BI r5 = r11.A3R
            r1 = 0
            X.C18070vi.A0d(r5, r2)
            int r4 = r3.size()
            if (r4 != r2) goto L_0x06c4
            java.lang.Object r4 = r3.get(r1)
            X.1BI r4 = (X.AnonymousClass1BI) r4
            boolean r3 = X.C22971Dz.A0a(r4)
            if (r3 != 0) goto L_0x054e
            boolean r3 = r5.equals(r4)
            if (r3 != 0) goto L_0x054e
            X.C18070vi.A0d(r4, r1)
            boolean r3 = X.C22971Dz.A0a(r4)
            if (r3 != 0) goto L_0x054e
            X.5cQ r3 = r0.A02
            r7 = 2131895753(0x7f1225c9, float:1.9426348E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.1Me r5 = r3.getWAContactNames()
            X.1M9 r2 = r0.A01
            java.lang.String r2 = X.AnonymousClass3MY.A0p(r2, r5, r4)
            java.lang.String r2 = X.C63462t7.A02(r2)
            r6[r1] = r2
            java.lang.String r16 = r3.getString(r7, r6)
            X.C18070vi.A0X(r16)
            X.1FY r14 = r0.A00
            r2 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r13 = X.AnonymousClass3MY.A0C(r14, r2)
            java.util.List r17 = java.util.Collections.emptyList()
            X.C18070vi.A0X(r17)
            X.11C r15 = r0.A03
            r18 = -1
            X.4eK r12 = new X.4eK
            r19 = r1
            r12.<init>((android.view.View) r13, (X.AnonymousClass1F9) r14, (X.AnonymousClass11C) r15, (java.lang.String) r16, (java.util.List) r17, (int) r18, (boolean) r19)
            boolean r2 = X.C22971Dz.A0V(r4)
            r1 = 2131897872(0x7f122e10, float:1.9430646E38)
            if (r2 == 0) goto L_0x069f
            r1 = 2131897902(0x7f122e2e, float:1.9430707E38)
        L_0x069f:
            java.lang.String r3 = r3.getString(r1)
            X.C18070vi.A0X(r3)
            r2 = 46
            X.48h r1 = new X.48h
            r1.<init>(r4, r0, r2)
            X.Bik r0 = r12.A01
            r0.A0G(r3, r1)
            r1 = 2130971311(0x7f040aaf, float:1.7551357E38)
            r0 = 2131102579(0x7f060b73, float:1.78176E38)
            int r0 = X.AnonymousClass3Ma.A00(r14, r1, r0)
            r12.A04(r0)
        L_0x06bf:
            r12.A03()
            goto L_0x054e
        L_0x06c4:
            java.util.Iterator r5 = r3.iterator()
        L_0x06c8:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x071f
            com.whatsapp.jid.Jid r4 = X.C17880vN.A0S(r5)
            boolean r4 = X.C22971Dz.A0V(r4)
            if (r4 != 0) goto L_0x06c8
            X.1BI r4 = X.C22971Dz.A01(r3)
            if (r4 != 0) goto L_0x0715
            boolean r4 = X.C22971Dz.A0h(r3)
            if (r4 != 0) goto L_0x0715
            X.5cQ r6 = r0.A02
            r5 = 2131895754(0x7f1225ca, float:1.942635E38)
        L_0x06e9:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r2 = r3.size()
            X.C17880vN.A1T(r4, r2, r1)
            java.lang.String r16 = r6.getString(r5, r4)
        L_0x06f6:
            X.C18070vi.A0b(r16)
            X.1FY r14 = r0.A00
            r2 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r13 = X.AnonymousClass3MY.A0C(r14, r2)
            java.util.List r17 = java.util.Collections.emptyList()
            X.C18070vi.A0X(r17)
            X.11C r15 = r0.A03
            r18 = -1
            X.4eK r12 = new X.4eK
            r19 = r1
            r12.<init>((android.view.View) r13, (X.AnonymousClass1F9) r14, (X.AnonymousClass11C) r15, (java.lang.String) r16, (java.util.List) r17, (int) r18, (boolean) r19)
            goto L_0x06bf
        L_0x0715:
            X.5cQ r3 = r0.A02
            r2 = 2131895746(0x7f1225c2, float:1.9426334E38)
            java.lang.String r16 = r3.getString(r2)
            goto L_0x06f6
        L_0x071f:
            X.5cQ r6 = r0.A02
            r5 = 2131895755(0x7f1225cb, float:1.9426352E38)
            goto L_0x06e9
        L_0x0725:
            r10 = 0
            goto L_0x05c5
        L_0x0728:
            int r0 = r3.size()
            if (r0 != r2) goto L_0x07c0
            java.lang.Object r0 = r3.get(r1)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C22971Dz.A0a(r0)
            if (r0 != 0) goto L_0x07c0
            X.1BI r4 = r11.A3R
            X.C17960vV.A07(r4)
            java.lang.Object r0 = r3.get(r1)
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x054e
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0779
            int r0 = r5.size()
            if (r0 != r2) goto L_0x079a
            java.util.Iterator r0 = r5.iterator()
            X.206 r0 = X.C17880vN.A0Y(r0)
            int r4 = r0.A0u
            r0 = 20
            if (r4 != r0) goto L_0x079a
            X.1FY r5 = X.AnonymousClass3MW.A0P(r11)
            X.5cQ r0 = r11.A2Q
            X.11C r4 = r0.getSystemServices()
            X.5cQ r2 = r11.A2Q
            r0 = 2131896433(0x7f122871, float:1.9427727E38)
            java.lang.String r0 = r2.getString(r0)
            X.AnonymousClass1Y5.A00(r5, r4, r0)
        L_0x0779:
            X.5cQ r0 = r11.A2Q
            X.1L9 r6 = r0.getActivityUtils()
            X.1FY r5 = X.AnonymousClass3MW.A0P(r11)
            X.1LU r4 = r11.A3Q
            X.1FY r2 = X.AnonymousClass3MW.A0P(r11)
            java.lang.Object r0 = r3.get(r1)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            android.content.Intent r1 = r4.A1w(r2, r0, r1)
            java.lang.String r0 = "Conversation:forwardMessage"
            r6.A0B(r5, r1, r0)
            goto L_0x054e
        L_0x079a:
            X.1FY r9 = X.AnonymousClass3MW.A0P(r11)
            X.5cQ r0 = r11.A2Q
            X.11C r8 = r0.getSystemServices()
            android.content.res.Resources r7 = X.AnonymousClass3MW.A04(r11)
            r6 = 2131755235(0x7f1000e3, float:1.9141344E38)
            int r4 = r5.size()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r0 = r5.size()
            X.C17880vN.A1T(r2, r0, r1)
            java.lang.String r0 = r7.getQuantityString(r6, r4, r2)
            X.AnonymousClass1Y5.A00(r9, r8, r0)
            goto L_0x0779
        L_0x07c0:
            r1 = r10 ^ 1
            X.5cQ r0 = r11.A2Q
            r0.CPW(r3, r1)
            goto L_0x054e
        L_0x07c9:
            java.lang.String r0 = "conversation/forward/failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1KB r2 = X.AnonymousClass3MX.A0U(r11)
            r0 = 2131892058(0x7f12175a, float:1.9418854E38)
            r2.A08(r0, r1)
            goto L_0x054e
        L_0x07da:
            A0m(r11)
            A0d(r11)
            X.0ve r0 = r11.A3F
            boolean r0 = X.C87544Vz.A01(r0)
            if (r0 == 0) goto L_0x07ed
            X.5tO r0 = r11.A24
            r0.A0K()
        L_0x07ed:
            com.whatsapp.conversation.ConversationListView r0 = r11.A2B
            r0.A0B(r2)
            android.view.ViewGroup r0 = r11.A0S
            r0.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2h(int, int, android.content.Intent):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.4aY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.1BI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: X.3UN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: X.3UN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: X.4aY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v241, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v244, resolved type: X.3UN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v490, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v491, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v255, resolved type: X.3UN} */
    /* JADX WARNING: type inference failed for: r1v44, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r40v5, types: [X.4GR, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r41v7, types: [X.4Ga, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r103v2, types: [X.4HF, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x07e9, code lost:
        if (r12.A0E() == false) goto L_0x07eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0800, code lost:
        if (r9.A02.A0D(r11) == false) goto L_0x0802;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0803, code lost:
        if (r5 != false) goto L_0x0805;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0805, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x080e, code lost:
        if (r9.A02.A00.A01(r11) != false) goto L_0x0811;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0810, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0811, code lost:
        r39 = r12.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0815, code lost:
        if (r13 == false) goto L_0x081f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0817, code lost:
        r40 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x081d, code lost:
        if (X.C42701yb.A01(r11) != false) goto L_0x0821;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x081f, code lost:
        r40 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0821, code lost:
        if (r38 != false) goto L_0x082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0823, code lost:
        if (r13 != false) goto L_0x082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0825, code lost:
        if (r5 != false) goto L_0x082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0827, code lost:
        if (r39 != false) goto L_0x082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x082a, code lost:
        r35 = new X.C136036tA(X.AnonymousClass3MW.A00(r10.getResources(), 2131165493), r10.getResources().getDimensionPixelSize(2131165494), r38, r39, r40);
        r5 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0849, code lost:
        if (r38 != false) goto L_0x084f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x084b, code lost:
        if (r13 != false) goto L_0x084f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x084d, code lost:
        if (r39 == false) goto L_0x0850;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x084f, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0850, code lost:
        r4 = (X.AnonymousClass3UN) X.C91784gF.A00(r6, r5, r35, r4, 7).A00(X.AnonymousClass3UN.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x085d, code lost:
        r2.A4A = r4;
        A0D();
        X.C91594fw.A00(X.AnonymousClass3MX.A0P(r2), (X.AnonymousClass1DT) ((X.AnonymousClass8Fn) X.C72463Mc.A0U(r2).A00(X.AnonymousClass8Fn.class)).A00.getValue(), r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0887, code lost:
        if (r2.A3l.A01() == false) goto L_0x08db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0889, code lost:
        r6 = r2.A3s;
        r5 = X.AnonymousClass3MW.A0j(r2);
        r4 = X.AnonymousClass11S.A00(r2.A1O);
        r1 = X.C63572tK.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x089f, code lost:
        if (r6.A0i(r2.A36, r5, r4, "55") == false) goto L_0x08db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x08a1, code lost:
        r1 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) X.C72463Mc.A0U(r2).A00(com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel.class);
        r2.A3p = r1;
        ((X.AnonymousClass1DT) r1.A05.getValue()).A0A(X.AnonymousClass3MX.A0P(r2), new X.C20336AGs(r2, 1));
        ((X.AnonymousClass1DT) r2.A3p.A07.getValue()).A0A(X.AnonymousClass3MX.A0P(r2), new X.C20336AGs(r2, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x08db, code lost:
        A1d(r2, "initViewModelsAfterJid_end");
        A1d(r2, "add_chat_annotations_start");
        r3 = r2.A2U;
        r1 = r3.A01;
        r4 = new X.C694837j(r3, 0);
        r1 = r1.A01;
        r1.A07.Bit(r4, r1.A05.A06);
        r2.A2U.A00(r2.A35);
        r1 = r2.A2U;
        r4 = ((X.C25431Oe) r1.A06.get()).A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x090e, code lost:
        if (r4 == null) goto L_0x0919;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0910, code lost:
        r1.A01.A01.A0A("chat_session_id", r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0919, code lost:
        r6 = r2.A2U;
        r5 = X.AnonymousClass3MW.A0P(r2);
        r4 = r2.A3R;
        r3 = r6.A01;
        r1 = new X.C97714pv(r5, r6, r4, 1);
        r3 = r3.A01;
        r3.A07.Bit(r1, r3.A05.A06);
        A1d(r2, "add_chat_annotations_end");
        r3 = r2.A29;
        r1 = r3.A0e;
        X.C17960vV.A07(java.lang.Boolean.valueOf(r1));
        r2.A6g = r1;
        r1 = r3.A0g;
        X.C17960vV.A07(java.lang.Boolean.valueOf(r1));
        r2.A6i = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0956, code lost:
        if (X.C22971Dz.A0V(r2.A3R) == false) goto L_0x096f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0958, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x096d, code lost:
        if (((X.C86454Rr) X.AnonymousClass3Ma.A0Y(r2).A0I.get()).A01((X.C29681ch) r2.A3R) != false) goto L_0x0970;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x096f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0970, code lost:
        r2.A6q = r1;
        r1 = r2.A29;
        r2.A6N = r1.A0F;
        r2.A6Z = r1.A0Y;
        r2.A2b.A0I = r1.A0X;
        r2.A2s.A00();
        r4 = r2.A2p.A0W;
        r1 = r2.A2r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x098d, code lost:
        if (r4 != false) goto L_0x099d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x099b, code lost:
        if (X.C18020vd.A05(r28, r1.A00.A00, 976) == false) goto L_0x0ade;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x09a3, code lost:
        if (r2.A2r.A00() != false) goto L_0x0ade;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x09a5, code lost:
        r5 = r2.A4c;
        r3 = new X.C98794rj(r2, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x09ac, code lost:
        r5.CGF(r3);
        r3 = X.AnonymousClass000.A10();
        r3.append("conversation/onCreate entryPoint=");
        X.C17890vO.A1A(r3, r2.A29.A0L);
        r3 = r2.A29;
        r2.A6U = r3.A0L;
        r2.A6R = r3.A0I;
        r2.A6T = r3.A0K;
        r2.A6S = r3.A0J;
        r6 = ((X.C88444Zs) r2.A5I.get()).A00;
        r5 = r2.A3R;
        r3 = r2.A2p;
        X.C18070vi.A0d(r5, 0);
        X.C18070vi.A0d(r3, 1);
        r1 = r3.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x09e7, code lost:
        if (r1 == null) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x09ed, code lost:
        if (r1.length() == 0) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x09ef, code lost:
        r1 = r3.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x09f1, code lost:
        if (r1 == null) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x09f7, code lost:
        if (r1.length() == 0) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x09ff, code lost:
        if (r6.A02.A0P(r5) != false) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0a0b, code lost:
        if (X.C18020vd.A05(r28, r6.A03, 2666) == false) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0a0d, code lost:
        r3 = r6.A00.A0H(r5);
        r6.A01.A05(X.C49502Qs.CTWA, r5, (java.lang.Runnable) null, r3.A0K(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0a26, code lost:
        r1 = ((X.AnonymousClass4O3) ((X.C88444Zs) r2.A5I.get()).A02.get()).A00;
        r12 = r2.A2d;
        r11 = r2.A29.A07;
        r45 = X.C88444Zs.A02(r2);
        r1 = r1.A00;
        r9 = r1.A00;
        r10 = r9.AAO;
        r3 = r1.A01;
        r37 = X.AnonymousClass10E.A12(r3);
        r46 = X.AnonymousClass10E.A8r(r3);
        r47 = X.AnonymousClass3MY.A0d(r3);
        r1 = r3.A00;
        r48 = X.AnonymousClass3MZ.A12(r3);
        r2.A2q = new X.AnonymousClass4VR(r10, r37, (X.AnonymousClass181) r3.AA9.get(), X.AnonymousClass3MZ.A0V(r9), X.AnonymousClass1K1.A12(r9), r12, r11, (X.AnonymousClass4XK) r1.A2a.get(), (X.C84884Lf) r1.A2b.get(), r45, r46, r47, r48, X.AnonymousClass3Ma.A0w(r1));
        r4 = X.AnonymousClass3MX.A0h(r2);
        X.C18070vi.A0d(r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0aa7, code lost:
        if (X.C18020vd.A05(r28, r4, 508) == false) goto L_0x0ab1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0aab, code lost:
        if (r2.A6U != null) goto L_0x0ad0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0aaf, code lost:
        if (r2.A6T != null) goto L_0x0ad0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0ab1, code lost:
        r2.A6o = X.C22971Dz.A0N(r2.A35.A0J);
        r5 = r2.A3R;
        r4 = X.C22941Dw.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0acd, code lost:
        if (X.C43391zj.A04(r2.A2Q.getContactManager(), r2.A2w, r5) == false) goto L_0x0afc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0ad0, code lost:
        r3 = X.AnonymousClass3MW.A0j(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0ad4, code lost:
        if (r3 == null) goto L_0x0ab1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0ad6, code lost:
        X.C98704ra.A00(X.AnonymousClass3MX.A0w(r2), r2, r3, 30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0ade, code lost:
        r5 = r2.A4c;
        r3 = new X.AnonymousClass7RK(40, (java.lang.Object) r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0ae9, code lost:
        if (r4 == null) goto L_0x0afc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0af1, code lost:
        if (r2.A4H.A01(r4) != false) goto L_0x0afc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0af3, code lost:
        X.AnonymousClass3MX.A0X(r2).A0Z(r4, (java.lang.Boolean) null, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0afc, code lost:
        r2.A7U = true;
        A1d(r2, "inflateViews_start");
        r4 = X.C18020vd.A05(r28, X.AnonymousClass3MX.A0h(r2), 12815);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0b0f, code lost:
        if (r4 == false) goto L_0x0b20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0b11, code lost:
        r1 = (X.AnonymousClass4OA) r2.A5V.get();
        r1.A00 = true;
        r1.A03.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0b24, code lost:
        if (A26(r2) == false) goto L_0x0b2f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0b26, code lost:
        r3 = r2.A2Q;
        r1 = 2131624715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0b2b, code lost:
        r3.setContentView(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0b2f, code lost:
        r3 = r2.A2Q;
        r1 = 2131624698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0b35, code lost:
        if (r4 == false) goto L_0x0b58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0b37, code lost:
        r9 = (X.AnonymousClass4OA) r2.A5V.get();
        r9.A00 = false;
        X.AnonymousClass3MX.A0x(r9.A01).CGF(new X.C21433Ak0(r9, new java.util.HashMap(r9.A03), 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0b58, code lost:
        A1d(r2, "inflateViews_end");
        A1d(r2, "viewStubInflation_start");
        r1 = r2.A2Q.findViewById(2131434891);
        X.C17960vV.A05(r1);
        r2.A4Y = X.AnonymousClass3MW.A0p(r1);
        r2.A4a = X.C72453Mb.A0r(X.AnonymousClass3MW.A0P(r2), 2131435617);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0b8b, code lost:
        if (X.C18020vd.A05(r28, r2.A3F, 12067) != false) goto L_0x0baa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0b8d, code lost:
        A1p(r2.A2Q, 2131436864);
        A1p(r2.A2Q, 2131436865);
        r2.A4Y.A02();
        A1p(r2.A2Q, 2131433352);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0bb4, code lost:
        if (X.C18020vd.A05(r28, r2.A3F, 12068) != false) goto L_0x0bd2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0bb6, code lost:
        X.C72453Mb.A0t(r2.A2Q, 2131429329).A02();
        A1p(r2.A2Q, 2131434126);
        A1p(r2.A2Q, 2131435555);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0bdc, code lost:
        if (X.C18020vd.A05(r28, r2.A3F, 12066) != false) goto L_0x0be3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0bde, code lost:
        r2.A4a.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0bed, code lost:
        if (X.C18020vd.A05(r28, r2.A3F, 12069) != false) goto L_0x0bff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0bef, code lost:
        r1 = r2.A2Q.findViewById(2131431492);
        X.C17960vV.A05(r1);
        X.C72463Mc.A1G(X.AnonymousClass3MW.A0p(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0bff, code lost:
        A1d(r2, "viewStubInflation_end");
        A1d(r2, "setupToolbar_start");
        r1 = (androidx.appcompat.widget.Toolbar) X.C110885hR.A0A(X.AnonymousClass3MW.A0P(r2), 2131429583).findViewById(2131436270);
        r2.A0f = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0c1f, code lost:
        if (r1 == null) goto L_0x0c24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0c21, code lost:
        A0T(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0c24, code lost:
        A1d(r2, "setupToolbar_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0c2b, code lost:
        if (r2.A3R == null) goto L_0x0c46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0c33, code lost:
        if (X.AnonymousClass1J8.A03(r2.A3F) == false) goto L_0x0c46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0c41, code lost:
        if (X.C18020vd.A00(r28, r2.A3F, 12746) != 2) goto L_0x0c46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0c43, code lost:
        A0Y(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0c46, code lost:
        r6 = (com.whatsapp.KeyboardPopupLayout) r2.A2Q.findViewById(2131429574);
        r2.A1M = r6;
        r6.setKeyboardPopupBackgroundColor(X.AnonymousClass3MZ.A02(X.AnonymousClass3MW.A0Q(r2), X.AnonymousClass3MW.A0P(r2), 2130969438, 2131100423));
        r2.A0C = X.C110885hR.A0A(X.AnonymousClass3MW.A0P(r2), 2131434738);
        r2.A0R = (android.view.ViewGroup) r2.A2Q.findViewById(16908290);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0c8a, code lost:
        if (X.AnonymousClass3Ma.A0j(r2).A06() == false) goto L_0x0c8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0c8c, code lost:
        A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0c8f, code lost:
        r2.A1s.setVisibilityChangeListener(new X.C94124k5(r2, 2));
        A1N(r2, r2.A00);
        r2.A0Z = (android.widget.LinearLayout) r2.A2Q.findViewById(2131429583);
        r2.A0D = r2.A2Q.findViewById(2131430255);
        r2.A7D = r2.A2Q.findViewById(2131436064);
        r2.A4S = X.C72453Mb.A0t(r2.A2Q, 2131427706);
        r4 = A05(r2);
        r3 = r2.A2Q;
        X.C18070vi.A0d(r3, 0);
        r4.A01 = (com.whatsapp.TextEmojiLabel) r3.findViewById(2131434377);
        r4.A00 = r3.findViewById(2131434378);
        r4.A02 = (com.whatsapp.wds.components.button.WDSButton) r3.findViewById(2131430651);
        r2.A4O = X.C72453Mb.A0t(r2.A2Q, 2131429329);
        r1 = X.C72453Mb.A0t(r2.A2Q, 2131429792);
        r2.A4Q = r1;
        X.C98254qp.A00(r1, r2, 30);
        r1 = X.C72453Mb.A0t(r2.A2Q, 2131428062);
        r2.A4N = r1;
        X.C98244qo.A00(r1, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0d2c, code lost:
        if (X.C18020vd.A05(r28, r2.A3F, 12415) != false) goto L_0x0d33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0d2e, code lost:
        r2.A4N.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0d33, code lost:
        r2.A0V = (android.view.ViewGroup) r2.A2Q.findViewById(2131437043);
        r2.A0S = (android.view.ViewGroup) r2.A2Q.findViewById(2131434297);
        r1 = X.C72453Mb.A0t(r2.A2Q, 2131436885);
        r2.A4b = r1;
        X.C98254qp.A00(r1, r2, 27);
        r1 = (com.whatsapp.conversation.ConversationListView) r2.A2Q.getListView();
        r2.A2B = r1;
        r1.setDividerHeight(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0d70, code lost:
        if (X.C36301nf.A01(r2.A3F, 3575) == false) goto L_0x0d7c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0d72, code lost:
        r2.A2B.setClipChildren(false);
        r2.A2B.setClipToPadding(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0d82, code lost:
        if (A1y(r2) == false) goto L_0x0eb7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        A1d(r2, "bonsai_start");
        r1 = ((X.C25741Pl) X.AnonymousClass3MZ.A0k(r2).A0G.get()).A01((com.whatsapp.jid.UserJid) r2.A3R);
        r2.A0s = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0d9f, code lost:
        if (r1 != null) goto L_0x0db5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0da1, code lost:
        r3 = X.AnonymousClass000.A10();
        r3.append("conversation/initializeBot/bot profile is null for bot jid ");
        com.whatsapp.util.Log.w(X.C17890vO.A0V(r2.A3R, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0db5, code lost:
        A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0dbc, code lost:
        if (A1v() == false) goto L_0x0e85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0dbe, code lost:
        X.C17960vV.A07(r2.A0s);
        r12 = X.AnonymousClass3MZ.A0k(r2);
        r10 = X.AnonymousClass3MX.A0P(r2);
        r9 = X.AnonymousClass3MW.A0E(r2.A0R, 2131432706);
        r6 = X.AnonymousClass1HF.A06(r2.A0R, 16908298);
        X.AnonymousClass3MW.A0C(X.C110885hR.A0A(X.AnonymousClass3MW.A0P(r2), 2131429583), 2131434889).removeView(r2.A0f);
        X.AnonymousClass3MZ.A0k(r2).A0B.get();
        r2.A2Q.CFa();
        r4 = (android.view.ViewGroup) X.C110885hR.A0A(X.AnonymousClass3MW.A0P(r2), 2131434889);
        r3 = X.C72463Mc.A0K(r4, 1).inflate(2131627211, r4, false);
        X.C18070vi.A0z(r3, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        r3 = (androidx.appcompat.widget.Toolbar) r3;
        r4.addView(r3, 0);
        r2.A0f = r3;
        A0T(r3, r2);
        A0J();
        A0j(r2);
        r3 = r2.A2Q.getViewModelStoreOwner();
        r1 = r2.A0s;
        X.C18070vi.A0d(r3, 0);
        X.C18070vi.A0d(r1, 1);
        r1 = (X.AnonymousClass3US) X.C91774gE.A00(r3, r1, (X.C84654Ki) r12.A0K.get(), 0).A00(X.AnonymousClass3US.class);
        r2.A1f = r1;
        r1.A00.A0A(r10, new X.C91514fo(r6, r9, r2, 6));
        X.C91594fw.A00(r10, r2.A1f.A01, r2, 45);
        X.C91594fw.A00(r10, r2.A1f.A02, r2, 46);
        r9.setOnInflateListener(new X.C90374dy(r10, r12, r2));
        X.C91594fw.A00(r10, X.C22791Df.A00(r2.A2b.A0U), r2, 47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0e8d, code lost:
        if (X.C72473Md.A0R(r2).A00() == false) goto L_0x0eb4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0e8f, code lost:
        r9 = X.C72483Me.A0S(r2);
        r6 = X.AnonymousClass3MZ.A0P(X.AnonymousClass3MW.A0Q(r2));
        r4 = r2.A7q;
        r1 = r2.A1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0e9f, code lost:
        if (r1 != null) goto L_0x0ea3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0ea1, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0ea3, code lost:
        r3 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0ea5, code lost:
        r4.add(new X.C92294h4(r3, r6, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0eae, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e1, code lost:
        if (android.os.Build.MODEL.contains("M2006C3L") == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:?, code lost:
        A1d(r2, "bonsai_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0eb4, code lost:
        A1d(r2, "bonsai_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0eb7, code lost:
        A1d(r2, "initWallPaper_start");
        r2.A44 = (com.whatsapp.settings.chat.wallpaper.WallPaperView) X.AnonymousClass3MY.A0I(X.C72453Mb.A0r(X.AnonymousClass3MW.A0P(r2), 2131429553), 0);
        A0n(r2);
        r2.A44.A00 = new X.AnonymousClass4q0(r2);
        r40 = new java.lang.Object();
        r1 = r2.A19;
        r10 = r2.A3R;
        r36 = X.AnonymousClass3MW.A0P(r2);
        r9 = r2.A1M;
        r6 = r2.A2B;
        r6.getClass();
        r4 = new X.C98794rj((java.lang.Object) r6, 6);
        r38 = X.AnonymousClass3MW.A0P(r2);
        r6 = r2.A44;
        r1 = r1.A00.A01;
        r35 = new X.C75413hS(r36, r9, r38, X.AnonymousClass10E.A12(r1), r40, X.AnonymousClass3Ma.A0a(r1), r10, r6, (X.AnonymousClass4aW) r1.A00.A5C.get(), X.AnonymousClass10E.AL1(r1), r4);
        r3 = r2.A7p;
        r123 = r3;
        r3.add(r35);
        r122 = r2.A7o;
        r122.add(r35.A01);
        A1d(r2, "initWallPaper_end");
        r2.A2B.getViewTreeObserver().addOnPreDrawListener(r2.A7z);
        r3 = r2.A2B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0f4c, code lost:
        if (r2.A6t == false) goto L_0x0f53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0f4e, code lost:
        X.AnonymousClass3MZ.A1K(r3, r2, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0f53, code lost:
        r2.A7J = new X.AnonymousClass4NE(X.AnonymousClass3MW.A0P(r2), (X.C37551pj) r2.A10.A00.A01.A0x.get());
        r1 = X.AnonymousClass3Ma.A0Y(r2).A04;
        r6 = X.AnonymousClass3MW.A0P(r2);
        r3 = r1.A00.A01;
        r2.A7L = new X.C85584Ny(r6, (X.C95424mD) r3.A00.A3T.get(), X.C000200d.A00(r3.A3J));
        r9 = r2.A2Q.getStartupTracker();
        r6 = r2.A2B;
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0f9e, code lost:
        if (X.AnonymousClass3MZ.A1W(r2) == false) goto L_0x0fa8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0fa0, code lost:
        r4 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0fa8, code lost:
        r9.A05(r6, new X.C98834rn((java.lang.Object) r2, 38), "Conversation", r4);
        r5 = new X.C85814Ov(X.C110885hR.A0A(X.AnonymousClass3MW.A0P(r2), 2131430255), X.AnonymousClass10E.A6Q(r2.A12.A00.A01));
        r2.A27 = r5;
        r4 = r5.A04;
        X.C27641Ww.A03(r4, 0, java.lang.Math.max(r4.getPaddingLeft(), r4.getPaddingRight()));
        r3 = r5.A02;
        r3.setBackgroundResource(2131231611);
        r3.setPadding(0, 0, 0, 0);
        r2.A0F = X.AnonymousClass6W9.A00(X.AnonymousClass3MW.A0P(r2), r2.A3F, r2.A4L);
        r2.A7H = (com.whatsapp.conversation.ConversationEntryActionButton) X.C110885hR.A0A(X.AnonymousClass3MW.A0P(r2), 2131429565);
        X.C110885hR.A0A(X.AnonymousClass3MW.A0P(r2), 2131434738);
        r1 = r2.A26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x1016, code lost:
        if (A1y(r2) != false) goto L_0x101b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x1018, code lost:
        A20(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x101b, code lost:
        r1.A00 = r2;
        X.C89914dE.A00(r2.A0F, r2, 27);
        X.C90274do.A00(r2.A0F, r2, 13);
        r3 = r2.A2Q.getSystemServices();
        X.C18070vi.A0d(r3, 0);
        r2.A6l = r3.A0P("android.hardware.type.featurephone");
        r3 = X.AnonymousClass3MW.A0P(r2);
        X.C18070vi.A0d(r3, 0);
        r1 = (com.whatsapp.WaImageButton) X.C110885hR.A0A(r3, 2131430328);
        X.C18070vi.A0X(r1);
        r2.A0E = r1;
        r3 = r2.A3F;
        X.C18070vi.A0d(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x105a, code lost:
        if (X.C25291Nq.A04(r3, 10925) == false) goto L_0x106b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x105c, code lost:
        A1b(r2, r2.A2Q.getString(2131890250), 2131232331);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x106f, code lost:
        if (A26(r2) == false) goto L_0x1085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x1071, code lost:
        r2.A1N = (com.whatsapp.LockableCoodinatorLayout) r2.A2Q.findViewById(2131429666);
        X.C89914dE.A00(r2.A0E, r2, 28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x1085, code lost:
        r3 = X.AnonymousClass3MW.A0P(r2);
        r1 = r2.A0F;
        X.C18070vi.A0d(r3, 0);
        X.C18070vi.A0d(r1, 1);
        r2.A0J = r1;
        A1d(r2, "initComposerViewModels_start");
        r1 = r28;
        r2.A2Y = X.AnonymousClass4GQ.A00(r2.A2Q.getViewModelStoreOwner(), r2.A2P.A09, A03(), r2.A3R, X.C18020vd.A05(r1, r2.A3F, 4548), X.C18020vd.A05(r1, r2.A3F, 4549), A2A(r2));
        r4 = r2.A2Q.getViewModelStoreOwner();
        r3 = r2.A2P.A0A;
        r1 = A03();
        X.C18070vi.A0d(r4, 0);
        X.C18070vi.A0d(r3, 1);
        r2.A2c = (X.AnonymousClass3V0) X.C91774gE.A00(r4, r3, r1, 10).A00(X.AnonymousClass3V0.class);
        r2.A0h = new X.AnonymousClass3TF();
        r5 = X.C22791Df.A00(X.C22791Df.A01(r2.A2Y.A05, new X.C99234sU(12)));
        r4 = new X.C22801Dg();
        r4.A0H(r5, new X.C20332AGo(r4));
        X.C91594fw.A00(X.AnonymousClass3MX.A0P(r2), r4, r2, 7);
        X.C91594fw.A00(X.AnonymousClass3MX.A0P(r2), r5, r2, 8);
        A1d(r2, "initComposerViewModels_end");
        r2.A7Q = X.C72453Mb.A0t(r2.A2Q, 2131434278);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x1136, code lost:
        if (A1y(r2) != false) goto L_0x113d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x1138, code lost:
        r2.A2Y.A0V(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x113d, code lost:
        r1 = r2.A0l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x1143, code lost:
        if (r1.A07() == false) goto L_0x1154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x1145, code lost:
        r1.A03();
        r2.A2Q.CFa();
        r0 = X.AnonymousClass000.A0s("create");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x1154, code lost:
        r1 = (X.AnonymousClass4V2) r2.A2Y.A00.A06();
        r3 = r2.A0q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x1164, code lost:
        if (r3.A07() == false) goto L_0x117b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x1166, code lost:
        if (r1 == null) goto L_0x116c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x116a, code lost:
        if (r1.A01 == 1) goto L_0x117b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x116c, code lost:
        r3.A03();
        r2.A2Q.getViewModelStoreOwner();
        r0 = X.AnonymousClass000.A0s("createSmbViewModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x117b, code lost:
        A1d(r2, "initConversationActionButton_start");
        r2.A7H.A02(X.AnonymousClass3MW.A0P(r2), new X.C94324kR(r2), r2.A2Y);
        r5 = X.C72463Mc.A00(X.AnonymousClass3MW.A0Q(r2));
        r4 = r2.A3F;
        X.C18070vi.A0d(r4, 1);
        r1 = X.C18020vd.A00(r28, r4, 5363);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x11a5, code lost:
        if (r1 >= 0) goto L_0x11a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x11a7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x11a9, code lost:
        r1 = java.lang.Integer.valueOf(X.C22339B3q.A01(((float) r1) * r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x11b3, code lost:
        r2.A6L = r1;
        A1d(r2, "initConversationActionButton_end");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x11c2, code lost:
        if (X.C72473Md.A0R(r2).A0A() != false) goto L_0x11e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x11c8, code lost:
        if (A2A(r2) != false) goto L_0x11e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x11ca, code lost:
        X.C91594fw.A00(X.AnonymousClass3MX.A0P(r2), X.C22791Df.A00(X.C22791Df.A01(r2.A2Y.A05, new X.C99234sU(13))), r2, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x11e6, code lost:
        r2.A0X = (android.widget.ImageButton) X.C110885hR.A0A(X.AnonymousClass3MW.A0P(r2), 2131428782);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x11f9, code lost:
        if (A1y(r2) != false) goto L_0x1211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x1203, code lost:
        if (X.C83724Gk.A00(r2.A3F, r2.A4L) == false) goto L_0x1211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x1205, code lost:
        X.AnonymousClass3MX.A1B(X.AnonymousClass3MW.A0P(r2), r2.A0X, 2131233143);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x1211, code lost:
        X.AnonymousClass3MZ.A1K(r2.A0X, r2, 7);
        r2.A0X.setPadding(0, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x1220, code lost:
        if (A21(r2) == false) goto L_0x1235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x1222, code lost:
        r2.A0Y = (android.widget.ImageButton) X.C72453Mb.A0r(X.AnonymousClass3MW.A0P(r2), 2131435846).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x1235, code lost:
        X.C89914dE.A00(r2.A0X, r2, 29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x1240, code lost:
        if (A21(r2) == false) goto L_0x1249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x1242, code lost:
        r1 = r2.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x1244, code lost:
        if (r1 == null) goto L_0x1249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x1246, code lost:
        X.C89914dE.A00(r1, r2, 30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x1249, code lost:
        r1 = A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x124f, code lost:
        if (r1.A07 == false) goto L_0x125c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x1253, code lost:
        if (r1.A08 == false) goto L_0x146d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x1255, code lost:
        X.C90284dp.A00(r2.A0X, r2, r1, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x125c, code lost:
        A1P(r2, 8);
        A1d(r2, "initFloatingFooter_start");
        r14 = (android.view.ViewStub) r2.A2Q.findViewById(2131428197);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x127b, code lost:
        if (X.C18020vd.A05(r32, r2.A3F, 12437) != false) goto L_0x12bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x127d, code lost:
        r0 = r2.A2L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x127f, code lost:
        if (r0 == null) goto L_0x12bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x1281, code lost:
        r0 = r0.A05;
        X.C18070vi.A0d(r0, 0);
        r6 = X.AnonymousClass1OR.A00;
        X.C91594fw.A00(X.AnonymousClass3MX.A0P(r2), X.C87324Vd.A00(r6, r0), r2, 5);
        r5 = r2.A2L;
        r4 = r2.A3R;
        r3 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x129f, code lost:
        r40 = X.AnonymousClass000.A1O(r2.A2w.A03(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:?, code lost:
        X.C18070vi.A0d(r4, 0);
        X.AnonymousClass3MW.A1X(r6, new com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel$loadQualitySurvey$1(r5, r4, (X.C30391dr) null, r3, r40), X.C41561wd.A00(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x12bd, code lost:
        r13 = new X.AnonymousClass4LT(r2);
        r1 = r2.A18;
        r53 = X.AnonymousClass3MW.A0P(r2);
        r55 = X.AnonymousClass3MW.A0P(r2);
        r7 = new X.C98834rn((java.lang.Object) r13, 40);
        r6 = new X.C98834rn((java.lang.Object) r13, 41);
        r1 = r1.A00;
        r0 = r1.A01;
        r65 = X.AnonymousClass10E.A8r(r0);
        r56 = X.AnonymousClass10E.A17(r0);
        r68 = X.AnonymousClass3MY.A0Z(r0);
        r70 = X.AnonymousClass10E.AL1(r0);
        r67 = X.AnonymousClass3Ma.A0g(r0);
        r69 = X.AnonymousClass3Ma.A0u(r0);
        r66 = X.AnonymousClass3MZ.A0u(r0);
        r60 = X.AnonymousClass3MZ.A0f(r0);
        r61 = X.AnonymousClass3Ma.A0c(r0);
        r59 = X.AnonymousClass3MZ.A0b(r0);
        r71 = X.C000200d.A00(r0.A0s);
        r52 = new X.C97924qH(r53, (X.C133326oZ) r0.A00.A00.get(), r55, r56, (X.C37551pj) r0.A0x.get(), (X.C36931oh) r1.A00.A3o.get(), r59, r60, r61, X.AnonymousClass3MY.A0V(r0), (X.C34591kk) r0.AB5.get(), X.AnonymousClass3MZ.A0r(r0), r65, r66, r67, r68, r69, r70, r71, X.C000200d.A00(r0.A0t), r7, r6);
        r1 = r2.A1B;
        r40 = X.AnonymousClass3MW.A0P(r2);
        r44 = X.AnonymousClass3MW.A0P(r2);
        r20 = r2.A3R;
        r19 = r2.A2B;
        r1 = r1.A00;
        r0 = r1.A01;
        r56 = X.AnonymousClass10E.A8r(r0);
        r45 = X.AnonymousClass10E.A17(r0);
        r53 = X.AnonymousClass3Ma.A0d(r0);
        r64 = X.AnonymousClass3Ma.A0u(r0);
        r57 = X.AnonymousClass3MZ.A0u(r0);
        r66 = X.C000200d.A00(r0.A00.A30);
        r50 = X.AnonymousClass10E.A4z(r0);
        r65 = X.AnonymousClass3MZ.A13(r0);
        r1 = r1.A00;
        r49 = X.AnonymousClass3MZ.A0V(r1);
        r58 = X.AnonymousClass3MY.A0X(r0);
        r63 = X.AnonymousClass3Ma.A0s(r0);
        r2.A2R = new X.AnonymousClass4ZY(r14, (android.view.ViewStub) r2.A2Q.findViewById(2131433204), (android.view.ViewStub) r2.A2Q.findViewById(2131429917), r19, r40, X.AnonymousClass3MZ.A0M(r0.A12), (X.AnonymousClass4PV) r1.A1o.get(), (X.AnonymousClass4JJ) r1.A2a.get(), r44, r45, (X.C37551pj) r0.A0x.get(), (X.C36931oh) r1.A3o.get(), (X.C53052bu) r0.AAt.get(), r49, r50, r13, r52, r53, (X.AnonymousClass1N4) r0.A8a.get(), (X.AnonymousClass1QY) r0.ABL.get(), r56, r57, r58, X.AnonymousClass3Ma.A0k(r0), r20, X.AnonymousClass3MZ.A11(r0), (X.C58012k0) r0.A7Z.get(), r63, r64, r65, r66);
        A1d(r2, "initFloatingFooter_end");
        r41 = new java.lang.Object();
        r4 = r2.A0x;
        r36 = X.AnonymousClass3MW.A0P(r2);
        r39 = X.AnonymousClass3MW.A0P(r2);
        r1 = r4.A00(r36, r2.A2Q.BHg(), new X.C92034ge(r2, 2), r39, r2.A8A, r41, r2.A3R);
        r2.A7M = r1;
        r123.add(r1);
        r1 = r2.A29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x1460, code lost:
        if (android.text.TextUtils.isEmpty(r1.A0H) != false) goto L_0x148c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x146a, code lost:
        if (android.text.TextUtils.isEmpty(r1.A07.A0R) != false) goto L_0x148c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x146d, code lost:
        r4 = new X.C94334kS(r2);
        r2.A0X.setOnTouchListener(new X.C90344dv(new X.C90304dr(r4, r2, 8), r2, new X.C98834rn((java.lang.Object) r4, 39)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x148c, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x1491, code lost:
        if (X.C72473Md.A0f(r2) == null) goto L_0x1494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x1493, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x1494, code lost:
        r1 = X.C88444Zs.A01(r2);
        r0 = X.C22941Dw.A01(r2.A3R);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x149e, code lost:
        if (r0 == null) goto L_0x14a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x14a0, code lost:
        X.C88654aI.A00(r1, r0).A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x14a6, code lost:
        A1d(r2, "on_create_conversation_start");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x14ad, code lost:
        if (r2.A3R == null) goto L_0x14c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x14b5, code lost:
        if (X.AnonymousClass1J8.A03(r2.A3F) == false) goto L_0x14c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x14c2, code lost:
        if (X.C18020vd.A00(r28, r2.A3F, 12746) != 3) goto L_0x14c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x14c4, code lost:
        A0Y(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x14c7, code lost:
        r121 = r2.A29;
        r1 = new X.AnonymousClass1Ez("conversation/createconversation");
        A0H();
        r0 = r2.A11;
        r50 = X.AnonymousClass3MW.A0P(r2);
        r10 = r2.A3R;
        r9 = r2.A2Q;
        r54 = r9.getConversationRowInflater();
        r0 = r0.A00.A01;
        r57 = X.AnonymousClass10E.A6O(r0);
        r52 = X.AnonymousClass10E.A17(r0);
        r66 = X.AnonymousClass3Ma.A0s(r0);
        r1 = r0.A00;
        r59 = X.AnonymousClass10E.A8r(r0);
        r58 = X.AnonymousClass3Ma.A0c(r0);
        r51 = X.C19890zB.A00;
        r49 = new X.C73103Oz(r50, r51, r52, (X.AnonymousClass4Xe) r1.A18.get(), r54, r9, (X.C63232sj) r1.A0U.get(), r57, r58, r59, (X.C88304Zd) r0.A4l.get(), r10, (X.AnonymousClass1O2) r0.A57.get(), (X.C25461Oh) r0.A76.get(), (X.C86454Rr) r1.A3Q.get(), (X.AnonymousClass1PP) r0.A3y.get(), r66);
        r49.registerDataSetObserver(r2.A7X);
        r2.A3Z = (com.whatsapp.mentions.MentionableEntry) r2.A2Q.findViewById(2131430490);
        r2.A0W = (android.widget.FrameLayout) X.C110885hR.A0A(X.AnonymousClass3MW.A0P(r2), 2131432483);
        r1 = r2.A3Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x1577, code lost:
        if (r1 == null) goto L_0x16e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x157f, code lost:
        if (X.C22971Dz.A0S(r2.A3R) == false) goto L_0x1586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x1581, code lost:
        r1.setPrivateImeOptions("disableSticker=true");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x1586, code lost:
        r2.A3Z.A0F = new X.C144947Jh(new java.lang.Object(), r2, 0);
        X.C91594fw.A00(X.AnonymousClass3MX.A0P(r2), ((X.AnonymousClass4ZT) r2.A5p.get()).A00, r2, 38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x15af, code lost:
        if (r2.A3Z.A0O(r2.A3R) == false) goto L_0x15c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x15b1, code lost:
        r3 = r2.A3Z;
        r3.A0C = new X.C96814oS(r2, 1);
        r3.A0M(r2.A0W, r2.A3R, false, false, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x15c7, code lost:
        A2e();
        r2.A3Z.setFilters(new android.text.InputFilter[]{new X.C89524cb(r2.A4h)});
        r2.A3Z.A05 = r2.A2Q.findViewById(2131431653);
        r2.A4V = X.C72453Mb.A0r(X.AnonymousClass3MW.A0P(r2), 2131434286);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x15fe, code lost:
        if (X.C18020vd.A05(r28, r2.A3F, 12417) != false) goto L_0x1605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x1600, code lost:
        r2.A4V.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x160b, code lost:
        if (r2.A0p.A07() == false) goto L_0x161d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x1613, code lost:
        if (X.C84104Hw.A00(r2.A3F) == false) goto L_0x169c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x161b, code lost:
        if (r2.A35.A0E() == false) goto L_0x169c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x161d, code lost:
        r2.A4V.A04(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x1624, code lost:
        r5 = r2.A4A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x1626, code lost:
        if (r5 == null) goto L_0x1643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x1628, code lost:
        r4 = r2.A3Z;
        new X.C92954iC(r2.A0W, X.AnonymousClass3MX.A0P(r2), r2.A2H, r2.A2K, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x1643, code lost:
        r1 = r2.A1g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x1645, code lost:
        if (r1 == null) goto L_0x168c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x1647, code lost:
        r7 = r2.A0W;
        r6 = X.AnonymousClass3MX.A0P(r2);
        r5 = r2.A3Z;
        X.C18070vi.A0d(r7, 0);
        X.C18070vi.A0d(r6, 1);
        X.C18070vi.A0d(r5, 2);
        r4 = new X.C77883re(r6, r1, r5);
        r5.addTextChangedListener(new X.C89544cd(r1, r5, 1));
        X.AnonymousClass3MY.A1K(r6, r1.A02, new X.C105005Qi(r5), 14);
        r7.addView(r4);
        r4.setVisibility(8);
        r1 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x167d, code lost:
        if (r1 == null) goto L_0x168c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x167f, code lost:
        r4.setAnchorWidthView(r1);
        r1.addOnLayoutChangeListener(new X.C90204dh(r1, r4, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x1690, code lost:
        if (A25(r2) == false) goto L_0x16e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x1692, code lost:
        X.AnonymousClass3MZ.A0k(r2).A0F.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x16a6, code lost:
        if (X.C18020vd.A05(r28, r2.A3F, 5811) == false) goto L_0x16b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x16ae, code lost:
        if (X.C42701yb.A01(r2.A3R) == false) goto L_0x16b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x16b8, code lost:
        if (r2.A35.A0C() == false) goto L_0x16c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x16ba, code lost:
        r1 = new X.C98794rj(r2, 3);
        r2.A6P = r1;
        r2.A4c.CGF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x16c9, code lost:
        A0e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x16ce, code lost:
        if (r125 == null) goto L_0x16d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x16d1, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x16d3, code lost:
        r0 = r16.getParcelableArrayList("saved_bot_media_array_list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x16db, code lost:
        A0O((android.os.Bundle) null, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x16e0, code lost:
        r1 = r2.A3R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x16e6, code lost:
        if (X.C22971Dz.A0V(r1) == false) goto L_0x16ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x16e8, code lost:
        A1q((X.C29681ch) r1, r2.A6q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x16ef, code lost:
        r2.A2B.setAdapter(r49);
        r0 = r121.A0d;
        A1s(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x16fd, code lost:
        if (r0 == false) goto L_0x1737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x170b, code lost:
        if (r2.A2Q.getIntent().getBooleanExtra("fromNotification", false) == false) goto L_0x1737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x1719, code lost:
        if (r2.A2Q.getIntent().getBooleanExtra("last_notification_keep_in_chat", false) == false) goto L_0x1737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x171b, code lost:
        r0 = r2.A3A;
        r3 = X.AnonymousClass3MW.A0P(r2).getSupportFragmentManager();
        r1 = r2.A3R;
        X.C18070vi.A0d(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x1730, code lost:
        if (X.C87474Vs.A00(r3, r0.A00) == false) goto L_0x1737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x1732, code lost:
        X.C72483Me.A0l(r1, r3, 1);
        com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A0N = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x1737, code lost:
        X.C98834rn.A01(X.AnonymousClass3MX.A0w(r2), r2, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x1744, code lost:
        if (r121.A0c == false) goto L_0x1769;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x1746, code lost:
        r2.A3e.A04();
        r4 = r121.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x174f, code lost:
        if (r4 == null) goto L_0x175d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x1751, code lost:
        r2.A1l.A00(new X.A69("show_vc_lobby", (java.lang.Object) r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x175d, code lost:
        r3 = r121.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x1761, code lost:
        if (r3 == null) goto L_0x1769;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x1763, code lost:
        r2.A2H.A0C(r3, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x1769, code lost:
        r2.A75 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x1773, code lost:
        if (r2.A0B.getStringExtra("ig_post_url") == null) goto L_0x1778;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x1775, code lost:
        A1h(r2, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x178c, code lost:
        if (X.AnonymousClass3MX.A0y(((X.C87724Ws) r2.A5s.get()).A03).A0A(r2.A3R) == false) goto L_0x179c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x178e, code lost:
        r3 = r49;
        r3.A0U.add(new X.C94344kT(r3, r2, new X.AnonymousClass4OZ[1]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x17a0, code lost:
        if (r121.A0f == false) goto L_0x1982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x17a4, code lost:
        if (r2.A6X != false) goto L_0x1982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x17aa, code lost:
        if (r121.A0Z == false) goto L_0x1982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x17ac, code lost:
        ((X.C51852Zw) r2.A5y.get()).A00.remove(r2.A3R);
        r2.A2B.A0Q = true;
        r0 = r121;
        r6 = r0.A0V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x17c3, code lost:
        if (r6 == null) goto L_0x17fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:?, code lost:
        r5 = r2.A1R;
        r0 = r121;
        r35 = r5;
        r35.A05(X.AnonymousClass3MW.A0P(r2), X.AnonymousClass3MW.A0P(r2), new X.C92184gt(r2, 1), (X.C692236j) null, r0.A0M, java.util.Collections.singletonList(r2.A3R), r6, r0.A00, 38, false, r0.A0b, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:?, code lost:
        r1 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x1800, code lost:
        if (r1 != 4) goto L_0x1876;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x1802, code lost:
        r0 = r2.A2Q;
        r1 = new X.AnonymousClass73Y(r0.getContactManager(), r2.A2f, r0.getWAContext(), r2.A2k);
        r3 = r2.A0u;
        r4 = r121.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:?, code lost:
        r7 = new X.C139136yH(r3, r1.A03);
        r1.A05(r4);
        r6 = r1.A04;
        r0 = r6.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x1829, code lost:
        if (r0 == null) goto L_0x185c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x182b, code lost:
        r3 = r1.A00;
        r9 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x1835, code lost:
        if (r9.hasNext() == false) goto L_0x184c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x1837, code lost:
        r1 = (X.C129926ib) r9.next();
        r0 = r3.A0J(r1.A02, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x1843, code lost:
        if (r0 == null) goto L_0x1831;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x1845, code lost:
        r1.A01 = X.AnonymousClass3MZ.A0x(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x184c, code lost:
        r4 = r7.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x1851, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:?, code lost:
        com.whatsapp.util.Log.e("addWaIdsToVCard", new X.AnonymousClass2RP(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x1878, code lost:
        if (r1 != 14) goto L_0x187c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x187c, code lost:
        r9 = r121.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x1884, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x1913;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x1886, code lost:
        r7 = r121.A07;
        r6 = r7.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x1890, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x1913;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x1892, code lost:
        r3 = r7.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x1898, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x1907;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x189a, code lost:
        r1 = r2.A2q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x189e, code lost:
        if (r1.A0W == false) goto L_0x18aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x18a2, code lost:
        if (r7.A0Z == false) goto L_0x18aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x18a8, code lost:
        if (r1.A00 == 2) goto L_0x18b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x18aa, code lost:
        X.AnonymousClass4IT.A02.put(X.AnonymousClass3MW.A0g(r2.A35), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x18b5, code lost:
        r5 = r7.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x18b7, code lost:
        if (r5 != null) goto L_0x18bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x18b9, code lost:
        r0 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x18bb, code lost:
        if (r0 == null) goto L_0x1900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x18bd, code lost:
        r5 = r0.user;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x18bf, code lost:
        r4 = r7.A0Z;
        r3 = r7.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x18c3, code lost:
        if (r3 == false) goto L_0x18fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x18c5, code lost:
        r1 = r7.A0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x18c7, code lost:
        A8L.put(X.AnonymousClass3MW.A0g(r2.A35), new X.C85834Ox(X.AnonymousClass3MZ.A0x(r2.A35), r5, r9, r6, r4, r3, r1));
        r3 = r7.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x18ed, code lost:
        if (r3 == null) goto L_0x1982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x18ef, code lost:
        X.C88444Zs.A01(r2).A06(X.C22941Dw.A01(r2.A3R), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x18fe, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x1900, code lost:
        r5 = r2.A3R.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x1907, code lost:
        X.AnonymousClass4IT.A02.remove(X.AnonymousClass3MW.A0g(r2.A35));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x1913, code lost:
        r3 = r121.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x1917, code lost:
        if (r3 == null) goto L_0x1982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x191d, code lost:
        if (r3.length() <= 0) goto L_0x1982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x1923, code lost:
        if (r121.A0a == false) goto L_0x1931;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x1925, code lost:
        X.AnonymousClass4IT.A02.put(X.AnonymousClass3MW.A0g(r2.A35), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x1931, code lost:
        X.AnonymousClass3MX.A0X(r2).A0O(X.C20016A3i.A00(r2.A2Q.getLinkifyWeb().A02(r3)), (X.AnonymousClass206) null, (X.C692236j) null, r3, java.util.Collections.singletonList(X.AnonymousClass3MW.A0g(r2.A35)), (java.util.List) null, r2.A6g, r2.A6i);
        r2.A6i = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x1963, code lost:
        X.AnonymousClass3MX.A0X(r2).A0h((X.AnonymousClass206) null, java.util.Collections.singletonList(r2.A3R), r121.A0W, r2.A6g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x1a32, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x1a55, code lost:
        if (A25(r2) != false) goto L_0x1a57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x2c18, code lost:
        if (X.C18020vd.A05(r28, r2.A3F, 6110) != false) goto L_0x2c1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:836:0x3255, code lost:
        if (X.C18070vi.A18(((X.AnonymousClass72A) X.AnonymousClass3MZ.A0k(r2).A0O.get()).A01(), "yes") != false) goto L_0x3257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:932:0x3522, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:933:0x3523, code lost:
        A1d(r2, "on_create_end");
        r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:934:0x352b, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x1b59 A[Catch:{ all -> 0x0eae }] */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x25de A[Catch:{ all -> 0x0eae }] */
    /* JADX WARNING: Removed duplicated region for block: B:840:0x3270 A[Catch:{ all -> 0x0eae }] */
    /* JADX WARNING: Removed duplicated region for block: B:845:0x3291 A[Catch:{ all -> 0x0eae }] */
    /* JADX WARNING: Removed duplicated region for block: B:876:0x335a A[Catch:{ all -> 0x0eae }] */
    /* JADX WARNING: Removed duplicated region for block: B:884:0x33b6 A[Catch:{ all -> 0x0eae }] */
    /* JADX WARNING: Removed duplicated region for block: B:896:0x3402 A[Catch:{ all -> 0x0eae }] */
    /* JADX WARNING: Removed duplicated region for block: B:901:0x3438 A[Catch:{ all -> 0x0eae }] */
    /* JADX WARNING: Removed duplicated region for block: B:907:0x3447 A[Catch:{ all -> 0x0eae }] */
    /* JADX WARNING: Removed duplicated region for block: B:909:0x3455 A[Catch:{ all -> 0x0eae }] */
    /* JADX WARNING: Removed duplicated region for block: B:916:0x346e A[Catch:{ all -> 0x0eae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2l(android.os.Bundle r125) {
        /*
            r124 = this;
            java.lang.String r31 = "error_message"
            java.lang.String r30 = "sms_invite_intent"
            java.lang.String r24 = "lifecycle_"
            java.lang.String r8 = "bot_metrics_entrypoint"
            java.lang.String r34 = "on_create_end"
            java.lang.String r1 = "conversation/create"
            X.1Ez r33 = new X.1Ez
            r0 = r33
            r0.<init>((java.lang.String) r1)
            r2 = r124
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1Bd r0 = r0.getStartupTracker()     // Catch:{ all -> 0x3520 }
            java.lang.String r20 = "Conversation"
            if (r0 == 0) goto L_0x002a
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1Bd r1 = r0.getStartupTracker()     // Catch:{ all -> 0x3520 }
            r0 = r20
            r1.A0A(r0)     // Catch:{ all -> 0x3520 }
        L_0x002a:
            X.1Il r1 = X.AnonymousClass3Ma.A0j(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1.A03(r0)     // Catch:{ all -> 0x3520 }
            boolean r0 = X.C72473Md.A1V(r2)     // Catch:{ all -> 0x3520 }
            r2.A6c = r0     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            android.content.Intent r18 = r0.getIntent()     // Catch:{ all -> 0x3520 }
            r16 = r125
            if (r18 == 0) goto L_0x0092
            java.lang.String r3 = "keep_navigation_history"
            r1 = 0
            r0 = r18
            boolean r0 = r0.getBooleanExtra(r3, r1)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x0092
            X.1Il r0 = X.AnonymousClass3Ma.A0j(r2)     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.A0A()     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x0092
            X.1Il r4 = X.AnonymousClass3Ma.A0j(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = r18
            android.content.Intent r3 = r4.A01(r3, r0)     // Catch:{ all -> 0x3520 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x0092
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x3520 }
            X.AnonymousClass3Ma.A1H(r0, r1)     // Catch:{ all -> 0x3520 }
            java.lang.String r4 = "key_perf_tracked"
            r1 = 1
            r0 = r18
            r0.putExtra(r4, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0 = r16
            r1.C7q(r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.startActivity(r3)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.finish()     // Catch:{ all -> 0x3520 }
            goto L_0x3517
        L_0x0092:
            boolean r0 = X.C72473Md.A1V(r2)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x00b9
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            android.view.Window r1 = r0.getWindow()     // Catch:{ all -> 0x3520 }
            boolean r0 = X.AnonymousClass745.A00     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x00b9
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.A0D     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x00b9
            r0 = 13
            r1.requestFeature(r0)     // Catch:{ all -> 0x3520 }
            r0 = 12
            r1.requestFeature(r0)     // Catch:{ all -> 0x3520 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r0)     // Catch:{ all -> 0x3520 }
        L_0x00b9:
            X.4RK r4 = r2.A2A     // Catch:{ all -> 0x3520 }
            boolean r3 = r2.A6X     // Catch:{ all -> 0x3520 }
            r1 = r18
            r0 = r16
            X.4PL r0 = r4.A00(r1, r0, r3)     // Catch:{ all -> 0x3520 }
            r2.A29 = r0     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r0.A0A     // Catch:{ all -> 0x3520 }
            r2.A3R = r0     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0 = r16
            r1.C7q(r0)     // Catch:{ all -> 0x3520 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x3520 }
            r0 = 30
            if (r1 != r0) goto L_0x00e3
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "M2006C3L"
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x3520 }
            r0 = 1
            if (r1 != 0) goto L_0x00e4
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            r2.A7V = r0     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "on_create_start"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r2.A4v     // Catch:{ all -> 0x3520 }
            r0.get()     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            r4 = 1
            if (r0 == 0) goto L_0x010c
            X.0ve r0 = r2.A3F     // Catch:{ all -> 0x3520 }
            boolean r0 = X.AnonymousClass1J8.A03(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x010c
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 12746(0x31ca, float:1.7861E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x3520 }
            int r0 = X.C18020vd.A00(r0, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r0 != r4) goto L_0x010c
            A0Y(r2)     // Catch:{ all -> 0x3520 }
        L_0x010c:
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 11930(0x2e9a, float:1.6717E-41)
            X.0vf r28 = X.C18040vf.A02     // Catch:{ all -> 0x3520 }
            r0 = r28
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x013b
            r3 = 2131624699(0x7f0e02fb, float:1.8876585E38)
            X.0ve r4 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 6218(0x184a, float:8.713E-42)
            X.0vf r0 = X.C18040vf.A01     // Catch:{ all -> 0x3520 }
            boolean r0 = X.AnonymousClass1J8.A0A(r4, r0, r1)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x012c
            r3 = 2131624704(0x7f0e0300, float:1.8876595E38)
        L_0x012c:
            X.00H r0 = r2.A6E     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1LT r1 = (X.AnonymousClass1LT) r1     // Catch:{ all -> 0x3520 }
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r2)     // Catch:{ all -> 0x3520 }
            r1.A01(r0, r3)     // Catch:{ all -> 0x3520 }
        L_0x013b:
            X.2hO r1 = r2.A14     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1HB r0 = r0.getInteractionPerfTracker()     // Catch:{ all -> 0x3520 }
            X.4RS r0 = r1.A00(r0)     // Catch:{ all -> 0x3520 }
            r2.A2U = r0     // Catch:{ all -> 0x3520 }
            X.10I r3 = X.AnonymousClass3MX.A0w(r2)     // Catch:{ all -> 0x3520 }
            X.1cr r1 = r2.A2g     // Catch:{ all -> 0x3520 }
            r1.getClass()     // Catch:{ all -> 0x3520 }
            r0 = 37
            X.C98834rn.A01(r3, r1, r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "viewModels_start"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.1It r1 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<com.whatsapp.tosgating.viewmodel.ToSGatingViewModel> r0 = com.whatsapp.tosgating.viewmodel.ToSGatingViewModel.class
            X.1J2 r0 = r1.A00(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = (com.whatsapp.tosgating.viewmodel.ToSGatingViewModel) r0     // Catch:{ all -> 0x3520 }
            r2.A4C = r0     // Catch:{ all -> 0x3520 }
            X.1It r1 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<com.whatsapp.countrygating.viewmodel.CountryGatingViewModel> r0 = com.whatsapp.countrygating.viewmodel.CountryGatingViewModel.class
            X.1J2 r0 = r1.A00(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = (com.whatsapp.countrygating.viewmodel.CountryGatingViewModel) r0     // Catch:{ all -> 0x3520 }
            r2.A2l = r0     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r4 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.2h2 r0 = r2.A2P     // Catch:{ all -> 0x3520 }
            X.4JA r3 = r0.A02     // Catch:{ all -> 0x3520 }
            android.os.Handler r1 = r2.A7Z     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r15 = 1
            X.1It r1 = X.C91784gF.A00(r4, r0, r3, r1, r15)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.3TA> r0 = X.AnonymousClass3TA.class
            X.1J2 r0 = r1.A00(r0)     // Catch:{ all -> 0x3520 }
            X.3TA r0 = (X.AnonymousClass3TA) r0     // Catch:{ all -> 0x3520 }
            r2.A2d = r0     // Catch:{ all -> 0x3520 }
            X.1It r1 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.8FO> r29 = X.AnonymousClass8FO.class
            r0 = r29
            X.1J2 r0 = r1.A00(r0)     // Catch:{ all -> 0x3520 }
            X.8FO r0 = (X.AnonymousClass8FO) r0     // Catch:{ all -> 0x3520 }
            r2.A3o = r0     // Catch:{ all -> 0x3520 }
            X.1It r1 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<com.whatsapp.media.share.ShareMediaViewModel> r0 = com.whatsapp.media.share.ShareMediaViewModel.class
            X.1J2 r0 = r1.A00(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.media.share.ShareMediaViewModel r0 = (com.whatsapp.media.share.ShareMediaViewModel) r0     // Catch:{ all -> 0x3520 }
            r2.A3Y = r0     // Catch:{ all -> 0x3520 }
            X.0ve r1 = r2.A3F     // Catch:{ all -> 0x3520 }
            X.0vf r32 = X.C18040vf.A01     // Catch:{ all -> 0x3520 }
            r0 = 12437(0x3095, float:1.7428E-41)
            r3 = r32
            boolean r0 = X.C18020vd.A05(r3, r1, r0)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x01cf
            X.1It r1 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel> r0 = com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel.class
            X.1J2 r0 = r1.A00(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel r0 = (com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel) r0     // Catch:{ all -> 0x3520 }
            r2.A2L = r0     // Catch:{ all -> 0x3520 }
        L_0x01cf:
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r2.A4C     // Catch:{ all -> 0x3520 }
            X.00H r1 = r0.A07     // Catch:{ all -> 0x3520 }
            X.10T r1 = X.C17880vN.A0V(r1)     // Catch:{ all -> 0x3520 }
            X.4WY r0 = r0.A02     // Catch:{ all -> 0x3520 }
            r1.registerObserver(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.media.share.ShareMediaViewModel r0 = r2.A3Y     // Catch:{ all -> 0x3520 }
            X.1DT r3 = r0.A02     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 41
            X.C91594fw.A00(r1, r3, r2, r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "viewModels_end"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.1GP r5 = X.AnonymousClass3MW.A0K(r2)     // Catch:{ all -> 0x3520 }
            java.lang.String r4 = "NewCommunityAdminBottomSheetFragment"
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 11
            X.4fa r0 = new X.4fa     // Catch:{ all -> 0x3520 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x3520 }
            r5.A0t(r0, r3, r4)     // Catch:{ all -> 0x3520 }
            X.3TA r0 = r2.A2d     // Catch:{ all -> 0x3520 }
            X.1DS r1 = r0.A0H     // Catch:{ all -> 0x3520 }
            X.1F9 r0 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r19 = 10
            r3 = r19
            X.C91594fw.A00(r0, r1, r2, r3)     // Catch:{ all -> 0x3520 }
            X.3TA r0 = r2.A2d     // Catch:{ all -> 0x3520 }
            X.1DT r1 = r0.A0L     // Catch:{ all -> 0x3520 }
            X.1F9 r0 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r7 = 12
            X.C91594fw.A00(r0, r1, r2, r7)     // Catch:{ all -> 0x3520 }
            X.3TA r0 = r2.A2d     // Catch:{ all -> 0x3520 }
            X.1DT r1 = r0.A0K     // Catch:{ all -> 0x3520 }
            X.1F9 r0 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.C91594fw.A00(r0, r1, r2, r7)     // Catch:{ all -> 0x3520 }
            X.3TA r0 = r2.A2d     // Catch:{ all -> 0x3520 }
            X.1DT r3 = r0.A0J     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 14
            X.C91594fw.A00(r1, r3, r2, r0)     // Catch:{ all -> 0x3520 }
            X.3TA r0 = r2.A2d     // Catch:{ all -> 0x3520 }
            X.1DT r0 = r0.A0M     // Catch:{ all -> 0x3520 }
            X.1Dg r1 = X.C22791Df.A00(r0)     // Catch:{ all -> 0x3520 }
            X.1F9 r0 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r4 = 15
            X.C91594fw.A00(r0, r1, r2, r4)     // Catch:{ all -> 0x3520 }
            X.2gp r0 = X.AnonymousClass3Ma.A0X(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A06     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1SB r6 = (X.AnonymousClass1SB) r6     // Catch:{ all -> 0x3520 }
            X.10I r40 = X.AnonymousClass3MX.A0w(r2)     // Catch:{ all -> 0x3520 }
            X.2gp r0 = X.AnonymousClass3Ma.A0X(r2)     // Catch:{ all -> 0x3520 }
            X.00H r5 = r0.A03     // Catch:{ all -> 0x3520 }
            X.2gp r0 = X.AnonymousClass3Ma.A0X(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A04     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x3520 }
            X.2LK r3 = (X.AnonymousClass2LK) r3     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.0z4 r36 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x3520 }
            X.2gp r0 = X.AnonymousClass3Ma.A0X(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A07     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x3520 }
            X.6pA r1 = (X.AnonymousClass6pA) r1     // Catch:{ all -> 0x3520 }
            X.722 r0 = new X.722     // Catch:{ all -> 0x3520 }
            r35 = r0
            r37 = r3
            r38 = r6
            r39 = r1
            r41 = r5
            r35.<init>(r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3520 }
            r2.A48 = r0     // Catch:{ all -> 0x3520 }
            X.7MX r1 = new X.7MX     // Catch:{ all -> 0x3520 }
            r1.<init>(r0)     // Catch:{ all -> 0x3520 }
            r2.A3v = r1     // Catch:{ all -> 0x3520 }
            r5 = 0
            boolean r0 = X.AnonymousClass000.A1W(r16)
            r2.A6X = r0     // Catch:{ all -> 0x3520 }
            X.0ve r1 = X.AnonymousClass3MX.A0h(r2)     // Catch:{ all -> 0x3520 }
            r0 = 1154(0x482, float:1.617E-42)
            r3 = r28
            boolean r0 = X.C18020vd.A05(r3, r1, r0)     // Catch:{ all -> 0x3520 }
            r2.A6t = r0     // Catch:{ all -> 0x3520 }
            boolean r0 = r2.A6X     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x02b1
            com.whatsapp.util.LRUCache r0 = X.C145777Mo.A17     // Catch:{ all -> 0x3520 }
            r0.clear()     // Catch:{ all -> 0x3520 }
        L_0x02b1:
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r2.A3b     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x3520 }
            r3 = 3
            if (r0 != 0) goto L_0x02d0
            java.lang.String r0 = "conversation/aborting due to native libraries missing"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "on_create_whatsapp_lib_failure"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.Biu(r3)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.finish()     // Catch:{ all -> 0x3520 }
            goto L_0x3517
        L_0x02d0:
            java.lang.String r0 = "messageStoreCheck_start"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.11S r0 = r0.getMeManager()     // Catch:{ all -> 0x3520 }
            r0.A0I()     // Catch:{ all -> 0x3520 }
            com.whatsapp.Me r0 = r0.A00     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x34f1
            X.1Cd r0 = r2.A32     // Catch:{ all -> 0x3520 }
            r0.A06()     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.A08     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x34f1
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1CM r0 = r0.getRegistrationStateManager()     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x34f1
            java.lang.String r0 = "messageStoreCheck_end"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.4PL r0 = r2.A29     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r0.A0A     // Catch:{ all -> 0x3520 }
            boolean r6 = X.C22971Dz.A0V(r1)     // Catch:{ all -> 0x3520 }
            r1 = 8
            if (r6 == 0) goto L_0x031e
            boolean r0 = r0.A0d     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x0329
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A0G     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.A6Q r0 = (X.A6Q) r0     // Catch:{ all -> 0x3520 }
            java.lang.Integer r0 = r0.A03(r1)     // Catch:{ all -> 0x3520 }
            r2.A6M = r0     // Catch:{ all -> 0x3520 }
        L_0x031e:
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            X.4Xd r0 = r1.A07     // Catch:{ all -> 0x3520 }
            r2.A2p = r0     // Catch:{ all -> 0x3520 }
            int r1 = r1.A02     // Catch:{ all -> 0x3520 }
            if (r1 == r15) goto L_0x34e1
            goto L_0x0338
        L_0x0329:
            java.lang.String r0 = "newsletter_log_instance_key"
            r1 = r18
            int r0 = r1.getIntExtra(r0, r5)     // Catch:{ all -> 0x3520 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x3520 }
            r2.A6M = r0     // Catch:{ all -> 0x3520 }
            goto L_0x031e
        L_0x0338:
            r0 = 2
            if (r1 == r0) goto L_0x34be
            if (r1 == r3) goto L_0x3470
            if (r125 != 0) goto L_0x035a
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A0A     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1Of r3 = (X.C25441Of) r3     // Catch:{ all -> 0x3520 }
            r0 = 7
            X.4fP r1 = new X.4fP     // Catch:{ all -> 0x3520 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x3520 }
            r0 = 48
            X.4sV r0 = X.C99244sV.A00(r1, r0)     // Catch:{ all -> 0x3520 }
            r3.A00(r0)     // Catch:{ all -> 0x3520 }
        L_0x035a:
            X.C17960vV.A07(r18)     // Catch:{ all -> 0x3520 }
            r0 = r18
            r2.A0B = r0     // Catch:{ all -> 0x3520 }
            X.4PL r0 = r2.A29     // Catch:{ all -> 0x3520 }
            X.2Qs r0 = r0.A08     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x079f
            X.00H r0 = r2.A55     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x3520 }
            X.9oM r3 = (X.C192419oM) r3     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.4PL r0 = r2.A29     // Catch:{ all -> 0x3520 }
            X.2Qs r0 = r0.A08     // Catch:{ all -> 0x3520 }
            r3.A01(r0, r1)     // Catch:{ all -> 0x3520 }
        L_0x0378:
            java.lang.String r1 = "chatlockEntryPoint"
            r0 = 8
            r3 = r18
            int r6 = r3.getIntExtra(r1, r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "mat_entry_point"
            r1 = 0
            int r0 = r3.getIntExtra(r0, r1)     // Catch:{ all -> 0x3520 }
            r2.A01 = r0     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "target_flow"
            int r0 = r3.getIntExtra(r0, r1)     // Catch:{ all -> 0x3520 }
            r2.A79 = r0     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "referrer_action"
            r0 = 7
            int r0 = r3.getIntExtra(r1, r0)     // Catch:{ all -> 0x3520 }
            r2.A78 = r0     // Catch:{ all -> 0x3520 }
            boolean r0 = r3.hasExtra(r8)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x03ac
            java.lang.String r0 = r3.getStringExtra(r8)     // Catch:{ all -> 0x3520 }
            java.lang.Integer r0 = X.C196839vj.A00(r0)     // Catch:{ all -> 0x3520 }
            r2.A6K = r0     // Catch:{ all -> 0x3520 }
        L_0x03ac:
            java.lang.String r0 = "bot_metrics_destination_id"
            java.lang.String r0 = r3.getStringExtra(r0)     // Catch:{ all -> 0x3520 }
            r2.A6Q = r0     // Catch:{ all -> 0x3520 }
            X.00H r0 = r2.A52     // Catch:{ all -> 0x3520 }
            X.1fA r9 = X.AnonymousClass3MW.A0Y(r0)     // Catch:{ all -> 0x3520 }
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1GP r1 = r0.getSupportFragmentManager()     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "com.whatsapp.HomeActivity.ConversationFragment"
            androidx.fragment.app.Fragment r5 = r1.A0Q(r0)     // Catch:{ all -> 0x3520 }
            if (r5 != 0) goto L_0x03ce
            X.1FY r5 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
        L_0x03ce:
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r8 = 0
            X.C18070vi.A0d(r5, r8)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r15)     // Catch:{ all -> 0x3520 }
            X.02i r1 = new X.02i     // Catch:{ all -> 0x3520 }
            r1.<init>()     // Catch:{ all -> 0x3520 }
            X.4f4 r0 = new X.4f4     // Catch:{ all -> 0x3520 }
            r0.<init>(r3, r9, r6)     // Catch:{ all -> 0x3520 }
            X.02n r0 = r5.CDw(r0, r1)     // Catch:{ all -> 0x3520 }
            r2.A0c = r0     // Catch:{ all -> 0x3520 }
            X.4PL r0 = r2.A29     // Catch:{ all -> 0x3520 }
            X.1E7 r0 = r0.A09     // Catch:{ all -> 0x3520 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x3520 }
            r2.A35 = r0     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.A0F()     // Catch:{ all -> 0x3520 }
            r2.A6n = r0     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "extra_is_new_broadcast_list"
            r1 = r18
            r1.getBooleanExtra(r0, r8)     // Catch:{ all -> 0x3520 }
            X.1Q9 r3 = r2.A30     // Catch:{ all -> 0x3520 }
            if (r125 == 0) goto L_0x040f
            java.lang.String r5 = "ephemeral_session_start"
            r0 = -1
            r6 = r16
            long r0 = r6.getLong(r5, r0)     // Catch:{ all -> 0x3520 }
            r3.A00 = r0     // Catch:{ all -> 0x3520 }
        L_0x040f:
            X.1Q9 r3 = r2.A30     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = r0.getLocalClassName()     // Catch:{ all -> 0x3520 }
            r3.A00(r1, r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "initViewModelsAfterJid_start"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.1It r1 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<com.whatsapp.conversation.conversationrow.MessageSelectionViewModel> r0 = com.whatsapp.conversation.conversationrow.MessageSelectionViewModel.class
            X.1J2 r0 = r1.A00(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = (com.whatsapp.conversation.conversationrow.MessageSelectionViewModel) r0     // Catch:{ all -> 0x3520 }
            r2.A2J = r0     // Catch:{ all -> 0x3520 }
            X.1DT r3 = r0.A01     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 17
            X.C91594fw.A00(r1, r3, r2, r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r11 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.2h2 r0 = r2.A2P     // Catch:{ all -> 0x3520 }
            X.2XS r10 = r0.A06     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FE r37 = r0.getSavedStateRegistryOwner()     // Catch:{ all -> 0x3520 }
            X.5c3 r9 = r2.A4e     // Catch:{ all -> 0x3520 }
            X.1BI r6 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.1E7 r5 = r2.A35     // Catch:{ all -> 0x3520 }
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            android.content.Intent r36 = r0.getIntent()     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r1 = r2.A2J     // Catch:{ all -> 0x3520 }
            r3 = 0
            r17 = r3
            X.27u r0 = new X.27u     // Catch:{ all -> 0x3520 }
            r35 = r0
            r38 = r10
            r39 = r1
            r40 = r5
            r41 = r6
            r42 = r9
            r35.<init>(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3520 }
            X.1It r1 = new X.1It     // Catch:{ all -> 0x3520 }
            r1.<init>(r0, r11)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.3VQ> r0 = X.AnonymousClass3VQ.class
            X.1J2 r6 = r1.A00(r0)     // Catch:{ all -> 0x3520 }
            X.3VQ r6 = (X.AnonymousClass3VQ) r6     // Catch:{ all -> 0x3520 }
            r2.A2b = r6     // Catch:{ all -> 0x3520 }
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            android.graphics.Point r5 = X.C72483Me.A0D(r0)     // Catch:{ all -> 0x3520 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x3520 }
            r0 = 2131166269(0x7f07043d, float:1.7946779E38)
            int r1 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x3520 }
            int r0 = r5.y     // Catch:{ all -> 0x3520 }
            int r0 = r0 * 2
            int r0 = r0 / r1
            r6.A00 = r0     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            r0 = 8
            r1.A03 = r0     // Catch:{ all -> 0x3520 }
            X.1DT r1 = r1.A0W     // Catch:{ all -> 0x3520 }
            X.1F9 r0 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r14 = 27
            X.C91594fw.A00(r0, r1, r2, r14)     // Catch:{ all -> 0x3520 }
            X.3VQ r0 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1DT r5 = r0.A0V     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 28
            X.C91594fw.A00(r1, r5, r2, r0)     // Catch:{ all -> 0x3520 }
            X.3VQ r0 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r5 = r0.A18     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 29
            X.C91594fw.A00(r1, r5, r2, r0)     // Catch:{ all -> 0x3520 }
            X.3VQ r0 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r5 = r0.A17     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 30
            X.C91594fw.A00(r1, r5, r2, r0)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1DT r6 = r1.A0X     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 31
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r6 = r1.A1A     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 32
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r6 = r1.A1B     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r27 = 33
            r1 = r27
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r6 = r1.A11     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r26 = 34
            r1 = r26
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r6 = r1.A12     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r25 = 35
            r1 = r25
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1DT r6 = r1.A0Z     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 18
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1DT r6 = r1.A0R     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 20
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r6 = r1.A10     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 21
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r6 = r1.A14     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 22
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r6 = r1.A15     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 23
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r6 = r1.A16     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 24
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1DT r6 = r1.A0Y     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 25
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1wy r6 = r1.A19     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 26
            X.C91594fw.A00(r5, r6, r2, r1)     // Catch:{ all -> 0x3520 }
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.1EC> r23 = X.AnonymousClass1EC.class
            r5 = r23
            com.whatsapp.jid.Jid r5 = r1.A06(r5)     // Catch:{ all -> 0x3520 }
            X.1EC r5 = (X.AnonymousClass1EC) r5     // Catch:{ all -> 0x3520 }
            if (r5 == 0) goto L_0x05eb
            X.1CJ r1 = r2.A2w     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A0R(r5)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x05eb
            X.00H r1 = r2.A58     // Catch:{ all -> 0x3520 }
            X.1EC r9 = X.C72453Mb.A0n(r5, r1)     // Catch:{ all -> 0x3520 }
            if (r9 == 0) goto L_0x05eb
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r5 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.2h2 r1 = r2.A2P     // Catch:{ all -> 0x3520 }
            X.2Wx r1 = r1.A01     // Catch:{ all -> 0x3520 }
            X.8GM r6 = X.AnonymousClass8GM.A00(r5, r1, r9)     // Catch:{ all -> 0x3520 }
            X.1wy r10 = r6.A03     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 49
            X.C91594fw.A00(r5, r10, r2, r1)     // Catch:{ all -> 0x3520 }
            X.1FY r36 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2
            X.4nS r5 = new X.4nS     // Catch:{ all -> 0x3520 }
            r5.<init>(r9, r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A58     // Catch:{ all -> 0x3520 }
            X.1kb r37 = X.AnonymousClass3MW.A0Z(r1)     // Catch:{ all -> 0x3520 }
            X.4fr r1 = new X.4fr     // Catch:{ all -> 0x3520 }
            r35 = r1
            r38 = r6
            r39 = r5
            r40 = r8
            r35.<init>(r36, r37, r38, r39, r40)     // Catch:{ all -> 0x3520 }
            X.1Dg r10 = r6.A00     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r10.A0A(r5, r1)     // Catch:{ all -> 0x3520 }
            X.1wy r6 = r6.A02     // Catch:{ all -> 0x3520 }
            X.1F9 r5 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.4fm r1 = new X.4fm     // Catch:{ all -> 0x3520 }
            r1.<init>(r9, r2, r4)     // Catch:{ all -> 0x3520 }
            r6.A0A(r5, r1)     // Catch:{ all -> 0x3520 }
        L_0x05eb:
            X.0ve r5 = r2.A3F     // Catch:{ all -> 0x3520 }
            r4 = 12286(0x2ffe, float:1.7216E-41)
            r1 = r28
            boolean r1 = X.C18020vd.A05(r1, r5, r4)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x075d
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            r4 = r23
            com.whatsapp.jid.Jid r4 = r1.A06(r4)     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4     // Catch:{ all -> 0x3520 }
            if (r4 == 0) goto L_0x060f
            X.1CJ r1 = r2.A2w     // Catch:{ all -> 0x3520 }
            int r1 = r1.A06(r4)     // Catch:{ all -> 0x3520 }
            boolean r1 = X.AnonymousClass2TI.A00(r1)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x075d
        L_0x060f:
            r2.A1p = r3     // Catch:{ all -> 0x3520 }
        L_0x0611:
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r6 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.2h2 r1 = r2.A2P     // Catch:{ all -> 0x3520 }
            X.2XU r5 = r1.A08     // Catch:{ all -> 0x3520 }
            X.1BI r4 = r2.A3R     // Catch:{ all -> 0x3520 }
            r1 = 9
            X.1It r4 = X.C91774gE.A00(r6, r5, r4, r1)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.3UG> r1 = X.AnonymousClass3UG.class
            X.1J2 r1 = r4.A00(r1)     // Catch:{ all -> 0x3520 }
            X.3UG r1 = (X.AnonymousClass3UG) r1     // Catch:{ all -> 0x3520 }
            X.1wy r5 = r1.A01     // Catch:{ all -> 0x3520 }
            X.1F9 r4 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 46
            X.C91624fz.A01(r4, r5, r2, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r12 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.2h2 r1 = r2.A2P     // Catch:{ all -> 0x3520 }
            X.2XR r11 = r1.A05     // Catch:{ all -> 0x3520 }
            X.1BI r10 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.3TA r9 = r2.A2d     // Catch:{ all -> 0x3520 }
            com.whatsapp.countrygating.viewmodel.CountryGatingViewModel r6 = r2.A2l     // Catch:{ all -> 0x3520 }
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r5 = r2.A4C     // Catch:{ all -> 0x3520 }
            X.1E7 r4 = r2.A35     // Catch:{ all -> 0x3520 }
            X.4gB r1 = new X.4gB     // Catch:{ all -> 0x3520 }
            r35 = r1
            r36 = r11
            r37 = r9
            r38 = r6
            r39 = r4
            r40 = r10
            r41 = r5
            r35.<init>(r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3520 }
            X.1It r4 = new X.1It     // Catch:{ all -> 0x3520 }
            r4.<init>(r1, r12)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.3Ub> r1 = X.C73293Ub.class
            X.1J2 r1 = r4.A00(r1)     // Catch:{ all -> 0x3520 }
            X.3Ub r1 = (X.C73293Ub) r1     // Catch:{ all -> 0x3520 }
            r2.A2X = r1     // Catch:{ all -> 0x3520 }
            X.1wy r5 = r1.A08     // Catch:{ all -> 0x3520 }
            X.1F9 r4 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 47
            X.C91624fz.A01(r4, r5, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3Ub r1 = r2.A2X     // Catch:{ all -> 0x3520 }
            X.1DT r5 = r1.A02     // Catch:{ all -> 0x3520 }
            X.1F9 r4 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 48
            X.C91624fz.A01(r4, r5, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3Ub r1 = r2.A2X     // Catch:{ all -> 0x3520 }
            X.1wy r5 = r1.A0A     // Catch:{ all -> 0x3520 }
            X.1F9 r4 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 49
            X.C91624fz.A01(r4, r5, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3Ub r1 = r2.A2X     // Catch:{ all -> 0x3520 }
            X.1wy r4 = r1.A09     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.C91594fw.A00(r1, r4, r2, r8)     // Catch:{ all -> 0x3520 }
            X.3Ub r1 = r2.A2X     // Catch:{ all -> 0x3520 }
            X.1wy r4 = r1.A07     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.C91594fw.A00(r1, r4, r2, r15)     // Catch:{ all -> 0x3520 }
            X.0ve r5 = r2.A3F     // Catch:{ all -> 0x3520 }
            r4 = 12576(0x3120, float:1.7623E-41)
            r1 = r28
            boolean r1 = X.C18020vd.A05(r1, r5, r4)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0736
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            r4 = r23
            com.whatsapp.jid.Jid r5 = r1.A06(r4)     // Catch:{ all -> 0x3520 }
            X.1EC r5 = (X.AnonymousClass1EC) r5     // Catch:{ all -> 0x3520 }
            if (r5 == 0) goto L_0x06c6
            X.10I r4 = r2.A4c     // Catch:{ all -> 0x3520 }
            r1 = 31
            X.C98704ra.A00(r4, r2, r5, r1)     // Catch:{ all -> 0x3520 }
        L_0x06c6:
            X.1It r4 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<com.whatsapp.pnh.RequestPhoneNumberViewModel> r1 = com.whatsapp.pnh.RequestPhoneNumberViewModel.class
            X.1J2 r5 = r4.A00(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.pnh.RequestPhoneNumberViewModel r5 = (com.whatsapp.pnh.RequestPhoneNumberViewModel) r5     // Catch:{ all -> 0x3520 }
            X.4PS r4 = r2.A0w     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.4VP r5 = r4.A00(r1, r5)     // Catch:{ all -> 0x3520 }
            r2.A3w = r5     // Catch:{ all -> 0x3520 }
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            X.1BI r4 = r1.A0J     // Catch:{ all -> 0x3520 }
            boolean r1 = r4 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x06eb
            X.1E2 r4 = (X.AnonymousClass1E2) r4     // Catch:{ all -> 0x3520 }
            r5.A01(r4)     // Catch:{ all -> 0x3520 }
        L_0x06eb:
            boolean r1 = X.AnonymousClass3MZ.A1W(r2)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0705
            X.1FY r5 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.4X5 r1 = X.AnonymousClass3Ma.A0Y(r2)     // Catch:{ all -> 0x3520 }
            X.4JP r4 = r1.A01     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.1ch r1 = (X.C29681ch) r1     // Catch:{ all -> 0x3520 }
            X.440 r1 = X.AnonymousClass4HB.A00(r4, r5, r1)     // Catch:{ all -> 0x3520 }
            r2.A3c = r1     // Catch:{ all -> 0x3520 }
        L_0x0705:
            X.00H r1 = r2.A4t     // Catch:{ all -> 0x3520 }
            java.lang.Object r9 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4Om r9 = (X.C85724Om) r9     // Catch:{ all -> 0x3520 }
            X.1FY r10 = X.AnonymousClass3MW.A0Q(r2)     // Catch:{ all -> 0x3520 }
            X.0ve r13 = r2.A3F     // Catch:{ all -> 0x3520 }
            X.1E7 r12 = r2.A35     // Catch:{ all -> 0x3520 }
            X.1BI r11 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r6 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r10, r8)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r13, r15)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0p(r12, r11, r6)     // Catch:{ all -> 0x3520 }
            boolean r1 = r11 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x3520 }
            r4 = 0
            if (r1 == 0) goto L_0x072e
            r3 = r11
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x3520 }
        L_0x072e:
            boolean r1 = X.C84104Hw.A00(r13)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x07eb
            goto L_0x07e1
        L_0x0736:
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r6 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.2h2 r1 = r2.A2P     // Catch:{ all -> 0x3520 }
            X.4Iv r5 = r1.A00     // Catch:{ all -> 0x3520 }
            X.1E7 r4 = r2.A35     // Catch:{ all -> 0x3520 }
            r1 = 8
            X.1It r4 = X.C91774gE.A00(r6, r4, r5, r1)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.3Un> r1 = X.C73323Un.class
            X.1J2 r1 = r4.A00(r1)     // Catch:{ all -> 0x3520 }
            X.3Un r1 = (X.C73323Un) r1     // Catch:{ all -> 0x3520 }
            X.1wy r5 = r1.A02     // Catch:{ all -> 0x3520 }
            X.1F9 r4 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 39
            X.C91594fw.A00(r4, r5, r2, r1)     // Catch:{ all -> 0x3520 }
            goto L_0x06c6
        L_0x075d:
            X.1It r4 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<com.whatsapp.community.ConversationCommunityViewModel> r1 = com.whatsapp.community.ConversationCommunityViewModel.class
            X.1J2 r1 = r4.A00(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.community.ConversationCommunityViewModel r1 = (com.whatsapp.community.ConversationCommunityViewModel) r1     // Catch:{ all -> 0x3520 }
            r2.A1p = r1     // Catch:{ all -> 0x3520 }
            X.1DT r5 = r1.A03     // Catch:{ all -> 0x3520 }
            X.1F9 r4 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 16
            X.C91594fw.A00(r4, r5, r2, r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.community.ConversationCommunityViewModel r1 = r2.A1p     // Catch:{ all -> 0x3520 }
            X.1DT r4 = r1.A02     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r6 = 19
            X.C91594fw.A00(r1, r4, r2, r6)     // Catch:{ all -> 0x3520 }
            boolean r1 = A1x(r2)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0611
            com.whatsapp.community.ConversationCommunityViewModel r5 = r2.A1p     // Catch:{ all -> 0x3520 }
            X.1BI r4 = r2.A3R     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r4, r8)     // Catch:{ all -> 0x3520 }
            android.util.Pair r1 = android.util.Pair.create(r4, r3)     // Catch:{ all -> 0x3520 }
            r5.A00 = r1     // Catch:{ all -> 0x3520 }
            X.10I r1 = r5.A06     // Catch:{ all -> 0x3520 }
            X.C98804rk.A01(r1, r5, r4, r6)     // Catch:{ all -> 0x3520 }
            goto L_0x0611
        L_0x079f:
            X.00H r0 = r2.A55     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x3520 }
            X.9oM r5 = (X.C192419oM) r5     // Catch:{ all -> 0x3520 }
            X.1BI r3 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.4Xd r1 = X.C87814Xd.A0e     // Catch:{ all -> 0x3520 }
            X.4Xd r0 = r2.A2p     // Catch:{ all -> 0x3520 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x3520 }
            r6 = r0 ^ 1
            r1 = 0
            X.C18070vi.A0d(r3, r1)     // Catch:{ all -> 0x3520 }
            boolean r0 = X.C22971Dz.A0T(r3)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x0378
            if (r6 == 0) goto L_0x07c2
            X.2Qs r0 = X.C49502Qs.CTWA     // Catch:{ all -> 0x3520 }
            goto L_0x07dc
        L_0x07c2:
            X.00H r0 = r5.A00     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4bI r0 = (X.AnonymousClass4bI) r0     // Catch:{ all -> 0x3520 }
            X.4Cd r0 = r0.A00()     // Catch:{ all -> 0x3520 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x3520 }
            if (r0 == r1) goto L_0x07d7
            if (r0 != r15) goto L_0x0fa2
            goto L_0x07da
        L_0x07d7:
            X.2Qs r0 = X.C49502Qs.USERNAME     // Catch:{ all -> 0x3520 }
            goto L_0x07dc
        L_0x07da:
            X.2Qs r0 = X.C49502Qs.GENERAL     // Catch:{ all -> 0x3520 }
        L_0x07dc:
            r5.A01(r0, r3)     // Catch:{ all -> 0x3520 }
            goto L_0x0378
        L_0x07e1:
            if (r3 == 0) goto L_0x07eb
            boolean r1 = r12.A0E()     // Catch:{ all -> 0x3520 }
            r38 = 1
            if (r1 != 0) goto L_0x07ed
        L_0x07eb:
            r38 = 0
        L_0x07ed:
            r5 = 5811(0x16b3, float:8.143E-42)
            r1 = r28
            boolean r5 = X.C18020vd.A05(r1, r13, r5)     // Catch:{ all -> 0x3520 }
            if (r5 == 0) goto L_0x0802
            if (r3 == 0) goto L_0x0802
            X.1Ps r1 = r9.A02     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A0D(r11)     // Catch:{ all -> 0x3520 }
            r13 = 1
            if (r1 != 0) goto L_0x0805
        L_0x0802:
            r13 = 0
            if (r5 == 0) goto L_0x0810
        L_0x0805:
            X.1Ps r1 = r9.A02     // Catch:{ all -> 0x3520 }
            X.1Pk r1 = r1.A00     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A01(r11)     // Catch:{ all -> 0x3520 }
            r5 = 1
            if (r1 != 0) goto L_0x0811
        L_0x0810:
            r5 = 0
        L_0x0811:
            boolean r39 = r12.A0C()     // Catch:{ all -> 0x3520 }
            if (r13 == 0) goto L_0x081f
            boolean r1 = X.C42701yb.A01(r11)     // Catch:{ all -> 0x3520 }
            r40 = 1
            if (r1 != 0) goto L_0x0821
        L_0x081f:
            r40 = 0
        L_0x0821:
            if (r38 != 0) goto L_0x082a
            if (r13 != 0) goto L_0x082a
            if (r5 != 0) goto L_0x082a
            if (r39 != 0) goto L_0x082a
            goto L_0x085d
        L_0x082a:
            android.content.res.Resources r5 = r10.getResources()     // Catch:{ all -> 0x3520 }
            r1 = 2131165494(0x7f070136, float:1.7945207E38)
            int r37 = r5.getDimensionPixelSize(r1)     // Catch:{ all -> 0x3520 }
            android.content.res.Resources r5 = r10.getResources()     // Catch:{ all -> 0x3520 }
            r1 = 2131165493(0x7f070135, float:1.7945205E38)
            float r36 = X.AnonymousClass3MW.A00(r5, r1)     // Catch:{ all -> 0x3520 }
            X.6tA r1 = new X.6tA     // Catch:{ all -> 0x3520 }
            r35 = r1
            r35.<init>(r36, r37, r38, r39, r40)     // Catch:{ all -> 0x3520 }
            X.4JG r5 = r9.A00     // Catch:{ all -> 0x3520 }
            if (r38 != 0) goto L_0x084f
            if (r13 != 0) goto L_0x084f
            if (r39 == 0) goto L_0x0850
        L_0x084f:
            r4 = r3
        L_0x0850:
            r3 = 7
            X.1It r3 = X.C91784gF.A00(r6, r5, r1, r4, r3)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.3UN> r1 = X.AnonymousClass3UN.class
            X.1J2 r4 = r3.A00(r1)     // Catch:{ all -> 0x3520 }
            X.3UN r4 = (X.AnonymousClass3UN) r4     // Catch:{ all -> 0x3520 }
        L_0x085d:
            r2.A4A = r4     // Catch:{ all -> 0x3520 }
            r2.A0D()     // Catch:{ all -> 0x3520 }
            X.1It r3 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.8Fn> r1 = X.AnonymousClass8Fn.class
            X.1J2 r1 = r3.A00(r1)     // Catch:{ all -> 0x3520 }
            X.8Fn r1 = (X.AnonymousClass8Fn) r1     // Catch:{ all -> 0x3520 }
            X.0vl r1 = r1.A00     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.getValue()     // Catch:{ all -> 0x3520 }
            X.1DT r3 = (X.AnonymousClass1DT) r3     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r22 = 2
            r4 = r22
            X.C91594fw.A00(r1, r3, r2, r4)     // Catch:{ all -> 0x3520 }
            X.1QO r1 = r2.A3l     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A01()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x08db
            X.1R2 r6 = r2.A3s     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass3MW.A0j(r2)     // Catch:{ all -> 0x3520 }
            X.11S r1 = r2.A1O     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.PhoneUserJid r4 = X.AnonymousClass11S.A00(r1)     // Catch:{ all -> 0x3520 }
            X.2tK r1 = X.C63572tK.A0E     // Catch:{ all -> 0x3520 }
            java.lang.String r3 = "55"
            X.1Ln r1 = r2.A36     // Catch:{ all -> 0x3520 }
            boolean r1 = r6.A0i(r1, r5, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x08db
            X.1It r3 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel> r1 = com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel.class
            X.1J2 r1 = r3.A00(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r1 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r1     // Catch:{ all -> 0x3520 }
            r2.A3p = r1     // Catch:{ all -> 0x3520 }
            X.0vl r1 = r1.A05     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.getValue()     // Catch:{ all -> 0x3520 }
            X.1DT r4 = (X.AnonymousClass1DT) r4     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.AGs r1 = new X.AGs     // Catch:{ all -> 0x3520 }
            r1.<init>(r2, r15)     // Catch:{ all -> 0x3520 }
            r4.A0A(r3, r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r1 = r2.A3p     // Catch:{ all -> 0x3520 }
            X.0vl r1 = r1.A07     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.getValue()     // Catch:{ all -> 0x3520 }
            X.1DT r4 = (X.AnonymousClass1DT) r4     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.AGs r1 = new X.AGs     // Catch:{ all -> 0x3520 }
            r5 = r22
            r1.<init>(r2, r5)     // Catch:{ all -> 0x3520 }
            r4.A0A(r3, r1)     // Catch:{ all -> 0x3520 }
        L_0x08db:
            java.lang.String r1 = "initViewModelsAfterJid_end"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "add_chat_annotations_start"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.4RS r3 = r2.A2U     // Catch:{ all -> 0x3520 }
            X.1HB r1 = r3.A01     // Catch:{ all -> 0x3520 }
            X.37j r4 = new X.37j     // Catch:{ all -> 0x3520 }
            r4.<init>(r3, r8)     // Catch:{ all -> 0x3520 }
            X.19a r1 = r1.A01     // Catch:{ all -> 0x3520 }
            X.19T r3 = r1.A07     // Catch:{ all -> 0x3520 }
            X.19b r1 = r1.A05     // Catch:{ all -> 0x3520 }
            int r1 = r1.A06     // Catch:{ all -> 0x3520 }
            r3.Bit(r4, r1)     // Catch:{ all -> 0x3520 }
            X.4RS r3 = r2.A2U     // Catch:{ all -> 0x3520 }
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            r3.A00(r1)     // Catch:{ all -> 0x3520 }
            X.4RS r1 = r2.A2U     // Catch:{ all -> 0x3520 }
            X.00H r3 = r1.A06     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1Oe r3 = (X.C25431Oe) r3     // Catch:{ all -> 0x3520 }
            java.lang.String r4 = r3.A03()     // Catch:{ all -> 0x3520 }
            if (r4 == 0) goto L_0x0919
            X.1HB r1 = r1.A01     // Catch:{ all -> 0x3520 }
            java.lang.String r3 = "chat_session_id"
            X.19a r1 = r1.A01     // Catch:{ all -> 0x3520 }
            r1.A0A(r3, r4, r8)     // Catch:{ all -> 0x3520 }
        L_0x0919:
            X.4RS r6 = r2.A2U     // Catch:{ all -> 0x3520 }
            X.1FY r5 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r4 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.1HB r3 = r6.A01     // Catch:{ all -> 0x3520 }
            X.4pv r1 = new X.4pv     // Catch:{ all -> 0x3520 }
            r1.<init>(r5, r6, r4, r15)     // Catch:{ all -> 0x3520 }
            X.19a r3 = r3.A01     // Catch:{ all -> 0x3520 }
            X.19T r4 = r3.A07     // Catch:{ all -> 0x3520 }
            X.19b r3 = r3.A05     // Catch:{ all -> 0x3520 }
            int r3 = r3.A06     // Catch:{ all -> 0x3520 }
            r4.Bit(r1, r3)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "add_chat_annotations_end"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.4PL r3 = r2.A29     // Catch:{ all -> 0x3520 }
            boolean r1 = r3.A0e     // Catch:{ all -> 0x3520 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x3520 }
            X.C17960vV.A07(r4)     // Catch:{ all -> 0x3520 }
            r2.A6g = r1     // Catch:{ all -> 0x3520 }
            boolean r1 = r3.A0g     // Catch:{ all -> 0x3520 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x3520 }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x3520 }
            r2.A6i = r1     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            boolean r1 = X.C22971Dz.A0V(r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x096f
            X.4X5 r1 = X.AnonymousClass3Ma.A0Y(r2)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r1.A0I     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4Rr r3 = (X.C86454Rr) r3     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.1ch r1 = (X.C29681ch) r1     // Catch:{ all -> 0x3520 }
            boolean r3 = r3.A01(r1)     // Catch:{ all -> 0x3520 }
            r1 = 1
            if (r3 != 0) goto L_0x0970
        L_0x096f:
            r1 = 0
        L_0x0970:
            r2.A6q = r1     // Catch:{ all -> 0x3520 }
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            java.lang.Long r3 = r1.A0F     // Catch:{ all -> 0x3520 }
            r2.A6N = r3     // Catch:{ all -> 0x3520 }
            boolean r3 = r1.A0Y     // Catch:{ all -> 0x3520 }
            r2.A6Z = r3     // Catch:{ all -> 0x3520 }
            X.3VQ r3 = r2.A2b     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A0X     // Catch:{ all -> 0x3520 }
            r3.A0I = r1     // Catch:{ all -> 0x3520 }
            X.2l6 r1 = r2.A2s     // Catch:{ all -> 0x3520 }
            r1.A00()     // Catch:{ all -> 0x3520 }
            X.4Xd r1 = r2.A2p     // Catch:{ all -> 0x3520 }
            boolean r4 = r1.A0W     // Catch:{ all -> 0x3520 }
            X.4QB r1 = r2.A2r     // Catch:{ all -> 0x3520 }
            if (r4 != 0) goto L_0x099d
            X.4Lg r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.0ve r5 = r1.A00     // Catch:{ all -> 0x3520 }
            r3 = 976(0x3d0, float:1.368E-42)
            r1 = r28
            boolean r1 = X.C18020vd.A05(r1, r5, r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0ade
        L_0x099d:
            X.4QB r1 = r2.A2r     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A00()     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x0ade
            X.10I r5 = r2.A4c     // Catch:{ all -> 0x3520 }
            X.4rj r3 = new X.4rj     // Catch:{ all -> 0x3520 }
            r3.<init>((X.AnonymousClass4aY) r2, (int) r7)     // Catch:{ all -> 0x3520 }
        L_0x09ac:
            r5.CGF(r3)     // Catch:{ all -> 0x3520 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "conversation/onCreate entryPoint="
            r3.append(r1)     // Catch:{ all -> 0x3520 }
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r1.A0L     // Catch:{ all -> 0x3520 }
            X.C17890vO.A1A(r3, r1)     // Catch:{ all -> 0x3520 }
            X.4PL r3 = r2.A29     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r3.A0L     // Catch:{ all -> 0x3520 }
            r2.A6U = r1     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r3.A0I     // Catch:{ all -> 0x3520 }
            r2.A6R = r1     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r3.A0K     // Catch:{ all -> 0x3520 }
            r2.A6T = r1     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r3.A0J     // Catch:{ all -> 0x3520 }
            r2.A6S = r1     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5I     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4Zs r1 = (X.C88444Zs) r1     // Catch:{ all -> 0x3520 }
            X.4Nx r6 = r1.A00     // Catch:{ all -> 0x3520 }
            X.1BI r5 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.4Xd r3 = r2.A2p     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r5, r8)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r15)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r3.A0F     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0a26
            int r1 = r1.length()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0a26
            java.lang.String r1 = r3.A0O     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0a26
            int r1 = r1.length()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0a26
            X.1CJ r1 = r6.A02     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A0P(r5)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x0a26
            X.0ve r4 = r6.A03     // Catch:{ all -> 0x3520 }
            r3 = 2666(0xa6a, float:3.736E-42)
            r1 = r28
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0a26
            X.1M9 r1 = r6.A00     // Catch:{ all -> 0x3520 }
            X.1E7 r3 = r1.A0H(r5)     // Catch:{ all -> 0x3520 }
            X.1Co r1 = r6.A01     // Catch:{ all -> 0x3520 }
            java.lang.String r39 = r3.A0K()     // Catch:{ all -> 0x3520 }
            X.2Qs r36 = X.C49502Qs.CTWA     // Catch:{ all -> 0x3520 }
            r35 = r1
            r37 = r5
            r38 = r17
            r40 = r15
            r35.A05(r36, r37, r38, r39, r40)     // Catch:{ all -> 0x3520 }
        L_0x0a26:
            X.00H r1 = r2.A5I     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4Zs r1 = (X.C88444Zs) r1     // Catch:{ all -> 0x3520 }
            X.00H r1 = r1.A02     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4O3 r1 = (X.AnonymousClass4O3) r1     // Catch:{ all -> 0x3520 }
            X.4JY r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.3TA r12 = r2.A2d     // Catch:{ all -> 0x3520 }
            X.4PL r3 = r2.A29     // Catch:{ all -> 0x3520 }
            X.4Xd r11 = r3.A07     // Catch:{ all -> 0x3520 }
            X.4TX r45 = X.C88444Zs.A02(r2)     // Catch:{ all -> 0x3520 }
            r6 = 2131431492(0x7f0b1044, float:1.8484715E38)
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.1K1 r9 = r1.A00     // Catch:{ all -> 0x3520 }
            android.app.Activity r10 = r9.AAO     // Catch:{ all -> 0x3520 }
            X.10E r3 = r1.A01     // Catch:{ all -> 0x3520 }
            X.1KB r37 = X.AnonymousClass10E.A12(r3)     // Catch:{ all -> 0x3520 }
            X.0ve r46 = X.AnonymousClass10E.A8r(r3)     // Catch:{ all -> 0x3520 }
            X.1gU r47 = X.AnonymousClass3MY.A0d(r3)     // Catch:{ all -> 0x3520 }
            X.00S r1 = r3.AA9     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r1.get()     // Catch:{ all -> 0x3520 }
            X.181 r5 = (X.AnonymousClass181) r5     // Catch:{ all -> 0x3520 }
            X.10G r1 = r3.A00     // Catch:{ all -> 0x3520 }
            X.00S r4 = r1.A2b     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x3520 }
            X.4Lf r4 = (X.C84884Lf) r4     // Catch:{ all -> 0x3520 }
            X.1PU r48 = X.AnonymousClass3MZ.A12(r3)     // Catch:{ all -> 0x3520 }
            X.5bZ r39 = X.AnonymousClass3MZ.A0V(r9)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A2a     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4XK r3 = (X.AnonymousClass4XK) r3     // Catch:{ all -> 0x3520 }
            X.4Rp r40 = X.AnonymousClass1K1.A12(r9)     // Catch:{ all -> 0x3520 }
            X.1L4 r49 = X.AnonymousClass3Ma.A0w(r1)     // Catch:{ all -> 0x3520 }
            X.4VR r1 = new X.4VR     // Catch:{ all -> 0x3520 }
            r35 = r1
            r36 = r10
            r38 = r5
            r41 = r12
            r42 = r11
            r43 = r3
            r44 = r4
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x3520 }
            r2.A2q = r1     // Catch:{ all -> 0x3520 }
            X.0ve r4 = X.AnonymousClass3MX.A0h(r2)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r4, r8)     // Catch:{ all -> 0x3520 }
            r3 = 508(0x1fc, float:7.12E-43)
            r1 = r28
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0ab1
            java.lang.String r1 = r2.A6U     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x0ad0
            java.lang.String r1 = r2.A6T     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x0ad0
        L_0x0ab1:
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r1.A0J     // Catch:{ all -> 0x3520 }
            boolean r1 = X.C22971Dz.A0N(r1)     // Catch:{ all -> 0x3520 }
            r2.A6o = r1     // Catch:{ all -> 0x3520 }
            X.1BI r5 = r2.A3R     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A00(r5)     // Catch:{ all -> 0x3520 }
            X.1CJ r3 = r2.A2w     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1M9 r1 = r1.getContactManager()     // Catch:{ all -> 0x3520 }
            boolean r1 = X.C43391zj.A04(r1, r3, r5)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0afc
            goto L_0x0ae9
        L_0x0ad0:
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MW.A0j(r2)     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x0ab1
            X.10I r1 = X.AnonymousClass3MX.A0w(r2)     // Catch:{ all -> 0x3520 }
            X.C98704ra.A00(r1, r2, r3, r0)     // Catch:{ all -> 0x3520 }
            goto L_0x0ab1
        L_0x0ade:
            X.10I r5 = r2.A4c     // Catch:{ all -> 0x3520 }
            r1 = 40
            X.7RK r3 = new X.7RK     // Catch:{ all -> 0x3520 }
            r3.<init>((int) r1, (java.lang.Object) r2, (boolean) r4)     // Catch:{ all -> 0x3520 }
            goto L_0x09ac
        L_0x0ae9:
            if (r4 == 0) goto L_0x0afc
            X.1Pu r1 = r2.A4H     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A01(r4)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x0afc
            X.1iW r1 = X.AnonymousClass3MX.A0X(r2)     // Catch:{ all -> 0x3520 }
            r3 = r17
            r1.A0Z(r4, r3, r8, r8)     // Catch:{ all -> 0x3520 }
        L_0x0afc:
            r2.A7U = r15     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "inflateViews_start"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.0ve r4 = X.AnonymousClass3MX.A0h(r2)     // Catch:{ all -> 0x3520 }
            r3 = 12815(0x320f, float:1.7958E-41)
            r1 = r28
            boolean r4 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r4 == 0) goto L_0x0b20
            X.00H r1 = r2.A5V     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4OA r1 = (X.AnonymousClass4OA) r1     // Catch:{ all -> 0x3520 }
            r1.A00 = r15     // Catch:{ all -> 0x3520 }
            java.util.Map r1 = r1.A03     // Catch:{ all -> 0x3520 }
            r1.clear()     // Catch:{ all -> 0x3520 }
        L_0x0b20:
            boolean r1 = A26(r2)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0b2f
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131624715(0x7f0e030b, float:1.8876618E38)
        L_0x0b2b:
            r3.setContentView(r1)     // Catch:{ all -> 0x3520 }
            goto L_0x0b35
        L_0x0b2f:
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131624698(0x7f0e02fa, float:1.8876583E38)
            goto L_0x0b2b
        L_0x0b35:
            if (r4 == 0) goto L_0x0b58
            X.00H r1 = r2.A5V     // Catch:{ all -> 0x3520 }
            java.lang.Object r9 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4OA r9 = (X.AnonymousClass4OA) r9     // Catch:{ all -> 0x3520 }
            r9.A00 = r8     // Catch:{ all -> 0x3520 }
            java.util.Map r1 = r9.A03     // Catch:{ all -> 0x3520 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x3520 }
            r5.<init>(r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r9.A01     // Catch:{ all -> 0x3520 }
            X.10I r4 = X.AnonymousClass3MX.A0x(r1)     // Catch:{ all -> 0x3520 }
            r3 = 16
            X.Ak0 r1 = new X.Ak0     // Catch:{ all -> 0x3520 }
            r1.<init>(r9, r5, r3)     // Catch:{ all -> 0x3520 }
            r4.CGF(r1)     // Catch:{ all -> 0x3520 }
        L_0x0b58:
            java.lang.String r1 = "inflateViews_end"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "viewStubInflation_start"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131434891(0x7f0b1d8b, float:1.8491609E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            X.C17960vV.A05(r1)     // Catch:{ all -> 0x3520 }
            X.1bI r1 = X.AnonymousClass3MW.A0p(r1)     // Catch:{ all -> 0x3520 }
            r2.A4Y = r1     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131435617(0x7f0b2061, float:1.8493081E38)
            X.1bI r1 = X.C72453Mb.A0r(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A4a = r1     // Catch:{ all -> 0x3520 }
            X.0ve r4 = r2.A3F     // Catch:{ all -> 0x3520 }
            r3 = 12067(0x2f23, float:1.691E-41)
            r1 = r28
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x0baa
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131436864(0x7f0b2540, float:1.849561E38)
            A1p(r3, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131436865(0x7f0b2541, float:1.8495612E38)
            A1p(r3, r1)     // Catch:{ all -> 0x3520 }
            X.1bI r1 = r2.A4Y     // Catch:{ all -> 0x3520 }
            r1.A02()     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131433352(0x7f0b1788, float:1.8488487E38)
            A1p(r3, r1)     // Catch:{ all -> 0x3520 }
        L_0x0baa:
            X.0ve r4 = r2.A3F     // Catch:{ all -> 0x3520 }
            r3 = 12068(0x2f24, float:1.6911E-41)
            r1 = r28
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x0bd2
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131429329(0x7f0b07d1, float:1.8480328E38)
            X.1bI r1 = X.C72453Mb.A0t(r3, r1)     // Catch:{ all -> 0x3520 }
            r1.A02()     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131434126(0x7f0b1a8e, float:1.8490057E38)
            A1p(r3, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131435555(0x7f0b2023, float:1.8492955E38)
            A1p(r3, r1)     // Catch:{ all -> 0x3520 }
        L_0x0bd2:
            X.0ve r4 = r2.A3F     // Catch:{ all -> 0x3520 }
            r3 = 12066(0x2f22, float:1.6908E-41)
            r1 = r28
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x0be3
            X.1bI r1 = r2.A4a     // Catch:{ all -> 0x3520 }
            r1.A02()     // Catch:{ all -> 0x3520 }
        L_0x0be3:
            X.0ve r4 = r2.A3F     // Catch:{ all -> 0x3520 }
            r3 = 12069(0x2f25, float:1.6912E-41)
            r1 = r28
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x0bff
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            android.view.View r1 = r1.findViewById(r6)     // Catch:{ all -> 0x3520 }
            X.C17960vV.A05(r1)     // Catch:{ all -> 0x3520 }
            X.1bI r1 = X.AnonymousClass3MW.A0p(r1)     // Catch:{ all -> 0x3520 }
            X.C72463Mc.A1G(r1)     // Catch:{ all -> 0x3520 }
        L_0x0bff:
            java.lang.String r1 = "viewStubInflation_end"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "setupToolbar_start"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131429583(0x7f0b08cf, float:1.8480843E38)
            android.view.View r3 = X.C110885hR.A0A(r3, r1)     // Catch:{ all -> 0x3520 }
            r1 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1     // Catch:{ all -> 0x3520 }
            r2.A0f = r1     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0c24
            A0T(r1, r2)     // Catch:{ all -> 0x3520 }
        L_0x0c24:
            java.lang.String r1 = "setupToolbar_end"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0c46
            X.0ve r1 = r2.A3F     // Catch:{ all -> 0x3520 }
            boolean r1 = X.AnonymousClass1J8.A03(r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0c46
            X.0ve r4 = r2.A3F     // Catch:{ all -> 0x3520 }
            r3 = 12746(0x31ca, float:1.7861E-41)
            r1 = r28
            int r1 = X.C18020vd.A00(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            r3 = r22
            if (r1 != r3) goto L_0x0c46
            A0Y(r2)     // Catch:{ all -> 0x3520 }
        L_0x0c46:
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131429574(0x7f0b08c6, float:1.8480825E38)
            android.view.View r6 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.KeyboardPopupLayout r6 = (com.whatsapp.KeyboardPopupLayout) r6     // Catch:{ all -> 0x3520 }
            r2.A1M = r6     // Catch:{ all -> 0x3520 }
            X.1FY r5 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r4 = X.AnonymousClass3MW.A0Q(r2)     // Catch:{ all -> 0x3520 }
            r3 = 2130969438(0x7f04035e, float:1.7547558E38)
            r1 = 2131100423(0x7f060307, float:1.7813227E38)
            int r1 = X.AnonymousClass3MZ.A02(r4, r5, r3, r1)     // Catch:{ all -> 0x3520 }
            r6.setKeyboardPopupBackgroundColor(r1)     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131434738(0x7f0b1cf2, float:1.8491298E38)
            android.view.View r1 = X.C110885hR.A0A(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A0C = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ all -> 0x3520 }
            r2.A0R = r1     // Catch:{ all -> 0x3520 }
            X.1Il r1 = X.AnonymousClass3Ma.A0j(r2)     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A06()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0c8f
            r2.A0J()     // Catch:{ all -> 0x3520 }
        L_0x0c8f:
            X.17T r3 = r2.A1s     // Catch:{ all -> 0x3520 }
            X.4k5 r1 = new X.4k5     // Catch:{ all -> 0x3520 }
            r4 = r22
            r1.<init>(r2, r4)     // Catch:{ all -> 0x3520 }
            r3.setVisibilityChangeListener(r1)     // Catch:{ all -> 0x3520 }
            int r1 = r2.A00     // Catch:{ all -> 0x3520 }
            A1N(r2, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131429583(0x7f0b08cf, float:1.8480843E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ all -> 0x3520 }
            r2.A0Z = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131430255(0x7f0b0b6f, float:1.8482206E38)
            r5 = 2131430255(0x7f0b0b6f, float:1.8482206E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            r2.A0D = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131436064(0x7f0b2220, float:1.8493988E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            r2.A7D = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131427706(0x7f0b017a, float:1.8477036E38)
            X.1bI r1 = X.C72453Mb.A0t(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A4S = r1     // Catch:{ all -> 0x3520 }
            X.4Ye r4 = A05(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r8)     // Catch:{ all -> 0x3520 }
            r1 = 2131434377(0x7f0b1b89, float:1.8490566E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1     // Catch:{ all -> 0x3520 }
            r4.A01 = r1     // Catch:{ all -> 0x3520 }
            r1 = 2131434378(0x7f0b1b8a, float:1.8490568E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            r4.A00 = r1     // Catch:{ all -> 0x3520 }
            r1 = 2131430651(0x7f0b0cfb, float:1.848301E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1     // Catch:{ all -> 0x3520 }
            r4.A02 = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131429329(0x7f0b07d1, float:1.8480328E38)
            X.1bI r1 = X.C72453Mb.A0t(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A4O = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131429792(0x7f0b09a0, float:1.8481267E38)
            X.1bI r1 = X.C72453Mb.A0t(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A4Q = r1     // Catch:{ all -> 0x3520 }
            X.C98254qp.A00(r1, r2, r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131428062(0x7f0b02de, float:1.8477758E38)
            X.1bI r1 = X.C72453Mb.A0t(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A4N = r1     // Catch:{ all -> 0x3520 }
            r3 = r19
            X.C98244qo.A00(r1, r3)     // Catch:{ all -> 0x3520 }
            X.0ve r4 = r2.A3F     // Catch:{ all -> 0x3520 }
            r3 = 12415(0x307f, float:1.7397E-41)
            r1 = r28
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x0d33
            X.1bI r1 = r2.A4N     // Catch:{ all -> 0x3520 }
            r1.A02()     // Catch:{ all -> 0x3520 }
        L_0x0d33:
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131437043(0x7f0b25f3, float:1.8495974E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ all -> 0x3520 }
            r2.A0V = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131434297(0x7f0b1b39, float:1.8490404E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ all -> 0x3520 }
            r2.A0S = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131436885(0x7f0b2555, float:1.8495653E38)
            X.1bI r1 = X.C72453Mb.A0t(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A4b = r1     // Catch:{ all -> 0x3520 }
            X.C98254qp.A00(r1, r2, r14)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            android.widget.ListView r1 = r1.getListView()     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationListView r1 = (com.whatsapp.conversation.ConversationListView) r1     // Catch:{ all -> 0x3520 }
            r2.A2B = r1     // Catch:{ all -> 0x3520 }
            r1.setDividerHeight(r8)     // Catch:{ all -> 0x3520 }
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 3575(0xdf7, float:5.01E-42)
            boolean r1 = X.C36301nf.A01(r3, r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0d7c
            com.whatsapp.conversation.ConversationListView r1 = r2.A2B     // Catch:{ all -> 0x3520 }
            r1.setClipChildren(r8)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationListView r1 = r2.A2B     // Catch:{ all -> 0x3520 }
            r1.setClipToPadding(r8)     // Catch:{ all -> 0x3520 }
        L_0x0d7c:
            java.lang.String r13 = "bonsai_end"
            boolean r1 = A1y(r2)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0eb7
            java.lang.String r1 = "bonsai_start"
            A1d(r2, r1)     // Catch:{ all -> 0x0eae }
            X.2hA r1 = X.AnonymousClass3MZ.A0k(r2)     // Catch:{ all -> 0x0eae }
            X.00H r1 = r1.A0G     // Catch:{ all -> 0x0eae }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x0eae }
            X.1Pl r3 = (X.C25741Pl) r3     // Catch:{ all -> 0x0eae }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x0eae }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0eae }
            X.24e r1 = r3.A01(r1)     // Catch:{ all -> 0x0eae }
            r2.A0s = r1     // Catch:{ all -> 0x0eae }
            if (r1 != 0) goto L_0x0db5
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0eae }
            java.lang.String r1 = "conversation/initializeBot/bot profile is null for bot jid "
            r3.append(r1)     // Catch:{ all -> 0x0eae }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x0eae }
            java.lang.String r1 = X.C17890vO.A0V(r1, r3)     // Catch:{ all -> 0x0eae }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x0eae }
            goto L_0x0eb4
        L_0x0db5:
            r2.A0D()     // Catch:{ all -> 0x0eae }
            boolean r1 = r2.A1v()     // Catch:{ all -> 0x0eae }
            if (r1 == 0) goto L_0x0e85
            X.24e r1 = r2.A0s     // Catch:{ all -> 0x0eae }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x0eae }
            X.2hA r12 = X.AnonymousClass3MZ.A0k(r2)     // Catch:{ all -> 0x0eae }
            X.00H r1 = r12.A0K     // Catch:{ all -> 0x0eae }
            java.lang.Object r11 = r1.get()     // Catch:{ all -> 0x0eae }
            X.4Ki r11 = (X.C84654Ki) r11     // Catch:{ all -> 0x0eae }
            X.1F9 r10 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x0eae }
            android.view.ViewGroup r3 = r2.A0R     // Catch:{ all -> 0x0eae }
            r1 = 2131432706(0x7f0b1502, float:1.8487177E38)
            android.view.ViewStub r9 = X.AnonymousClass3MW.A0E(r3, r1)     // Catch:{ all -> 0x0eae }
            android.view.ViewGroup r3 = r2.A0R     // Catch:{ all -> 0x0eae }
            r1 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r6 = X.AnonymousClass1HF.A06(r3, r1)     // Catch:{ all -> 0x0eae }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x0eae }
            r1 = 2131429583(0x7f0b08cf, float:1.8480843E38)
            android.view.View r3 = X.C110885hR.A0A(r3, r1)     // Catch:{ all -> 0x0eae }
            r1 = 2131434889(0x7f0b1d89, float:1.8491605E38)
            android.view.ViewGroup r3 = X.AnonymousClass3MW.A0C(r3, r1)     // Catch:{ all -> 0x0eae }
            androidx.appcompat.widget.Toolbar r1 = r2.A0f     // Catch:{ all -> 0x0eae }
            r3.removeView(r1)     // Catch:{ all -> 0x0eae }
            X.2hA r1 = X.AnonymousClass3MZ.A0k(r2)     // Catch:{ all -> 0x0eae }
            X.00H r1 = r1.A0B     // Catch:{ all -> 0x0eae }
            r1.get()     // Catch:{ all -> 0x0eae }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x0eae }
            r1.CFa()     // Catch:{ all -> 0x0eae }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x0eae }
            r1 = 2131434889(0x7f0b1d89, float:1.8491605E38)
            android.view.View r4 = X.C110885hR.A0A(r3, r1)     // Catch:{ all -> 0x0eae }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x0eae }
            android.view.LayoutInflater r3 = X.C72463Mc.A0K(r4, r15)     // Catch:{ all -> 0x0eae }
            r1 = 2131627211(0x7f0e0ccb, float:1.888168E38)
            android.view.View r3 = r3.inflate(r1, r4, r8)     // Catch:{ all -> 0x0eae }
            java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar"
            X.C18070vi.A0z(r3, r1)     // Catch:{ all -> 0x0eae }
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3     // Catch:{ all -> 0x0eae }
            r4.addView(r3, r8)     // Catch:{ all -> 0x0eae }
            r2.A0f = r3     // Catch:{ all -> 0x0eae }
            A0T(r3, r2)     // Catch:{ all -> 0x0eae }
            r2.A0J()     // Catch:{ all -> 0x0eae }
            A0j(r2)     // Catch:{ all -> 0x0eae }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x0eae }
            X.1FD r3 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x0eae }
            X.24e r1 = r2.A0s     // Catch:{ all -> 0x0eae }
            X.C18070vi.A0d(r3, r8)     // Catch:{ all -> 0x0eae }
            X.C18070vi.A0d(r1, r15)     // Catch:{ all -> 0x0eae }
            X.1It r3 = X.C91774gE.A00(r3, r1, r11, r8)     // Catch:{ all -> 0x0eae }
            java.lang.Class<X.3US> r1 = X.AnonymousClass3US.class
            X.1J2 r1 = r3.A00(r1)     // Catch:{ all -> 0x0eae }
            X.3US r1 = (X.AnonymousClass3US) r1     // Catch:{ all -> 0x0eae }
            r2.A1f = r1     // Catch:{ all -> 0x0eae }
            X.1DT r4 = r1.A00     // Catch:{ all -> 0x0eae }
            r3 = 6
            X.4fo r1 = new X.4fo     // Catch:{ all -> 0x0eae }
            r1.<init>(r6, r9, r2, r3)     // Catch:{ all -> 0x0eae }
            r4.A0A(r10, r1)     // Catch:{ all -> 0x0eae }
            X.3US r1 = r2.A1f     // Catch:{ all -> 0x0eae }
            X.1DT r3 = r1.A01     // Catch:{ all -> 0x0eae }
            r1 = 45
            X.C91594fw.A00(r10, r3, r2, r1)     // Catch:{ all -> 0x0eae }
            X.3US r1 = r2.A1f     // Catch:{ all -> 0x0eae }
            X.1DT r3 = r1.A02     // Catch:{ all -> 0x0eae }
            r1 = 46
            X.C91594fw.A00(r10, r3, r2, r1)     // Catch:{ all -> 0x0eae }
            X.4dy r1 = new X.4dy     // Catch:{ all -> 0x0eae }
            r1.<init>(r10, r12, r2)     // Catch:{ all -> 0x0eae }
            r9.setOnInflateListener(r1)     // Catch:{ all -> 0x0eae }
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x0eae }
            X.1DT r1 = r1.A0U     // Catch:{ all -> 0x0eae }
            X.1Dg r3 = X.C22791Df.A00(r1)     // Catch:{ all -> 0x0eae }
            r1 = 47
            X.C91594fw.A00(r10, r3, r2, r1)     // Catch:{ all -> 0x0eae }
        L_0x0e85:
            X.1UD r1 = X.C72473Md.A0R(r2)     // Catch:{ all -> 0x0eae }
            boolean r1 = r1.A00()     // Catch:{ all -> 0x0eae }
            if (r1 == 0) goto L_0x0eb4
            X.1Ps r9 = X.C72483Me.A0S(r2)     // Catch:{ all -> 0x0eae }
            X.1FY r1 = X.AnonymousClass3MW.A0Q(r2)     // Catch:{ all -> 0x0eae }
            X.1FU r6 = X.AnonymousClass3MZ.A0P(r1)     // Catch:{ all -> 0x0eae }
            java.util.Set r4 = r2.A7q     // Catch:{ all -> 0x0eae }
            X.3US r1 = r2.A1f     // Catch:{ all -> 0x0eae }
            if (r1 != 0) goto L_0x0ea3
            r3 = 0
            goto L_0x0ea5
        L_0x0ea3:
            X.1DT r3 = r1.A00     // Catch:{ all -> 0x0eae }
        L_0x0ea5:
            X.4h4 r1 = new X.4h4     // Catch:{ all -> 0x0eae }
            r1.<init>(r3, r6, r9)     // Catch:{ all -> 0x0eae }
            r4.add(r1)     // Catch:{ all -> 0x0eae }
            goto L_0x0eb4
        L_0x0eae:
            r0 = move-exception
            A1d(r2, r13)     // Catch:{ all -> 0x3520 }
            goto L_0x1153
        L_0x0eb4:
            A1d(r2, r13)     // Catch:{ all -> 0x3520 }
        L_0x0eb7:
            java.lang.String r1 = "initWallPaper_start"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131429553(0x7f0b08b1, float:1.8480782E38)
            X.1bI r1 = X.C72453Mb.A0r(r3, r1)     // Catch:{ all -> 0x3520 }
            android.view.View r1 = X.AnonymousClass3MY.A0I(r1, r8)     // Catch:{ all -> 0x3520 }
            com.whatsapp.settings.chat.wallpaper.WallPaperView r1 = (com.whatsapp.settings.chat.wallpaper.WallPaperView) r1     // Catch:{ all -> 0x3520 }
            r2.A44 = r1     // Catch:{ all -> 0x3520 }
            A0n(r2)     // Catch:{ all -> 0x3520 }
            com.whatsapp.settings.chat.wallpaper.WallPaperView r3 = r2.A44     // Catch:{ all -> 0x3520 }
            X.4q0 r1 = new X.4q0     // Catch:{ all -> 0x3520 }
            r1.<init>(r2)     // Catch:{ all -> 0x3520 }
            r3.A00 = r1     // Catch:{ all -> 0x3520 }
            X.4GR r40 = new X.4GR     // Catch:{ all -> 0x3520 }
            r40.<init>()     // Catch:{ all -> 0x3520 }
            X.2XD r1 = r2.A19     // Catch:{ all -> 0x3520 }
            X.1BI r10 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.1FY r36 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            com.whatsapp.KeyboardPopupLayout r9 = r2.A1M     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationListView r6 = r2.A2B     // Catch:{ all -> 0x3520 }
            r6.getClass()     // Catch:{ all -> 0x3520 }
            r3 = 6
            X.4rj r4 = new X.4rj     // Catch:{ all -> 0x3520 }
            r4.<init>((java.lang.Object) r6, (int) r3)     // Catch:{ all -> 0x3520 }
            X.1FY r38 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            com.whatsapp.settings.chat.wallpaper.WallPaperView r6 = r2.A44     // Catch:{ all -> 0x3520 }
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.10E r1 = r1.A01     // Catch:{ all -> 0x3520 }
            X.1KB r39 = X.AnonymousClass10E.A12(r1)     // Catch:{ all -> 0x3520 }
            X.10I r45 = X.AnonymousClass10E.AL1(r1)     // Catch:{ all -> 0x3520 }
            X.11C r41 = X.AnonymousClass3Ma.A0a(r1)     // Catch:{ all -> 0x3520 }
            X.10G r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.00S r1 = r1.A5C     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4aW r3 = (X.AnonymousClass4aW) r3     // Catch:{ all -> 0x3520 }
            X.3hS r1 = new X.3hS     // Catch:{ all -> 0x3520 }
            r35 = r1
            r37 = r9
            r42 = r10
            r43 = r6
            r44 = r3
            r46 = r4
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x3520 }
            java.util.Set r3 = r2.A7p     // Catch:{ all -> 0x3520 }
            r123 = r3
            r3.add(r1)     // Catch:{ all -> 0x3520 }
            java.util.Set r3 = r2.A7o     // Catch:{ all -> 0x3520 }
            r122 = r3
            X.4h3 r3 = r1.A01     // Catch:{ all -> 0x3520 }
            r1 = r122
            r1.add(r3)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "initWallPaper_end"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationListView r1 = r2.A2B     // Catch:{ all -> 0x3520 }
            android.view.ViewTreeObserver r3 = r1.getViewTreeObserver()     // Catch:{ all -> 0x3520 }
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.A7z     // Catch:{ all -> 0x3520 }
            r3.addOnPreDrawListener(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationListView r3 = r2.A2B     // Catch:{ all -> 0x3520 }
            boolean r1 = r2.A6t     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x0f53
            r1 = 8
            X.AnonymousClass3MZ.A1K(r3, r2, r1)     // Catch:{ all -> 0x3520 }
        L_0x0f53:
            X.2X6 r1 = r2.A10     // Catch:{ all -> 0x3520 }
            X.1FY r4 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.10E r1 = r1.A01     // Catch:{ all -> 0x3520 }
            X.00S r1 = r1.A0x     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.1pj r3 = (X.C37551pj) r3     // Catch:{ all -> 0x3520 }
            X.4NE r1 = new X.4NE     // Catch:{ all -> 0x3520 }
            r1.<init>(r4, r3)     // Catch:{ all -> 0x3520 }
            r2.A7J = r1     // Catch:{ all -> 0x3520 }
            X.4X5 r1 = X.AnonymousClass3Ma.A0Y(r2)     // Catch:{ all -> 0x3520 }
            X.4JT r1 = r1.A04     // Catch:{ all -> 0x3520 }
            X.1FY r6 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.10E r3 = r1.A01     // Catch:{ all -> 0x3520 }
            X.10G r1 = r3.A00     // Catch:{ all -> 0x3520 }
            X.00S r1 = r1.A3T     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4mD r4 = (X.C95424mD) r4     // Catch:{ all -> 0x3520 }
            X.00S r1 = r3.A3J     // Catch:{ all -> 0x3520 }
            X.00H r3 = X.C000200d.A00(r1)     // Catch:{ all -> 0x3520 }
            X.4Ny r1 = new X.4Ny     // Catch:{ all -> 0x3520 }
            r1.<init>(r6, r4, r3)     // Catch:{ all -> 0x3520 }
            r2.A7L = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1Bd r9 = r1.getStartupTracker()     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationListView r6 = r2.A2B     // Catch:{ all -> 0x3520 }
            boolean r1 = X.AnonymousClass3MZ.A1W(r2)     // Catch:{ all -> 0x3520 }
            r4 = 2
            if (r1 == 0) goto L_0x0fa8
            r4 = 5
            goto L_0x0fa8
        L_0x0fa2:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ all -> 0x3520 }
            goto L_0x1153
        L_0x0fa8:
            r1 = 38
            X.4rn r3 = new X.4rn     // Catch:{ all -> 0x3520 }
            r3.<init>((java.lang.Object) r2, (int) r1)     // Catch:{ all -> 0x3520 }
            r1 = r20
            r9.A05(r6, r3, r1, r4)     // Catch:{ all -> 0x3520 }
            X.2X8 r1 = r2.A12     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            android.view.View r3 = X.C110885hR.A0A(r3, r5)     // Catch:{ all -> 0x3520 }
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.10E r1 = r1.A01     // Catch:{ all -> 0x3520 }
            X.0vb r1 = X.AnonymousClass10E.A6Q(r1)     // Catch:{ all -> 0x3520 }
            X.4Ov r5 = new X.4Ov     // Catch:{ all -> 0x3520 }
            r5.<init>(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A27 = r5     // Catch:{ all -> 0x3520 }
            android.widget.FrameLayout r4 = r5.A04     // Catch:{ all -> 0x3520 }
            int r3 = r4.getPaddingLeft()     // Catch:{ all -> 0x3520 }
            int r1 = r4.getPaddingRight()     // Catch:{ all -> 0x3520 }
            int r1 = java.lang.Math.max(r3, r1)     // Catch:{ all -> 0x3520 }
            X.C27641Ww.A03(r4, r8, r1)     // Catch:{ all -> 0x3520 }
            android.view.View r3 = r5.A02     // Catch:{ all -> 0x3520 }
            r1 = 2131231611(0x7f08037b, float:1.8079308E38)
            r3.setBackgroundResource(r1)     // Catch:{ all -> 0x3520 }
            r3.setPadding(r8, r8, r8, r8)     // Catch:{ all -> 0x3520 }
            X.1FY r4 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            X.1DC r1 = r2.A4L     // Catch:{ all -> 0x3520 }
            android.view.View r1 = X.AnonymousClass6W9.A00(r4, r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A0F = r1     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131429565(0x7f0b08bd, float:1.8480806E38)
            android.view.View r1 = X.C110885hR.A0A(r3, r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationEntryActionButton r1 = (com.whatsapp.conversation.ConversationEntryActionButton) r1     // Catch:{ all -> 0x3520 }
            r2.A7H = r1     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131434738(0x7f0b1cf2, float:1.8491298E38)
            X.C110885hR.A0A(r3, r1)     // Catch:{ all -> 0x3520 }
            X.4mZ r1 = r2.A26     // Catch:{ all -> 0x3520 }
            boolean r3 = A1y(r2)     // Catch:{ all -> 0x3520 }
            if (r3 != 0) goto L_0x101b
            A20(r2)     // Catch:{ all -> 0x3520 }
        L_0x101b:
            r1.A00 = r2     // Catch:{ all -> 0x3520 }
            android.view.View r1 = r2.A0F     // Catch:{ all -> 0x3520 }
            X.C89914dE.A00(r1, r2, r14)     // Catch:{ all -> 0x3520 }
            android.view.View r3 = r2.A0F     // Catch:{ all -> 0x3520 }
            r1 = 13
            X.C90274do.A00(r3, r2, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.11C r3 = r1.getSystemServices()     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r8)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "android.hardware.type.featurephone"
            boolean r1 = r3.A0P(r1)     // Catch:{ all -> 0x3520 }
            r2.A6l = r1     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r8)     // Catch:{ all -> 0x3520 }
            r1 = 2131430328(0x7f0b0bb8, float:1.8482354E38)
            android.view.View r1 = X.C110885hR.A0A(r3, r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.WaImageButton r1 = (com.whatsapp.WaImageButton) r1     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x3520 }
            r2.A0E = r1     // Catch:{ all -> 0x3520 }
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r8)     // Catch:{ all -> 0x3520 }
            r1 = 10925(0x2aad, float:1.5309E-41)
            boolean r1 = X.C25291Nq.A04(r3, r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x106b
            r4 = 2131232331(0x7f08064b, float:1.8080768E38)
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131890250(0x7f12104a, float:1.9415187E38)
            java.lang.String r1 = r3.getString(r1)     // Catch:{ all -> 0x3520 }
            A1b(r2, r1, r4)     // Catch:{ all -> 0x3520 }
        L_0x106b:
            boolean r1 = A26(r2)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x1085
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131429666(0x7f0b0922, float:1.8481011E38)
            android.view.View r1 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.LockableCoodinatorLayout r1 = (com.whatsapp.LockableCoodinatorLayout) r1     // Catch:{ all -> 0x3520 }
            r2.A1N = r1     // Catch:{ all -> 0x3520 }
            android.view.View r3 = r2.A0E     // Catch:{ all -> 0x3520 }
            r1 = 28
            X.C89914dE.A00(r3, r2, r1)     // Catch:{ all -> 0x3520 }
        L_0x1085:
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            android.view.View r1 = r2.A0F     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r8)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r1, r15)     // Catch:{ all -> 0x3520 }
            r2.A0J = r1     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "initComposerViewModels_start"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r35 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.2h2 r1 = r2.A2P     // Catch:{ all -> 0x3520 }
            X.4JZ r3 = r1.A09     // Catch:{ all -> 0x3520 }
            X.4VJ r37 = r2.A03()     // Catch:{ all -> 0x3520 }
            X.0ve r5 = r2.A3F     // Catch:{ all -> 0x3520 }
            r4 = 4548(0x11c4, float:6.373E-42)
            r1 = r28
            boolean r39 = X.C18020vd.A05(r1, r5, r4)     // Catch:{ all -> 0x3520 }
            X.0ve r5 = r2.A3F     // Catch:{ all -> 0x3520 }
            r4 = 4549(0x11c5, float:6.375E-42)
            boolean r40 = X.C18020vd.A05(r1, r5, r4)     // Catch:{ all -> 0x3520 }
            boolean r41 = A2A(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            r36 = r3
            r38 = r1
            X.3V4 r1 = X.AnonymousClass4GQ.A00(r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3520 }
            r2.A2Y = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r4 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.2h2 r1 = r2.A2P     // Catch:{ all -> 0x3520 }
            X.2XV r3 = r1.A0A     // Catch:{ all -> 0x3520 }
            X.4VJ r1 = r2.A03()     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r4, r8)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r15)     // Catch:{ all -> 0x3520 }
            r5 = r19
            X.1It r3 = X.C91774gE.A00(r4, r3, r1, r5)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.3V0> r1 = X.AnonymousClass3V0.class
            X.1J2 r1 = r3.A00(r1)     // Catch:{ all -> 0x3520 }
            X.3V0 r1 = (X.AnonymousClass3V0) r1     // Catch:{ all -> 0x3520 }
            r2.A2c = r1     // Catch:{ all -> 0x3520 }
            X.3TF r1 = new X.3TF     // Catch:{ all -> 0x3520 }
            r1.<init>()     // Catch:{ all -> 0x3520 }
            r2.A0h = r1     // Catch:{ all -> 0x3520 }
            X.3V4 r1 = r2.A2Y     // Catch:{ all -> 0x3520 }
            X.1vp r3 = r1.A05     // Catch:{ all -> 0x3520 }
            X.4sU r1 = new X.4sU     // Catch:{ all -> 0x3520 }
            r1.<init>(r7)     // Catch:{ all -> 0x3520 }
            X.1Dg r1 = X.C22791Df.A01(r3, r1)     // Catch:{ all -> 0x3520 }
            X.1Dg r5 = X.C22791Df.A00(r1)     // Catch:{ all -> 0x3520 }
            X.1Dg r4 = new X.1Dg     // Catch:{ all -> 0x3520 }
            r4.<init>()     // Catch:{ all -> 0x3520 }
            X.AGo r1 = new X.AGo     // Catch:{ all -> 0x3520 }
            r1.<init>(r4)     // Catch:{ all -> 0x3520 }
            r4.A0H(r5, r1)     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 7
            X.C91594fw.A00(r3, r4, r2, r1)     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 8
            X.C91594fw.A00(r3, r5, r2, r1)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "initComposerViewModels_end"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131434278(0x7f0b1b26, float:1.8490365E38)
            X.1bI r1 = X.C72453Mb.A0t(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A7Q = r1     // Catch:{ all -> 0x3520 }
            boolean r1 = A1y(r2)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x113d
            X.3V4 r1 = r2.A2Y     // Catch:{ all -> 0x3520 }
            r1.A0V(r15)     // Catch:{ all -> 0x3520 }
        L_0x113d:
            X.0zA r1 = r2.A0l     // Catch:{ all -> 0x3520 }
            boolean r3 = r1.A07()     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x1154
            r1.A03()     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.CFa()     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "create"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ all -> 0x3520 }
        L_0x1153:
            throw r0     // Catch:{ all -> 0x3520 }
        L_0x1154:
            X.3V4 r1 = r2.A2Y     // Catch:{ all -> 0x3520 }
            X.1DS r1 = r1.A00     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.A06()     // Catch:{ all -> 0x3520 }
            X.4V2 r1 = (X.AnonymousClass4V2) r1     // Catch:{ all -> 0x3520 }
            X.0zA r3 = r2.A0q     // Catch:{ all -> 0x3520 }
            boolean r4 = r3.A07()     // Catch:{ all -> 0x3520 }
            if (r4 == 0) goto L_0x117b
            if (r1 == 0) goto L_0x116c
            int r1 = r1.A01     // Catch:{ all -> 0x3520 }
            if (r1 == r15) goto L_0x117b
        L_0x116c:
            r3.A03()     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "createSmbViewModel"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ all -> 0x3520 }
            goto L_0x1153
        L_0x117b:
            java.lang.String r1 = "initConversationActionButton_start"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationEntryActionButton r5 = r2.A7H     // Catch:{ all -> 0x3520 }
            X.1FY r4 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.3V4 r3 = r2.A2Y     // Catch:{ all -> 0x3520 }
            X.4kR r1 = new X.4kR     // Catch:{ all -> 0x3520 }
            r1.<init>(r2)     // Catch:{ all -> 0x3520 }
            r5.A02(r4, r1, r3)     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0Q(r2)     // Catch:{ all -> 0x3520 }
            float r5 = X.C72463Mc.A00(r1)     // Catch:{ all -> 0x3520 }
            X.0ve r4 = r2.A3F     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r4, r15)     // Catch:{ all -> 0x3520 }
            r3 = 5363(0x14f3, float:7.515E-42)
            r1 = r28
            int r1 = X.C18020vd.A00(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r1 >= 0) goto L_0x11a9
            r1 = 0
            goto L_0x11b3
        L_0x11a9:
            float r1 = (float) r1     // Catch:{ all -> 0x3520 }
            float r1 = r1 * r5
            int r1 = X.C22339B3q.A01(r1)     // Catch:{ all -> 0x3520 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x3520 }
        L_0x11b3:
            r2.A6L = r1     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "initConversationActionButton_end"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.1UD r1 = X.C72473Md.A0R(r2)     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A0A()     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x11e6
            boolean r1 = A2A(r2)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x11e6
            X.3V4 r1 = r2.A2Y     // Catch:{ all -> 0x3520 }
            X.1vp r4 = r1.A05     // Catch:{ all -> 0x3520 }
            r3 = 13
            X.4sU r1 = new X.4sU     // Catch:{ all -> 0x3520 }
            r1.<init>(r3)     // Catch:{ all -> 0x3520 }
            X.1Dg r1 = X.C22791Df.A01(r4, r1)     // Catch:{ all -> 0x3520 }
            X.1Dg r4 = X.C22791Df.A00(r1)     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 9
            X.C91594fw.A00(r3, r4, r2, r1)     // Catch:{ all -> 0x3520 }
        L_0x11e6:
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131428782(0x7f0b05ae, float:1.8479218E38)
            android.view.View r1 = X.C110885hR.A0A(r3, r1)     // Catch:{ all -> 0x3520 }
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1     // Catch:{ all -> 0x3520 }
            r2.A0X = r1     // Catch:{ all -> 0x3520 }
            boolean r1 = A1y(r2)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x1211
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            X.1DC r1 = r2.A4L     // Catch:{ all -> 0x3520 }
            boolean r1 = X.C83724Gk.A00(r3, r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x1211
            android.widget.ImageButton r4 = r2.A0X     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131233143(0x7f080977, float:1.8082415E38)
            X.AnonymousClass3MX.A1B(r3, r4, r1)     // Catch:{ all -> 0x3520 }
        L_0x1211:
            android.widget.ImageButton r3 = r2.A0X     // Catch:{ all -> 0x3520 }
            r1 = 7
            X.AnonymousClass3MZ.A1K(r3, r2, r1)     // Catch:{ all -> 0x3520 }
            android.widget.ImageButton r1 = r2.A0X     // Catch:{ all -> 0x3520 }
            r1.setPadding(r8, r8, r8, r8)     // Catch:{ all -> 0x3520 }
            boolean r1 = A21(r2)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x1235
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131435846(0x7f0b2146, float:1.8493546E38)
            X.1bI r1 = X.C72453Mb.A0r(r3, r1)     // Catch:{ all -> 0x3520 }
            android.view.View r1 = r1.A02()     // Catch:{ all -> 0x3520 }
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1     // Catch:{ all -> 0x3520 }
            r2.A0Y = r1     // Catch:{ all -> 0x3520 }
        L_0x1235:
            android.widget.ImageButton r3 = r2.A0X     // Catch:{ all -> 0x3520 }
            r1 = 29
            X.C89914dE.A00(r3, r2, r1)     // Catch:{ all -> 0x3520 }
            boolean r1 = A21(r2)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x1249
            android.widget.ImageButton r1 = r2.A0Y     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x1249
            X.C89914dE.A00(r1, r2, r0)     // Catch:{ all -> 0x3520 }
        L_0x1249:
            X.4VJ r1 = r2.A03()     // Catch:{ all -> 0x3520 }
            boolean r0 = r1.A07     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x125c
            boolean r0 = r1.A08     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x146d
            android.widget.ImageButton r0 = r2.A0X     // Catch:{ all -> 0x3520 }
            r3 = r19
            X.C90284dp.A00(r0, r2, r1, r3)     // Catch:{ all -> 0x3520 }
        L_0x125c:
            r0 = 8
            A1P(r2, r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "initFloatingFooter_start"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0 = 2131428197(0x7f0b0365, float:1.8478032E38)
            android.view.View r14 = r1.findViewById(r0)     // Catch:{ all -> 0x3520 }
            android.view.ViewStub r14 = (android.view.ViewStub) r14     // Catch:{ all -> 0x3520 }
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 12437(0x3095, float:1.7428E-41)
            r0 = r32
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x12bd
            com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel r0 = r2.A2L     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x12bd
            X.1G1 r0 = r0.A05     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r0, r8)     // Catch:{ all -> 0x3520 }
            X.1OR r6 = X.AnonymousClass1OR.A00     // Catch:{ all -> 0x3520 }
            androidx.lifecycle.CoroutineLiveData r3 = X.C87324Vd.A00(r6, r0)     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 5
            X.C91594fw.A00(r1, r3, r2, r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel r5 = r2.A2L     // Catch:{ all -> 0x3520 }
            X.1BI r4 = r2.A3R     // Catch:{ all -> 0x3520 }
            int r3 = r2.A01     // Catch:{ all -> 0x3520 }
            X.1CJ r0 = r2.A2w     // Catch:{ all -> 0x3520 }
            int r0 = r0.A03(r4)     // Catch:{ all -> 0x3520 }
            boolean r40 = X.AnonymousClass000.A1O(r0)
            X.C18070vi.A0d(r4, r8)     // Catch:{ all -> 0x3520 }
            X.1OX r1 = X.C41561wd.A00(r5)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel$loadQualitySurvey$1 r0 = new com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel$loadQualitySurvey$1     // Catch:{ all -> 0x3520 }
            r35 = r0
            r36 = r5
            r37 = r4
            r38 = r17
            r39 = r3
            r35.<init>(r36, r37, r38, r39, r40)     // Catch:{ all -> 0x3520 }
            X.AnonymousClass3MW.A1X(r6, r0, r1)     // Catch:{ all -> 0x3520 }
        L_0x12bd:
            X.4LT r13 = new X.4LT     // Catch:{ all -> 0x3520 }
            r13.<init>(r2)     // Catch:{ all -> 0x3520 }
            X.2XC r1 = r2.A18     // Catch:{ all -> 0x3520 }
            X.1FY r53 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r55 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 40
            X.4rn r7 = new X.4rn     // Catch:{ all -> 0x3520 }
            r7.<init>((java.lang.Object) r13, (int) r0)     // Catch:{ all -> 0x3520 }
            r0 = 41
            X.4rn r6 = new X.4rn     // Catch:{ all -> 0x3520 }
            r6.<init>((java.lang.Object) r13, (int) r0)     // Catch:{ all -> 0x3520 }
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.10E r0 = r1.A01     // Catch:{ all -> 0x3520 }
            X.0ve r65 = X.AnonymousClass10E.A8r(r0)     // Catch:{ all -> 0x3520 }
            X.11S r56 = X.AnonymousClass10E.A17(r0)     // Catch:{ all -> 0x3520 }
            X.1LU r68 = X.AnonymousClass3MY.A0Z(r0)     // Catch:{ all -> 0x3520 }
            X.10I r70 = X.AnonymousClass10E.AL1(r0)     // Catch:{ all -> 0x3520 }
            X.10G r3 = r0.A00     // Catch:{ all -> 0x3520 }
            X.00S r3 = r3.A00     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x3520 }
            X.6oZ r5 = (X.C133326oZ) r5     // Catch:{ all -> 0x3520 }
            X.18K r67 = X.AnonymousClass3Ma.A0g(r0)     // Catch:{ all -> 0x3520 }
            X.1Mc r69 = X.AnonymousClass3Ma.A0u(r0)     // Catch:{ all -> 0x3520 }
            X.12L r66 = X.AnonymousClass3MZ.A0u(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A0x     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1pj r4 = (X.C37551pj) r4     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.AB5     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1kk r3 = (X.C34591kk) r3     // Catch:{ all -> 0x3520 }
            X.1PM r60 = X.AnonymousClass3MZ.A0f(r0)     // Catch:{ all -> 0x3520 }
            X.0z4 r61 = X.AnonymousClass3Ma.A0c(r0)     // Catch:{ all -> 0x3520 }
            X.1kb r59 = X.AnonymousClass3MZ.A0b(r0)     // Catch:{ all -> 0x3520 }
            X.00S r9 = r0.A0s     // Catch:{ all -> 0x3520 }
            X.00H r71 = X.C000200d.A00(r9)     // Catch:{ all -> 0x3520 }
            X.1RK r64 = X.AnonymousClass3MZ.A0r(r0)     // Catch:{ all -> 0x3520 }
            X.1MZ r62 = X.AnonymousClass3MY.A0V(r0)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r0.A0t     // Catch:{ all -> 0x3520 }
            X.00H r72 = X.C000200d.A00(r0)     // Catch:{ all -> 0x3520 }
            X.1K1 r0 = r1.A00     // Catch:{ all -> 0x3520 }
            X.00S r0 = r0.A3o     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1oh r0 = (X.C36931oh) r0     // Catch:{ all -> 0x3520 }
            X.4qH r52 = new X.4qH     // Catch:{ all -> 0x3520 }
            r54 = r5
            r57 = r4
            r58 = r0
            r63 = r3
            r73 = r7
            r74 = r6
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0 = 2131433204(0x7f0b16f4, float:1.8488187E38)
            android.view.View r12 = r1.findViewById(r0)     // Catch:{ all -> 0x3520 }
            android.view.ViewStub r12 = (android.view.ViewStub) r12     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0 = 2131429917(0x7f0b0a1d, float:1.848152E38)
            android.view.View r11 = r1.findViewById(r0)     // Catch:{ all -> 0x3520 }
            android.view.ViewStub r11 = (android.view.ViewStub) r11     // Catch:{ all -> 0x3520 }
            X.2XF r1 = r2.A1B     // Catch:{ all -> 0x3520 }
            X.1FY r40 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r44 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            r20 = r0
            com.whatsapp.conversation.ConversationListView r0 = r2.A2B     // Catch:{ all -> 0x3520 }
            r19 = r0
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.10E r0 = r1.A01     // Catch:{ all -> 0x3520 }
            X.0ve r56 = X.AnonymousClass10E.A8r(r0)     // Catch:{ all -> 0x3520 }
            X.11S r45 = X.AnonymousClass10E.A17(r0)     // Catch:{ all -> 0x3520 }
            X.1CJ r53 = X.AnonymousClass3Ma.A0d(r0)     // Catch:{ all -> 0x3520 }
            X.1Mc r64 = X.AnonymousClass3Ma.A0u(r0)     // Catch:{ all -> 0x3520 }
            X.12L r57 = X.AnonymousClass3MZ.A0u(r0)     // Catch:{ all -> 0x3520 }
            X.10G r3 = r0.A00     // Catch:{ all -> 0x3520 }
            X.00S r3 = r3.A30     // Catch:{ all -> 0x3520 }
            X.00H r66 = X.C000200d.A00(r3)     // Catch:{ all -> 0x3520 }
            X.1M9 r50 = X.AnonymousClass10E.A4z(r0)     // Catch:{ all -> 0x3520 }
            X.1DC r65 = X.AnonymousClass3MZ.A13(r0)     // Catch:{ all -> 0x3520 }
            X.1K1 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.5bZ r49 = X.AnonymousClass3MZ.A0V(r1)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A0x     // Catch:{ all -> 0x3520 }
            java.lang.Object r10 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1pj r10 = (X.C37551pj) r10     // Catch:{ all -> 0x3520 }
            X.126 r58 = X.AnonymousClass3MY.A0X(r0)     // Catch:{ all -> 0x3520 }
            X.1W6 r63 = X.AnonymousClass3Ma.A0s(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.ABL     // Catch:{ all -> 0x3520 }
            java.lang.Object r9 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1QY r9 = (X.AnonymousClass1QY) r9     // Catch:{ all -> 0x3520 }
            X.1MB r59 = X.AnonymousClass3Ma.A0k(r0)     // Catch:{ all -> 0x3520 }
            X.1Nb r61 = X.AnonymousClass3MZ.A11(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A7Z     // Catch:{ all -> 0x3520 }
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x3520 }
            X.2k0 r7 = (X.C58012k0) r7     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A8a     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1N4 r6 = (X.AnonymousClass1N4) r6     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A12     // Catch:{ all -> 0x3520 }
            X.1Ha r41 = X.AnonymousClass3MZ.A0M(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r0.AAt     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x3520 }
            X.2bu r5 = (X.C53052bu) r5     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A3o     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1oh r4 = (X.C36931oh) r4     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A2a     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4JJ r3 = (X.AnonymousClass4JJ) r3     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A1o     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4PV r0 = (X.AnonymousClass4PV) r0     // Catch:{ all -> 0x3520 }
            X.4ZY r1 = new X.4ZY     // Catch:{ all -> 0x3520 }
            r35 = r1
            r36 = r14
            r37 = r12
            r38 = r11
            r39 = r19
            r42 = r0
            r43 = r3
            r46 = r10
            r47 = r4
            r48 = r5
            r51 = r13
            r54 = r6
            r55 = r9
            r60 = r20
            r62 = r7
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ all -> 0x3520 }
            r2.A2R = r1     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "initFloatingFooter_end"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.4Ga r41 = new X.4Ga     // Catch:{ all -> 0x3520 }
            r41.<init>()     // Catch:{ all -> 0x3520 }
            X.2hI r4 = r2.A0x     // Catch:{ all -> 0x3520 }
            X.1FY r36 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r39 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.4ge r3 = new X.4ge     // Catch:{ all -> 0x3520 }
            r0 = r22
            r3.<init>(r2, r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.5YU r37 = r0.BHg()     // Catch:{ all -> 0x3520 }
            X.5Zh r1 = r2.A8A     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            r35 = r4
            r38 = r3
            r40 = r1
            r42 = r0
            X.3hR r1 = r35.A00(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3520 }
            r2.A7M = r1     // Catch:{ all -> 0x3520 }
            r0 = r123
            r0.add(r1)     // Catch:{ all -> 0x3520 }
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = r1.A0H     // Catch:{ all -> 0x3520 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x148c
            X.4Xd r0 = r1.A07     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = r0.A0R     // Catch:{ all -> 0x3520 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x148c
            goto L_0x1493
        L_0x146d:
            X.4kS r4 = new X.4kS     // Catch:{ all -> 0x3520 }
            r4.<init>(r2)     // Catch:{ all -> 0x3520 }
            r0 = 8
            X.4dr r3 = new X.4dr     // Catch:{ all -> 0x3520 }
            r3.<init>(r4, r2, r0)     // Catch:{ all -> 0x3520 }
            r1 = 39
            X.4rn r0 = new X.4rn     // Catch:{ all -> 0x3520 }
            r0.<init>((java.lang.Object) r4, (int) r1)     // Catch:{ all -> 0x3520 }
            X.4dv r1 = new X.4dv     // Catch:{ all -> 0x3520 }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x3520 }
            android.widget.ImageButton r0 = r2.A0X     // Catch:{ all -> 0x3520 }
            r0.setOnTouchListener(r1)     // Catch:{ all -> 0x3520 }
            goto L_0x125c
        L_0x148c:
            java.lang.Object r0 = X.C72473Md.A0f(r2)     // Catch:{ all -> 0x3520 }
            r3 = 0
            if (r0 == 0) goto L_0x1494
        L_0x1493:
            r3 = 1
        L_0x1494:
            X.4aI r1 = X.C88444Zs.A01(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x14a6
            X.4YT r0 = X.C88654aI.A00(r1, r0)     // Catch:{ all -> 0x3520 }
            r0.A01 = r3     // Catch:{ all -> 0x3520 }
        L_0x14a6:
            java.lang.String r0 = "on_create_conversation_start"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x14c7
            X.0ve r0 = r2.A3F     // Catch:{ all -> 0x3520 }
            boolean r0 = X.AnonymousClass1J8.A03(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x14c7
            X.0ve r1 = r2.A3F     // Catch:{ all -> 0x3520 }
            r0 = 12746(0x31ca, float:1.7861E-41)
            r3 = r28
            int r1 = X.C18020vd.A00(r3, r1, r0)     // Catch:{ all -> 0x3520 }
            r0 = 3
            if (r1 != r0) goto L_0x14c7
            A0Y(r2)     // Catch:{ all -> 0x3520 }
        L_0x14c7:
            X.4PL r0 = r2.A29     // Catch:{ all -> 0x3520 }
            r121 = r0
            java.lang.String r0 = "conversation/createconversation"
            X.1Ez r20 = new X.1Ez     // Catch:{ all -> 0x3520 }
            r1 = r20
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x3520 }
            r2.A0H()     // Catch:{ all -> 0x3520 }
            X.2X7 r0 = r2.A11     // Catch:{ all -> 0x3520 }
            X.1FY r50 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r10 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.5cQ r9 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.4a2 r54 = r9.getConversationRowInflater()     // Catch:{ all -> 0x3520 }
            X.1K2 r0 = r0.A00     // Catch:{ all -> 0x3520 }
            X.10E r0 = r0.A01     // Catch:{ all -> 0x3520 }
            X.11P r57 = X.AnonymousClass10E.A6O(r0)     // Catch:{ all -> 0x3520 }
            X.11S r52 = X.AnonymousClass10E.A17(r0)     // Catch:{ all -> 0x3520 }
            X.00S r1 = r0.A3y     // Catch:{ all -> 0x3520 }
            java.lang.Object r7 = r1.get()     // Catch:{ all -> 0x3520 }
            X.1PP r7 = (X.AnonymousClass1PP) r7     // Catch:{ all -> 0x3520 }
            X.1W6 r66 = X.AnonymousClass3Ma.A0s(r0)     // Catch:{ all -> 0x3520 }
            X.00S r1 = r0.A57     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r1.get()     // Catch:{ all -> 0x3520 }
            X.1O2 r6 = (X.AnonymousClass1O2) r6     // Catch:{ all -> 0x3520 }
            X.10G r1 = r0.A00     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A0U     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x3520 }
            X.2sj r5 = (X.C63232sj) r5     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A4l     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4Zd r4 = (X.C88304Zd) r4     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A18     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4Xe r3 = (X.AnonymousClass4Xe) r3     // Catch:{ all -> 0x3520 }
            X.00S r1 = r1.A3Q     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4Rr r1 = (X.C86454Rr) r1     // Catch:{ all -> 0x3520 }
            X.0ve r59 = X.AnonymousClass10E.A8r(r0)     // Catch:{ all -> 0x3520 }
            X.0z4 r58 = X.AnonymousClass3Ma.A0c(r0)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r0.A76     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1Oh r0 = (X.C25461Oh) r0     // Catch:{ all -> 0x3520 }
            X.0zB r51 = X.C19890zB.A00     // Catch:{ all -> 0x3520 }
            X.3Oz r19 = new X.3Oz     // Catch:{ all -> 0x3520 }
            r49 = r19
            r53 = r3
            r55 = r9
            r56 = r5
            r60 = r4
            r61 = r10
            r62 = r6
            r63 = r0
            r64 = r1
            r65 = r7
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ all -> 0x3520 }
            android.database.DataSetObserver r0 = r2.A7X     // Catch:{ all -> 0x3520 }
            r1 = r19
            r1.registerDataSetObserver(r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0 = 2131430490(0x7f0b0c5a, float:1.8482682E38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r0 = (com.whatsapp.mentions.MentionableEntry) r0     // Catch:{ all -> 0x3520 }
            r2.A3Z = r0     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 2131432483(0x7f0b1423, float:1.8486725E38)
            android.view.View r0 = X.C110885hR.A0A(r1, r0)     // Catch:{ all -> 0x3520 }
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch:{ all -> 0x3520 }
            r2.A0W = r0     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r1 = r2.A3Z     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x16e0
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            boolean r0 = X.C22971Dz.A0S(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1586
            java.lang.String r0 = "disableSticker=true"
            r1.setPrivateImeOptions(r0)     // Catch:{ all -> 0x3520 }
        L_0x1586:
            X.6xm r3 = new X.6xm     // Catch:{ all -> 0x3520 }
            r3.<init>()     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r1 = r2.A3Z     // Catch:{ all -> 0x3520 }
            X.7Jh r0 = new X.7Jh     // Catch:{ all -> 0x3520 }
            r0.<init>(r3, r2, r8)     // Catch:{ all -> 0x3520 }
            r1.A0F = r0     // Catch:{ all -> 0x3520 }
            X.00H r0 = r2.A5p     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4ZT r0 = (X.AnonymousClass4ZT) r0     // Catch:{ all -> 0x3520 }
            X.1vp r3 = r0.A00     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 38
            X.C91594fw.A00(r1, r3, r2, r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r1 = r2.A3Z     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            boolean r0 = r1.A0O(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x15c7
            com.whatsapp.mentions.MentionableEntry r3 = r2.A3Z     // Catch:{ all -> 0x3520 }
            X.4oS r0 = new X.4oS     // Catch:{ all -> 0x3520 }
            r0.<init>(r2, r15)     // Catch:{ all -> 0x3520 }
            r3.A0C = r0     // Catch:{ all -> 0x3520 }
            android.widget.FrameLayout r1 = r2.A0W     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            r7 = r8
            r10 = r15
            r4 = r3
            r5 = r1
            r6 = r0
            r9 = r15
            r4.A0M(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x3520 }
        L_0x15c7:
            r2.A2e()     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r4 = r2.A3Z     // Catch:{ all -> 0x3520 }
            android.text.InputFilter[] r3 = new android.text.InputFilter[r15]     // Catch:{ all -> 0x3520 }
            X.74M r1 = r2.A4h     // Catch:{ all -> 0x3520 }
            X.4cb r0 = new X.4cb     // Catch:{ all -> 0x3520 }
            r0.<init>(r1)     // Catch:{ all -> 0x3520 }
            r3[r8] = r0     // Catch:{ all -> 0x3520 }
            r4.setFilters(r3)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r3 = r2.A3Z     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0 = 2131431653(0x7f0b10e5, float:1.8485041E38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x3520 }
            r3.A05 = r0     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 2131434286(0x7f0b1b2e, float:1.8490382E38)
            X.1bI r0 = X.C72453Mb.A0r(r1, r0)     // Catch:{ all -> 0x3520 }
            r2.A4V = r0     // Catch:{ all -> 0x3520 }
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 12417(0x3081, float:1.74E-41)
            r0 = r28
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x1605
            X.1bI r0 = r2.A4V     // Catch:{ all -> 0x3520 }
            r0.A02()     // Catch:{ all -> 0x3520 }
        L_0x1605:
            X.0zA r0 = r2.A0p     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.A07()     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x161d
            X.0ve r0 = r2.A3F     // Catch:{ all -> 0x3520 }
            boolean r0 = X.C84104Hw.A00(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x169c
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x169c
        L_0x161d:
            X.1bI r1 = r2.A4V     // Catch:{ all -> 0x3520 }
            r0 = 8
            r1.A04(r0)     // Catch:{ all -> 0x3520 }
        L_0x1624:
            X.3UN r5 = r2.A4A     // Catch:{ all -> 0x3520 }
            if (r5 == 0) goto L_0x1643
            com.whatsapp.mentions.MentionableEntry r4 = r2.A3Z     // Catch:{ all -> 0x3520 }
            X.1F9 r37 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            android.widget.FrameLayout r3 = r2.A0W     // Catch:{ all -> 0x3520 }
            X.1i1 r1 = r2.A2H     // Catch:{ all -> 0x3520 }
            X.1l7 r0 = r2.A2K     // Catch:{ all -> 0x3520 }
            X.4iC r35 = new X.4iC     // Catch:{ all -> 0x3520 }
            r36 = r3
            r38 = r1
            r39 = r0
            r40 = r4
            r41 = r5
            r35.<init>(r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3520 }
        L_0x1643:
            X.3V2 r1 = r2.A1g     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x168c
            android.widget.FrameLayout r7 = r2.A0W     // Catch:{ all -> 0x3520 }
            X.1F9 r6 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r5 = r2.A3Z     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r7, r8)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r6, r15)     // Catch:{ all -> 0x3520 }
            r0 = r22
            X.C18070vi.A0d(r5, r0)     // Catch:{ all -> 0x3520 }
            X.3re r4 = new X.3re     // Catch:{ all -> 0x3520 }
            r4.<init>(r6, r1, r5)     // Catch:{ all -> 0x3520 }
            X.4cd r0 = new X.4cd     // Catch:{ all -> 0x3520 }
            r0.<init>(r1, r5, r15)     // Catch:{ all -> 0x3520 }
            r5.addTextChangedListener(r0)     // Catch:{ all -> 0x3520 }
            X.1DT r3 = r1.A02     // Catch:{ all -> 0x3520 }
            X.5Qi r1 = new X.5Qi     // Catch:{ all -> 0x3520 }
            r1.<init>(r5)     // Catch:{ all -> 0x3520 }
            r0 = 14
            X.AnonymousClass3MY.A1K(r6, r3, r1, r0)     // Catch:{ all -> 0x3520 }
            r7.addView(r4)     // Catch:{ all -> 0x3520 }
            r0 = 8
            r4.setVisibility(r0)     // Catch:{ all -> 0x3520 }
            android.view.View r1 = r5.A05     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x168c
            r4.setAnchorWidthView(r1)     // Catch:{ all -> 0x3520 }
            X.4dh r0 = new X.4dh     // Catch:{ all -> 0x3520 }
            r3 = r22
            r0.<init>(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            r1.addOnLayoutChangeListener(r0)     // Catch:{ all -> 0x3520 }
        L_0x168c:
            boolean r0 = A25(r2)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x16e0
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A0F     // Catch:{ all -> 0x3520 }
            r0.get()     // Catch:{ all -> 0x3520 }
            goto L_0x16ce
        L_0x169c:
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 5811(0x16b3, float:8.143E-42)
            r0 = r28
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x16b2
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            boolean r0 = X.C42701yb.A01(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x16b2
            goto L_0x161d
        L_0x16b2:
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x16c9
            r0 = 3
            X.4rj r1 = new X.4rj     // Catch:{ all -> 0x3520 }
            r1.<init>((X.AnonymousClass4aY) r2, (int) r0)     // Catch:{ all -> 0x3520 }
            r2.A6P = r1     // Catch:{ all -> 0x3520 }
            X.10I r0 = r2.A4c     // Catch:{ all -> 0x3520 }
            r0.CGF(r1)     // Catch:{ all -> 0x3520 }
            goto L_0x1624
        L_0x16c9:
            A0e(r2)     // Catch:{ all -> 0x3520 }
            goto L_0x1624
        L_0x16ce:
            if (r125 == 0) goto L_0x16d1
            goto L_0x16d3
        L_0x16d1:
            r0 = 0
            goto L_0x16db
        L_0x16d3:
            java.lang.String r0 = "saved_bot_media_array_list"
            r1 = r16
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)     // Catch:{ all -> 0x3520 }
        L_0x16db:
            r1 = r17
            A0O(r1, r2, r0)     // Catch:{ all -> 0x3520 }
        L_0x16e0:
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            boolean r0 = X.C22971Dz.A0V(r1)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x16ef
            boolean r0 = r2.A6q     // Catch:{ all -> 0x3520 }
            X.1ch r1 = (X.C29681ch) r1     // Catch:{ all -> 0x3520 }
            r2.A1q(r1, r0)     // Catch:{ all -> 0x3520 }
        L_0x16ef:
            com.whatsapp.conversation.ConversationListView r0 = r2.A2B     // Catch:{ all -> 0x3520 }
            r1 = r19
            r0.setAdapter(r1)     // Catch:{ all -> 0x3520 }
            r0 = r121
            boolean r0 = r0.A0d     // Catch:{ all -> 0x3520 }
            r2.A1s(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1737
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            android.content.Intent r1 = r0.getIntent()     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "fromNotification"
            boolean r0 = r1.getBooleanExtra(r0, r8)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1737
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            android.content.Intent r1 = r0.getIntent()     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "last_notification_keep_in_chat"
            boolean r0 = r1.getBooleanExtra(r0, r8)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1737
            X.4QD r0 = r2.A3A     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1GP r3 = r1.getSupportFragmentManager()     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r8)     // Catch:{ all -> 0x3520 }
            X.0z4 r0 = r0.A00     // Catch:{ all -> 0x3520 }
            boolean r0 = X.C87474Vs.A00(r3, r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1737
            X.C72483Me.A0l(r1, r3, r15)     // Catch:{ all -> 0x3520 }
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A0N = r17     // Catch:{ all -> 0x3520 }
        L_0x1737:
            X.10I r0 = X.AnonymousClass3MX.A0w(r2)     // Catch:{ all -> 0x3520 }
            r1 = r27
            X.C98834rn.A01(r0, r2, r1)     // Catch:{ all -> 0x3520 }
            r0 = r121
            boolean r0 = r0.A0c     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1769
            X.3Ao r0 = r2.A3e     // Catch:{ all -> 0x3520 }
            r0.A04()     // Catch:{ all -> 0x3520 }
            r0 = r121
            java.lang.String r4 = r0.A0U     // Catch:{ all -> 0x3520 }
            if (r4 == 0) goto L_0x175d
            X.1V7 r3 = r2.A1l     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "show_vc_lobby"
            X.A69 r0 = new X.A69     // Catch:{ all -> 0x3520 }
            r0.<init>((java.lang.String) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x3520 }
            r3.A00(r0)     // Catch:{ all -> 0x3520 }
        L_0x175d:
            r0 = r121
            X.1BI r3 = r0.A0A     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x1769
            X.1i1 r1 = r2.A2H     // Catch:{ all -> 0x3520 }
            r0 = 4
            r1.A0C(r3, r0)     // Catch:{ all -> 0x3520 }
        L_0x1769:
            r2.A75 = r8     // Catch:{ all -> 0x3520 }
            android.content.Intent r1 = r2.A0B     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "ig_post_url"
            java.lang.String r0 = r1.getStringExtra(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1778
            A1h(r2, r15)     // Catch:{ all -> 0x3520 }
        L_0x1778:
            X.00H r0 = r2.A5s     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4Ws r0 = (X.C87724Ws) r0     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A03     // Catch:{ all -> 0x3520 }
            X.4a3 r1 = X.AnonymousClass3MX.A0y(r0)     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            boolean r0 = r1.A0A(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x179c
            X.4OZ[] r1 = new X.AnonymousClass4OZ[r15]     // Catch:{ all -> 0x3520 }
            X.4kT r0 = new X.4kT     // Catch:{ all -> 0x3520 }
            r3 = r19
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x3520 }
            java.util.List r1 = r3.A0U     // Catch:{ all -> 0x3520 }
            r1.add(r0)     // Catch:{ all -> 0x3520 }
        L_0x179c:
            r0 = r121
            boolean r0 = r0.A0f     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1982
            boolean r0 = r2.A6X     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x1982
            r0 = r121
            boolean r0 = r0.A0Z     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1982
            X.00H r0 = r2.A5y     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.2Zw r0 = (X.C51852Zw) r0     // Catch:{ all -> 0x3520 }
            java.util.HashMap r1 = r0.A00     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            r1.remove(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationListView r0 = r2.A2B     // Catch:{ all -> 0x3520 }
            r0.A0Q = r15     // Catch:{ all -> 0x3520 }
            r0 = r121
            java.util.ArrayList r6 = r0.A0V     // Catch:{ all -> 0x3520 }
            if (r6 == 0) goto L_0x17fb
            X.1kd r5 = r2.A1R     // Catch:{ all -> 0x1a32 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x1a32 }
            java.util.List r41 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x1a32 }
            r0 = r121
            java.lang.String r4 = r0.A0M     // Catch:{ all -> 0x1a32 }
            int r3 = r0.A00     // Catch:{ all -> 0x1a32 }
            boolean r1 = r0.A0b     // Catch:{ all -> 0x1a32 }
            X.1FY r36 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x1a32 }
            X.1FY r37 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x1a32 }
            X.4gt r0 = new X.4gt     // Catch:{ all -> 0x1a32 }
            r0.<init>(r2, r15)     // Catch:{ all -> 0x1a32 }
            r44 = 38
            r47 = r8
            r35 = r5
            r38 = r0
            r39 = r17
            r40 = r4
            r42 = r6
            r43 = r3
            r45 = r8
            r46 = r1
            r35.A05(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)     // Catch:{ all -> 0x1a32 }
            goto L_0x1982
        L_0x17fb:
            int r1 = r0.A01     // Catch:{ all -> 0x3520 }
            r0 = 4
            r5 = 107(0x6b, float:1.5E-43)
            if (r1 != r0) goto L_0x1876
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.118 r6 = r0.getWAContext()     // Catch:{ all -> 0x3520 }
            X.1M9 r4 = r0.getContactManager()     // Catch:{ all -> 0x3520 }
            X.11C r3 = r2.A2f     // Catch:{ all -> 0x3520 }
            X.0vb r0 = r2.A2k     // Catch:{ all -> 0x3520 }
            X.73Y r1 = new X.73Y     // Catch:{ all -> 0x3520 }
            r1.<init>(r4, r3, r6, r0)     // Catch:{ all -> 0x3520 }
            X.1LA r3 = r2.A0u     // Catch:{ all -> 0x3520 }
            r0 = r121
            java.lang.String r4 = r0.A0T     // Catch:{ all -> 0x3520 }
            X.0vb r0 = r1.A03     // Catch:{ 1iZ -> 0x1851 }
            X.6yH r7 = new X.6yH     // Catch:{ 1iZ -> 0x1851 }
            r7.<init>(r3, r0)     // Catch:{ 1iZ -> 0x1851 }
            r1.A05(r4)     // Catch:{ 1iZ -> 0x1851 }
            X.73C r6 = r1.A04     // Catch:{ 1iZ -> 0x1851 }
            java.util.List r0 = r6.A06     // Catch:{ 1iZ -> 0x1851 }
            if (r0 == 0) goto L_0x185c
            X.1M9 r3 = r1.A00     // Catch:{ 1iZ -> 0x1851 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ 1iZ -> 0x1851 }
        L_0x1831:
            boolean r0 = r9.hasNext()     // Catch:{ 1iZ -> 0x1851 }
            if (r0 == 0) goto L_0x184c
            java.lang.Object r1 = r9.next()     // Catch:{ 1iZ -> 0x1851 }
            X.6ib r1 = (X.C129926ib) r1     // Catch:{ 1iZ -> 0x1851 }
            java.lang.String r0 = r1.A02     // Catch:{ 1iZ -> 0x1851 }
            X.1E7 r0 = r3.A0J(r0, r15)     // Catch:{ 1iZ -> 0x1851 }
            if (r0 == 0) goto L_0x1831
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r0)     // Catch:{ 1iZ -> 0x1851 }
            r1.A01 = r0     // Catch:{ 1iZ -> 0x1851 }
            goto L_0x1831
        L_0x184c:
            java.lang.String r4 = r7.A01(r6)     // Catch:{ 1iZ -> 0x1851 }
            goto L_0x185c
        L_0x1851:
            r3 = move-exception
            java.lang.String r1 = "addWaIdsToVCard"
            X.2RP r0 = new X.2RP     // Catch:{ all -> 0x3520 }
            r0.<init>(r3)     // Catch:{ all -> 0x3520 }
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ all -> 0x3520 }
        L_0x185c:
            X.1iW r9 = X.AnonymousClass3MX.A0X(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r3 = r2.A3R     // Catch:{ all -> 0x3520 }
            r0 = r121
            java.lang.String r1 = r0.A0S     // Catch:{ all -> 0x3520 }
            boolean r0 = r2.A6g     // Catch:{ all -> 0x3520 }
            java.util.List r13 = java.util.Collections.singletonList(r3)     // Catch:{ all -> 0x3520 }
            r10 = r17
            r11 = r1
            r12 = r4
            r14 = r0
            r9.A0g(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x3520 }
            goto L_0x1978
        L_0x1876:
            r0 = 14
            if (r1 != r0) goto L_0x187c
            goto L_0x1963
        L_0x187c:
            r0 = r121
            java.lang.String r9 = r0.A0H     // Catch:{ all -> 0x3520 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x1913
            r0 = r121
            X.4Xd r7 = r0.A07     // Catch:{ all -> 0x3520 }
            java.lang.String r6 = r7.A0R     // Catch:{ all -> 0x3520 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x1913
            java.lang.String r3 = r7.A0I     // Catch:{ all -> 0x3520 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x1907
            X.4VR r1 = r2.A2q     // Catch:{ all -> 0x3520 }
            boolean r0 = r1.A0W     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x18aa
            boolean r0 = r7.A0Z     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x18aa
            int r0 = r1.A00     // Catch:{ all -> 0x3520 }
            r1 = r22
            if (r0 == r1) goto L_0x18b5
        L_0x18aa:
            java.util.HashMap r1 = X.AnonymousClass4IT.A02     // Catch:{ all -> 0x3520 }
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0g(r0)     // Catch:{ all -> 0x3520 }
            r1.put(r0, r3)     // Catch:{ all -> 0x3520 }
        L_0x18b5:
            java.lang.String r5 = r7.A0E     // Catch:{ all -> 0x3520 }
            if (r5 != 0) goto L_0x18bf
            com.whatsapp.jid.UserJid r0 = r7.A04     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1900
            java.lang.String r5 = r0.user     // Catch:{ all -> 0x3520 }
        L_0x18bf:
            boolean r4 = r7.A0Z     // Catch:{ all -> 0x3520 }
            boolean r3 = r7.A0a     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x18fe
            boolean r1 = r7.A0c     // Catch:{ all -> 0x3520 }
        L_0x18c7:
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.UserJid r36 = X.AnonymousClass3MZ.A0x(r0)     // Catch:{ all -> 0x3520 }
            X.4Ox r0 = new X.4Ox     // Catch:{ all -> 0x3520 }
            r35 = r0
            r37 = r5
            r38 = r9
            r39 = r6
            r40 = r4
            r41 = r3
            r42 = r1
            r35.<init>(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3520 }
            java.util.HashMap r3 = A8L     // Catch:{ all -> 0x3520 }
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3MW.A0g(r1)     // Catch:{ all -> 0x3520 }
            r3.put(r1, r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r3 = r7.A0P     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x1982
            X.4aI r1 = X.C88444Zs.A01(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r0)     // Catch:{ all -> 0x3520 }
            r1.A06(r0, r3)     // Catch:{ all -> 0x3520 }
            goto L_0x1982
        L_0x18fe:
            r1 = 0
            goto L_0x18c7
        L_0x1900:
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            java.lang.String r5 = r0.getRawString()     // Catch:{ all -> 0x3520 }
            goto L_0x18bf
        L_0x1907:
            java.util.HashMap r1 = X.AnonymousClass4IT.A02     // Catch:{ all -> 0x3520 }
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0g(r0)     // Catch:{ all -> 0x3520 }
            r1.remove(r0)     // Catch:{ all -> 0x3520 }
            goto L_0x18b5
        L_0x1913:
            r0 = r121
            java.lang.String r3 = r0.A0Q     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x1982
            int r0 = r3.length()     // Catch:{ all -> 0x3520 }
            if (r0 <= 0) goto L_0x1982
            r0 = r121
            boolean r0 = r0.A0a     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1931
            java.util.HashMap r1 = X.AnonymousClass4IT.A02     // Catch:{ all -> 0x3520 }
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0g(r0)     // Catch:{ all -> 0x3520 }
            r1.put(r0, r3)     // Catch:{ all -> 0x3520 }
            goto L_0x1982
        L_0x1931:
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1gU r0 = r0.getLinkifyWeb()     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = r0.A02(r3)     // Catch:{ all -> 0x3520 }
            X.7Fe r36 = X.C20016A3i.A00(r0)     // Catch:{ all -> 0x3520 }
            X.1iW r35 = X.AnonymousClass3MX.A0X(r2)     // Catch:{ all -> 0x3520 }
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0g(r0)     // Catch:{ all -> 0x3520 }
            java.util.List r40 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x3520 }
            boolean r1 = r2.A6g     // Catch:{ all -> 0x3520 }
            boolean r0 = r2.A6i     // Catch:{ all -> 0x3520 }
            r38 = r17
            r41 = r17
            r37 = r17
            r39 = r3
            r42 = r1
            r43 = r0
            r35.A0O(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3520 }
            r2.A6i = r8     // Catch:{ all -> 0x3520 }
            goto L_0x1982
        L_0x1963:
            X.1iW r4 = X.AnonymousClass3MX.A0X(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            r1 = r121
            java.util.ArrayList r3 = r1.A0W     // Catch:{ all -> 0x3520 }
            boolean r1 = r2.A6g     // Catch:{ all -> 0x3520 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x3520 }
            r6 = r17
            r4.A0h(r6, r0, r3, r1)     // Catch:{ all -> 0x3520 }
        L_0x1978:
            X.4Xm r1 = r2.A3H     // Catch:{ all -> 0x3520 }
            X.4fO r0 = new X.4fO     // Catch:{ all -> 0x3520 }
            r0.<init>(r15)     // Catch:{ all -> 0x3520 }
            r1.A01(r0, r5)     // Catch:{ all -> 0x3520 }
        L_0x1982:
            java.util.HashMap r1 = X.AnonymousClass4IT.A02     // Catch:{ all -> 0x3520 }
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.1BI> r5 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r0 = r0.A06(r5)     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.get(r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x3520 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x1a35
            X.4R4 r1 = X.AnonymousClass3MZ.A0a(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x3520 }
            r1.A00 = r0     // Catch:{ all -> 0x3520 }
            java.util.HashMap r1 = A8M     // Catch:{ all -> 0x3520 }
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.Jid r0 = r0.A06(r5)     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x3520 }
            java.util.ArrayList r1 = X.AnonymousClass4aJ.A03(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z     // Catch:{ all -> 0x3520 }
            r0.setMentionableText(r4, r1)     // Catch:{ all -> 0x3520 }
            A1D(r2)     // Catch:{ all -> 0x3520 }
            X.0ve r7 = r2.A3F     // Catch:{ all -> 0x3520 }
            X.1FY r35 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1KW r39 = r0.getEmojiLoader()     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.11C r38 = r0.getSystemServices()     // Catch:{ all -> 0x3520 }
            X.0vc r3 = r2.A3x     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z     // Catch:{ all -> 0x3520 }
            android.text.Editable r36 = r0.getEditableText()     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z     // Catch:{ all -> 0x3520 }
            android.text.TextPaint r37 = r0.getPaint()     // Catch:{ all -> 0x3520 }
            X.1FY r6 = X.AnonymousClass3MW.A0Q(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2130970892(0x7f04090c, float:1.7550507E38)
            r0 = 2131102330(0x7f060a7a, float:1.7817095E38)
            int r42 = X.AnonymousClass1YL.A00(r6, r1, r0)     // Catch:{ all -> 0x3520 }
            X.1FY r6 = X.AnonymousClass3MW.A0Q(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2130970132(0x7f040614, float:1.7548965E38)
            r0 = 2131101250(0x7f060642, float:1.7814904E38)
            int r43 = X.AnonymousClass1YL.A00(r6, r1, r0)     // Catch:{ all -> 0x3520 }
            r40 = r7
            r41 = r3
            r44 = r15
            X.C26302CxJ.A0L(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1gU r0 = r0.getLinkifyWeb()     // Catch:{ all -> 0x3520 }
            java.lang.String r7 = r0.A02(r4)     // Catch:{ all -> 0x3520 }
            X.3TA r0 = r2.A2d     // Catch:{ all -> 0x3520 }
            r0.A0a(r7)     // Catch:{ all -> 0x3520 }
            X.3TA r1 = r2.A2d     // Catch:{ all -> 0x3520 }
            r1.A0D = r15     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = r1.A0A     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1a26
            X.1DT r6 = r1.A0M     // Catch:{ all -> 0x3520 }
            X.4DX r3 = X.AnonymousClass4DX.LOADING     // Catch:{ all -> 0x3520 }
            X.4UK r1 = new X.4UK     // Catch:{ all -> 0x3520 }
            r9 = r17
            r1.<init>(r9, r3, r9)     // Catch:{ all -> 0x3520 }
            r6.A0F(r1)     // Catch:{ all -> 0x3520 }
        L_0x1a26:
            X.3TA r3 = r2.A2d     // Catch:{ all -> 0x1a32 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x1a32 }
            X.0vq r0 = r2.A2K()     // Catch:{ all -> 0x1a32 }
            r3.A0Y(r1, r0, r7)     // Catch:{ all -> 0x1a32 }
            goto L_0x1a49
        L_0x1a32:
            r0 = move-exception
            goto L_0x1153
        L_0x1a35:
            X.4R4 r1 = X.AnonymousClass3MZ.A0a(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x3520 }
            r1.A00 = r0     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z     // Catch:{ all -> 0x3520 }
            r1 = r17
            r0.setText(r1)     // Catch:{ all -> 0x3520 }
            A0a(r2)     // Catch:{ all -> 0x3520 }
        L_0x1a49:
            boolean r0 = X.AnonymousClass1EG.A0H(r4)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x1a57
            boolean r1 = A25(r2)     // Catch:{ all -> 0x3520 }
            r0 = 8
            if (r1 == 0) goto L_0x1a58
        L_0x1a57:
            r0 = 0
        L_0x1a58:
            A1P(r2, r0)     // Catch:{ all -> 0x3520 }
            r6 = 0
            java.util.HashMap r21 = A8L     // Catch:{ all -> 0x3520 }
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.Jid r0 = r0.A06(r5)     // Catch:{ all -> 0x3520 }
            r1 = r21
            java.lang.Object r14 = r1.get(r0)     // Catch:{ all -> 0x3520 }
            X.4Ox r14 = (X.C85834Ox) r14     // Catch:{ all -> 0x3520 }
            if (r14 == 0) goto L_0x1bb8
            X.4TX r0 = X.C88444Zs.A02(r2)     // Catch:{ all -> 0x3520 }
            r1 = 1029386189(0x3d5b2fcd, float:0.053512383)
            X.19Y r0 = r0.A00     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.BfT(r1)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x1a86
            X.4TX r1 = X.C88444Zs.A02(r2)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "chats_list_screen"
            r1.A01(r0)     // Catch:{ all -> 0x3520 }
        L_0x1a86:
            X.4aI r3 = X.C88444Zs.A01(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A01(r0)     // Catch:{ all -> 0x3520 }
            r4 = r22
            r0 = r17
            X.C88654aI.A03(r3, r1, r0, r4, r15)     // Catch:{ all -> 0x3520 }
            X.3TA r0 = r2.A2d     // Catch:{ all -> 0x3520 }
            java.lang.String r3 = r14.A03     // Catch:{ all -> 0x3520 }
            r0.A0a(r3)     // Catch:{ all -> 0x3520 }
            X.4TX r5 = X.C88444Zs.A02(r2)     // Catch:{ all -> 0x3520 }
            boolean r0 = r14.A04     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1aab
            boolean r0 = r14.A05     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1aab
            r6 = 1
        L_0x1aab:
            java.lang.String r4 = "preview_load_starts"
            if (r6 == 0) goto L_0x1ab9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "icebreaker_"
            java.lang.String r4 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ all -> 0x3520 }
        L_0x1ab9:
            r5.A00(r4)     // Catch:{ all -> 0x3520 }
            X.3TA r13 = r2.A2d     // Catch:{ all -> 0x3520 }
            r0 = r121
            X.4Xd r12 = r0.A07     // Catch:{ all -> 0x3520 }
            X.0ve r4 = r13.A0e     // Catch:{ all -> 0x3520 }
            r1 = 10299(0x283b, float:1.4432E-41)
            r0 = r28
            boolean r0 = X.C18020vd.A05(r0, r4, r1)     // Catch:{ all -> 0x3520 }
            r5 = 1
            if (r0 == 0) goto L_0x1ad1
            r13.A0D = r15     // Catch:{ all -> 0x3520 }
        L_0x1ad1:
            boolean r0 = r14.A06     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x2618
            r1 = 10399(0x289f, float:1.4572E-41)
            r0 = r28
            boolean r0 = X.C18020vd.A05(r0, r4, r1)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x2618
        L_0x1adf:
            r13.A0F = r5     // Catch:{ all -> 0x3520 }
            X.1gU r5 = r13.A0g     // Catch:{ all -> 0x3520 }
            X.181 r1 = r13.A0P     // Catch:{ all -> 0x3520 }
            r0 = r22
            X.AnonymousClass3Ma.A1O(r5, r0, r1)     // Catch:{ all -> 0x3520 }
            X.3hL r0 = new X.3hL     // Catch:{ all -> 0x3520 }
            r0.<init>(r1, r4, r5, r3)     // Catch:{ all -> 0x3520 }
            r0.A08 = r3     // Catch:{ all -> 0x3520 }
            r13.A00 = r0     // Catch:{ all -> 0x3520 }
            X.4DX r1 = X.AnonymousClass4DX.LOADING     // Catch:{ all -> 0x3520 }
            X.AnonymousClass3TA.A00(r0, r13, r1)     // Catch:{ all -> 0x3520 }
            X.44b r3 = r13.A0c     // Catch:{ all -> 0x3520 }
            X.4mA r11 = new X.4mA     // Catch:{ all -> 0x3520 }
            r11.<init>(r13, r12, r14)     // Catch:{ all -> 0x3520 }
            java.lang.String r10 = r12.A0H     // Catch:{ all -> 0x3520 }
            if (r10 == 0) goto L_0x25ec
            r1 = 10258(0x2812, float:1.4375E-41)
            r0 = r28
            boolean r0 = X.C18020vd.A05(r0, r4, r1)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x25ec
            java.lang.String r0 = ""
            java.lang.String r3 = "post"
            X.4UF r9 = new X.4UF     // Catch:{ all -> 0x3520 }
            r9.<init>(r0, r3, r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r12.A0O     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x1b31
            java.lang.String r0 = "FB_Ads"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1b24
            java.lang.String r3 = "ad"
        L_0x1b24:
            java.lang.String r1 = r12.A0P     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x1b31
            java.lang.String r0 = r12.A0R     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1b31
            X.4UF r9 = new X.4UF     // Catch:{ all -> 0x3520 }
            r9.<init>(r1, r3, r0)     // Catch:{ all -> 0x3520 }
        L_0x1b31:
            X.4Ue r7 = r12.A02     // Catch:{ all -> 0x3520 }
            if (r7 == 0) goto L_0x25e2
            java.lang.String r1 = r7.A01     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x25e2
            byte[] r0 = r7.A03     // Catch:{ all -> 0x3520 }
            X.4TY r6 = new X.4TY     // Catch:{ all -> 0x3520 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x3520 }
        L_0x1b40:
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x25e8
            X.4Sl r5 = new X.4Sl     // Catch:{ all -> 0x3520 }
            r5.<init>(r0)     // Catch:{ all -> 0x3520 }
        L_0x1b49:
            X.4UE r0 = r12.A01     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x25de
            java.lang.String r4 = r0.A02     // Catch:{ all -> 0x3520 }
            if (r4 == 0) goto L_0x25de
            java.lang.String r3 = r0.A00     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x25de
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x25de
            X.4UG r0 = new X.4UG     // Catch:{ all -> 0x3520 }
            r0.<init>(r4, r3, r1)     // Catch:{ all -> 0x3520 }
        L_0x1b5e:
            java.util.ArrayList r1 = r12.A0T     // Catch:{ all -> 0x3520 }
            r46 = r1
            if (r7 == 0) goto L_0x25da
            java.lang.String r4 = r7.A00     // Catch:{ all -> 0x3520 }
            if (r4 == 0) goto L_0x25da
        L_0x1b68:
            java.lang.String r1 = r12.A0A     // Catch:{ all -> 0x3520 }
            r41 = r1
            java.lang.String r1 = r12.A0S     // Catch:{ all -> 0x3520 }
            r17 = r1
            java.lang.String r7 = r12.A0C     // Catch:{ all -> 0x3520 }
            java.lang.String r3 = r12.A0M     // Catch:{ all -> 0x3520 }
            X.4VG r1 = new X.4VG     // Catch:{ all -> 0x3520 }
            r35 = r1
            r36 = r9
            r37 = r0
            r38 = r6
            r39 = r5
            r40 = r10
            r42 = r17
            r43 = r7
            r44 = r3
            r45 = r4
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x3520 }
            X.1KB r3 = r13.A0N     // Catch:{ all -> 0x3520 }
            X.3Bw r0 = new X.3Bw     // Catch:{ all -> 0x3520 }
            r0.<init>(r11, r1, r15)     // Catch:{ all -> 0x3520 }
            r3.CGP(r0)     // Catch:{ all -> 0x3520 }
        L_0x1b97:
            X.1DT r4 = r11.A00     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 14
            X.4fm r0 = new X.4fm     // Catch:{ all -> 0x3520 }
            r0.<init>(r14, r2, r1)     // Catch:{ all -> 0x3520 }
            r4.A0A(r3, r0)     // Catch:{ all -> 0x3520 }
            boolean r0 = r12.A0d     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1bb8
            boolean r0 = A29(r2)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x1bb8
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1bb8
            r0.A0I(r8)     // Catch:{ all -> 0x3520 }
        L_0x1bb8:
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.4ZR r17 = new X.4ZR     // Catch:{ all -> 0x3520 }
            r1 = r17
            r1.<init>(r0)     // Catch:{ all -> 0x3520 }
            boolean r0 = r2.A6n     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1e98
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.1EC r101 = X.AnonymousClass3MY.A0b(r0)     // Catch:{ all -> 0x3520 }
            X.2XJ r0 = r2.A1J     // Catch:{ all -> 0x3520 }
            X.1FY r53 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1E7 r12 = r2.A35     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1F9 r54 = r1.getLifecycleOwner()     // Catch:{ all -> 0x3520 }
            X.1FD r55 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.1K2 r1 = r0.A00     // Catch:{ all -> 0x3520 }
            X.10E r0 = r1.A01     // Catch:{ all -> 0x3520 }
            X.11P r73 = X.AnonymousClass10E.A6O(r0)     // Catch:{ all -> 0x3520 }
            X.0ve r82 = X.AnonymousClass10E.A8r(r0)     // Catch:{ all -> 0x3520 }
            X.1KB r59 = X.AnonymousClass10E.A12(r0)     // Catch:{ all -> 0x3520 }
            X.11S r60 = X.AnonymousClass10E.A17(r0)     // Catch:{ all -> 0x3520 }
            X.1LU r88 = X.AnonymousClass3MY.A0Z(r0)     // Catch:{ all -> 0x3520 }
            X.10I r92 = X.AnonymousClass10E.AL1(r0)     // Catch:{ all -> 0x3520 }
            X.1CJ r77 = X.AnonymousClass3Ma.A0d(r0)     // Catch:{ all -> 0x3520 }
            X.1KW r81 = X.AnonymousClass3Ma.A0f(r0)     // Catch:{ all -> 0x3520 }
            X.1Q1 r76 = X.AnonymousClass3MY.A0U(r0)     // Catch:{ all -> 0x3520 }
            X.1VW r67 = X.AnonymousClass3MZ.A0e(r0)     // Catch:{ all -> 0x3520 }
            X.1M9 r68 = X.AnonymousClass10E.A4z(r0)     // Catch:{ all -> 0x3520 }
            X.10G r3 = r0.A00     // Catch:{ all -> 0x3520 }
            X.00S r4 = r3.A12     // Catch:{ all -> 0x3520 }
            java.lang.Object r11 = r4.get()     // Catch:{ all -> 0x3520 }
            X.1xn r11 = (X.C42201xn) r11     // Catch:{ all -> 0x3520 }
            X.1PU r90 = X.AnonymousClass3MZ.A12(r0)     // Catch:{ all -> 0x3520 }
            X.1DC r91 = X.AnonymousClass3MZ.A13(r0)     // Catch:{ all -> 0x3520 }
            X.1Me r70 = X.AnonymousClass3MZ.A0g(r0)     // Catch:{ all -> 0x3520 }
            X.0vb r75 = X.AnonymousClass10E.A6Q(r0)     // Catch:{ all -> 0x3520 }
            X.00S r4 = r0.A5H     // Catch:{ all -> 0x3520 }
            java.lang.Object r10 = r4.get()     // Catch:{ all -> 0x3520 }
            X.1Va r10 = (X.C27171Va) r10     // Catch:{ all -> 0x3520 }
            X.1Lf r69 = X.AnonymousClass3Ma.A0S(r0)     // Catch:{ all -> 0x3520 }
            X.126 r83 = X.AnonymousClass3MY.A0X(r0)     // Catch:{ all -> 0x3520 }
            X.1xo r86 = X.AnonymousClass3Ma.A0i(r0)     // Catch:{ all -> 0x3520 }
            X.00S r4 = r0.A2F     // Catch:{ all -> 0x3520 }
            java.lang.Object r9 = r4.get()     // Catch:{ all -> 0x3520 }
            X.1mk r9 = (X.C35751mk) r9     // Catch:{ all -> 0x3520 }
            X.00S r4 = r0.A2M     // Catch:{ all -> 0x3520 }
            java.lang.Object r7 = r4.get()     // Catch:{ all -> 0x3520 }
            X.1gf r7 = (X.C32111gf) r7     // Catch:{ all -> 0x3520 }
            X.0z4 r74 = X.AnonymousClass3Ma.A0c(r0)     // Catch:{ all -> 0x3520 }
            X.1kb r65 = X.AnonymousClass3MZ.A0b(r0)     // Catch:{ all -> 0x3520 }
            X.00S r4 = r0.A1K     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r4.get()     // Catch:{ all -> 0x3520 }
            X.1tC r6 = (X.C39511tC) r6     // Catch:{ all -> 0x3520 }
            X.00S r4 = r0.A4m     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x3520 }
            X.1Uw r5 = (X.C27141Uw) r5     // Catch:{ all -> 0x3520 }
            X.1MZ r79 = X.AnonymousClass3MY.A0V(r0)     // Catch:{ all -> 0x3520 }
            X.1Vc r71 = X.AnonymousClass3MZ.A0j(r0)     // Catch:{ all -> 0x3520 }
            X.1Nf r78 = X.AnonymousClass3MZ.A0m(r0)     // Catch:{ all -> 0x3520 }
            X.1Ng r85 = X.AnonymousClass3MY.A0Y(r0)     // Catch:{ all -> 0x3520 }
            X.1K1 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.00S r4 = r1.A2d     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x3520 }
            X.4JN r4 = (X.AnonymousClass4JN) r4     // Catch:{ all -> 0x3520 }
            X.3Kk r61 = X.AnonymousClass3MZ.A0T(r3)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r3.A59     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1LT r3 = (X.AnonymousClass1LT) r3     // Catch:{ all -> 0x3520 }
            X.00S r1 = r1.A13     // Catch:{ all -> 0x3520 }
            X.00H r93 = X.C000200d.A00(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r0.A7f     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.0zA r0 = (X.C19880zA) r0     // Catch:{ all -> 0x3520 }
            X.3rV r1 = new X.3rV     // Catch:{ all -> 0x3520 }
            r52 = r1
            r56 = r0
            r57 = r11
            r58 = r4
            r62 = r17
            r63 = r6
            r64 = r9
            r66 = r7
            r72 = r10
            r80 = r12
            r84 = r5
            r87 = r3
            r89 = r101
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93)     // Catch:{ all -> 0x3520 }
            r2.A23 = r1     // Catch:{ all -> 0x3520 }
            X.2XI r1 = r2.A1E     // Catch:{ all -> 0x3520 }
            X.1FY r50 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r59 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r47 = r0
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            r46 = r0
            X.1K2 r4 = r1.A00     // Catch:{ all -> 0x3520 }
            X.10E r1 = r4.A01     // Catch:{ all -> 0x3520 }
            X.11P r80 = X.AnonymousClass10E.A6O(r1)     // Catch:{ all -> 0x3520 }
            X.0ve r95 = X.AnonymousClass10E.A8r(r1)     // Catch:{ all -> 0x3520 }
            X.1KB r60 = X.AnonymousClass10E.A12(r1)     // Catch:{ all -> 0x3520 }
            X.11S r61 = X.AnonymousClass10E.A17(r1)     // Catch:{ all -> 0x3520 }
            X.10I r112 = X.AnonymousClass10E.AL1(r1)     // Catch:{ all -> 0x3520 }
            X.1CJ r85 = X.AnonymousClass3Ma.A0d(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A99     // Catch:{ all -> 0x3520 }
            java.lang.Object r45 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r45
            X.1HQ r0 = (X.AnonymousClass1HQ) r0     // Catch:{ all -> 0x3520 }
            r45 = r0
            X.18O r62 = X.AnonymousClass3MZ.A0S(r1)     // Catch:{ all -> 0x3520 }
            X.1iW r63 = X.AnonymousClass3MZ.A0U(r1)     // Catch:{ all -> 0x3520 }
            X.12L r96 = X.AnonymousClass3MZ.A0u(r1)     // Catch:{ all -> 0x3520 }
            X.00H r114 = X.AnonymousClass3MX.A0z(r1)     // Catch:{ all -> 0x3520 }
            X.1HS r68 = X.AnonymousClass3MZ.A0Z(r1)     // Catch:{ all -> 0x3520 }
            X.1VW r72 = X.AnonymousClass3MZ.A0e(r1)     // Catch:{ all -> 0x3520 }
            X.1M9 r73 = X.AnonymousClass10E.A4z(r1)     // Catch:{ all -> 0x3520 }
            X.1Me r75 = X.AnonymousClass3MZ.A0g(r1)     // Catch:{ all -> 0x3520 }
            X.1DC r111 = X.AnonymousClass3MZ.A13(r1)     // Catch:{ all -> 0x3520 }
            X.11C r79 = X.AnonymousClass3Ma.A0a(r1)     // Catch:{ all -> 0x3520 }
            X.0vb r82 = X.AnonymousClass10E.A6Q(r1)     // Catch:{ all -> 0x3520 }
            X.1PU r110 = X.AnonymousClass3MZ.A12(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A4p     // Catch:{ all -> 0x3520 }
            java.lang.Object r44 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r44
            X.1Pv r0 = (X.C25841Pv) r0     // Catch:{ all -> 0x3520 }
            r44 = r0
            X.00S r0 = r1.A8b     // Catch:{ all -> 0x3520 }
            java.lang.Object r43 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r43
            X.1Rj r0 = (X.C26241Rj) r0     // Catch:{ all -> 0x3520 }
            r43 = r0
            X.10G r3 = r1.A00     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A55     // Catch:{ all -> 0x3520 }
            java.lang.Object r42 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r42
            X.1pz r0 = (X.C37701pz) r0     // Catch:{ all -> 0x3520 }
            r42 = r0
            X.00S r0 = r1.A1U     // Catch:{ all -> 0x3520 }
            java.lang.Object r41 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r41
            X.1tA r0 = (X.C39491tA) r0     // Catch:{ all -> 0x3520 }
            r41 = r0
            X.00S r0 = r1.A21     // Catch:{ all -> 0x3520 }
            java.lang.Object r40 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r40
            X.1MC r0 = (X.AnonymousClass1MC) r0     // Catch:{ all -> 0x3520 }
            r40 = r0
            X.1Lf r74 = X.AnonymousClass3Ma.A0S(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A1m     // Catch:{ all -> 0x3520 }
            java.lang.Object r39 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r39
            X.1TD r0 = (X.AnonymousClass1TD) r0     // Catch:{ all -> 0x3520 }
            r39 = r0
            X.1i1 r78 = X.AnonymousClass3Ma.A0U(r1)     // Catch:{ all -> 0x3520 }
            X.1Nb r107 = X.AnonymousClass3MZ.A11(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A4N     // Catch:{ all -> 0x3520 }
            java.lang.Object r38 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r38
            X.2l3 r0 = (X.C58662l3) r0     // Catch:{ all -> 0x3520 }
            r38 = r0
            X.1Q1 r84 = X.AnonymousClass3MY.A0U(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A2M     // Catch:{ all -> 0x3520 }
            java.lang.Object r37 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r37
            X.1gf r0 = (X.C32111gf) r0     // Catch:{ all -> 0x3520 }
            r37 = r0
            X.1VU r94 = X.AnonymousClass3MZ.A0s(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.AB5     // Catch:{ all -> 0x3520 }
            java.lang.Object r36 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r36
            X.1kk r0 = (X.C34591kk) r0     // Catch:{ all -> 0x3520 }
            r36 = r0
            X.00S r0 = r1.A9e     // Catch:{ all -> 0x3520 }
            java.lang.Object r35 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r35
            X.1m1 r0 = (X.C35311m1) r0     // Catch:{ all -> 0x3520 }
            r35 = r0
            X.00S r0 = r1.AA1     // Catch:{ all -> 0x3520 }
            java.lang.Object r14 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1xp r14 = (X.C42221xp) r14     // Catch:{ all -> 0x3520 }
            X.0z4 r81 = X.AnonymousClass3Ma.A0c(r1)     // Catch:{ all -> 0x3520 }
            X.1kb r70 = X.AnonymousClass3MZ.A0b(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A5X     // Catch:{ all -> 0x3520 }
            java.lang.Object r13 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1TA r13 = (X.AnonymousClass1TA) r13     // Catch:{ all -> 0x3520 }
            X.1MW r89 = X.AnonymousClass3MZ.A0p(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A9f     // Catch:{ all -> 0x3520 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1vZ r12 = (X.C40951vZ) r12     // Catch:{ all -> 0x3520 }
            X.1RK r92 = X.AnonymousClass3MZ.A0r(r1)     // Catch:{ all -> 0x3520 }
            X.1K1 r0 = r4.A00     // Catch:{ all -> 0x3520 }
            X.00S r4 = r0.A1C     // Catch:{ all -> 0x3520 }
            java.lang.Object r11 = r4.get()     // Catch:{ all -> 0x3520 }
            X.4Ii r11 = (X.C84164Ii) r11     // Catch:{ all -> 0x3520 }
            X.00S r4 = r0.A1D     // Catch:{ all -> 0x3520 }
            java.lang.Object r10 = r4.get()     // Catch:{ all -> 0x3520 }
            X.2hH r10 = (X.C56322hH) r10     // Catch:{ all -> 0x3520 }
            X.1MZ r87 = X.AnonymousClass3MY.A0V(r1)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r3.A0t     // Catch:{ all -> 0x3520 }
            java.lang.Object r9 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4Wn r9 = (X.C87684Wn) r9     // Catch:{ all -> 0x3520 }
            X.1Vc r76 = X.AnonymousClass3MZ.A0j(r1)     // Catch:{ all -> 0x3520 }
            X.1Nf r86 = X.AnonymousClass3MZ.A0m(r1)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A3R     // Catch:{ all -> 0x3520 }
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1Pu r7 = (X.C25831Pu) r7     // Catch:{ all -> 0x3520 }
            X.1Ng r98 = X.AnonymousClass3MY.A0Y(r1)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A2Y     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4PY r6 = (X.AnonymousClass4PY) r6     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A2c     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x3520 }
            X.5Yu r5 = (X.C107205Yu) r5     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A1E     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4Ij r4 = (X.C84174Ij) r4     // Catch:{ all -> 0x3520 }
            X.1xo r100 = X.AnonymousClass3Ma.A0i(r1)     // Catch:{ all -> 0x3520 }
            X.4HF r103 = new X.4HF     // Catch:{ all -> 0x3520 }
            r103.<init>()     // Catch:{ all -> 0x3520 }
            X.00S r0 = r0.A4B     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4Ln r3 = (X.C84964Ln) r3     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A7f     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.0zA r0 = (X.C19880zA) r0     // Catch:{ all -> 0x3520 }
            X.00S r1 = r1.A8X     // Catch:{ all -> 0x3520 }
            X.00H r115 = X.C000200d.A00(r1)     // Catch:{ all -> 0x3520 }
            X.3ra r49 = new X.3ra     // Catch:{ all -> 0x3520 }
            r53 = r51
            r52 = r51
            r54 = r0
            r55 = r11
            r56 = r10
            r57 = r4
            r58 = r6
            r64 = r17
            r65 = r45
            r66 = r5
            r67 = r38
            r69 = r40
            r71 = r37
            r77 = r47
            r83 = r39
            r88 = r13
            r90 = r36
            r91 = r46
            r93 = r14
            r97 = r44
            r99 = r3
            r102 = r42
            r104 = r43
            r105 = r35
            r106 = r12
            r108 = r9
            r109 = r7
            r113 = r41
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115)     // Catch:{ all -> 0x3520 }
        L_0x1e80:
            boolean r0 = r2.A6d     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1e8f
            X.3hU r1 = r2.A23     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x1e8f
            androidx.appcompat.widget.Toolbar r0 = r2.A0f     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r0, r8)     // Catch:{ all -> 0x3520 }
            r1.A0B = r0     // Catch:{ all -> 0x3520 }
        L_0x1e8f:
            X.3hU r1 = r2.A23     // Catch:{ all -> 0x3520 }
            r0 = r123
            r0.add(r1)     // Catch:{ all -> 0x3520 }
            goto L_0x261b
        L_0x1e98:
            boolean r0 = r2.A6o     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1ffc
            X.1BI r6 = r2.A3R     // Catch:{ all -> 0x3520 }
            android.os.Parcelable$Creator r0 = X.C47712Jo.CREATOR     // Catch:{ all -> 0x3520 }
            boolean r0 = r6 instanceof X.C47712Jo     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x1ff9
            X.2Jo r6 = (X.C47712Jo) r6     // Catch:{ all -> 0x3520 }
        L_0x1ea6:
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x3520 }
            X.1FY r53 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.0ve r71 = X.AnonymousClass3MX.A0h(r2)     // Catch:{ all -> 0x3520 }
            X.1KB r55 = X.AnonymousClass3MX.A0U(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.11S r56 = r0.getMeManager()     // Catch:{ all -> 0x3520 }
            X.10I r77 = X.AnonymousClass3MX.A0w(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1KW r70 = r0.getEmojiLoader()     // Catch:{ all -> 0x3520 }
            X.1VW r0 = r2.A1u     // Catch:{ all -> 0x3520 }
            r38 = r0
            X.1xn r0 = r2.A0t     // Catch:{ all -> 0x3520 }
            r37 = r0
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1PU r75 = r1.getGroupChatUtils()     // Catch:{ all -> 0x3520 }
            X.1DC r0 = r2.A4L     // Catch:{ all -> 0x3520 }
            r36 = r0
            X.1Me r63 = r1.getWAContactNames()     // Catch:{ all -> 0x3520 }
            X.0vb r0 = r2.A2k     // Catch:{ all -> 0x3520 }
            r35 = r0
            X.1Va r14 = r2.A20     // Catch:{ all -> 0x3520 }
            X.1Lf r13 = r2.A1v     // Catch:{ all -> 0x3520 }
            X.00H r0 = r2.A53     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1Q1 r5 = (X.AnonymousClass1Q1) r5     // Catch:{ all -> 0x3520 }
            X.00H r0 = r2.A56     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1mk r4 = (X.C35751mk) r4     // Catch:{ all -> 0x3520 }
            X.4OV r0 = X.AnonymousClass3MY.A0T(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A04     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1tC r3 = (X.C39511tC) r3     // Catch:{ all -> 0x3520 }
            X.1Vc r12 = r2.A1z     // Catch:{ all -> 0x3520 }
            X.1Nf r11 = r2.A2x     // Catch:{ all -> 0x3520 }
            X.00H r0 = r2.A5T     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1Ng r1 = (X.C25191Ng) r1     // Catch:{ all -> 0x3520 }
            X.3Kk r10 = r2.A1U     // Catch:{ all -> 0x3520 }
            X.00H r0 = r2.A6E     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1LT r0 = (X.AnonymousClass1LT) r0     // Catch:{ all -> 0x3520 }
            X.1E7 r9 = r2.A35     // Catch:{ all -> 0x3520 }
            X.3rT r7 = new X.3rT     // Catch:{ all -> 0x3520 }
            r52 = r7
            r54 = r37
            r57 = r10
            r58 = r17
            r59 = r3
            r60 = r4
            r61 = r38
            r62 = r13
            r64 = r12
            r65 = r14
            r66 = r35
            r67 = r5
            r68 = r11
            r69 = r9
            r72 = r1
            r73 = r0
            r74 = r6
            r76 = r36
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)     // Catch:{ all -> 0x3520 }
            r2.A23 = r7     // Catch:{ all -> 0x3520 }
            X.2X5 r0 = r2.A0z     // Catch:{ all -> 0x3520 }
            X.1E7 r11 = r2.A35     // Catch:{ all -> 0x3520 }
            X.1FY r50 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r56 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r10 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1K2 r1 = r0.A00     // Catch:{ all -> 0x3520 }
            X.10E r0 = r1.A01     // Catch:{ all -> 0x3520 }
            X.0ve r75 = X.AnonymousClass10E.A8r(r0)     // Catch:{ all -> 0x3520 }
            X.1KB r57 = X.AnonymousClass10E.A12(r0)     // Catch:{ all -> 0x3520 }
            X.11S r58 = X.AnonymousClass10E.A17(r0)     // Catch:{ all -> 0x3520 }
            X.10I r83 = X.AnonymousClass10E.AL1(r0)     // Catch:{ all -> 0x3520 }
            X.1CJ r71 = X.AnonymousClass3Ma.A0d(r0)     // Catch:{ all -> 0x3520 }
            X.18O r59 = X.AnonymousClass3MZ.A0S(r0)     // Catch:{ all -> 0x3520 }
            X.1iW r60 = X.AnonymousClass3MZ.A0U(r0)     // Catch:{ all -> 0x3520 }
            X.12L r76 = X.AnonymousClass3MZ.A0u(r0)     // Catch:{ all -> 0x3520 }
            X.00H r84 = X.AnonymousClass3MX.A0z(r0)     // Catch:{ all -> 0x3520 }
            X.1HS r62 = X.AnonymousClass3MZ.A0Z(r0)     // Catch:{ all -> 0x3520 }
            X.1DC r82 = X.AnonymousClass3MZ.A13(r0)     // Catch:{ all -> 0x3520 }
            X.11C r67 = X.AnonymousClass3Ma.A0a(r0)     // Catch:{ all -> 0x3520 }
            X.0vb r69 = X.AnonymousClass10E.A6Q(r0)     // Catch:{ all -> 0x3520 }
            X.10G r3 = r0.A00     // Catch:{ all -> 0x3520 }
            X.00S r3 = r3.A55     // Catch:{ all -> 0x3520 }
            java.lang.Object r9 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1pz r9 = (X.C37701pz) r9     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A21     // Catch:{ all -> 0x3520 }
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1MC r7 = (X.AnonymousClass1MC) r7     // Catch:{ all -> 0x3520 }
            X.1Lf r64 = X.AnonymousClass3Ma.A0S(r0)     // Catch:{ all -> 0x3520 }
            X.1i1 r66 = X.AnonymousClass3Ma.A0U(r0)     // Catch:{ all -> 0x3520 }
            X.1Nb r80 = X.AnonymousClass3MZ.A11(r0)     // Catch:{ all -> 0x3520 }
            X.1Q1 r70 = X.AnonymousClass3MY.A0U(r0)     // Catch:{ all -> 0x3520 }
            X.0z4 r68 = X.AnonymousClass3Ma.A0c(r0)     // Catch:{ all -> 0x3520 }
            X.1RK r74 = X.AnonymousClass3MZ.A0r(r0)     // Catch:{ all -> 0x3520 }
            X.1K1 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A1C     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4Ii r5 = (X.C84164Ii) r5     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A1D     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x3520 }
            X.2hH r4 = (X.C56322hH) r4     // Catch:{ all -> 0x3520 }
            X.1Nf r72 = X.AnonymousClass3MZ.A0m(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A3R     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1Pu r3 = (X.C25831Pu) r3     // Catch:{ all -> 0x3520 }
            X.1Ng r77 = X.AnonymousClass3MY.A0Y(r0)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A1E     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4Ij r0 = (X.C84174Ij) r0     // Catch:{ all -> 0x3520 }
            X.3rY r49 = new X.3rY     // Catch:{ all -> 0x3520 }
            r52 = r51
            r53 = r5
            r54 = r4
            r55 = r0
            r61 = r17
            r63 = r7
            r65 = r10
            r73 = r11
            r78 = r6
            r79 = r9
            r81 = r3
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84)     // Catch:{ all -> 0x3520 }
            goto L_0x1e80
        L_0x1ff9:
            r6 = 0
            goto L_0x1ea6
        L_0x1ffc:
            boolean r0 = X.AnonymousClass3MZ.A1W(r2)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x21dd
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r2)     // Catch:{ all -> 0x3520 }
            X.4JR r0 = r0.A02     // Catch:{ all -> 0x3520 }
            X.1FY r53 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r3 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.25J r1 = X.C29681ch.A03     // Catch:{ all -> 0x3520 }
            boolean r1 = r3 instanceof X.C29681ch     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x21da
            X.1ch r3 = (X.C29681ch) r3     // Catch:{ all -> 0x3520 }
        L_0x2016:
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x3520 }
            X.1E7 r13 = r2.A35     // Catch:{ all -> 0x3520 }
            android.content.Intent r1 = r2.A0B     // Catch:{ all -> 0x3520 }
            java.lang.String r12 = "wamo_pc_id"
            java.lang.String r83 = r1.getStringExtra(r12)     // Catch:{ all -> 0x3520 }
            X.1K2 r4 = r0.A00     // Catch:{ all -> 0x3520 }
            X.10E r0 = r4.A01     // Catch:{ all -> 0x3520 }
            X.0ve r74 = X.AnonymousClass10E.A8r(r0)     // Catch:{ all -> 0x3520 }
            X.1KB r56 = X.AnonymousClass10E.A12(r0)     // Catch:{ all -> 0x3520 }
            X.11S r57 = X.AnonymousClass10E.A17(r0)     // Catch:{ all -> 0x3520 }
            X.10I r82 = X.AnonymousClass10E.AL1(r0)     // Catch:{ all -> 0x3520 }
            X.1CJ r70 = X.AnonymousClass3Ma.A0d(r0)     // Catch:{ all -> 0x3520 }
            X.1KW r73 = X.AnonymousClass3Ma.A0f(r0)     // Catch:{ all -> 0x3520 }
            X.1VW r62 = X.AnonymousClass3MZ.A0e(r0)     // Catch:{ all -> 0x3520 }
            X.10G r1 = r0.A00     // Catch:{ all -> 0x3520 }
            X.00S r5 = r1.A12     // Catch:{ all -> 0x3520 }
            java.lang.Object r11 = r5.get()     // Catch:{ all -> 0x3520 }
            X.1xn r11 = (X.C42201xn) r11     // Catch:{ all -> 0x3520 }
            X.1DC r81 = X.AnonymousClass3MZ.A13(r0)     // Catch:{ all -> 0x3520 }
            X.1Me r64 = X.AnonymousClass3MZ.A0g(r0)     // Catch:{ all -> 0x3520 }
            X.0vb r68 = X.AnonymousClass10E.A6Q(r0)     // Catch:{ all -> 0x3520 }
            X.1PU r80 = X.AnonymousClass3MZ.A12(r0)     // Catch:{ all -> 0x3520 }
            X.00S r5 = r0.A5H     // Catch:{ all -> 0x3520 }
            java.lang.Object r10 = r5.get()     // Catch:{ all -> 0x3520 }
            X.1Va r10 = (X.C27171Va) r10     // Catch:{ all -> 0x3520 }
            X.1Lf r63 = X.AnonymousClass3Ma.A0S(r0)     // Catch:{ all -> 0x3520 }
            X.00S r5 = r0.A2F     // Catch:{ all -> 0x3520 }
            java.lang.Object r9 = r5.get()     // Catch:{ all -> 0x3520 }
            X.1mk r9 = (X.C35751mk) r9     // Catch:{ all -> 0x3520 }
            X.1Q1 r69 = X.AnonymousClass3MY.A0U(r0)     // Catch:{ all -> 0x3520 }
            X.00S r5 = r0.A1K     // Catch:{ all -> 0x3520 }
            java.lang.Object r7 = r5.get()     // Catch:{ all -> 0x3520 }
            X.1tC r7 = (X.C39511tC) r7     // Catch:{ all -> 0x3520 }
            X.1Vc r65 = X.AnonymousClass3MZ.A0j(r0)     // Catch:{ all -> 0x3520 }
            X.1Nf r71 = X.AnonymousClass3MZ.A0m(r0)     // Catch:{ all -> 0x3520 }
            X.1Ng r75 = X.AnonymousClass3MY.A0Y(r0)     // Catch:{ all -> 0x3520 }
            X.1K1 r4 = r4.A00     // Catch:{ all -> 0x3520 }
            X.00S r4 = r4.A2e     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r4.get()     // Catch:{ all -> 0x3520 }
            X.4JP r6 = (X.AnonymousClass4JP) r6     // Catch:{ all -> 0x3520 }
            X.3Kk r58 = X.AnonymousClass3MZ.A0T(r1)     // Catch:{ all -> 0x3520 }
            X.00S r4 = r1.A59     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x3520 }
            X.1LT r5 = (X.AnonymousClass1LT) r5     // Catch:{ all -> 0x3520 }
            X.11P r67 = X.AnonymousClass10E.A6O(r0)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A3O     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4XM r4 = (X.AnonymousClass4XM) r4     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A3Q     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4Rr r0 = (X.C86454Rr) r0     // Catch:{ all -> 0x3520 }
            X.3rX r1 = new X.3rX     // Catch:{ all -> 0x3520 }
            r52 = r1
            r54 = r11
            r55 = r6
            r59 = r17
            r60 = r7
            r61 = r9
            r66 = r10
            r72 = r13
            r76 = r5
            r77 = r3
            r78 = r4
            r79 = r0
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83)     // Catch:{ all -> 0x3520 }
            r2.A23 = r1     // Catch:{ all -> 0x3520 }
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r2)     // Catch:{ all -> 0x3520 }
            X.4JO r1 = r0.A00     // Catch:{ all -> 0x3520 }
            X.1FY r50 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r60 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r36 = r0
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            r35 = r0
            X.1E7 r14 = r2.A35     // Catch:{ all -> 0x3520 }
            android.content.Intent r0 = r2.A0B     // Catch:{ all -> 0x3520 }
            r0.getStringExtra(r12)     // Catch:{ all -> 0x3520 }
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.10E r0 = r1.A01     // Catch:{ all -> 0x3520 }
            X.0ve r80 = X.AnonymousClass10E.A8r(r0)     // Catch:{ all -> 0x3520 }
            X.1KB r61 = X.AnonymousClass10E.A12(r0)     // Catch:{ all -> 0x3520 }
            X.11S r62 = X.AnonymousClass10E.A17(r0)     // Catch:{ all -> 0x3520 }
            X.10I r90 = X.AnonymousClass10E.AL1(r0)     // Catch:{ all -> 0x3520 }
            X.1CJ r76 = X.AnonymousClass3Ma.A0d(r0)     // Catch:{ all -> 0x3520 }
            X.18O r63 = X.AnonymousClass3MZ.A0S(r0)     // Catch:{ all -> 0x3520 }
            X.1iW r64 = X.AnonymousClass3MZ.A0U(r0)     // Catch:{ all -> 0x3520 }
            X.00H r91 = X.AnonymousClass3MX.A0z(r0)     // Catch:{ all -> 0x3520 }
            X.12L r81 = X.AnonymousClass3MZ.A0u(r0)     // Catch:{ all -> 0x3520 }
            X.1HS r66 = X.AnonymousClass3MZ.A0Z(r0)     // Catch:{ all -> 0x3520 }
            X.0vb r74 = X.AnonymousClass10E.A6Q(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A21     // Catch:{ all -> 0x3520 }
            java.lang.Object r12 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1MC r12 = (X.AnonymousClass1MC) r12     // Catch:{ all -> 0x3520 }
            X.1Lf r68 = X.AnonymousClass3Ma.A0S(r0)     // Catch:{ all -> 0x3520 }
            X.1i1 r70 = X.AnonymousClass3Ma.A0U(r0)     // Catch:{ all -> 0x3520 }
            X.1Nb r88 = X.AnonymousClass3MZ.A11(r0)     // Catch:{ all -> 0x3520 }
            X.0z4 r73 = X.AnonymousClass3Ma.A0c(r0)     // Catch:{ all -> 0x3520 }
            X.1RK r79 = X.AnonymousClass3MZ.A0r(r0)     // Catch:{ all -> 0x3520 }
            X.1K1 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A1C     // Catch:{ all -> 0x3520 }
            java.lang.Object r11 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4Ii r11 = (X.C84164Ii) r11     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A1D     // Catch:{ all -> 0x3520 }
            java.lang.Object r10 = r3.get()     // Catch:{ all -> 0x3520 }
            X.2hH r10 = (X.C56322hH) r10     // Catch:{ all -> 0x3520 }
            X.1Nf r77 = X.AnonymousClass3MZ.A0m(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A3R     // Catch:{ all -> 0x3520 }
            java.lang.Object r9 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1Pu r9 = (X.C25831Pu) r9     // Catch:{ all -> 0x3520 }
            X.1Ng r82 = X.AnonymousClass3MY.A0Y(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A1E     // Catch:{ all -> 0x3520 }
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4Ij r7 = (X.C84174Ij) r7     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A2e     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4JP r6 = (X.AnonymousClass4JP) r6     // Catch:{ all -> 0x3520 }
            X.00S r1 = r1.A52     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4JQ r5 = (X.AnonymousClass4JQ) r5     // Catch:{ all -> 0x3520 }
            X.10G r1 = r0.A00     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A55     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1pz r4 = (X.C37701pz) r4     // Catch:{ all -> 0x3520 }
            X.11P r72 = X.AnonymousClass10E.A6O(r0)     // Catch:{ all -> 0x3520 }
            X.1Q1 r75 = X.AnonymousClass3MY.A0U(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A7M     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x3520 }
            X.74D r3 = (X.AnonymousClass74D) r3     // Catch:{ all -> 0x3520 }
            X.11C r71 = X.AnonymousClass3Ma.A0a(r0)     // Catch:{ all -> 0x3520 }
            X.00S r13 = r0.A7R     // Catch:{ all -> 0x3520 }
            X.00H r92 = X.C000200d.A00(r13)     // Catch:{ all -> 0x3520 }
            X.00S r1 = r1.A3Q     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4Rr r1 = (X.C86454Rr) r1     // Catch:{ all -> 0x3520 }
            X.00S r13 = r0.A7V     // Catch:{ all -> 0x3520 }
            X.00H r93 = X.C000200d.A00(r13)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r0.A7C     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1c4 r0 = (X.AnonymousClass1c4) r0     // Catch:{ all -> 0x3520 }
            X.3rb r49 = new X.3rb     // Catch:{ all -> 0x3520 }
            r53 = r51
            r54 = r51
            r52 = r51
            r55 = r11
            r56 = r10
            r57 = r7
            r58 = r6
            r59 = r5
            r65 = r17
            r67 = r12
            r69 = r36
            r78 = r14
            r83 = r35
            r84 = r4
            r85 = r0
            r86 = r3
            r87 = r1
            r89 = r9
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93)     // Catch:{ all -> 0x3520 }
            goto L_0x1e80
        L_0x21da:
            r3 = 0
            goto L_0x2016
        L_0x21dd:
            boolean r0 = r2.A1v()     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x2282
            X.2XH r0 = r2.A1D     // Catch:{ all -> 0x3520 }
            X.1BI r10 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.1E7 r9 = r2.A35     // Catch:{ all -> 0x3520 }
            X.1FY r36 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1K2 r0 = r0.A00     // Catch:{ all -> 0x3520 }
            X.10E r0 = r0.A01     // Catch:{ all -> 0x3520 }
            X.0ve r54 = X.AnonymousClass10E.A8r(r0)     // Catch:{ all -> 0x3520 }
            X.1KB r38 = X.AnonymousClass10E.A12(r0)     // Catch:{ all -> 0x3520 }
            X.11S r39 = X.AnonymousClass10E.A17(r0)     // Catch:{ all -> 0x3520 }
            X.10I r60 = X.AnonymousClass10E.AL1(r0)     // Catch:{ all -> 0x3520 }
            X.1KW r53 = X.AnonymousClass3Ma.A0f(r0)     // Catch:{ all -> 0x3520 }
            X.1VW r44 = X.AnonymousClass3MZ.A0e(r0)     // Catch:{ all -> 0x3520 }
            X.10G r1 = r0.A00     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A12     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1xn r6 = (X.C42201xn) r6     // Catch:{ all -> 0x3520 }
            X.1PU r58 = X.AnonymousClass3MZ.A12(r0)     // Catch:{ all -> 0x3520 }
            X.1DC r59 = X.AnonymousClass3MZ.A13(r0)     // Catch:{ all -> 0x3520 }
            X.1Me r46 = X.AnonymousClass3MZ.A0g(r0)     // Catch:{ all -> 0x3520 }
            X.0vb r49 = X.AnonymousClass10E.A6Q(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A5H     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1Va r5 = (X.C27171Va) r5     // Catch:{ all -> 0x3520 }
            X.1Lf r45 = X.AnonymousClass3Ma.A0S(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A2F     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1mk r4 = (X.C35751mk) r4     // Catch:{ all -> 0x3520 }
            X.1Q1 r50 = X.AnonymousClass3MY.A0U(r0)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r0.A1K     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1tC r3 = (X.C39511tC) r3     // Catch:{ all -> 0x3520 }
            X.1Vc r47 = X.AnonymousClass3MZ.A0j(r0)     // Catch:{ all -> 0x3520 }
            X.1Nf r51 = X.AnonymousClass3MZ.A0m(r0)     // Catch:{ all -> 0x3520 }
            X.1Ng r55 = X.AnonymousClass3MY.A0Y(r0)     // Catch:{ all -> 0x3520 }
            X.3Kk r40 = X.AnonymousClass3MZ.A0T(r1)     // Catch:{ all -> 0x3520 }
            X.00S r1 = r1.A59     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.1LT r1 = (X.AnonymousClass1LT) r1     // Catch:{ all -> 0x3520 }
            X.00S r7 = r0.A12     // Catch:{ all -> 0x3520 }
            X.00H r61 = X.C000200d.A00(r7)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r0.A6n     // Catch:{ all -> 0x3520 }
            X.00H r62 = X.C000200d.A00(r0)     // Catch:{ all -> 0x3520 }
            X.3rU r0 = new X.3rU     // Catch:{ all -> 0x3520 }
            r35 = r0
            r37 = r6
            r41 = r17
            r42 = r3
            r43 = r4
            r48 = r5
            r52 = r9
            r56 = r1
            r57 = r10
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)     // Catch:{ all -> 0x3520 }
            r2.A23 = r0     // Catch:{ all -> 0x3520 }
            goto L_0x25d6
        L_0x2282:
            X.2XG r1 = r2.A1C     // Catch:{ all -> 0x3520 }
            X.1FY r53 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1Nf r0 = r2.A2x     // Catch:{ all -> 0x3520 }
            r43 = r0
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            r42 = r0
            X.C17960vV.A07(r42)     // Catch:{ all -> 0x3520 }
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            r41 = r0
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1F9 r54 = r0.getLifecycleOwner()     // Catch:{ all -> 0x3520 }
            X.1FD r55 = r0.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.24e r0 = r2.A0s     // Catch:{ all -> 0x3520 }
            r40 = r0
            android.content.Intent r3 = r2.A0B     // Catch:{ all -> 0x3520 }
            java.lang.String r38 = "extra_deep_link_session_id"
            r0 = r38
            java.lang.String r103 = r3.getStringExtra(r0)     // Catch:{ all -> 0x3520 }
            X.1pJ r0 = r2.A21     // Catch:{ all -> 0x3520 }
            r39 = r0
            X.1K2 r4 = r1.A00     // Catch:{ all -> 0x3520 }
            X.10E r1 = r4.A01     // Catch:{ all -> 0x3520 }
            X.11P r76 = X.AnonymousClass10E.A6O(r1)     // Catch:{ all -> 0x3520 }
            X.0ve r84 = X.AnonymousClass10E.A8r(r1)     // Catch:{ all -> 0x3520 }
            X.1KB r60 = X.AnonymousClass10E.A12(r1)     // Catch:{ all -> 0x3520 }
            X.11S r61 = X.AnonymousClass10E.A17(r1)     // Catch:{ all -> 0x3520 }
            X.10I r94 = X.AnonymousClass10E.AL1(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.ABf     // Catch:{ all -> 0x3520 }
            java.lang.Object r37 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r37
            X.1Mm r0 = (X.C25001Mm) r0     // Catch:{ all -> 0x3520 }
            r37 = r0
            X.1CJ r80 = X.AnonymousClass3Ma.A0d(r1)     // Catch:{ all -> 0x3520 }
            X.1KW r83 = X.AnonymousClass3Ma.A0f(r1)     // Catch:{ all -> 0x3520 }
            X.12L r85 = X.AnonymousClass3MZ.A0u(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.AAB     // Catch:{ all -> 0x3520 }
            java.lang.Object r36 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r36
            X.1Lc r0 = (X.C24641Lc) r0     // Catch:{ all -> 0x3520 }
            r36 = r0
            X.1VW r69 = X.AnonymousClass3MZ.A0e(r1)     // Catch:{ all -> 0x3520 }
            X.10G r3 = r1.A00     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A12     // Catch:{ all -> 0x3520 }
            java.lang.Object r35 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r35
            X.1xn r0 = (X.C42201xn) r0     // Catch:{ all -> 0x3520 }
            r35 = r0
            X.1PU r92 = X.AnonymousClass3MZ.A12(r1)     // Catch:{ all -> 0x3520 }
            X.1DC r93 = X.AnonymousClass3MZ.A13(r1)     // Catch:{ all -> 0x3520 }
            X.1Me r71 = X.AnonymousClass3MZ.A0g(r1)     // Catch:{ all -> 0x3520 }
            X.0vb r77 = X.AnonymousClass10E.A6Q(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.ABp     // Catch:{ all -> 0x3520 }
            java.lang.Object r14 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1PV r14 = (X.AnonymousClass1PV) r14     // Catch:{ all -> 0x3520 }
            X.1Lf r70 = X.AnonymousClass3Ma.A0S(r1)     // Catch:{ all -> 0x3520 }
            X.1Q1 r79 = X.AnonymousClass3MY.A0U(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A5H     // Catch:{ all -> 0x3520 }
            java.lang.Object r13 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1Va r13 = (X.C27171Va) r13     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A2F     // Catch:{ all -> 0x3520 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1mk r12 = (X.C35751mk) r12     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A12     // Catch:{ all -> 0x3520 }
            X.1Ha r56 = X.AnonymousClass3MZ.A0M(r0)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A04     // Catch:{ all -> 0x3520 }
            X.1Ha r57 = X.AnonymousClass3MZ.A0M(r0)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A1K     // Catch:{ all -> 0x3520 }
            java.lang.Object r11 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1tC r11 = (X.C39511tC) r11     // Catch:{ all -> 0x3520 }
            X.1Vc r72 = X.AnonymousClass3MZ.A0j(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.ABN     // Catch:{ all -> 0x3520 }
            X.00H r97 = X.C000200d.A00(r0)     // Catch:{ all -> 0x3520 }
            X.1Ng r86 = X.AnonymousClass3MY.A0Y(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A0E     // Catch:{ all -> 0x3520 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1l3 r10 = (X.C34771l3) r10     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A2Z     // Catch:{ all -> 0x3520 }
            X.00H r98 = X.C000200d.A00(r0)     // Catch:{ all -> 0x3520 }
            X.1K1 r0 = r4.A00     // Catch:{ all -> 0x3520 }
            X.00S r4 = r0.A0h     // Catch:{ all -> 0x3520 }
            X.00H r99 = X.C000200d.A00(r4)     // Catch:{ all -> 0x3520 }
            X.00S r4 = r3.A1K     // Catch:{ all -> 0x3520 }
            X.00H r100 = X.C000200d.A00(r4)     // Catch:{ all -> 0x3520 }
            X.3Kk r62 = X.AnonymousClass3MZ.A0T(r3)     // Catch:{ all -> 0x3520 }
            X.00S r3 = r3.A59     // Catch:{ all -> 0x3520 }
            java.lang.Object r9 = r3.get()     // Catch:{ all -> 0x3520 }
            X.1LT r9 = (X.AnonymousClass1LT) r9     // Catch:{ all -> 0x3520 }
            X.00S r3 = r1.A8r     // Catch:{ all -> 0x3520 }
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4aI r7 = (X.C88654aI) r7     // Catch:{ all -> 0x3520 }
            X.1MB r87 = X.AnonymousClass3Ma.A0k(r1)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r0.A13     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x3520 }
            X.2ri r6 = (X.C62632ri) r6     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A14     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1UD r5 = (X.AnonymousClass1UD) r5     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.ABq     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1gh r4 = (X.C32131gh) r4     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A18     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x3520 }
            X.2LL r3 = (X.AnonymousClass2LL) r3     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A0t     // Catch:{ all -> 0x3520 }
            X.00H r101 = X.C000200d.A00(r0)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r1.A0s     // Catch:{ all -> 0x3520 }
            X.00H r102 = X.C000200d.A00(r0)     // Catch:{ all -> 0x3520 }
            X.3rW r0 = new X.3rW     // Catch:{ all -> 0x3520 }
            r52 = r0
            r58 = r40
            r59 = r35
            r63 = r37
            r64 = r17
            r65 = r11
            r66 = r3
            r67 = r5
            r68 = r12
            r73 = r13
            r74 = r39
            r75 = r6
            r78 = r7
            r81 = r43
            r82 = r41
            r88 = r9
            r89 = r42
            r90 = r36
            r91 = r10
            r95 = r14
            r96 = r4
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103)     // Catch:{ all -> 0x3520 }
            r2.A23 = r0     // Catch:{ all -> 0x3520 }
            boolean r0 = A1y(r2)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x25d6
            X.2XB r1 = r2.A17     // Catch:{ all -> 0x3520 }
            X.1FY r50 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r63 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r84 = r0
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            r105 = r0
            X.1E7 r0 = r2.A35     // Catch:{ all -> 0x3520 }
            r95 = r0
            android.content.Intent r3 = r2.A0B     // Catch:{ all -> 0x3520 }
            r0 = r38
            java.lang.String r119 = r3.getStringExtra(r0)     // Catch:{ all -> 0x3520 }
            X.1pJ r0 = r2.A21     // Catch:{ all -> 0x3520 }
            r83 = r0
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.10E r3 = r1.A01     // Catch:{ all -> 0x3520 }
            X.0ve r98 = X.AnonymousClass10E.A8r(r3)     // Catch:{ all -> 0x3520 }
            X.1KB r64 = X.AnonymousClass10E.A12(r3)     // Catch:{ all -> 0x3520 }
            X.11S r66 = X.AnonymousClass10E.A17(r3)     // Catch:{ all -> 0x3520 }
            X.10I r112 = X.AnonymousClass10E.AL1(r3)     // Catch:{ all -> 0x3520 }
            X.1CJ r93 = X.AnonymousClass3Ma.A0d(r3)     // Catch:{ all -> 0x3520 }
            X.18K r100 = X.AnonymousClass3Ma.A0g(r3)     // Catch:{ all -> 0x3520 }
            X.18O r67 = X.AnonymousClass3MZ.A0S(r3)     // Catch:{ all -> 0x3520 }
            X.1iW r68 = X.AnonymousClass3MZ.A0U(r3)     // Catch:{ all -> 0x3520 }
            X.12L r99 = X.AnonymousClass3MZ.A0u(r3)     // Catch:{ all -> 0x3520 }
            X.1nl r65 = X.AnonymousClass3Ma.A0L(r3)     // Catch:{ all -> 0x3520 }
            X.00H r114 = X.AnonymousClass3MX.A0z(r3)     // Catch:{ all -> 0x3520 }
            X.1HS r75 = X.AnonymousClass3MZ.A0Z(r3)     // Catch:{ all -> 0x3520 }
            X.1DC r111 = X.AnonymousClass3MZ.A13(r3)     // Catch:{ all -> 0x3520 }
            X.11C r88 = X.AnonymousClass3Ma.A0a(r3)     // Catch:{ all -> 0x3520 }
            X.1Me r81 = X.AnonymousClass3MZ.A0g(r3)     // Catch:{ all -> 0x3520 }
            X.0vb r90 = X.AnonymousClass10E.A6Q(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A9w     // Catch:{ all -> 0x3520 }
            java.lang.Object r48 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r48
            X.9kp r0 = (X.C190369kp) r0     // Catch:{ all -> 0x3520 }
            r48 = r0
            X.10G r5 = r3.A00     // Catch:{ all -> 0x3520 }
            X.00S r0 = r5.A55     // Catch:{ all -> 0x3520 }
            java.lang.Object r47 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r47
            X.1pz r0 = (X.C37701pz) r0     // Catch:{ all -> 0x3520 }
            r47 = r0
            X.00S r0 = r3.A21     // Catch:{ all -> 0x3520 }
            java.lang.Object r46 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r46
            X.1MC r0 = (X.AnonymousClass1MC) r0     // Catch:{ all -> 0x3520 }
            r46 = r0
            X.1Lf r79 = X.AnonymousClass3Ma.A0S(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A0x     // Catch:{ all -> 0x3520 }
            java.lang.Object r45 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r45
            X.1pj r0 = (X.C37551pj) r0     // Catch:{ all -> 0x3520 }
            r45 = r0
            X.00S r0 = r3.A2D     // Catch:{ all -> 0x3520 }
            X.00H r115 = X.C000200d.A00(r0)     // Catch:{ all -> 0x3520 }
            X.1i1 r86 = X.AnonymousClass3Ma.A0U(r3)     // Catch:{ all -> 0x3520 }
            X.1Nb r109 = X.AnonymousClass3MZ.A11(r3)     // Catch:{ all -> 0x3520 }
            X.1K1 r4 = r1.A00     // Catch:{ all -> 0x3520 }
            X.4Op r108 = X.AnonymousClass1K1.A1R(r4)     // Catch:{ all -> 0x3520 }
            X.1Q1 r92 = X.AnonymousClass3MY.A0U(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r4.A4C     // Catch:{ all -> 0x3520 }
            java.lang.Object r44 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r44
            X.1o1 r0 = (X.C36511o1) r0     // Catch:{ all -> 0x3520 }
            r44 = r0
            X.1PM r80 = X.AnonymousClass3MZ.A0f(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.AA1     // Catch:{ all -> 0x3520 }
            java.lang.Object r43 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r43
            X.1xp r0 = (X.C42221xp) r0     // Catch:{ all -> 0x3520 }
            r43 = r0
            X.0z4 r89 = X.AnonymousClass3Ma.A0c(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A1I     // Catch:{ all -> 0x3520 }
            java.lang.Object r42 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r42
            X.9uX r0 = (X.C196149uX) r0     // Catch:{ all -> 0x3520 }
            r42 = r0
            X.1QO r107 = X.AnonymousClass3Ma.A0q(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A1J     // Catch:{ all -> 0x3520 }
            java.lang.Object r41 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r41
            X.1Ty r0 = (X.C26911Ty) r0     // Catch:{ all -> 0x3520 }
            r41 = r0
            X.00S r0 = r3.A2e     // Catch:{ all -> 0x3520 }
            java.lang.Object r40 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r40
            X.1M2 r0 = (X.AnonymousClass1M2) r0     // Catch:{ all -> 0x3520 }
            r40 = r0
            X.00S r0 = r3.AAt     // Catch:{ all -> 0x3520 }
            java.lang.Object r39 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r39
            X.2bu r0 = (X.C53052bu) r0     // Catch:{ all -> 0x3520 }
            r39 = r0
            X.1RK r96 = X.AnonymousClass3MZ.A0r(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r4.A1C     // Catch:{ all -> 0x3520 }
            java.lang.Object r38 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r38
            X.4Ii r0 = (X.C84164Ii) r0     // Catch:{ all -> 0x3520 }
            r38 = r0
            X.00S r0 = r4.A1D     // Catch:{ all -> 0x3520 }
            java.lang.Object r37 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r37
            X.2hH r0 = (X.C56322hH) r0     // Catch:{ all -> 0x3520 }
            r37 = r0
            X.00S r0 = r4.A2Y     // Catch:{ all -> 0x3520 }
            java.lang.Object r36 = r0.get()     // Catch:{ all -> 0x3520 }
            r0 = r36
            X.4PY r0 = (X.AnonymousClass4PY) r0     // Catch:{ all -> 0x3520 }
            r36 = r0
            X.00S r0 = r4.A2Z     // Catch:{ all -> 0x3520 }
            java.lang.Object r14 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4JI r14 = (X.AnonymousClass4JI) r14     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.ABR     // Catch:{ all -> 0x3520 }
            java.lang.Object r13 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1HR r13 = (X.AnonymousClass1HR) r13     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A3X     // Catch:{ all -> 0x3520 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x3520 }
            X.2dl r12 = (X.C54202dl) r12     // Catch:{ all -> 0x3520 }
            X.1Nf r94 = X.AnonymousClass3MZ.A0m(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A3R     // Catch:{ all -> 0x3520 }
            java.lang.Object r11 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1Pu r11 = (X.C25831Pu) r11     // Catch:{ all -> 0x3520 }
            X.1Ng r102 = X.AnonymousClass3MY.A0Y(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r5.A0b     // Catch:{ all -> 0x3520 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x3520 }
            X.2j8 r10 = (X.C57472j8) r10     // Catch:{ all -> 0x3520 }
            X.00S r0 = r5.A1K     // Catch:{ all -> 0x3520 }
            X.00H r116 = X.C000200d.A00(r0)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A1e     // Catch:{ all -> 0x3520 }
            X.00H r117 = X.C000200d.A00(r0)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r4.A1E     // Catch:{ all -> 0x3520 }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4Ij r9 = (X.C84174Ij) r9     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A8r     // Catch:{ all -> 0x3520 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x3520 }
            X.4aI r7 = (X.C88654aI) r7     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A7m     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x3520 }
            X.0zA r6 = (X.C19880zA) r6     // Catch:{ all -> 0x3520 }
            X.00S r0 = r3.A8t     // Catch:{ all -> 0x3520 }
            r120 = r0
            X.1MB r104 = X.AnonymousClass3Ma.A0k(r3)     // Catch:{ all -> 0x3520 }
            X.10E r0 = r4.AAQ     // Catch:{ all -> 0x3520 }
            X.0ve r0 = X.AnonymousClass10E.A8q(r0)     // Catch:{ all -> 0x3520 }
            X.4Lk r35 = new X.4Lk     // Catch:{ all -> 0x3520 }
            r1 = r35
            r1.<init>(r0)     // Catch:{ all -> 0x3520 }
            X.8ny r87 = X.AnonymousClass10E.A6B(r3)     // Catch:{ all -> 0x3520 }
            X.00S r0 = r4.A3o     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.1oh r0 = (X.C36931oh) r0     // Catch:{ all -> 0x3520 }
            X.00S r1 = r5.A33     // Catch:{ all -> 0x3520 }
            X.00H r118 = X.C000200d.A00(r1)     // Catch:{ all -> 0x3520 }
            X.3rZ r49 = new X.3rZ     // Catch:{ all -> 0x3520 }
            r54 = r51
            r55 = r51
            r56 = r51
            r57 = r51
            r52 = r51
            r53 = r6
            r58 = r38
            r59 = r37
            r60 = r9
            r61 = r36
            r62 = r14
            r69 = r17
            r70 = r42
            r71 = r41
            r72 = r45
            r73 = r0
            r74 = r39
            r76 = r13
            r77 = r46
            r78 = r40
            r82 = r10
            r85 = r12
            r91 = r7
            r97 = r43
            r101 = r35
            r103 = r44
            r106 = r47
            r110 = r11
            r113 = r48
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120)     // Catch:{ all -> 0x3520 }
            goto L_0x1e80
        L_0x25d6:
            r49 = 0
            goto L_0x1e80
        L_0x25da:
            r4 = r17
            goto L_0x1b68
        L_0x25de:
            r0 = r17
            goto L_0x1b5e
        L_0x25e2:
            r6 = r17
            if (r7 == 0) goto L_0x25e8
            goto L_0x1b40
        L_0x25e8:
            r5 = r17
            goto L_0x1b49
        L_0x25ec:
            X.1KB r6 = r13.A0N     // Catch:{ all -> 0x3520 }
            X.10I r5 = r13.A0q     // Catch:{ all -> 0x3520 }
            X.1OZ r4 = r13.A0i     // Catch:{ all -> 0x3520 }
            X.1Hc r1 = r13.A0R     // Catch:{ all -> 0x3520 }
            X.4pj r0 = new X.4pj     // Catch:{ all -> 0x3520 }
            r35 = r0
            r36 = r6
            r37 = r1
            r38 = r3
            r39 = r11
            r40 = r4
            r41 = r5
            r35.<init>(r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3520 }
            r0.A01(r14)     // Catch:{ all -> 0x3520 }
            java.util.List r4 = r13.A0s     // Catch:{ all -> 0x3520 }
            r3 = 16
            X.4rL r1 = new X.4rL     // Catch:{ all -> 0x3520 }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x3520 }
            r4.add(r1)     // Catch:{ all -> 0x3520 }
            goto L_0x1b97
        L_0x2618:
            r5 = 0
            goto L_0x1adf
        L_0x261b:
            if (r49 == 0) goto L_0x2628
            r1 = r0
            r0 = r49
            r1.add(r0)     // Catch:{ all -> 0x3520 }
            java.util.Set r1 = r2.A7q     // Catch:{ all -> 0x3520 }
            r1.add(r0)     // Catch:{ all -> 0x3520 }
        L_0x2628:
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z     // Catch:{ all -> 0x3520 }
            r0.requestFocus()     // Catch:{ all -> 0x3520 }
            X.4XJ r1 = new X.4XJ     // Catch:{ all -> 0x3520 }
            r0 = r121
            r1.<init>(r0, r2)     // Catch:{ all -> 0x3520 }
            r2.A2M = r1     // Catch:{ all -> 0x3520 }
            X.4Rn r0 = new X.4Rn     // Catch:{ all -> 0x3520 }
            r0.<init>(r1)     // Catch:{ all -> 0x3520 }
            r2.A2G = r0     // Catch:{ all -> 0x3520 }
            X.00H r3 = r2.A4q     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r3.get()     // Catch:{ all -> 0x3520 }
            X.5c0 r1 = (X.C108615c0) r1     // Catch:{ all -> 0x3520 }
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r2)     // Catch:{ all -> 0x3520 }
            r1.BdS(r0)     // Catch:{ all -> 0x3520 }
            A1G(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r3.get()     // Catch:{ all -> 0x3520 }
            X.5c0 r0 = (X.C108615c0) r0     // Catch:{ all -> 0x3520 }
            r0.CMd()     // Catch:{ all -> 0x3520 }
            r1 = 0
            java.lang.Object r0 = r3.get()     // Catch:{ all -> 0x3520 }
            X.5c0 r0 = (X.C108615c0) r0     // Catch:{ all -> 0x3520 }
            r0.CRP(r1)     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r3.get()     // Catch:{ all -> 0x3520 }
            X.5c0 r0 = (X.C108615c0) r0     // Catch:{ all -> 0x3520 }
            r0.BjQ()     // Catch:{ all -> 0x3520 }
            X.AQF r0 = r2.A3m     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r0, r8)     // Catch:{ all -> 0x3520 }
            r1 = r19
            java.util.List r1 = r1.A0U     // Catch:{ all -> 0x3520 }
            r1.add(r0)     // Catch:{ all -> 0x3520 }
            r20.A02()     // Catch:{ all -> 0x3520 }
            X.0ve r1 = r2.A3F     // Catch:{ all -> 0x3520 }
            r0 = 5532(0x159c, float:7.752E-42)
            r3 = r28
            boolean r0 = X.C18020vd.A05(r3, r1, r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x2697
            X.1FY r4 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.3Nu r3 = new X.3Nu     // Catch:{ all -> 0x3520 }
            r3.<init>(r2)     // Catch:{ all -> 0x3520 }
            r1 = 0
            X.CIZ r0 = new X.CIZ     // Catch:{ all -> 0x3520 }
            r0.<init>(r4, r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A0g = r0     // Catch:{ all -> 0x3520 }
        L_0x2697:
            java.lang.String r0 = "on_create_conversation_end"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 2131433505(0x7f0b1821, float:1.8488798E38)
            X.1bI r0 = X.C72453Mb.A0r(r1, r0)     // Catch:{ all -> 0x3520 }
            r2.A4T = r0     // Catch:{ all -> 0x3520 }
            X.0ve r1 = r2.A3F     // Catch:{ all -> 0x3520 }
            r0 = 9526(0x2536, float:1.3349E-41)
            r3 = r28
            boolean r0 = X.C18020vd.A05(r3, r1, r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x28dd
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x26cf
            android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x3520 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x26cf
            X.10I r3 = r2.A4c     // Catch:{ all -> 0x3520 }
            X.49i r1 = new X.49i     // Catch:{ all -> 0x3520 }
            r1.<init>((java.lang.Object) r2, (int) r15)     // Catch:{ all -> 0x3520 }
            java.lang.Void[] r0 = new java.lang.Void[r8]     // Catch:{ all -> 0x3520 }
            r3.CGM(r1, r0)     // Catch:{ all -> 0x3520 }
        L_0x26cf:
            r1 = 815(0x32f, float:1.142E-42)
            r0 = 818(0x332, float:1.146E-42)
            X.6dp r9 = new X.6dp     // Catch:{ all -> 0x3520 }
            r9.<init>(r1, r0)     // Catch:{ all -> 0x3520 }
            X.1FY r38 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1FY r36 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.0ve r63 = X.AnonymousClass3MX.A0h(r2)     // Catch:{ all -> 0x3520 }
            X.10I r81 = X.AnonymousClass3MX.A0w(r2)     // Catch:{ all -> 0x3520 }
            X.1KB r40 = X.AnonymousClass3MX.A0U(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1L4 r77 = r0.getImeUtils()     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.11S r42 = r0.getMeManager()     // Catch:{ all -> 0x3520 }
            X.190 r0 = r2.A0v     // Catch:{ all -> 0x3520 }
            r37 = r0
            X.1kd r0 = r2.A1R     // Catch:{ all -> 0x3520 }
            r43 = r0
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.17r r39 = r0.getFMessageIO()     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.18K r64 = r1.getWamRuntime()     // Catch:{ all -> 0x3520 }
            X.BDO r0 = r2.A1d     // Catch:{ all -> 0x3520 }
            r48 = r0
            X.1iW r44 = r1.getUserActions()     // Catch:{ all -> 0x3520 }
            X.00H r0 = r2.A51     // Catch:{ all -> 0x3520 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x3520 }
            X.2gI r0 = (X.C55742gI) r0     // Catch:{ all -> 0x3520 }
            X.A1M r0 = r0.A01     // Catch:{ all -> 0x3520 }
            r47 = r0
            X.00H r0 = r2.A5c     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x3520 }
            X.2kg r4 = (X.C58432kg) r4     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.11Z r62 = r0.getStorageUtils()     // Catch:{ all -> 0x3520 }
            X.689 r0 = r2.A3U     // Catch:{ all -> 0x3520 }
            r67 = r0
            X.4Ni r0 = r2.A1e     // Catch:{ all -> 0x3520 }
            r49 = r0
            X.1Sl r0 = r2.A4I     // Catch:{ all -> 0x3520 }
            r79 = r0
            X.1DC r0 = r2.A4L     // Catch:{ all -> 0x3520 }
            r80 = r0
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.11C r59 = r0.getSystemServices()     // Catch:{ all -> 0x3520 }
            X.00H r0 = r2.A4s     // Catch:{ all -> 0x3520 }
            X.1pj r50 = X.AnonymousClass3MW.A0V(r0)     // Catch:{ all -> 0x3520 }
            X.6pb r0 = r2.A3t     // Catch:{ all -> 0x3520 }
            r73 = r0
            X.1NM r0 = r2.A2e     // Catch:{ all -> 0x3520 }
            r58 = r0
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1dX r52 = r0.getContactAccessHelper()     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.17x r60 = r0.getWaPermissionsHelper()     // Catch:{ all -> 0x3520 }
            X.0z4 r61 = r0.getWaSharedPreferences()     // Catch:{ all -> 0x3520 }
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1L1 r0 = r0.A0F     // Catch:{ all -> 0x3520 }
            r74 = r0
            X.00H r0 = r2.A5b     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x3520 }
            X.6uJ r3 = (X.C136736uJ) r3     // Catch:{ all -> 0x3520 }
            X.4OV r0 = X.AnonymousClass3MY.A0T(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A03     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x3520 }
            X.9uX r1 = (X.C196149uX) r1     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1Ty r46 = r0.getBusinessProfileManager()     // Catch:{ all -> 0x3520 }
            X.1LD r76 = r0.getScreenLockStateProvider()     // Catch:{ all -> 0x3520 }
            X.0vc r0 = r2.A3x     // Catch:{ all -> 0x3520 }
            r75 = r0
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1f4 r56 = r0.getMessageAudioPlayerProvider()     // Catch:{ all -> 0x3520 }
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A0M     // Catch:{ all -> 0x3520 }
            r82 = r0
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r53 = r0
            X.1FY r0 = r53.CFa()     // Catch:{ all -> 0x3520 }
            X.4lx r5 = new X.4lx     // Catch:{ all -> 0x3520 }
            r5.<init>(r0)     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            r66 = r0
            boolean r0 = r2.A6g     // Catch:{ all -> 0x3520 }
            r86 = r0
            com.whatsapp.KeyboardPopupLayout r0 = r2.A1M     // Catch:{ all -> 0x3520 }
            r41 = r0
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z     // Catch:{ all -> 0x3520 }
            r20 = r0
            X.8FO r0 = r2.A3o     // Catch:{ all -> 0x3520 }
            r19 = r0
            com.whatsapp.community.ConversationCommunityViewModel r0 = r2.A1p     // Catch:{ all -> 0x3520 }
            r17 = r0
            X.9n9 r14 = r2.A3q     // Catch:{ all -> 0x3520 }
            X.4Op r13 = r2.A3n     // Catch:{ all -> 0x3520 }
            X.6bw r12 = r2.A3I     // Catch:{ all -> 0x3520 }
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r2)     // Catch:{ all -> 0x3520 }
            X.00H r11 = r0.A0B     // Catch:{ all -> 0x3520 }
            X.4Yq r10 = r2.A25     // Catch:{ all -> 0x3520 }
            X.00H r7 = r2.A5j     // Catch:{ all -> 0x3520 }
            X.00H r6 = r2.A4p     // Catch:{ all -> 0x3520 }
            X.5tO r0 = new X.5tO     // Catch:{ all -> 0x3520 }
            r35 = r0
            r45 = r1
            r51 = r17
            r54 = r9
            r55 = r10
            r57 = r5
            r65 = r12
            r68 = r4
            r69 = r20
            r70 = r13
            r71 = r19
            r72 = r14
            r78 = r3
            r83 = r11
            r84 = r7
            r85 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86)     // Catch:{ all -> 0x3520 }
            r2.A24 = r0     // Catch:{ all -> 0x3520 }
            r1 = r123
            r1.add(r0)     // Catch:{ all -> 0x3520 }
            X.5tO r1 = r2.A24     // Catch:{ all -> 0x3520 }
            r0 = r122
            r0.add(r1)     // Catch:{ all -> 0x3520 }
            java.util.Set r1 = r2.A8H     // Catch:{ all -> 0x3520 }
            X.5tO r0 = r2.A24     // Catch:{ all -> 0x3520 }
            r1.add(r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0 = 2131430178(0x7f0b0b22, float:1.848205E38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x288c
            X.0ve r3 = X.AnonymousClass3MX.A0h(r2)     // Catch:{ all -> 0x3520 }
            r1 = 1416(0x588, float:1.984E-42)
            r4 = r28
            boolean r1 = X.C18020vd.A05(r4, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x288c
            X.2XE r1 = r2.A1A     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r5 = r2.A3Z     // Catch:{ all -> 0x3520 }
            X.1BI r4 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.1K1 r3 = r1.A00     // Catch:{ all -> 0x3520 }
            android.app.Activity r3 = r3.AAO     // Catch:{ all -> 0x3520 }
            X.10E r6 = r1.A01     // Catch:{ all -> 0x3520 }
            X.1kd r38 = X.AnonymousClass3MZ.A0R(r6)     // Catch:{ all -> 0x3520 }
            X.1KB r37 = X.AnonymousClass10E.A12(r6)     // Catch:{ all -> 0x3520 }
            X.17x r41 = X.AnonymousClass3Ma.A0b(r6)     // Catch:{ all -> 0x3520 }
            X.00S r1 = r6.A68     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.1ka r1 = (X.C34501ka) r1     // Catch:{ all -> 0x3520 }
            X.1M9 r39 = X.AnonymousClass10E.A4z(r6)     // Catch:{ all -> 0x3520 }
            X.1Me r40 = X.AnonymousClass3MZ.A0g(r6)     // Catch:{ all -> 0x3520 }
            X.1KW r42 = X.AnonymousClass3Ma.A0f(r6)     // Catch:{ all -> 0x3520 }
            X.18K r43 = X.AnonymousClass3Ma.A0g(r6)     // Catch:{ all -> 0x3520 }
            X.DOe r11 = new X.DOe     // Catch:{ all -> 0x3520 }
            r35 = r11
            r36 = r3
            r44 = r4
            r45 = r1
            r46 = r5
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x3520 }
            X.2XA r1 = r2.A16     // Catch:{ all -> 0x3520 }
            X.1K2 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.1K1 r3 = r1.A00     // Catch:{ all -> 0x3520 }
            android.app.Activity r10 = r3.AAO     // Catch:{ all -> 0x3520 }
            X.10E r1 = r1.A01     // Catch:{ all -> 0x3520 }
            X.11P r12 = X.AnonymousClass10E.A6O(r1)     // Catch:{ all -> 0x3520 }
            X.18K r13 = X.AnonymousClass3Ma.A0g(r1)     // Catch:{ all -> 0x3520 }
            X.00S r1 = r1.A68     // Catch:{ all -> 0x3520 }
            java.lang.Object r14 = r1.get()     // Catch:{ all -> 0x3520 }
            X.1ka r14 = (X.C34501ka) r14     // Catch:{ all -> 0x3520 }
            X.D4n r9 = new X.D4n     // Catch:{ all -> 0x3520 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x3520 }
            r0.setOnDragListener(r9)     // Catch:{ all -> 0x3520 }
            r0 = r122
            r0.add(r11)     // Catch:{ all -> 0x3520 }
        L_0x288c:
            java.lang.String r0 = "lifecycle_callbacks_start"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            java.util.Iterator r5 = r123.iterator()     // Catch:{ all -> 0x3520 }
        L_0x2895:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x290b
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x3520 }
            X.5cG r4 = (X.C108765cG) r4     // Catch:{ all -> 0x3520 }
            boolean r0 = r4 instanceof X.C75433hU     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x28d3
            java.lang.String r3 = r4.BO6()     // Catch:{ all -> 0x3520 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r24)     // Catch:{ all -> 0x3520 }
            r1.append(r3)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x3520 }
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = r16
            r4.onActivityCreated(r0, r1)     // Catch:{ all -> 0x3520 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r24)     // Catch:{ all -> 0x3520 }
            r0.append(r3)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "_end"
            java.lang.String r0 = X.AnonymousClass000.A0y(r1, r0)     // Catch:{ all -> 0x3520 }
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            goto L_0x2895
        L_0x28d3:
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = r16
            r4.onActivityCreated(r0, r1)     // Catch:{ all -> 0x3520 }
            goto L_0x2895
        L_0x28dd:
            X.1R2 r1 = r2.A3s     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            int r3 = r1.A0H(r0)     // Catch:{ all -> 0x3520 }
            X.1bI r1 = r2.A4T     // Catch:{ all -> 0x3520 }
            X.4qm r0 = new X.4qm     // Catch:{ all -> 0x3520 }
            r0.<init>(r2, r3, r15)     // Catch:{ all -> 0x3520 }
            r1.A07(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z     // Catch:{ all -> 0x3520 }
            android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x3520 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x26cf
            boolean r0 = A2D(r2, r3)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x26cf
            A1M(r2, r3)     // Catch:{ all -> 0x3520 }
            X.1bI r0 = r2.A4T     // Catch:{ all -> 0x3520 }
            r0.A04(r8)     // Catch:{ all -> 0x3520 }
            goto L_0x26cf
        L_0x290b:
            java.lang.String r0 = "lifecycle_callbacks_end"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r2.A3R     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x292b
            X.0ve r0 = r2.A3F     // Catch:{ all -> 0x3520 }
            boolean r0 = X.AnonymousClass1J8.A03(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x292b
            X.0ve r1 = r2.A3F     // Catch:{ all -> 0x3520 }
            r0 = 12746(0x31ca, float:1.7861E-41)
            r3 = r28
            int r0 = X.C18020vd.A00(r3, r1, r0)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x292b
            A0Y(r2)     // Catch:{ all -> 0x3520 }
        L_0x292b:
            X.3Oz r5 = X.AnonymousClass3MX.A0c(r2)     // Catch:{ all -> 0x3520 }
            boolean r0 = X.AnonymousClass3MZ.A1W(r2)     // Catch:{ all -> 0x3520 }
            r4 = 0
            if (r0 != 0) goto L_0x2977
            boolean r0 = A1x(r2)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x2977
            android.content.res.Resources r1 = X.AnonymousClass3MW.A04(r2)     // Catch:{ all -> 0x3520 }
            r0 = 2131166307(0x7f070463, float:1.7946856E38)
            int r3 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x3520 }
            android.content.res.Resources r1 = X.AnonymousClass3MW.A04(r2)     // Catch:{ all -> 0x3520 }
            r0 = 2131166304(0x7f070460, float:1.794685E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x3520 }
            int r3 = r3 * 2
            int r3 = r3 + r0
            android.content.res.Resources r1 = X.AnonymousClass3MW.A04(r2)     // Catch:{ all -> 0x3520 }
            r0 = 2131167738(0x7f0709fa, float:1.7949758E38)
            int r3 = X.AnonymousClass3MX.A00(r1, r0, r3)     // Catch:{ all -> 0x3520 }
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics     // Catch:{ all -> 0x3520 }
            r1.<init>()     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            android.view.WindowManager r0 = r0.getWindowManager()     // Catch:{ all -> 0x3520 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x3520 }
            r0.getMetrics(r1)     // Catch:{ all -> 0x3520 }
            int r0 = r1.widthPixels     // Catch:{ all -> 0x3520 }
            if (r0 <= r3) goto L_0x2977
            r4 = 1
        L_0x2977:
            r5.A0D = r4     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 2131427549(0x7f0b00dd, float:1.8476717E38)
            X.1bI r1 = X.C72453Mb.A0r(r1, r0)     // Catch:{ all -> 0x3520 }
            r2.A4M = r1     // Catch:{ all -> 0x3520 }
            r0 = 32
            X.C98254qp.A00(r1, r2, r0)     // Catch:{ all -> 0x3520 }
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r6 = r1.A06(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x3520 }
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A0C()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2a54
            if (r6 == 0) goto L_0x2a54
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r5 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.B6z r1 = r2.A1Y     // Catch:{ all -> 0x3520 }
            X.9p3 r4 = r1.BGF(r6)     // Catch:{ all -> 0x3520 }
            X.2h2 r1 = r2.A2P     // Catch:{ all -> 0x3520 }
            X.2XP r3 = r1.A03     // Catch:{ all -> 0x3520 }
            X.4g4 r1 = new X.4g4     // Catch:{ all -> 0x3520 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x3520 }
            X.1It r3 = new X.1It     // Catch:{ all -> 0x3520 }
            r3.<init>(r1, r5)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.3T0> r1 = X.AnonymousClass3T0.class
            X.1J2 r1 = r3.A00(r1)     // Catch:{ all -> 0x3520 }
            X.3T0 r1 = (X.AnonymousClass3T0) r1     // Catch:{ all -> 0x3520 }
            r2.A1X = r1     // Catch:{ all -> 0x3520 }
            X.4OV r1 = X.AnonymousClass3MY.A0T(r2)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r1.A02     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4Ww r5 = (X.C87764Ww) r5     // Catch:{ all -> 0x3520 }
            X.1F9 r4 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r4, r8)     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.UserJid r1 = r5.A01     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2ac0
            java.lang.String r1 = "BusinessProfileHasShoppingFlowsObserver/trackHasShoppingFlowsChange: already tracking some business id"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x3520 }
        L_0x29df:
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.1GP r3 = r1.getSupportFragmentManager()     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "active_cart_fragment"
            androidx.fragment.app.Fragment r1 = r3.A0Q(r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2a0a
            X.4OV r3 = X.AnonymousClass3MY.A0T(r2)     // Catch:{ all -> 0x3520 }
            X.00H r3 = r3.A02     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x3520 }
            X.4Ww r4 = (X.C87764Ww) r4     // Catch:{ all -> 0x3520 }
            X.1Fw r3 = r1.A0L     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r8)     // Catch:{ all -> 0x3520 }
            r4.A02 = r15     // Catch:{ all -> 0x3520 }
            X.4fc r1 = new X.4fc     // Catch:{ all -> 0x3520 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x3520 }
            r3.A05(r1)     // Catch:{ all -> 0x3520 }
        L_0x2a0a:
            X.3T0 r1 = r2.A1X     // Catch:{ all -> 0x3520 }
            X.9p3 r1 = r1.A00     // Catch:{ all -> 0x3520 }
            X.1DS r4 = r1.A03     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 43
            X.C91594fw.A00(r3, r4, r2, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r4 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.2h2 r1 = r2.A2P     // Catch:{ all -> 0x3520 }
            X.B7A r3 = r1.A0C     // Catch:{ all -> 0x3520 }
            X.AHF r1 = new X.AHF     // Catch:{ all -> 0x3520 }
            r1.<init>(r3, r6)     // Catch:{ all -> 0x3520 }
            X.1It r3 = new X.1It     // Catch:{ all -> 0x3520 }
            r3.<init>(r1, r4)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.8F7> r1 = X.AnonymousClass8F7.class
            X.1J2 r1 = r3.A00(r1)     // Catch:{ all -> 0x3520 }
            X.8F7 r1 = (X.AnonymousClass8F7) r1     // Catch:{ all -> 0x3520 }
            r2.A1c = r1     // Catch:{ all -> 0x3520 }
            X.1DT r4 = r1.A00     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 44
            X.C91594fw.A00(r3, r4, r2, r1)     // Catch:{ all -> 0x3520 }
            X.3lJ r1 = new X.3lJ     // Catch:{ all -> 0x3520 }
            r1.<init>(r2)     // Catch:{ all -> 0x3520 }
            r2.A1b = r1     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A50     // Catch:{ all -> 0x3520 }
            X.10T r3 = X.C17880vN.A0V(r1)     // Catch:{ all -> 0x3520 }
            X.9Nc r1 = r2.A1b     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
        L_0x2a54:
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131434835(0x7f0b1d53, float:1.8491495E38)
            X.1bI r3 = X.C72453Mb.A0r(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A4W = r3     // Catch:{ all -> 0x3520 }
            r1 = 28
            X.C98254qp.A00(r3, r2, r1)     // Catch:{ all -> 0x3520 }
            A1j(r2, r15)     // Catch:{ all -> 0x3520 }
            X.1bI r4 = r2.A4W     // Catch:{ all -> 0x3520 }
            r3 = 31
            X.4dE r1 = new X.4dE     // Catch:{ all -> 0x3520 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x3520 }
            r4.A05(r1)     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131433122(0x7f0b16a2, float:1.848802E38)
            X.1bI r3 = X.C72453Mb.A0r(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A4X = r3     // Catch:{ all -> 0x3520 }
            r1 = 29
            X.C98254qp.A00(r3, r2, r1)     // Catch:{ all -> 0x3520 }
            X.1bI r4 = r2.A4X     // Catch:{ all -> 0x3520 }
            r3 = 32
            X.4dE r1 = new X.4dE     // Catch:{ all -> 0x3520 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x3520 }
            r4.A05(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationListView r1 = r2.A2B     // Catch:{ all -> 0x3520 }
            r1.setScrollbarFadingEnabled(r15)     // Catch:{ all -> 0x3520 }
            com.whatsapp.conversation.ConversationListView r3 = r2.A2B     // Catch:{ all -> 0x3520 }
            android.widget.AbsListView$OnScrollListener r1 = r2.A80     // Catch:{ all -> 0x3520 }
            r3.setOnScrollListener(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r1 = r2.A3Z     // Catch:{ all -> 0x3520 }
            r1.setScrollbarFadingEnabled(r15)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r3 = r2.A3Z     // Catch:{ all -> 0x3520 }
            android.text.TextWatcher r1 = r2.A7u     // Catch:{ all -> 0x3520 }
            r3.addTextChangedListener(r1)     // Catch:{ all -> 0x3520 }
            X.0vb r4 = r2.A2k     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r3 = r2.A3Z     // Catch:{ all -> 0x3520 }
            X.48C r1 = new X.48C     // Catch:{ all -> 0x3520 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x3520 }
            r2.A7N = r1     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r3 = r2.A3Z     // Catch:{ all -> 0x3520 }
            r3.addTextChangedListener(r1)     // Catch:{ all -> 0x3520 }
            boolean r1 = X.AnonymousClass3MZ.A1W(r2)     // Catch:{ all -> 0x3520 }
            goto L_0x2ad3
        L_0x2ac0:
            r5.A01 = r6     // Catch:{ all -> 0x3520 }
            X.1Fv r3 = r4.getLifecycle()     // Catch:{ all -> 0x3520 }
            X.4fd r1 = r5.A04     // Catch:{ all -> 0x3520 }
            r3.A05(r1)     // Catch:{ all -> 0x3520 }
            X.1Fv r1 = r4.getLifecycle()     // Catch:{ all -> 0x3520 }
            r5.A00 = r1     // Catch:{ all -> 0x3520 }
            goto L_0x29df
        L_0x2ad3:
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x2ade
            com.whatsapp.mentions.MentionableEntry r3 = r2.A3Z     // Catch:{ all -> 0x3520 }
            android.text.TextWatcher r1 = r2.A7t     // Catch:{ all -> 0x3520 }
            r3.addTextChangedListener(r1)     // Catch:{ all -> 0x3520 }
        L_0x2ade:
            com.whatsapp.mentions.MentionableEntry r3 = r2.A3Z     // Catch:{ all -> 0x3520 }
            android.widget.TextView$OnEditorActionListener r1 = r2.A81     // Catch:{ all -> 0x3520 }
            r3.setOnEditorActionListener(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r3 = r2.A3Z     // Catch:{ all -> 0x3520 }
            android.view.View$OnClickListener r1 = r2.A7y     // Catch:{ all -> 0x3520 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r4 = r2.A3Z     // Catch:{ all -> 0x3520 }
            r3 = 42
            X.4rn r1 = new X.4rn     // Catch:{ all -> 0x3520 }
            r1.<init>((java.lang.Object) r2, (int) r3)     // Catch:{ all -> 0x3520 }
            r4.setupEnterIsSend(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r1 = r2.A3Z     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = X.AnonymousClass3Ma.A12(r1)     // Catch:{ all -> 0x3520 }
            boolean r3 = X.AnonymousClass1EG.A0H(r1)     // Catch:{ all -> 0x3520 }
            r2.A6s = r3     // Catch:{ all -> 0x3520 }
            X.3V4 r1 = r2.A2Y     // Catch:{ all -> 0x3520 }
            r1.A0X(r3)     // Catch:{ all -> 0x3520 }
            X.3V0 r1 = r2.A2c     // Catch:{ all -> 0x3520 }
            r1.A0U(r3)     // Catch:{ all -> 0x3520 }
            if (r3 != 0) goto L_0x2b1e
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.19T r4 = r1.getQuickPerformanceLogger()     // Catch:{ all -> 0x3520 }
            java.lang.String r3 = "composer_has_text"
            r1 = 703926750(0x29f511de, float:1.0883285E-13)
            r4.markerAnnotate((int) r1, (java.lang.String) r3, (boolean) r15)     // Catch:{ all -> 0x3520 }
        L_0x2b1e:
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 3403(0xd4b, float:4.769E-42)
            r4 = r28
            boolean r1 = X.C18020vd.A05(r4, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2bb7
            boolean r1 = A26(r2)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2bb7
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 2131429529(0x7f0b0899, float:1.8480733E38)
            X.1bI r3 = X.C72453Mb.A0r(r3, r1)     // Catch:{ all -> 0x3520 }
            r2.A4P = r3     // Catch:{ all -> 0x3520 }
            X.4dE r1 = new X.4dE     // Catch:{ all -> 0x3520 }
            r4 = r26
            r1.<init>(r2, r4)     // Catch:{ all -> 0x3520 }
            r3.A05(r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5D     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4XX r4 = (X.AnonymousClass4XX) r4     // Catch:{ all -> 0x3520 }
            android.view.View r1 = r2.A0E     // Catch:{ all -> 0x3520 }
            X.1bI r3 = r2.A4P     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r1, r8)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r15)     // Catch:{ all -> 0x3520 }
            r4.A02 = r1     // Catch:{ all -> 0x3520 }
            r4.A04 = r3     // Catch:{ all -> 0x3520 }
            r1 = 41
            X.C98254qp.A00(r3, r4, r1)     // Catch:{ all -> 0x3520 }
            X.5ii r1 = r2.A46     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x2bab
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1FD r6 = r1.getViewModelStoreOwner()     // Catch:{ all -> 0x3520 }
            X.0ve r5 = r2.A3F     // Catch:{ all -> 0x3520 }
            X.0z4 r4 = r2.A2j     // Catch:{ all -> 0x3520 }
            X.2gp r1 = X.AnonymousClass3Ma.A0X(r2)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r1.A08     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.6hX r3 = (X.C129276hX) r3     // Catch:{ all -> 0x3520 }
            X.7AY r1 = new X.7AY     // Catch:{ all -> 0x3520 }
            r1.<init>(r4, r5, r3)     // Catch:{ all -> 0x3520 }
            X.1It r3 = new X.1It     // Catch:{ all -> 0x3520 }
            r3.<init>(r1, r6)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.5ii> r1 = X.C111185ii.class
            X.1J2 r3 = r3.A00(r1)     // Catch:{ all -> 0x3520 }
            X.5ii r3 = (X.C111185ii) r3     // Catch:{ all -> 0x3520 }
            r2.A46 = r3     // Catch:{ all -> 0x3520 }
            X.722 r1 = r2.A48     // Catch:{ all -> 0x3520 }
            r1.A01 = r3     // Catch:{ all -> 0x3520 }
            X.1KB r4 = X.AnonymousClass3MX.A0U(r2)     // Catch:{ all -> 0x3520 }
            X.5ii r3 = r2.A46     // Catch:{ all -> 0x3520 }
            X.6nN r1 = new X.6nN     // Catch:{ all -> 0x3520 }
            r1.<init>(r4, r3)     // Catch:{ all -> 0x3520 }
            r2.A47 = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            com.whatsapp.emoji.search.EmojiSearchProvider r3 = r1.getEmojiSearchProvider()     // Catch:{ all -> 0x3520 }
            r1 = 0
            r3.A01(r1)     // Catch:{ all -> 0x3520 }
        L_0x2bab:
            X.5ii r1 = r2.A46     // Catch:{ all -> 0x3520 }
            X.1DT r4 = r1.A02     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 3
            X.C91594fw.A00(r3, r4, r2, r1)     // Catch:{ all -> 0x3520 }
        L_0x2bb7:
            boolean r1 = A26(r2)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x2ce1
            java.lang.String r1 = "emojiPopup_start"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.6qD r9 = r2.A3J     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r1, r8)     // Catch:{ all -> 0x3520 }
            r9.A00 = r1     // Catch:{ all -> 0x3520 }
            com.whatsapp.KeyboardPopupLayout r11 = r2.A1M     // Catch:{ all -> 0x3520 }
            android.view.View r10 = r2.A0E     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r12 = r2.A3Z     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            java.lang.Integer r13 = X.A3P.A00(r1)     // Catch:{ all -> 0x3520 }
            r14 = 31
            r9.A01(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5J     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.6uD r1 = (X.C136686uD) r1     // Catch:{ all -> 0x3520 }
            X.6in r1 = r1.A00()     // Catch:{ all -> 0x3520 }
            r9.A02 = r1     // Catch:{ all -> 0x3520 }
            X.6qD r3 = r2.A3J     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5J     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.6uD r1 = (X.C136686uD) r1     // Catch:{ all -> 0x3520 }
            X.7Hs r1 = r1.A01()     // Catch:{ all -> 0x3520 }
            r3.A03 = r1     // Catch:{ all -> 0x3520 }
            X.6qD r3 = r2.A3J     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            r3.A05 = r1     // Catch:{ all -> 0x3520 }
            boolean r1 = X.C22971Dz.A0S(r1)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x2c69
            boolean r1 = X.AnonymousClass3MZ.A1W(r2)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2c1a
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 6110(0x17de, float:8.562E-42)
            r4 = r28
            boolean r1 = X.C18020vd.A05(r4, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2c69
        L_0x2c1a:
            X.6qD r10 = r2.A3J     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5J     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x3520 }
            X.6uD r4 = (X.C136686uD) r4     // Catch:{ all -> 0x3520 }
            X.5ii r3 = r2.A46     // Catch:{ all -> 0x3520 }
            X.722 r1 = r2.A48     // Catch:{ all -> 0x3520 }
            X.6q9 r1 = r4.A02(r3, r1)     // Catch:{ all -> 0x3520 }
            r10.A04 = r1     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5J     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.6uD r1 = (X.C136686uD) r1     // Catch:{ all -> 0x3520 }
            X.5ii r9 = r2.A46     // Catch:{ all -> 0x3520 }
            X.1SB r7 = r1.A01     // Catch:{ all -> 0x3520 }
            X.1Sw r6 = r1.A00     // Catch:{ all -> 0x3520 }
            X.00H r3 = r1.A04     // Catch:{ all -> 0x3520 }
            java.lang.Object r5 = X.C18070vi.A0E(r3)     // Catch:{ all -> 0x3520 }
            X.6uM r5 = (X.C136766uM) r5     // Catch:{ all -> 0x3520 }
            X.00H r3 = r1.A02     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = X.C18070vi.A0E(r3)     // Catch:{ all -> 0x3520 }
            X.6ka r4 = (X.C131146ka) r4     // Catch:{ all -> 0x3520 }
            X.00H r1 = r1.A03     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = X.C18070vi.A0E(r1)     // Catch:{ all -> 0x3520 }
            X.6pA r3 = (X.AnonymousClass6pA) r3     // Catch:{ all -> 0x3520 }
            X.6q3 r1 = new X.6q3     // Catch:{ all -> 0x3520 }
            r35 = r1
            r36 = r4
            r37 = r6
            r38 = r7
            r39 = r3
            r40 = r9
            r41 = r5
            r35.<init>(r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3520 }
            r10.A01 = r1     // Catch:{ all -> 0x3520 }
        L_0x2c69:
            X.6qD r1 = r2.A3J     // Catch:{ all -> 0x3520 }
            X.5z4 r3 = r1.A00()     // Catch:{ all -> 0x3520 }
            r2.A3K = r3     // Catch:{ all -> 0x3520 }
            X.4Wn r1 = r2.A4G     // Catch:{ all -> 0x3520 }
            r3.A0C = r1     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            android.widget.PopupWindow$OnDismissListener r1 = r1.getOnPopupWindowDismissListener()     // Catch:{ all -> 0x3520 }
            r3.setOnDismissListener(r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.18K r38 = r3.getWamRuntime()     // Catch:{ all -> 0x3520 }
            X.6zz r5 = r2.A3O     // Catch:{ all -> 0x3520 }
            r1 = 2131431135(0x7f0b0edf, float:1.848399E38)
            X.1bI r41 = X.C72453Mb.A0t(r3, r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r4 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.emoji.search.EmojiSearchContainer r4 = (com.whatsapp.emoji.search.EmojiSearchContainer) r4     // Catch:{ all -> 0x3520 }
            X.5z4 r3 = r2.A3K     // Catch:{ all -> 0x3520 }
            X.1FY r36 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.3xv r1 = new X.3xv     // Catch:{ all -> 0x3520 }
            r35 = r1
            r37 = r4
            r39 = r3
            r40 = r5
            r35.<init>((android.app.Activity) r36, (com.whatsapp.emoji.search.EmojiSearchContainer) r37, (X.AnonymousClass18K) r38, (X.C117015z4) r39, (X.C140126zz) r40, (X.C28931bI) r41)     // Catch:{ all -> 0x3520 }
            r2.A3L = r1     // Catch:{ all -> 0x3520 }
            X.7MX r5 = r2.A3v     // Catch:{ all -> 0x3520 }
            X.5cQ r4 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.5z4 r3 = r2.A3K     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            r5.A01(r3, r1, r4)     // Catch:{ all -> 0x3520 }
            X.5z4 r4 = r2.A3K     // Catch:{ all -> 0x3520 }
            X.5ai r1 = r2.A7e     // Catch:{ all -> 0x3520 }
            r4.A0J(r1)     // Catch:{ all -> 0x3520 }
            r3 = 13
            X.4rj r1 = new X.4rj     // Catch:{ all -> 0x3520 }
            r1.<init>((X.AnonymousClass4aY) r2, (int) r3)     // Catch:{ all -> 0x3520 }
            r4.A0E = r1     // Catch:{ all -> 0x3520 }
            X.7G6 r1 = new X.7G6     // Catch:{ all -> 0x3520 }
            r1.<init>(r2, r8)     // Catch:{ all -> 0x3520 }
            r4.A09 = r1     // Catch:{ all -> 0x3520 }
            X.88B r1 = r2.A7l     // Catch:{ all -> 0x3520 }
            r4.A0N(r1)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "emojiPopup_end"
            A1d(r2, r1)     // Catch:{ all -> 0x3520 }
            X.3xv r3 = r2.A3L     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r3.A00 = r1     // Catch:{ all -> 0x3520 }
            r3.A00 = r1     // Catch:{ all -> 0x3520 }
        L_0x2ce1:
            X.7MX r3 = r2.A3v     // Catch:{ all -> 0x3520 }
            X.4nN r1 = new X.4nN     // Catch:{ all -> 0x3520 }
            r1.<init>(r2)     // Catch:{ all -> 0x3520 }
            r3.A01 = r1     // Catch:{ all -> 0x3520 }
            X.88B r1 = r2.A7l     // Catch:{ all -> 0x3520 }
            r3.A04 = r1     // Catch:{ all -> 0x3520 }
            r1 = 32
            r2.A0M(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.mentions.MentionableEntry r3 = r2.A3Z     // Catch:{ all -> 0x3520 }
            float r5 = X.C72473Md.A00(r3)     // Catch:{ all -> 0x3520 }
            r1 = 1069547520(0x3fc00000, float:1.5)
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r1 = 6
            if (r4 >= 0) goto L_0x2d08
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r1 = 4
            if (r4 < 0) goto L_0x2d08
            r1 = 5
        L_0x2d08:
            r3.setMaxLines(r1)     // Catch:{ all -> 0x3520 }
            X.0ve r4 = r2.A3F     // Catch:{ all -> 0x3520 }
            r3 = 10202(0x27da, float:1.4296E-41)
            r1 = r32
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2e6e
            X.1VT r4 = r2.A4j     // Catch:{ all -> 0x3520 }
            X.1IV r3 = r2.A8G     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r4.observeUntilDestroy(r3, r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A6D     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x3520 }
            X.2LC r4 = (X.AnonymousClass2LC) r4     // Catch:{ all -> 0x3520 }
            X.6Uq r3 = r2.A8F     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r4.observeUntilDestroy(r3, r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5d     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x3520 }
            X.2Kv r4 = (X.C48012Kv) r4     // Catch:{ all -> 0x3520 }
            X.4WU r3 = r2.A86     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r4.observeUntilDestroy(r3, r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5N     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x3520 }
            X.1p5 r4 = (X.C37171p5) r4     // Catch:{ all -> 0x3520 }
            X.4LV r3 = r2.A87     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r4.observeUntilDestroy(r3, r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5n     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x3520 }
            X.2Kz r4 = (X.C48052Kz) r4     // Catch:{ all -> 0x3520 }
            X.9Nf r3 = r2.A8D     // Catch:{ all -> 0x3520 }
            X.1F9 r1 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r4.observeUntilDestroy(r3, r1)     // Catch:{ all -> 0x3520 }
        L_0x2d66:
            X.1HS r1 = r2.A1m     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A01()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2d72
            r1 = 0
            A0W(r1, r2)     // Catch:{ all -> 0x3520 }
        L_0x2d72:
            X.4OV r1 = X.AnonymousClass3MY.A0T(r2)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r1.A04     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.1tC r3 = (X.C39511tC) r3     // Catch:{ all -> 0x3520 }
            X.1M6 r1 = r2.A82     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            X.2gp r1 = X.AnonymousClass3Ma.A0X(r2)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r1.A04     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.2LK r3 = (X.AnonymousClass2LK) r3     // Catch:{ all -> 0x3520 }
            X.6qF r1 = r2.A8E     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            X.722 r1 = r2.A48     // Catch:{ all -> 0x3520 }
            X.2LK r3 = r1.A0B     // Catch:{ all -> 0x3520 }
            X.6qF r1 = r1.A09     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            X.2gp r1 = X.AnonymousClass3Ma.A0X(r2)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r1.A05     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.2LA r3 = (X.AnonymousClass2LA) r3     // Catch:{ all -> 0x3520 }
            X.4LW r1 = r2.A89     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5o     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.2L3 r3 = (X.AnonymousClass2L3) r3     // Catch:{ all -> 0x3520 }
            X.4WV r1 = r2.A88     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A61     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.2Kc r3 = (X.C47822Kc) r3     // Catch:{ all -> 0x3520 }
            X.4LO r1 = r2.A83     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r1 = r2.A4C     // Catch:{ all -> 0x3520 }
            X.1DT r4 = r1.A01     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 11
            X.C91594fw.A00(r3, r4, r2, r1)     // Catch:{ all -> 0x3520 }
            boolean r1 = X.C28361a1.A00()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2e24
            java.lang.String r1 = "conversation/device-not-supported"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment r1 = new com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment     // Catch:{ all -> 0x3520 }
            r1.<init>()     // Catch:{ all -> 0x3520 }
            r3.CMl(r1)     // Catch:{ all -> 0x3520 }
        L_0x2dea:
            X.3VQ r1 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.4PL r5 = r2.A29     // Catch:{ all -> 0x3520 }
            X.1FY r7 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.AEv r4 = r5.A06     // Catch:{ all -> 0x3520 }
            X.2Zw r3 = r1.A0d     // Catch:{ all -> 0x3520 }
            java.util.HashMap r6 = r3.A00     // Catch:{ all -> 0x3520 }
            X.1BI r3 = r1.A0u     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ all -> 0x3520 }
            X.206 r6 = (X.AnonymousClass206) r6     // Catch:{ all -> 0x3520 }
            if (r4 == 0) goto L_0x2eab
            X.2rc r6 = new X.2rc     // Catch:{ all -> 0x3520 }
            r6.<init>()     // Catch:{ all -> 0x3520 }
            java.io.File r3 = r5.A0D     // Catch:{ all -> 0x3520 }
            r6.A0G = r3     // Catch:{ all -> 0x3520 }
            X.4O1 r3 = new X.4O1     // Catch:{ all -> 0x3520 }
            r3.<init>(r6, r4, r5, r1)     // Catch:{ all -> 0x3520 }
            X.10I r4 = r1.A1C     // Catch:{ all -> 0x3520 }
            X.1Sl r5 = r1.A0z     // Catch:{ all -> 0x3520 }
            X.48w r1 = new X.48w     // Catch:{ all -> 0x3520 }
            r1.<init>(r7, r3, r5)     // Catch:{ all -> 0x3520 }
            java.io.File[] r3 = new java.io.File[r15]     // Catch:{ all -> 0x3520 }
            java.io.File r5 = r6.A0G     // Catch:{ all -> 0x3520 }
            r3[r8] = r5     // Catch:{ all -> 0x3520 }
            r4.CGD(r1, r3)     // Catch:{ all -> 0x3520 }
            goto L_0x2eec
        L_0x2e24:
            X.194 r1 = r2.A1P     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A02()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2e3d
            java.lang.String r1 = "conversation/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x3520 }
            X.1FY r4 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.17v r3 = r2.A3a     // Catch:{ all -> 0x3520 }
            X.1gx r1 = r2.A3d     // Catch:{ all -> 0x3520 }
            X.C88364Zk.A02(r4, r3, r1)     // Catch:{ all -> 0x3520 }
            goto L_0x2dea
        L_0x2e3d:
            X.194 r1 = r2.A1P     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A01()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2e56
            java.lang.String r1 = "conversation/software-expired"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x3520 }
            X.1FY r4 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.17v r3 = r2.A3a     // Catch:{ all -> 0x3520 }
            X.1gx r1 = r2.A3d     // Catch:{ all -> 0x3520 }
            X.C88364Zk.A03(r4, r3, r1)     // Catch:{ all -> 0x3520 }
            goto L_0x2dea
        L_0x2e56:
            X.1DM r1 = r2.A1S     // Catch:{ all -> 0x3520 }
            int r1 = r1.A00()     // Catch:{ all -> 0x3520 }
            if (r1 <= 0) goto L_0x2dea
            java.lang.String r1 = "conversation/software-about-to-expire"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 115(0x73, float:1.61E-43)
            X.AnonymousClass4Yv.A01(r3, r1)     // Catch:{ all -> 0x3520 }
            goto L_0x2dea
        L_0x2e6e:
            X.1VT r3 = r2.A4j     // Catch:{ all -> 0x3520 }
            X.1IV r1 = r2.A8G     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A6D     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.2LC r3 = (X.AnonymousClass2LC) r3     // Catch:{ all -> 0x3520 }
            X.6Uq r1 = r2.A8F     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5d     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.2Kv r3 = (X.C48012Kv) r3     // Catch:{ all -> 0x3520 }
            X.4WU r1 = r2.A86     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5N     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.1p5 r3 = (X.C37171p5) r3     // Catch:{ all -> 0x3520 }
            X.4LV r1 = r2.A87     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r2.A5n     // Catch:{ all -> 0x3520 }
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x3520 }
            X.2Kz r3 = (X.C48052Kz) r3     // Catch:{ all -> 0x3520 }
            X.9Nf r1 = r2.A8D     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            goto L_0x2d66
        L_0x2eab:
            if (r6 == 0) goto L_0x2ebe
            long r3 = r6.A0x     // Catch:{ all -> 0x3520 }
            X.1W6 r5 = r1.A0y     // Catch:{ all -> 0x31e1 }
            X.1W2 r5 = r5.A01     // Catch:{ all -> 0x31e1 }
            X.206 r3 = r5.A03(r3)     // Catch:{ all -> 0x31e1 }
            if (r3 == 0) goto L_0x2eba
            r6 = r3
        L_0x2eba:
            r1.A0b(r6)     // Catch:{ all -> 0x3520 }
            goto L_0x2eec
        L_0x2ebe:
            X.1EC r7 = r5.A0B     // Catch:{ all -> 0x3520 }
            if (r7 == 0) goto L_0x2ed9
            X.11P r3 = r1.A0i     // Catch:{ all -> 0x3520 }
            long r3 = X.AnonymousClass11P.A01(r3)     // Catch:{ all -> 0x3520 }
            java.lang.String r6 = r5.A0O     // Catch:{ all -> 0x3520 }
            java.lang.String r5 = r5.A0N     // Catch:{ all -> 0x3520 }
            X.23W r4 = X.C181589Rb.A00(r7, r6, r5, r3)     // Catch:{ all -> 0x3520 }
            java.lang.String r3 = ""
            r4.A0i(r3)     // Catch:{ all -> 0x3520 }
            r1.A0b(r4)     // Catch:{ all -> 0x3520 }
            goto L_0x2eec
        L_0x2ed9:
            java.lang.Long r3 = r5.A0E     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x2eec
            long r3 = r3.longValue()     // Catch:{ all -> 0x3520 }
            X.1W6 r5 = r1.A0y     // Catch:{ all -> 0x31e1 }
            X.1W2 r5 = r5.A01     // Catch:{ all -> 0x31e1 }
            X.206 r3 = r5.A03(r3)     // Catch:{ all -> 0x31e1 }
            r1.A0b(r3)     // Catch:{ all -> 0x3520 }
        L_0x2eec:
            if (r125 == 0) goto L_0x2efc
            java.lang.String r1 = "keyboard_visible"
            r3 = r16
            boolean r1 = r3.getBoolean(r1)     // Catch:{ all -> 0x3520 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x3520 }
            r2.A6J = r1     // Catch:{ all -> 0x3520 }
        L_0x2efc:
            X.1It r1 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            r3 = r29
            X.1J2 r1 = r1.A00(r3)     // Catch:{ all -> 0x3520 }
            X.8FO r1 = (X.AnonymousClass8FO) r1     // Catch:{ all -> 0x3520 }
            r2.A3o = r1     // Catch:{ all -> 0x3520 }
            X.3Oz r4 = X.AnonymousClass3MX.A0c(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.4NU r3 = r1.getFirstDrawMonitor()     // Catch:{ all -> 0x3520 }
            X.1HB r1 = r1.getInteractionPerfTracker()     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r1, r15)     // Catch:{ all -> 0x3520 }
            r4.A0A = r3     // Catch:{ all -> 0x3520 }
            r4.A09 = r1     // Catch:{ all -> 0x3520 }
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            android.os.Bundle r1 = r1.A05     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2fee
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x3520 }
            r2.A6J = r1     // Catch:{ all -> 0x3520 }
            android.content.Intent r1 = r2.A0B     // Catch:{ all -> 0x3520 }
            java.lang.String r3 = "new_group_result_bundle"
            android.os.Bundle r1 = r1.getBundleExtra(r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2f5b
            android.content.Intent r1 = r2.A0B     // Catch:{ all -> 0x3520 }
            android.os.Bundle r3 = r1.getBundleExtra(r3)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "invite_intent"
            boolean r1 = r3.containsKey(r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2f5b
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            android.os.Bundle r5 = r1.A05     // Catch:{ all -> 0x3520 }
            r4 = 53
            com.whatsapp.invites.PromptSendGroupInviteDialogFragment r3 = new com.whatsapp.invites.PromptSendGroupInviteDialogFragment     // Catch:{ all -> 0x3520 }
            r3.<init>()     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "invite_intent_code"
            r5.putInt(r1, r4)     // Catch:{ all -> 0x3520 }
            r3.A1R(r5)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1.CMl(r3)     // Catch:{ all -> 0x3520 }
        L_0x2f5b:
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            android.os.Bundle r1 = r1.A05     // Catch:{ all -> 0x3520 }
            r3 = r30
            boolean r1 = r1.containsKey(r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2f85
            boolean r1 = X.AnonymousClass112.A09()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2f74
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            android.content.Intent r3 = X.AnonymousClass4GL.A00(r1)     // Catch:{ all -> 0x3520 }
            goto L_0x2f7e
        L_0x2f74:
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            android.os.Bundle r1 = r1.A05     // Catch:{ all -> 0x3520 }
            android.os.Parcelable r3 = r1.getParcelable(r3)     // Catch:{ all -> 0x3520 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ all -> 0x3520 }
        L_0x2f7e:
            if (r3 == 0) goto L_0x2f85
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1.startActivity(r3)     // Catch:{ all -> 0x3520 }
        L_0x2f85:
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            android.os.Bundle r1 = r1.A05     // Catch:{ all -> 0x3520 }
            r3 = r31
            boolean r1 = r1.containsKey(r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2fac
            X.1FY r1 = X.AnonymousClass3MW.A0Q(r2)     // Catch:{ all -> 0x3520 }
            X.3Rj r3 = X.AnonymousClass4a6.A00(r1)     // Catch:{ all -> 0x3520 }
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            android.os.Bundle r1 = r1.A05     // Catch:{ all -> 0x3520 }
            r4 = r31
            java.lang.String r1 = r1.getString(r4)     // Catch:{ all -> 0x3520 }
            r3.A0S(r1)     // Catch:{ all -> 0x3520 }
            X.C73203Rj.A06(r3)     // Catch:{ all -> 0x3520 }
            r3.A0C()     // Catch:{ all -> 0x3520 }
        L_0x2fac:
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            android.os.Bundle r3 = r1.A05     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "messages_to_forward_bundle"
            android.os.Bundle r1 = r3.getBundle(r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x2fee
            java.util.ArrayList r13 = X.AnonymousClass4aU.A04(r1)     // Catch:{ all -> 0x3520 }
            if (r13 == 0) goto L_0x2fee
            boolean r1 = r13.isEmpty()     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x2fee
            X.10I r3 = r2.A4c     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x3520 }
            java.util.ArrayList r12 = X.C17880vN.A10(r1)     // Catch:{ all -> 0x3520 }
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            android.os.Bundle r4 = r1.A05     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "include_captions"
            boolean r14 = r4.getBoolean(r1, r8)     // Catch:{ all -> 0x3520 }
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            android.os.Bundle r4 = r1.A05     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "appended_message"
            java.lang.String r11 = r4.getString(r1)     // Catch:{ all -> 0x3520 }
            X.48r r1 = new X.48r     // Catch:{ all -> 0x3520 }
            r9 = r1
            r10 = r2
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x3520 }
            X.AnonymousClass3MW.A1T(r1, r3, r8)     // Catch:{ all -> 0x3520 }
        L_0x2fee:
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1xo r3 = r1.getSuspensionManager()     // Catch:{ all -> 0x3520 }
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            boolean r1 = r3.A02(r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x31a6
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            r3 = r23
            com.whatsapp.jid.Jid r5 = r1.A06(r3)     // Catch:{ all -> 0x3520 }
            X.1EC r5 = (X.AnonymousClass1EC) r5     // Catch:{ all -> 0x3520 }
            X.C17960vV.A07(r5)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1MZ r1 = r1.getGroupParticipantsManager()     // Catch:{ all -> 0x3520 }
            boolean r4 = r1.A0J(r5)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1MZ r1 = r1.getGroupParticipantsManager()     // Catch:{ all -> 0x3520 }
            boolean r3 = r1.A0K(r5)     // Catch:{ all -> 0x3520 }
            X.4nw r1 = new X.4nw     // Catch:{ all -> 0x3520 }
            r1.<init>(r2, r8)     // Catch:{ all -> 0x3520 }
            com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet r3 = X.C83824Gu.A00(r1, r5, r4, r3)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1.CMl(r3)     // Catch:{ all -> 0x3520 }
        L_0x302b:
            X.1BI r4 = r2.A3R     // Catch:{ all -> 0x3520 }
            if (r4 == 0) goto L_0x3054
            X.1CJ r3 = r2.A2w     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1M9 r1 = r1.getContactManager()     // Catch:{ all -> 0x3520 }
            int r3 = X.C43391zj.A00(r1, r3, r4)     // Catch:{ all -> 0x3520 }
            X.0vb r1 = r2.A2k     // Catch:{ all -> 0x3520 }
            java.lang.String r4 = X.C43391zj.A01(r1, r3)     // Catch:{ all -> 0x3520 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x3054
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.11C r1 = r1.getSystemServices()     // Catch:{ all -> 0x3520 }
            X.AnonymousClass1Y5.A00(r3, r1, r4)     // Catch:{ all -> 0x3520 }
        L_0x3054:
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.0z4 r1 = r1.getWaSharedPreferences()     // Catch:{ all -> 0x3520 }
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r1)     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "ptt_fast_playback_player_state"
            int r1 = r3.getInt(r1, r8)     // Catch:{ all -> 0x3520 }
            X.C145777Mo.A15 = r1     // Catch:{ all -> 0x3520 }
            X.12L r3 = r2.A3G     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            boolean r1 = X.C42761yh.A01(r3, r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x3099
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.0z4 r1 = r1.getWaSharedPreferences()     // Catch:{ all -> 0x3520 }
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r1)     // Catch:{ all -> 0x3520 }
            java.lang.String r4 = "wac_intro_shown"
            boolean r1 = r1.getBoolean(r4, r8)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x3099
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            com.whatsapp.WAChatIntroBottomSheet r1 = new com.whatsapp.WAChatIntroBottomSheet     // Catch:{ all -> 0x3520 }
            r1.<init>()     // Catch:{ all -> 0x3520 }
            r3.CMl(r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.0z4 r1 = r1.getWaSharedPreferences()     // Catch:{ all -> 0x3520 }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r1)     // Catch:{ all -> 0x3520 }
            X.C17880vN.A1F(r1, r4, r15)     // Catch:{ all -> 0x3520 }
        L_0x3099:
            X.00H r1 = r2.A5U     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4MU r1 = (X.AnonymousClass4MU) r1     // Catch:{ all -> 0x3520 }
            X.1MB r3 = r1.A01     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            boolean r1 = r3.A02(r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x30ef
            X.1kU r1 = r2.A3h     // Catch:{ all -> 0x3520 }
            java.lang.String r4 = "support_ai"
            r3 = 0
            X.1aA r1 = r1.A00     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A01(r3, r4)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x30ef
            X.00H r1 = r2.A5U     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4MU r1 = (X.AnonymousClass4MU) r1     // Catch:{ all -> 0x3520 }
            X.0zA r1 = r1.A00     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A07()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x30ef
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 9944(0x26d8, float:1.3935E-41)
            r4 = r28
            boolean r1 = X.C18020vd.A05(r4, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x30ef
            X.00H r1 = r2.A5U     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.4MU r1 = (X.AnonymousClass4MU) r1     // Catch:{ all -> 0x3520 }
            X.0zA r1 = r1.A00     // Catch:{ all -> 0x3520 }
            r1.A03()     // Catch:{ all -> 0x3520 }
            X.1FY r3 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r8)     // Catch:{ all -> 0x3520 }
            com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet r1 = X.C83844Gw.A00(r15, r8)     // Catch:{ all -> 0x3520 }
            r3.CMl(r1)     // Catch:{ all -> 0x3520 }
        L_0x30ef:
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r1.A0P     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x3114
            X.00H r1 = r2.A66     // Catch:{ all -> 0x3520 }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x3520 }
            X.9lF r4 = (X.C190619lF) r4     // Catch:{ all -> 0x3520 }
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r1.A0P     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r1, r8)     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r3, r15)     // Catch:{ all -> 0x3520 }
            org.json.JSONObject r1 = X.C17880vN.A16(r1)     // Catch:{ all -> 0x3520 }
            X.9tI r1 = X.C83854Gx.A00(r1)     // Catch:{ all -> 0x3520 }
            r4.A00(r3, r1, r15)     // Catch:{ all -> 0x3520 }
        L_0x3114:
            android.widget.LinearLayout r4 = r2.A0Z     // Catch:{ all -> 0x3520 }
            if (r4 == 0) goto L_0x3125
            boolean r1 = r2.A6c     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x3125
            r3 = 6
            X.4dj r1 = new X.4dj     // Catch:{ all -> 0x3520 }
            r1.<init>((X.AnonymousClass4aY) r2, (int) r3)     // Catch:{ all -> 0x3520 }
            r4.addOnLayoutChangeListener(r1)     // Catch:{ all -> 0x3520 }
        L_0x3125:
            A1D(r2)     // Catch:{ all -> 0x3520 }
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            java.lang.String r3 = r1.A0G     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x3171
            java.lang.String r1 = "CHAT"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x319b
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x3520 }
        L_0x3138:
            int r1 = r1.intValue()     // Catch:{ all -> 0x3520 }
            if (r1 == r15) goto L_0x317d
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.3Rj r6 = X.AnonymousClass4a6.A00(r1)     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r1)     // Catch:{ all -> 0x3520 }
            r1 = 2131624445(0x7f0e01fd, float:1.887607E38)
            android.view.View r1 = X.AnonymousClass3MY.A0D(r3, r1)     // Catch:{ all -> 0x3520 }
            r6.A0R(r1)     // Catch:{ all -> 0x3520 }
            r1 = 2131892061(0x7f12175d, float:1.941886E38)
            r6.A0D(r1)     // Catch:{ all -> 0x3520 }
            r5 = 2131899286(0x7f123396, float:1.9433514E38)
            X.1FY r4 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r3 = 5
            X.4fk r1 = new X.4fk     // Catch:{ all -> 0x3520 }
            r1.<init>(r3)     // Catch:{ all -> 0x3520 }
            r6.A0g(r4, r1, r5)     // Catch:{ all -> 0x3520 }
            r6.A0C()     // Catch:{ all -> 0x3520 }
        L_0x3171:
            boolean r1 = r2.A6X     // Catch:{ all -> 0x3520 }
            X.1FY r5 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r3 = r22
            X.C18070vi.A0d(r5, r3)     // Catch:{ all -> 0x3520 }
            goto L_0x31e3
        L_0x317d:
            X.00H r1 = r2.A5M     // Catch:{ all -> 0x3520 }
            X.17w r3 = X.AnonymousClass3MW.A0c(r1)     // Catch:{ all -> 0x3520 }
            java.lang.Class<X.17Y> r1 = X.AnonymousClass17Y.class
            r3.A01(r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r4 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1BI r3 = r2.A3R     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x3520 }
            r1 = 52
            X.C18070vi.A0d(r3, r8)     // Catch:{ all -> 0x3520 }
            com.whatsapp.calling.capi.view.CapiCallingConfirmationBottomSheetDialogFragment r1 = X.AnonymousClass4Fv.A00(r3, r1)     // Catch:{ all -> 0x3520 }
            r4.CMl(r1)     // Catch:{ all -> 0x3520 }
            goto L_0x3171
        L_0x319b:
            java.lang.String r1 = "CALL"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x31db
            java.lang.Integer r1 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x3520 }
            goto L_0x3138
        L_0x31a6:
            X.1BI r3 = r2.A3R     // Catch:{ all -> 0x3520 }
            boolean r1 = X.C22971Dz.A0W(r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x302b
            X.1CJ r1 = r2.A2w     // Catch:{ all -> 0x3520 }
            X.1ci r1 = r1.A0A(r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x302b
            X.1Mc r3 = r2.A49     // Catch:{ all -> 0x3520 }
            X.1BI r1 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r1, r8)     // Catch:{ all -> 0x3520 }
            int r3 = X.C24901Mc.A00(r1, r3)     // Catch:{ all -> 0x3520 }
            r1 = -3
            if (r3 != r1) goto L_0x302b
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 11627(0x2d6b, float:1.6293E-41)
            r4 = r28
            boolean r1 = X.C18020vd.A05(r4, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x302b
            X.10I r3 = X.AnonymousClass3MX.A0w(r2)     // Catch:{ all -> 0x3520 }
            r1 = 43
            X.C98834rn.A00(r3, r2, r1)     // Catch:{ all -> 0x3520 }
            goto L_0x302b
        L_0x31db:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r3)     // Catch:{ all -> 0x3520 }
            goto L_0x1153
        L_0x31e1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x3520 }
        L_0x31e3:
            if (r1 != 0) goto L_0x3209
            java.lang.String r1 = "show_expired_newsletter_message_dialog"
            r3 = r18
            boolean r1 = r3.getBooleanExtra(r1, r8)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x31f6
            r4 = 2131897371(0x7f122c1b, float:1.942963E38)
            r3 = 2131897370(0x7f122c1a, float:1.9429628E38)
            goto L_0x3204
        L_0x31f6:
            java.lang.String r1 = "show_revoked_newsletter_message_dialog"
            boolean r1 = r3.getBooleanExtra(r1, r8)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x3209
            r4 = 2131897375(0x7f122c1f, float:1.9429638E38)
            r3 = 2131897374(0x7f122c1e, float:1.9429636E38)
        L_0x3204:
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x3520 }
            r5.BhU(r1, r4, r3)     // Catch:{ all -> 0x3520 }
        L_0x3209:
            boolean r1 = r2.A6X     // Catch:{ all -> 0x3520 }
            X.1GP r5 = X.AnonymousClass3MW.A0K(r2)     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x322f
            java.lang.String r1 = "show_event_message_on_create_bundle"
            r3 = r18
            android.os.Bundle r3 = r3.getBundleExtra(r1)     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x322f
            java.lang.String r1 = ""
            X.205 r6 = X.AnonymousClass4aU.A03(r3, r1)     // Catch:{ all -> 0x3520 }
            if (r6 == 0) goto L_0x322f
            X.10I r4 = r2.A4c     // Catch:{ all -> 0x3520 }
            r3 = 29
            X.4rb r1 = new X.4rb     // Catch:{ all -> 0x3520 }
            r1.<init>(r2, r6, r5, r3)     // Catch:{ all -> 0x3520 }
            r4.CGN(r1)     // Catch:{ all -> 0x3520 }
        L_0x322f:
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A0E()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x32a2
            X.0ve r1 = r2.A3F     // Catch:{ all -> 0x3520 }
            boolean r1 = X.C84104Hw.A00(r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x325a
            X.2hA r1 = X.AnonymousClass3MZ.A0k(r2)     // Catch:{ all -> 0x3520 }
            X.00H r1 = r1.A0O     // Catch:{ all -> 0x3520 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x3520 }
            X.72A r1 = (X.AnonymousClass72A) r1     // Catch:{ all -> 0x3520 }
            java.lang.String r3 = r1.A01()     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = "yes"
            boolean r1 = X.C18070vi.A18(r3, r1)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x325a
        L_0x3257:
            A10(r2)     // Catch:{ all -> 0x3520 }
        L_0x325a:
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.Jid r4 = r1.A06(r0)     // Catch:{ all -> 0x3520 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x3520 }
            X.1E7 r3 = r2.A35     // Catch:{ all -> 0x3520 }
            r1 = 0
            X.2tn r0 = new X.2tn     // Catch:{ all -> 0x3520 }
            r0.<init>((X.C25491Ok) r1, (X.AnonymousClass1E7) r3, (com.whatsapp.jid.UserJid) r4)     // Catch:{ all -> 0x3520 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x328b
            X.1UD r0 = X.C72473Md.A0R(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r4 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r0, r8)     // Catch:{ all -> 0x3520 }
            X.0ve r3 = r0.A00     // Catch:{ all -> 0x3520 }
            r1 = 6358(0x18d6, float:8.91E-42)
            r0 = r32
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x328b
            X.C42701yb.A01(r4)     // Catch:{ all -> 0x3520 }
            r2.A0K()     // Catch:{ all -> 0x3520 }
        L_0x328b:
            boolean r0 = A1y(r2)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x335a
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A0B     // Catch:{ all -> 0x3520 }
            r0.get()     // Catch:{ all -> 0x3520 }
            int r1 = r2.A01     // Catch:{ all -> 0x3520 }
            r0 = 20
            if (r1 == r0) goto L_0x3379
            goto L_0x3355
        L_0x32a2:
            boolean r1 = A1y(r2)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x3339
            X.1UD r1 = X.C72473Md.A0R(r2)     // Catch:{ all -> 0x3520 }
            X.1BI r4 = r2.A3R     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r1, r8)     // Catch:{ all -> 0x3520 }
            X.0ve r5 = r1.A00     // Catch:{ all -> 0x3520 }
            r3 = 6358(0x18d6, float:8.91E-42)
            r1 = r32
            boolean r1 = X.C18020vd.A05(r1, r5, r3)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x32c7
            boolean r1 = X.C42701yb.A01(r4)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x32c7
            r2.A0K()     // Catch:{ all -> 0x3520 }
            goto L_0x325a
        L_0x32c7:
            boolean r1 = r2.A1v()     // Catch:{ all -> 0x3520 }
            if (r1 != 0) goto L_0x328b
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r1 = 2131430331(0x7f0b0bbb, float:1.848236E38)
            android.view.View r10 = r3.findViewById(r1)     // Catch:{ all -> 0x3520 }
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch:{ all -> 0x3520 }
            if (r10 == 0) goto L_0x325a
            X.1It r3 = X.C72463Mc.A0U(r2)     // Catch:{ all -> 0x3520 }
            java.lang.Class<com.whatsapp.bot.prompts.BonsaiPromptsViewModel> r1 = com.whatsapp.bot.prompts.BonsaiPromptsViewModel.class
            X.1J2 r6 = r3.A00(r1)     // Catch:{ all -> 0x3520 }
            com.whatsapp.bot.prompts.BonsaiPromptsViewModel r6 = (com.whatsapp.bot.prompts.BonsaiPromptsViewModel) r6     // Catch:{ all -> 0x3520 }
            r2.A1i = r6     // Catch:{ all -> 0x3520 }
            X.1BI r5 = r2.A3R     // Catch:{ all -> 0x3520 }
            r6.A00 = r5     // Catch:{ all -> 0x3520 }
            boolean r1 = X.C22971Dz.A0d(r5)     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x3305
            X.1Lg r3 = r6.A03     // Catch:{ all -> 0x3520 }
            X.4mL r1 = r6.A01     // Catch:{ all -> 0x3520 }
            r3.registerObserver(r1)     // Catch:{ all -> 0x3520 }
            X.10I r4 = r6.A06     // Catch:{ all -> 0x3520 }
            r3 = 31
            X.AkI r1 = new X.AkI     // Catch:{ all -> 0x3520 }
            r1.<init>(r6, r5, r3)     // Catch:{ all -> 0x3520 }
            r4.CGN(r1)     // Catch:{ all -> 0x3520 }
        L_0x3305:
            X.3UN r1 = r2.A4A     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x3314
            X.1vp r4 = r1.A05     // Catch:{ all -> 0x3520 }
            X.1F9 r3 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r1 = 40
            X.C91594fw.A00(r3, r4, r2, r1)     // Catch:{ all -> 0x3520 }
        L_0x3314:
            X.1Ps r13 = X.C72483Me.A0S(r2)     // Catch:{ all -> 0x3520 }
            com.whatsapp.bot.prompts.BonsaiPromptsViewModel r1 = r2.A1i     // Catch:{ all -> 0x3520 }
            X.1vp r1 = r1.A05     // Catch:{ all -> 0x3520 }
            X.5cQ r3 = r2.A2Q     // Catch:{ all -> 0x3520 }
            X.1F9 r11 = r3.getLifecycleOwner()     // Catch:{ all -> 0x3520 }
            X.1FY r12 = r3.CFa()     // Catch:{ all -> 0x3520 }
            X.0vb r14 = r2.A2k     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0d(r1, r8)     // Catch:{ all -> 0x3520 }
            r3 = 3
            X.C72473Md.A1M(r11, r12, r14, r3)     // Catch:{ all -> 0x3520 }
            X.4fs r9 = new X.4fs     // Catch:{ all -> 0x3520 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x3520 }
            r1.A0A(r11, r9)     // Catch:{ all -> 0x3520 }
            goto L_0x325a
        L_0x3339:
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            boolean r1 = r1.A0C()     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x325a
            X.1E7 r1 = r2.A35     // Catch:{ all -> 0x3520 }
            X.1BI r3 = r1.A0J     // Catch:{ all -> 0x3520 }
            r1 = r21
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x3520 }
            X.4Ox r1 = (X.C85834Ox) r1     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x3257
            boolean r1 = r1.A04     // Catch:{ all -> 0x3520 }
            if (r1 == 0) goto L_0x3257
            goto L_0x325a
        L_0x3355:
            r0 = 26
            if (r1 != r0) goto L_0x338b
            goto L_0x3379
        L_0x335a:
            int r1 = r2.A01     // Catch:{ all -> 0x3520 }
            r0 = 37
            if (r1 == r0) goto L_0x3364
            switch(r1) {
                case 29: goto L_0x3364;
                case 30: goto L_0x3364;
                case 31: goto L_0x3364;
                case 32: goto L_0x3364;
                case 33: goto L_0x3364;
                case 34: goto L_0x3364;
                default: goto L_0x3363;
            }     // Catch:{ all -> 0x3520 }
        L_0x3363:
            goto L_0x338b
        L_0x3364:
            com.whatsapp.KeyboardPopupLayout r4 = r2.A1M     // Catch:{ all -> 0x3520 }
            r0 = 47
            X.4rn r3 = new X.4rn     // Catch:{ all -> 0x3520 }
            r3.<init>((java.lang.Object) r2, (int) r0)     // Catch:{ all -> 0x3520 }
            r1 = 1137180672(0x43c80000, float:400.0)
            float r0 = A00(r2)     // Catch:{ all -> 0x3520 }
            float r0 = r0 * r1
            long r0 = (long) r0     // Catch:{ all -> 0x3520 }
            r4.postDelayed(r3, r0)     // Catch:{ all -> 0x3520 }
            goto L_0x338b
        L_0x3379:
            X.3VQ r0 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1DT r3 = r0.A0S     // Catch:{ all -> 0x3520 }
            r0 = 16
            X.4fm r1 = new X.4fm     // Catch:{ all -> 0x3520 }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x3520 }
            X.1F9 r0 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r3.A0A(r0, r1)     // Catch:{ all -> 0x3520 }
        L_0x338b:
            X.3VQ r0 = r2.A2b     // Catch:{ all -> 0x3520 }
            X.1DT r3 = r0.A0T     // Catch:{ all -> 0x3520 }
            r0 = 17
            X.4fm r1 = new X.4fm     // Catch:{ all -> 0x3520 }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x3520 }
            X.1F9 r0 = X.AnonymousClass3MX.A0P(r2)     // Catch:{ all -> 0x3520 }
            r3.A0A(r0, r1)     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            r0 = 2131434239(0x7f0b1aff, float:1.8490286E38)
            X.1bI r0 = X.C72453Mb.A0r(r1, r0)     // Catch:{ all -> 0x3520 }
            r2.A7P = r0     // Catch:{ all -> 0x3520 }
            X.0ve r3 = r2.A3F     // Catch:{ all -> 0x3520 }
            r1 = 8505(0x2139, float:1.1918E-41)
            r0 = r28
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x33bd
            X.0ve r1 = r2.A3F     // Catch:{ all -> 0x3520 }
            r0 = 7466(0x1d2a, float:1.0462E-41)
            r1.A0N(r0)     // Catch:{ all -> 0x3520 }
        L_0x33bd:
            X.00H r0 = r2.A4u     // Catch:{ all -> 0x3520 }
            r0.get()     // Catch:{ all -> 0x3520 }
            X.5cQ r1 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0 = 2131436678(0x7f0b2486, float:1.8495233E38)
            android.view.View r3 = r1.findViewById(r0)     // Catch:{ all -> 0x3520 }
            android.view.ViewStub r3 = (android.view.ViewStub) r3     // Catch:{ all -> 0x3520 }
            if (r3 == 0) goto L_0x33ec
            X.0ve r1 = r2.A3F     // Catch:{ all -> 0x3520 }
            boolean r0 = r2.A6n     // Catch:{ all -> 0x3520 }
            boolean r0 = X.C40811vJ.A0c(r1, r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x33ec
            X.1bI r3 = X.AnonymousClass3MW.A0p(r3)     // Catch:{ all -> 0x3520 }
            r2.A4Z = r3     // Catch:{ all -> 0x3520 }
            X.4dE r1 = new X.4dE     // Catch:{ all -> 0x3520 }
            r0 = r27
            r1.<init>(r2, r0)     // Catch:{ all -> 0x3520 }
            r3.A05(r1)     // Catch:{ all -> 0x3520 }
            A15(r2)     // Catch:{ all -> 0x3520 }
        L_0x33ec:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x3520 }
            X.4PL r1 = r2.A29     // Catch:{ all -> 0x3520 }
            boolean r0 = r1.A0c     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x346e
            java.lang.String r0 = r1.A0U     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x346e
            X.0ve r0 = r2.A3F     // Catch:{ all -> 0x3520 }
            boolean r0 = X.C40811vJ.A0P(r0)     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x346e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x3520 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r27)     // Catch:{ all -> 0x3520 }
            X.4PL r0 = r2.A29     // Catch:{ all -> 0x3520 }
            int r1 = r0.A03     // Catch:{ all -> 0x3520 }
            r0 = 7
            if (r1 != r0) goto L_0x3465
            java.lang.Integer r7 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x3520 }
        L_0x3415:
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r2)     // Catch:{ all -> 0x3520 }
            X.00H r0 = r0.A0B     // Catch:{ all -> 0x3520 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x3520 }
            X.9sP r6 = (X.C194859sP) r6     // Catch:{ all -> 0x3520 }
            r5 = 0
            X.00H r3 = r6.A02     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = X.C17890vO.A0Q()     // Catch:{ all -> 0x3520 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x3520 }
            X.9rU r0 = new X.9rU     // Catch:{ all -> 0x3520 }
            r0.<init>(r3, r1, r5)     // Catch:{ all -> 0x3520 }
            r6.A00 = r0     // Catch:{ all -> 0x3520 }
            int r1 = r7.intValue()     // Catch:{ all -> 0x3520 }
            if (r1 == r15) goto L_0x3443
            boolean r0 = r2.A6n     // Catch:{ all -> 0x3520 }
            if (r0 == 0) goto L_0x3463
            java.lang.Integer r0 = X.C72483Me.A0V(r2)     // Catch:{ all -> 0x3520 }
        L_0x3440:
            r6.A02(r4, r0, r1)     // Catch:{ all -> 0x3520 }
        L_0x3443:
            int r1 = r2.A79     // Catch:{ all -> 0x3520 }
            if (r1 != r15) goto L_0x3455
            android.widget.ImageButton r3 = r2.A0X     // Catch:{ all -> 0x3520 }
            r0 = 44
            X.4rn r1 = new X.4rn     // Catch:{ all -> 0x3520 }
            r1.<init>((java.lang.Object) r2, (int) r0)     // Catch:{ all -> 0x3520 }
        L_0x3450:
            r3.post(r1)     // Catch:{ all -> 0x3520 }
            goto L_0x3517
        L_0x3455:
            r0 = r22
            if (r1 != r0) goto L_0x3517
            com.whatsapp.KeyboardPopupLayout r3 = r2.A1M     // Catch:{ all -> 0x3520 }
            r0 = 45
            X.4rn r1 = new X.4rn     // Catch:{ all -> 0x3520 }
            r1.<init>((java.lang.Object) r2, (int) r0)     // Catch:{ all -> 0x3520 }
            goto L_0x3450
        L_0x3463:
            r0 = 0
            goto L_0x3440
        L_0x3465:
            r0 = 8
            if (r1 != r0) goto L_0x3415
            java.lang.Integer r7 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x3520 }
            goto L_0x3415
        L_0x346e:
            r4 = 0
            goto L_0x3415
        L_0x3470:
            java.lang.String r0 = "fail_tell_a_friend"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.1FY r1 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            X.4PL r0 = r2.A29     // Catch:{ all -> 0x3520 }
            java.lang.String r6 = r0.A0R     // Catch:{ all -> 0x3520 }
            android.net.Uri r5 = r0.A04     // Catch:{ all -> 0x3520 }
            android.content.Intent r4 = X.C17880vN.A0A()     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "com.whatsapp.conversationslist.SmsDefaultAppWarning"
            r4.setClassName(r1, r0)     // Catch:{ all -> 0x3520 }
            r4.setData(r5)     // Catch:{ all -> 0x3520 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x349a
            java.lang.String r0 = "sms_body"
            r4.putExtra(r0, r6)     // Catch:{ all -> 0x3520 }
        L_0x349a:
            X.4PL r0 = r2.A29     // Catch:{ all -> 0x3520 }
            java.lang.String r1 = r0.A0R     // Catch:{ all -> 0x3520 }
            android.net.Uri r0 = r0.A04     // Catch:{ all -> 0x3520 }
            r4.setData(r0)     // Catch:{ all -> 0x3520 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x3520 }
            if (r0 != 0) goto L_0x34ae
            java.lang.String r0 = "sms_body"
            r4.putExtra(r0, r1)     // Catch:{ all -> 0x3520 }
        L_0x34ae:
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.startActivity(r4)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.finish()     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.Biu(r3)     // Catch:{ all -> 0x3520 }
            goto L_0x3517
        L_0x34be:
            java.lang.String r0 = "fail_display_name"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.1hl r1 = r2.A2E     // Catch:{ all -> 0x3520 }
            X.4PL r0 = r2.A29     // Catch:{ all -> 0x3520 }
            X.1BI r0 = r0.A0A     // Catch:{ all -> 0x3520 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x3520 }
            r11 = r15
            r12 = r5
            r6 = r1
            r7 = r0
            r8 = r5
            r9 = r3
            r10 = r15
            r6.A00(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.finish()     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.Biu(r3)     // Catch:{ all -> 0x3520 }
            goto L_0x3517
        L_0x34e1:
            java.lang.String r0 = "fail"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.finish()     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.Biu(r3)     // Catch:{ all -> 0x3520 }
            goto L_0x3517
        L_0x34f1:
            java.lang.String r0 = "conversation/create/no-me-or-msgstore-db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x3520 }
            java.lang.String r0 = "no_msg_store"
            A1d(r2, r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.getGlobalUI()     // Catch:{ all -> 0x3520 }
            X.1FY r0 = X.AnonymousClass3MW.A0P(r2)     // Catch:{ all -> 0x3520 }
            android.content.Intent r1 = X.AnonymousClass1LU.A0A(r0)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.startActivity(r1)     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.finish()     // Catch:{ all -> 0x3520 }
            X.5cQ r0 = r2.A2Q     // Catch:{ all -> 0x3520 }
            r0.Biu(r3)     // Catch:{ all -> 0x3520 }
        L_0x3517:
            r0 = r34
            A1d(r2, r0)
            r33.A02()
            return
        L_0x3520:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x3522 }
        L_0x3522:
            r1 = move-exception
            r0 = r34
            A1d(r2, r0)
            r33.A02()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aY.A2l(android.os.Bundle):void");
    }
}
