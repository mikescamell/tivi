// Copyright 2023, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.tivi.common.ui.resources

import cafe.adriel.lyricist.LyricistStrings

@LyricistStrings(languageTag = Locales.EN, default = true)
val EnTiviStrings = TiviStrings(
    accountNameUnknown = "Hi there!",
    accountTitle = "Trakt Account",
    airsText = { p0, p1 -> "%s at %s".fmt(p0, p1) },
    airsTitle = "Airs",
    buttonConfirm = "Confirm",
    cdClearText = "Clear text",
    cdClose = "Close",
    cdDelete = "Delete",
    cdDiscoverTitle = "Discover",
    cdEpisodeDeleted = "Removed",
    cdEpisodeFirstAired = { "First aired: %s".fmt(it) },
    cdEpisodeSyncing = "Syncing",
    cdEpisodeWatched = "Watched",
    cdFollowShowAdd = "Follow show",
    cdFollowShowRemove = "Unfollow show",
    cdFollowingShowsTitle = "Followed",
    cdLibraryTitle = "Library",
    cdNavigateUp = "Navigate up",
    cdNetworkLogo = "Network logo",
    cdOpenOverflow = "Open more",
    cdProfilePic = { "Profile picture for %s".fmt(it) },
    cdRefresh = "Refresh",
    cdSearchNavigationTitle = "Search",
    cdShowPoster = "Poster image",
    cdShowPosterImage = { "Poster image for %s".fmt(it) },
    cdSortList = "Sort list",
    cdTraktRating = { "Trakt Rating: %.0f%%".fmt(it) },
    cdUpnextTitle = "Up Next",
    cdUserProfile = "User profile",
    cdWatchedShowsTitle = "Watched",
    certificateContentDescriptionFormat = { "Certificate: %s".fmt(it) },
    certificateTitle = "Certificate",
    dateLabel = "Date",
    detailsAbout = "About show",
    detailsNextEpisodeToWatch = "Next episode to watch",
    detailsRelated = "Related shows",
    detailsViewStats = "View stats",
    dialogDismiss = "Dismiss",
    discoverKeepWatchingTitle = "Up next",
    discoverPopularTitle = "Popular",
    discoverRecommendedTitle = "Recommended for you",
    discoverTitle = "Discover",
    discoverTrendingTitle = "Being watched now",
    emptyEmoji = "😏",
    emptyPrompt = "Y u no watch some TV?",
    episodeAddWatch = "Add episode watch",
    episodeMarkWatched = "Mark watched",
    episodeNavigationTitle = "Episode details",
    episodeNumber = { "#%d".fmt(it) },
    episodeRemoveWatchesDialogConfirm = "Remove all",
    episodeRemoveWatchesDialogMessage = "Are you sure that you want to remove all episode watches?",
    episodeRemoveWatchesDialogTitle = "Remove watches",
    episodeTitleFallback = { "Episode %d".fmt(it) },
    episodeTrackSetNow = "Set now",
    episodeTrackPrompt = "Finished watching…",
    episodeTrackSetFirstAired = "Set air date",
    episodeWatchDateTitle = "Date",
    episodeWatchTimeTitle = "What time did you finish watching?",
    episodeWatches = "Episode watches",
    errorGeneric = "An error occurred",
    filterShows = { "Filter %d shows".fmt(it) },
    firstAired = { "First aired: %s".fmt(it) },
    followShowAdd = "Follow show",
    followShowRemove = "Unfollow show",
    followShowsAdd = "Follow shows",
    followShowsRemove = "Unfollow shows",
    followedWatchStatsComplete = "Watched all",
    followedWatchStatsToWatch = { quantity ->
        when (quantity) {
            1 -> "%d episode to watch"
            else -> "%d episodes to watch"
        }.fmt(quantity)
    },
    followingShowsTitle = "Followed",
    genreLabelAction = "Action",
    genreLabelAdventure = "Adventure",
    genreLabelComedy = "Comedy",
    genreLabelCrime = "Crime",
    genreLabelDrama = "Drama",
    genreLabelFantasy = "Fantasy",
    genreLabelHorror = "Horror",
    genreLabelMystery = "Mystery",
    genreLabelScienceFiction = "Science Fiction",
    genreLabelThriller = "Thriller",
    headerMore = "More",
    headerShowCount = { quantity ->
        when (quantity) {
            1 -> "%d show"
            else -> "%d shows"
        }.fmt(quantity)
    },
    headerShowCountFiltered = { quantity ->
        when (quantity) {
            1 -> "%d show (filtered)"
            else -> "%d shows (filtered)"
        }.fmt(quantity)
    },
    libraryEmptyPrompt = "Follow some shows?",
    libraryEmptyTitle = "No shows found",
    libraryLastWatched = { "Last watched: %s".fmt(it) },
    libraryTitle = "Library",
    login = "Login",
    logout = "Logout",
    menuRefresh = "Refresh",
    minutesFormat = { "%dm".fmt(it) },
    networkContentDescriptionFormat = { "Network: %s".fmt(it) },
    networkTitle = "Network",
    nextPrefix = { "Next: %s".fmt(it) },
    notKnownTitle = "TBD",
    percentageFormat = { "%d%%".fmt(it) },
    popupSeasonFollow = "Follow season",
    popupSeasonIgnore = "Ignore season",
    popupSeasonIgnorePrevious = "Ignore previous seasons",
    popupSeasonMarkAllUnwatched = "Unwatch all",
    popupSeasonMarkWatchedAired = "Watch aired",
    popupSeasonMarkWatchedAll = "Watch all",
    popupSeasonWatchAirDate = "Watch date: air date",
    popupSeasonWatchNow = "Watch date: now",
    popupSortAirDate = "Air date",
    popupSortAlpha = "A-Z",
    popupSortDateFollowed = "Date followed",
    popupSortLastWatched = "Last watched",
    ratingContentDescriptionFormat = { "Rating: %d%%".fmt(it) },
    refreshCredentials = "Refresh credentials",
    runtimeTitle = "Length",
    searchEmptyTitle = "Enter a query above",
    searchHint = "Search for shows",
    searchNavigationTitle = "Search",
    searchNoresultsPrompt = "Made a typo?",
    searchNoresultsTitle = "No results found",
    seasonEpisodeNumber = { p0, p1 -> "Season %d - Episode %d".fmt(p0, p1) },
    seasonSummaryToAir = { "%d to air".fmt(it) },
    seasonSummaryToWatch = { "%d to watch".fmt(it) },
    seasonSummaryWatched = { "%d watched".fmt(it) },
    seasonTitleFallback = { "Season %d".fmt(it) },
    selectionTitle = { "%d selected".fmt(it) },
    settingsAboutCategoryTitle = "About Tivi",
    settingsAppVersion = "Version",
    settingsAppVersionSummary = { p0, p1 -> "v%s (%d)".fmt(p0, p1) },
    settingsDataSaverSummaryOn = "Fetch data less often and display lower quality images",
    settingsDataSaverSummaryOff = "Automatically enabled due to system setting",
    settingsDataSaverTitle = "Data saver",
    settingsDynamicColorSummary = "Use colors derived from your wallpaper",
    settingsDynamicColorTitle = "Dynamic colors",
    settingsIgnoreSpecialsTitle = "Ignore specials",
    settingsIgnoreSpecialsSummary = "Automatically ignore specials",
    settingsOpenSource = "Open source licenses",
    settingsOpenSourceSummary = "Tivi 💞open source",
    settingsThemeTitle = "Theme",
    settingsTitle = "Settings",
    settingsUiCategoryTitle = "User Interface",
    showDetailsSeasons = "Seasons",
    showdetailsNavigationTitle = "Show details",
    statusActive = "Continuing",
    statusEnded = "Ended",
    statusInProduction = "In production",
    statusPlanned = "Production planned",
    statusTitle = "Status",
    timeLabel = "Time",
    traktRatingText = { rating -> "%.0f%%".fmt(rating) },
    traktRatingTitle = "Trakt Rating",
    traktRatingVotes = { "%.1fk votes".fmt(it) },
    upnextEmptyPrompt = "You\'ve been busy",
    upnextEmptyTitle = "No episodes left",
    upnextFilterFollowedShowsOnlyTitle = "Followed only",
    upnextTitle = "Up Next",
    viewPrivacyPolicy = "View Privacy Policy",
    watchedShowsTitle = "Watched",
)
