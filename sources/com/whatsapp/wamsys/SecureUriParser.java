package com.whatsapp.wamsys;

import X.AnonymousClass000;
import X.BE6;
import X.BE7;
import X.BEB;
import X.C17890vO;
import android.net.Uri;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;

public class SecureUriParser {
    public static SecurityException createOnParsingJavaUriFailException(String str, URISyntaxException uRISyntaxException) {
        Locale locale = Locale.US;
        Object[] A1a = C17890vO.A1a(str);
        BE6.A1M(uRISyntaxException, A1a, 1);
        return new SecurityException(String.format(locale, "Parsing url %s caused exception: %s.", A1a));
    }

    public static Uri createOpaqueAndroidUriFromJavaUri(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedOpaquePart(uri.getRawSchemeSpecificPart()).encodedFragment(uri.getRawFragment()).build();
    }

    public static Uri parseEncodedRFC2396Reverse(String str) {
        try {
            URI uri = new URI(str);
            if (uri.isOpaque()) {
                Uri createOpaqueAndroidUriFromJavaUri = createOpaqueAndroidUriFromJavaUri(uri);
                urisMatchMightThrowOnOpaque(str, uri, createOpaqueAndroidUriFromJavaUri);
                return createOpaqueAndroidUriFromJavaUri;
            }
            Uri A0J = BEB.A0J(uri);
            urisMatchMightThrowOnHier(str, uri, A0J, false);
            return A0J;
        } catch (URISyntaxException e) {
            throw createOnParsingJavaUriFailException(str, e);
        }
    }

    public static boolean stringEquals(String str, String str2) {
        if (str != null && !str.equals("")) {
            return str.equals(str2);
        }
        if (str2 == null || str2.equals("")) {
            return true;
        }
        return false;
    }

    public static Uri createHierAndroidUriFromJavaUri(URI uri) {
        return BEB.A0J(uri);
    }

    public static URI createHierJavaUriFromAndroidUri(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            URI createHierJavaUriFromAndroidUriSecondTry = createHierJavaUriFromAndroidUriSecondTry(uri);
            if (createHierJavaUriFromAndroidUriSecondTry != null) {
                return createHierJavaUriFromAndroidUriSecondTry;
            }
            throw createOnParsingJavaUriFailException(str, e);
        }
    }

    public static URI createHierJavaUriFromAndroidUriSecondTry(Uri uri) {
        try {
            URI uri2 = new URI(uri.toString());
            if (shouldSkipAuthority(uri2, uri)) {
                return uri2;
            }
            return null;
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public static URI createOpaqueJavaUriFromAndroidUri(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getSchemeSpecificPart(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw createOnParsingJavaUriFailException(str, e);
        }
    }

    public static Uri parseEncodedRFC2396(String str) {
        Uri parse = Uri.parse(str);
        if (!validateScheme(parse)) {
            return parseEncodedRFC2396Reverse(str);
        }
        validateMightThrow(str, parse);
        return parse;
    }

    public static boolean shouldSkipAuthority(URI uri, Uri uri2) {
        String host = uri2.getHost();
        if (uri.getHost() != null || host == null || !host.contains("_")) {
            return false;
        }
        return true;
    }

    public static void urisMatchMightThrowOnHier(String str, URI uri, Uri uri2, boolean z) {
        boolean stringEquals = stringEquals(uri.getScheme(), uri2.getScheme());
        boolean stringEquals2 = stringEquals(uri.getAuthority(), uri2.getAuthority());
        boolean stringEquals3 = stringEquals(uri.getPath(), uri2.getPath());
        String str2 = "";
        if (!stringEquals) {
            str2 = AnonymousClass000.A0y(String.format(Locale.US, "javaUri scheme: \"%s\". androidUri scheme: \"%s\".", new Object[]{uri.getScheme(), uri2.getScheme()}), AnonymousClass000.A11(str2));
        }
        if (!z && !stringEquals2) {
            str2 = AnonymousClass000.A0y(String.format(Locale.US, "javaUri authority: \"%s\". androidUri authority: \"%s\".", new Object[]{uri.getAuthority(), uri2.getAuthority()}), AnonymousClass000.A11(str2));
        }
        if (!stringEquals3) {
            str2 = AnonymousClass000.A0y(String.format(Locale.US, "javaUri path: \"%s\". androidUri path: \"%s\".", new Object[]{uri.getPath(), uri2.getPath()}), AnonymousClass000.A11(str2));
        }
        if (!stringEquals || !stringEquals2 || !stringEquals3) {
            Locale locale = Locale.US;
            Object[] A1a = BE6.A1a();
            BE6.A1H(uri, A1a, 0);
            BE6.A1H(uri2, A1a, 1);
            BE7.A1F(str2, str, A1a);
            throw new SecurityException(String.format(locale, "java uri \"%s\" not equal to android uri \"%s\". Debug info: %s. Original uri: %s", A1a));
        }
    }

    public static void urisMatchMightThrowOnOpaque(String str, URI uri, Uri uri2) {
        boolean stringEquals = stringEquals(uri.getScheme(), uri2.getScheme());
        boolean stringEquals2 = stringEquals(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (!stringEquals || !stringEquals2) {
            String str2 = "";
            if (!stringEquals) {
                str2 = AnonymousClass000.A0y(String.format(Locale.US, "javaUri scheme: \"%s\". androidUri scheme: \"%s\".", new Object[]{uri.getScheme(), uri2.getScheme()}), AnonymousClass000.A11(str2));
            }
            if (!stringEquals2) {
                str2 = AnonymousClass000.A0y(String.format(Locale.US, "javaUri opaque part: \"%s\". androidUri opaque part: \"%s\".", new Object[]{uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart()}), AnonymousClass000.A11(str2));
            }
            Locale locale = Locale.US;
            Object[] A1a = BE6.A1a();
            BE6.A1H(uri, A1a, 0);
            BE6.A1H(uri2, A1a, 1);
            BE7.A1F(str2, str, A1a);
            throw new SecurityException(String.format(locale, "java uri \"%s\" not equal to android uri \"%s\". Debug info: %s. Original uri: %s", A1a));
        }
    }

    public static void validateMightThrow(String str, Uri uri) {
        if (uri.isOpaque()) {
            urisMatchMightThrowOnOpaque(str, createOpaqueJavaUriFromAndroidUri(str, uri), uri);
            return;
        }
        URI createHierJavaUriFromAndroidUri = createHierJavaUriFromAndroidUri(str, uri);
        urisMatchMightThrowOnHier(str, createHierJavaUriFromAndroidUri, uri, shouldSkipAuthority(createHierJavaUriFromAndroidUri, uri));
    }

    public static boolean validateScheme(Uri uri) {
        if (uri.getScheme() == null) {
            return true;
        }
        return uri.getScheme().matches("([a-zA-Z][a-zA-Z0-9+.-]*)?");
    }
}
