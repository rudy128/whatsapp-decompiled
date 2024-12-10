package com.facebook.tigon.iface;

public interface TigonRequest {
    public static final Companion A00 = Companion.A00;
    public static final String FETCH = "fetch";
    public static final String GET = "GET";
    public static final String HEAD = "HEAD";
    public static final String POST = "POST";
    public static final String PREFETCH = "prefetch";

    public final class Companion {
        public static final /* synthetic */ Companion A00 = new Object();
        public static final String FETCH = "fetch";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String POST = "POST";
        public static final String PREFETCH = "prefetch";
    }

    TigonAuthHandler authHandler();

    HttpPriorityContext httpPriorityContext();
}
