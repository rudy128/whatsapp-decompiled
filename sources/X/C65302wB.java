package X;

import com.facebook.quicklog.EventBuilder;
import java.util.AbstractMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2wB  reason: invalid class name and case insensitive filesystem */
public class C65302wB implements EventBuilder {
    public int A00 = 7;
    public short A01 = 51;
    public final int A02;
    public final AnonymousClass19A A03;
    public final AnonymousClass19X A04;
    public final Integer A05;
    public final ConcurrentSkipListMap A06 = new ConcurrentSkipListMap();
    public final String A07;
    public final AtomicBoolean A08 = new AtomicBoolean(false);

    public boolean isSampled() {
        return true;
    }

    public static void A01(Object obj, Object obj2, AbstractMap abstractMap, int i) {
        abstractMap.put(obj2, new C53832dA(i, obj));
    }

    public void report() {
        if (this.A08.getAndSet(true)) {
            this.A03.BKg(this.A02);
            return;
        }
        Integer num = this.A05;
        AnonymousClass19X r5 = this.A04;
        int i = this.A02;
        if (num != null) {
            int intValue = num.intValue();
            r5.markerStart(i, intValue);
            String str = this.A07;
            if (str != null) {
                r5.CKw(i, intValue, str);
            }
        } else {
            r5.markerStart(i);
            String str2 = this.A07;
            if (str2 != null) {
                r5.CKx(i, str2);
            }
        }
        while (true) {
            ConcurrentSkipListMap concurrentSkipListMap = this.A06;
            if (!concurrentSkipListMap.isEmpty()) {
                Map.Entry pollLastEntry = concurrentSkipListMap.pollLastEntry();
                if (!(pollLastEntry == null || pollLastEntry.getValue() == null || A00(pollLastEntry) == null)) {
                    try {
                        int i2 = ((C53832dA) pollLastEntry.getValue()).A00;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            switch (i2) {
                                                case 11:
                                                    if (num != null) {
                                                        r5.markerAnnotate(i, num.intValue(), C17880vN.A0x(pollLastEntry), (int[]) A00(pollLastEntry));
                                                        break;
                                                    } else {
                                                        r5.markerAnnotate(i, C17880vN.A0x(pollLastEntry), (int[]) A00(pollLastEntry));
                                                        break;
                                                    }
                                                case 12:
                                                    if (num != null) {
                                                        r5.markerAnnotate(i, num.intValue(), C17880vN.A0x(pollLastEntry), (long[]) A00(pollLastEntry));
                                                        break;
                                                    } else {
                                                        r5.markerAnnotate(i, C17880vN.A0x(pollLastEntry), (long[]) A00(pollLastEntry));
                                                        break;
                                                    }
                                                case 13:
                                                    if (num != null) {
                                                        r5.markerAnnotate(i, num.intValue(), C17880vN.A0x(pollLastEntry), (double[]) A00(pollLastEntry));
                                                        break;
                                                    } else {
                                                        r5.markerAnnotate(i, C17880vN.A0x(pollLastEntry), (double[]) A00(pollLastEntry));
                                                        break;
                                                    }
                                                case 14:
                                                    if (num != null) {
                                                        r5.markerAnnotate(i, num.intValue(), C17880vN.A0x(pollLastEntry), (boolean[]) A00(pollLastEntry));
                                                        break;
                                                    } else {
                                                        r5.markerAnnotate(i, C17880vN.A0x(pollLastEntry), (boolean[]) A00(pollLastEntry));
                                                        break;
                                                    }
                                                case 15:
                                                    if (num != null) {
                                                        r5.markerAnnotate(i, num.intValue(), C17880vN.A0x(pollLastEntry), (String[]) A00(pollLastEntry));
                                                        break;
                                                    } else {
                                                        r5.markerAnnotate(i, C17880vN.A0x(pollLastEntry), (String[]) A00(pollLastEntry));
                                                        break;
                                                    }
                                            }
                                        } else if (num == null) {
                                            r5.markerAnnotate(i, C17880vN.A0x(pollLastEntry), (String) A00(pollLastEntry));
                                        } else {
                                            r5.markerAnnotate(i, num.intValue(), C17880vN.A0x(pollLastEntry), (String) A00(pollLastEntry));
                                        }
                                    } else if (num == null) {
                                        r5.markerAnnotate(i, C17880vN.A0x(pollLastEntry), AnonymousClass000.A1Y(A00(pollLastEntry)));
                                    } else {
                                        r5.markerAnnotate(i, num.intValue(), C17880vN.A0x(pollLastEntry), AnonymousClass000.A1Y(A00(pollLastEntry)));
                                    }
                                } else if (num == null) {
                                    r5.markerAnnotate(i, C17880vN.A0x(pollLastEntry), ((Double) A00(pollLastEntry)).doubleValue());
                                } else {
                                    r5.markerAnnotate(i, num.intValue(), C17880vN.A0x(pollLastEntry), ((Double) A00(pollLastEntry)).doubleValue());
                                }
                            } else if (num == null) {
                                r5.markerAnnotate(i, C17880vN.A0x(pollLastEntry), ((Long) A00(pollLastEntry)).longValue());
                            } else {
                                r5.markerAnnotate(i, num.intValue(), C17880vN.A0x(pollLastEntry), ((Long) A00(pollLastEntry)).longValue());
                            }
                        } else if (num == null) {
                            r5.markerAnnotate(i, C17880vN.A0x(pollLastEntry), ((Integer) A00(pollLastEntry)).intValue());
                        } else {
                            r5.markerAnnotate(i, num.intValue(), C17880vN.A0x(pollLastEntry), ((Integer) A00(pollLastEntry)).intValue());
                        }
                    } catch (Exception unused) {
                        this.A03.BC8(i, C17880vN.A0x(pollLastEntry));
                    }
                }
            } else if (num != null) {
                r5.markerEnd(i, num.intValue(), this.A01);
                return;
            } else {
                r5.markerEnd(i, this.A01);
                return;
            }
        }
    }

    public C65302wB(AnonymousClass19A r3, AnonymousClass19X r4, Integer num, String str, int i) {
        this.A04 = r4;
        this.A03 = r3;
        this.A07 = str;
        this.A02 = i;
        this.A05 = num;
    }

    public static Object A00(Map.Entry entry) {
        return ((C53832dA) entry.getValue()).A01;
    }

    public EventBuilder setActionId(short s) {
        this.A01 = s;
        return this;
    }

    public EventBuilder setLevel(int i) {
        this.A00 = i;
        return this;
    }

    public EventBuilder annotate(String str, double d) {
        if (str != null && C50432Uk.A00(this.A00)) {
            A01(Double.valueOf(d), str, this.A06, 3);
        }
        return this;
    }

    public EventBuilder annotate(String str, int i) {
        if (str != null && C50432Uk.A00(this.A00)) {
            A01(Integer.valueOf(i), str, this.A06, 1);
        }
        return this;
    }

    public EventBuilder annotate(String str, long j) {
        if (str != null && C50432Uk.A00(this.A00)) {
            A01(Long.valueOf(j), str, this.A06, 2);
        }
        return this;
    }

    public EventBuilder annotate(String str, String str2) {
        if (str != null && C50432Uk.A00(this.A00)) {
            A01(str2, str, this.A06, 5);
        }
        return this;
    }

    public EventBuilder annotate(String str, boolean z) {
        if (str != null && C50432Uk.A00(this.A00)) {
            A01(Boolean.valueOf(z), str, this.A06, 4);
        }
        return this;
    }

    public EventBuilder annotate(String str, double[] dArr) {
        if (str != null && C50432Uk.A00(this.A00)) {
            A01(dArr, str, this.A06, 13);
        }
        return this;
    }

    public EventBuilder annotate(String str, int[] iArr) {
        if (str != null && C50432Uk.A00(this.A00)) {
            A01(iArr, str, this.A06, 11);
        }
        return this;
    }

    public EventBuilder annotate(String str, long[] jArr) {
        if (str != null && C50432Uk.A00(this.A00)) {
            A01(jArr, str, this.A06, 12);
        }
        return this;
    }

    public EventBuilder annotate(String str, String[] strArr) {
        if (str != null && C50432Uk.A00(this.A00)) {
            A01(strArr, str, this.A06, 15);
        }
        return this;
    }

    public EventBuilder annotate(String str, boolean[] zArr) {
        if (str != null && C50432Uk.A00(this.A00)) {
            A01(zArr, str, this.A06, 14);
        }
        return this;
    }
}
