# Spring Boot & JTE Templates

## Relevant Code Examples


### JTE Template

JTE templates are located in the `src/main/jte/pages` directory. Here's a simple example of what a JTE template might look like:

```html
@param String username

@template.layout.main(content = @`
<div class="bg-white shadow rounded-lg p-6">
    <h1 class="text-2xl font-bold mb-4">Welcome, ${username}!</h1>
    <p class="text-gray-600">This is your dashboard. Here you can view your recent activity and manage your account.</p>
</div>
`)
```

This template takes a `username` parameter and renders it within the HTML. This template declares that it is using the `main` layout.


## JTE Content and Layouts

### Understanding Content in JTE

In JTE, `gg.jte.Content` is a special parameter type used to pass template code to other templates, similar to lambdas in Java. This feature is particularly useful for sharing structures between different templates and creating reusable layouts.

### Main Layout

The main layout for this project is located at `/src/main/jte/layout/main.jte`. This layout serves as the base structure for other pages in the application. Here's an example of how a main layout might look:

```jte
@import gg.jte.Content

@param String title
@param Content content

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title}</title>
</head>
<body>
    <header>
        <h1>${title}</h1>
    </header>
    
    <main>
        ${content}
    </main>
    
    <footer>
        <p>&copy; 2024 Spring Boot & JTE Templates</p>
    </footer>
</body>
</html>
```

### Using Content Blocks

To use content blocks within JTE templates, you can use the shorthand syntax of `@` followed by two backticks. Here's an example of how you might use the main layout in another template:

```jte
@import dev.danvega.jte.TemplateController

@param String username

@template.layout.main(
    title = "Welcome",
    content = @`
        <p>Welcome, ${username}!</p>
        <p>This is a JTE template rendered by Spring Boot.</p>
    `
)
```

This approach allows for clean separation of concerns, making your templates more modular and easier to maintain.


