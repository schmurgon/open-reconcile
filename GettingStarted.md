There is a video tutorial for installation and use of Open Reconcile [http://www.youtube.com/watch?v=ZHTZzF1sVUY&feature=youtu.be]here.

# Introduction #

First off, the requirements for this are: Tomcat. It's been tested on Tomcat 7, but should work on previous version as well.

Click on the link to the /reconcile in the app listing and begin configuring the desired data.


# What this app does #

This app:
  * Allows for users to configure a Google Refine API compatible web service to allow for reconciliation against columns in a compatible database.
  * Compatible databases are, at this time, Postgres and Oracle.
  * Users are able to further customize matching by configuring the comparison to be punctuation/spacing sensitive and/or case sensitive.
  * Users can also set up "synonyms" which will allow for specialized fixing of data - basically if you have a term ("human") that should always be matched to a different one ("homo sapiens") , you can add it. This is a type-specific feature, so there shouldn't be any unintended overlap.

# What this app does not do #

This app has this functionality missing:
  * No suggest api support. This is not advisable for data sets where there will be many types.
  * No support for multiple columns being included in one type.
  * No preview support.
  * No support for properties.
  * No (current) support for any other data sources beyond Oracle or Postgres.