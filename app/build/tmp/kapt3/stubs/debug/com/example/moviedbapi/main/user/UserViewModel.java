package com.example.moviedbapi.main.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/moviedbapi/main/user/UserViewModel;", "Lcom/example/moviedbapi/base/ParentViewModel;", "userRepository", "Lcom/example/moviedbapi/repository/UserRepository;", "(Lcom/example/moviedbapi/repository/UserRepository;)V", "_liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/moviedbapi/main/user/UserViewModel$State;", "liveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "getAccountDetails", "", "sessionId", "", "handleError", "e", "", "State", "app_debug"})
public final class UserViewModel extends com.example.moviedbapi.base.ParentViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.moviedbapi.main.user.UserViewModel.State> _liveData = null;
    private final com.example.moviedbapi.repository.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviedbapi.main.user.UserViewModel.State> getLiveData() {
        return null;
    }
    
    public final void getAccountDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId) {
    }
    
    @java.lang.Override()
    protected void handleError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviedbapi.repository.UserRepository userRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/example/moviedbapi/main/user/UserViewModel$State;", "", "()V", "Error", "HideLoading", "IntError", "Result", "ShowLoading", "Lcom/example/moviedbapi/main/user/UserViewModel$State$ShowLoading;", "Lcom/example/moviedbapi/main/user/UserViewModel$State$HideLoading;", "Lcom/example/moviedbapi/main/user/UserViewModel$State$Result;", "Lcom/example/moviedbapi/main/user/UserViewModel$State$Error;", "Lcom/example/moviedbapi/main/user/UserViewModel$State$IntError;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/moviedbapi/main/user/UserViewModel$State$ShowLoading;", "Lcom/example/moviedbapi/main/user/UserViewModel$State;", "()V", "app_debug"})
        public static final class ShowLoading extends com.example.moviedbapi.main.user.UserViewModel.State {
            public static final com.example.moviedbapi.main.user.UserViewModel.State.ShowLoading INSTANCE = null;
            
            private ShowLoading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/moviedbapi/main/user/UserViewModel$State$HideLoading;", "Lcom/example/moviedbapi/main/user/UserViewModel$State;", "()V", "app_debug"})
        public static final class HideLoading extends com.example.moviedbapi.main.user.UserViewModel.State {
            public static final com.example.moviedbapi.main.user.UserViewModel.State.HideLoading INSTANCE = null;
            
            private HideLoading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/moviedbapi/main/user/UserViewModel$State$Result;", "Lcom/example/moviedbapi/main/user/UserViewModel$State;", "account", "Lcom/example/moviedbapi/data/models/AccountData;", "(Lcom/example/moviedbapi/data/models/AccountData;)V", "getAccount", "()Lcom/example/moviedbapi/data/models/AccountData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Result extends com.example.moviedbapi.main.user.UserViewModel.State {
            @org.jetbrains.annotations.Nullable()
            private final com.example.moviedbapi.data.models.AccountData account = null;
            
            @org.jetbrains.annotations.Nullable()
            public final com.example.moviedbapi.data.models.AccountData getAccount() {
                return null;
            }
            
            public Result(@org.jetbrains.annotations.Nullable()
            com.example.moviedbapi.data.models.AccountData account) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.example.moviedbapi.data.models.AccountData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviedbapi.main.user.UserViewModel.State.Result copy(@org.jetbrains.annotations.Nullable()
            com.example.moviedbapi.data.models.AccountData account) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/moviedbapi/main/user/UserViewModel$State$Error;", "Lcom/example/moviedbapi/main/user/UserViewModel$State;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Error extends com.example.moviedbapi.main.user.UserViewModel.State {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String error = null;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getError() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.Nullable()
            java.lang.String error) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviedbapi.main.user.UserViewModel.State.Error copy(@org.jetbrains.annotations.Nullable()
            java.lang.String error) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/moviedbapi/main/user/UserViewModel$State$IntError;", "Lcom/example/moviedbapi/main/user/UserViewModel$State;", "error", "", "(I)V", "getError", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class IntError extends com.example.moviedbapi.main.user.UserViewModel.State {
            private final int error = 0;
            
            public final int getError() {
                return 0;
            }
            
            public IntError(int error) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviedbapi.main.user.UserViewModel.State.IntError copy(int error) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}