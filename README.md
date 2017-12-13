# orlando-shared-libraries
To be used inside a Jenkins pipeline
 
 Use in a Jenkins pipeline script
 ```
 libraries {
        lib('github.com/OrlandoSoto/orlando-shared-libraries')
        }
  ```

To run from a specific branch in a shared library repo:
```
 libraries {
        lib('github.com/OrlandoSoto/orlando-shared-libraries@my-branch')
    }
 ```
